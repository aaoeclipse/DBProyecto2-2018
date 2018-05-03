package fileManager;

import objects.Tabla;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FileManagerImpl implements FileManager {
    private static String Databases = "DBs/";
    @Override
    public boolean createDB(String nombre) {
        new File("DBs/"+nombre).mkdirs();
        return true;
    }

    @Override
    public String[] showDatabases() {
        File file = new File("DBs/");

        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });
        // System.out.println(Arrays.toString(directories));
        return directories;
    }

    @Override
    public boolean useDatabase(String nombreDeDataBase) {
        File existingFile = new File("DBs/"+nombreDeDataBase);
        if (existingFile.exists()) {
            globalVariables.setUtilizandoBaseDeDatos(true);
            globalVariables.setBaseDeDatosEnUso(nombreDeDataBase);
            return true;
        }
        return false;
    }

    @Override
    public String[] listTables() {
        String[] arrayToReturn;

        if (!globalVariables.getUtilizandoBaseDeDatos()) {
            arrayToReturn = new String[1];
            arrayToReturn[0] = "ERROR: DB No Seleccionada";
            return arrayToReturn;
        }

        File directory = new File("DBs/"+ globalVariables.getBaseDeDatosEnUso());
        // get all the files from a directory
        File[] fList = directory.listFiles();
        arrayToReturn = new String[fList.length];
        for (int i = 0; i < arrayToReturn.length; i++){
            arrayToReturn[i] = fList[i].getName();
        }
        return arrayToReturn;
    }

    @Override
    public boolean renameTable(String nombreTablaViejo, String nombreTablaNuevo) {

        if (!globalVariables.getUtilizandoBaseDeDatos()) {
            globalVariables.addErrorMessage("ERROR: DB No Seleccionada");
            return false;
        }
        File directory = new File("DBs/"+ globalVariables.getBaseDeDatosEnUso() +"/"+nombreTablaViejo);
        if (!directory.exists()) {
            globalVariables.addErrorMessage("ERROR: Tabla No Existe");
            return false;
        }
        File nuevodirectory = new File("DBs/"+ globalVariables.getBaseDeDatosEnUso() +"/"+nombreTablaNuevo);
        if (nuevodirectory.exists()) {
            globalVariables.addErrorMessage("Ya hay una tabla con ese nombre");
            return false;
        }
        boolean success = directory.renameTo(nuevodirectory);
        if(!success) {
            globalVariables.addErrorMessage("ERROR: No se logro cambiar el nombre");
            return false;
        }
        return true;
    }

    @Override
    public boolean alterAddColumn(String nombreDeTabla, String nombreDeColumna, String tipo) {
        try {
            boolean repetido = false;
            if (! globalVariables.utilizandoBaseDeDatos){
                globalVariables.addErrorMessage("ERROR: DB No Seleccionado");
                return false;
            }
            FileReader tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);

            // Read line
            String temporal = bufferedReader.readLine();
            if (temporal == null){
                globalVariables.addErrorMessage("ERROR: Tabla vacia");
                return false;
            }

            JSONObject raw = new JSONObject(temporal);

            // head
            JSONObject tableHeader = (JSONObject) raw.get("header");
            Iterator<?> iterator = tableHeader.keys();

            Tabla tabla = new Tabla();
            HashMap<String, String> row = new HashMap<>();
            // agregar la nueva columna
            row.put(nombreDeColumna, tipo);

            //HEADER
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (! key.equals(nombreDeColumna)) {
                    row.put(key,tableHeader.get(key).toString());
                } else {
                    repetido = true;
                }
            }
            if (repetido){
                globalVariables.addErrorMessage("ERROR: Columna Ya Existe");
                bufferedReader.close();
                return false;
            }

            // Agrega a tabla el row
            tabla.addRow(row);

            while ((temporal = bufferedReader.readLine()) != null){
                // Borra el row
                row = new HashMap<>();
                row.put(nombreDeColumna, "");

                // Read Next Line
                raw = new JSONObject(temporal);
                iterator = raw.keys();

                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    row.put(key, raw.get(key).toString());
                }
                // Agrega a tabla el row
                tabla.addRow(row);
            }
            // Escribir
            // Borramos primero el file
            //globalVariables.getBaseDeDatosEnUso()
            FileWriter writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            writer.write("");
            writer.close();

            // Lo abrimos de forma append
            writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso()+ "/" + nombreDeTabla, true);
            writer.append("{\"header\":");
            boolean isHeader = true;

            for (int i = 0; i < tabla.getLines(); i++){
                JSONObject rowToWrite = new JSONObject(tabla.getRow(i));
                //System.out.println("COUNT: " + i + "\n"+"Writing... " + rowToWrite.toString()+"\nsize of array: "+ tabla.getLines());
                writer.append(rowToWrite.toString());
                if (isHeader) {
                    writer.append("}\n");
                    isHeader = false;
                } else {
                    writer.append("}\n");
                }
            }
            writer.close();
        }catch (FileNotFoundException e) {
            globalVariables.addErrorMessage("ERROR: No existe la tabla");
            return false;
        } catch (IOException e) {
            globalVariables.addErrorMessage("ERROR: Lectura del archivo");
            return false;
        } catch (JSONException e) {
            globalVariables.addErrorMessage("ERROR: problema con el JSON");
            return false;
        }


        return true;
    }

    @Override
    public boolean alterAddConstraint(String nombreDeTabla, String nombreDeconstraint, String tipoDeConstraint, String columna) {
        return false;
    }

    @Override
    public boolean alterDropColumn(String nombreDeTabla, String nombreDeColumnaParaDrop) {
        try {
            boolean columnaEncontrada = false;
            if (! globalVariables.utilizandoBaseDeDatos){
                globalVariables.addErrorMessage("ERROR: DB No Seleccionado");
                return false;
            }
            FileReader tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso()+ "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);

            // Read line
            String temporal = bufferedReader.readLine();
            if (temporal == null){
                globalVariables.addErrorMessage("ERROR: Tabla vacia");
                return false;
            }

            JSONObject raw = new JSONObject(temporal);

            // head
            JSONObject tableHeader = (JSONObject) raw.get("header");
            Iterator<?> iterator = tableHeader.keys();

            Tabla tabla = new Tabla();
            HashMap<String, String> row = new HashMap<>();
            //HEADER
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (! key.equals(nombreDeColumnaParaDrop)) {
                    row.put(key,tableHeader.get(key).toString());
                } else {
                    columnaEncontrada = true;
                }
            }
            if (! columnaEncontrada){
                globalVariables.addErrorMessage("ERROR: Columna No Existe");
                bufferedReader.close();
                return false;
            }
            // Agrega a tabla el row
            tabla.addRow(row);

            while ((temporal = bufferedReader.readLine()) != null){
                // Borra el row
                row = new HashMap<>();

                // Read Next Line
                raw = new JSONObject(temporal);
                iterator = raw.keys();

                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    // Solo agrega las que no son igual a la columna
                    if (! key.equals(nombreDeColumnaParaDrop)) {
                        row.put(key, raw.get(key).toString());
                    }
                }
                // Agrega a tabla el row
                tabla.addRow(row);
            }


            // Escribir

            // Borramos primero el file
            //globalVariables.getBaseDeDatosEnUso()
            FileWriter writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            writer.write("");
            writer.close();

            // Lo abrimos de forma append
            //globalVariables.getBaseDeDatosEnUso()
            writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla, true);
            writer.append("{\"header\":");
            boolean isHeader = true;

            for (int i = 0; i < tabla.getLines(); i++){
                JSONObject rowToWrite = new JSONObject(tabla.getRow(i));
                //System.out.println("COUNT: " + i + "\n"+"Writing... " + rowToWrite.toString()+"\nsize of array: "+ tabla.getLines());
                writer.append(rowToWrite.toString());
                if (isHeader) {
                    writer.append("}\n");
                    isHeader = false;
                } else {
                    writer.append("}\n");
                }
            }
            writer.close();
        }catch (FileNotFoundException e) {
            globalVariables.addErrorMessage("ERROR: No existe la tabla");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            globalVariables.addErrorMessage("ERROR: Lectura del archivo");
            return false;
        } catch (JSONException e) {
            globalVariables.addErrorMessage("ERROR: problema con el JSON");
            return false;
        }
        return true;
    }

    @Override
    public boolean alterDropConstraint(String nombreDeTabla, String nombreDeConstraintParaBotar) {
        boolean columnaEncontrada = false;
        FileReader tablaFile = null;
        try {
            tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);
            // Read line
            String line = bufferedReader.readLine();
            // Object
            JSONObject raw = new JSONObject(line);
            JSONObject tableHeader = (JSONObject) raw.get("header");
            Iterator<?> iterator = tableHeader.keys();

            HashMap<String, String> row = new HashMap<>();
            Tabla tabla = new Tabla();

            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                row.put(key, tableHeader.get(key).toString());
            }
            tabla.addRow(row);
            JSONObject jsonFinal = new JSONObject(tabla.getRow(0));
            String output = jsonFinal.toString();
            System.out.println(output);
            bufferedReader.close();

            FileWriter writeToFile = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/");
            writeToFile.write(output);
            writeToFile.append("\n");
            writeToFile.append("Done!");
            writeToFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateNoWhere(String nombreDeTabla, String nombreDecolumna, String nuevoValor) {
        try {
            if (!globalVariables.utilizandoBaseDeDatos) {
                globalVariables.addErrorMessage("ERROR: DB No Seleccionado");
                return false;
            }
            FileReader tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);

            // Read line
            String temporal = bufferedReader.readLine();
            if (temporal == null) {
                globalVariables.addErrorMessage("ERROR: Tabla vacia");
                return false;
            }

            JSONObject raw = new JSONObject(temporal);

            // head
            JSONObject tableHeader = (JSONObject) raw.get("header");
            Iterator<?> iterator = tableHeader.keys();

            Tabla tabla = new Tabla();
            HashMap<String, String> row = new HashMap<>();
            //HEADER
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                row.put(key, tableHeader.get(key).toString());
            }
            // Agrega a tabla el row
            tabla.addRow(row);

            while ((temporal = bufferedReader.readLine()) != null) {
                // Borra el row
                row = new HashMap<>();

                // Read Next Line
                raw = new JSONObject(temporal);
                iterator = raw.keys();

                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    if (key.equals(nombreDecolumna))
                        row.put(key, nuevoValor);
                    else
                        row.put(key, raw.get(key).toString());
                }
                // Agrega a tabla el row
                tabla.addRow(row);
                }
                // Escribir
                // Borramos primero el file
                //globalVariables.getBaseDeDatosEnUso()
                FileWriter writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
                writer.write("");
                writer.close();

                // Lo abrimos de forma append
                //globalVariables.getBaseDeDatosEnUso()
                writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla, true);
                writer.append("{\"header\":");
                boolean isHeader = true;

                for (int i = 0; i < tabla.getLines(); i++){
                    JSONObject rowToWrite = new JSONObject(tabla.getRow(i));
                    writer.append(rowToWrite.toString());
                    if (isHeader) {
                        writer.append("}\n");
                        isHeader = false;
                    } else {
                        writer.append("}\n");
                    }
                }
                writer.close();
        } catch (FileNotFoundException e) {
            globalVariables.addErrorMessage("ERROR: No existe la tabla");
            return false;
        } catch (IOException e) {
            globalVariables.addErrorMessage("ERROR: Lectura del archivo");
            return false;

        } catch (JSONException e) {
            globalVariables.addErrorMessage("ERROR: problema con el JSON");
            return false;
        }

        return true;
    }

}
