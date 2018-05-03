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
            arrayToReturn[0] = "No se ha seleccionado una db";
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
            globalVariables.addErrorMessage("No se ha seleccionado una db");
            return false;
        }
        File directory = new File("DBs/"+ globalVariables.getBaseDeDatosEnUso() +"/"+nombreTablaViejo);
        if (!directory.exists()) {
            globalVariables.addErrorMessage("No existe la tabla");
            return false;
        }
        File nuevodirectory = new File("DBs/"+ globalVariables.getBaseDeDatosEnUso() +"/"+nombreTablaNuevo);
        if (nuevodirectory.exists()) {
            globalVariables.addErrorMessage("Ya hay una tabla con ese nombre");
            return false;
        }
        boolean success = directory.renameTo(nuevodirectory);
        if(!success) {
            globalVariables.addErrorMessage("Error con el cambio de nombre");
            return false;
        }
        return true;
    }

    @Override
    public boolean alterAddColumn(String nombreDeTabla, String nombreDeColumna, String tipo) {
        try {
            FileReader tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);
            String temporal = bufferedReader.readLine();
            JSONObject raw = new JSONObject(temporal);
            JSONObject tableHeader = (JSONObject) raw.get("header");
            ArrayList<String> keys = new ArrayList<>();
            ArrayList<String> keyValues = new ArrayList<>();
            Iterator<?> iterator = tableHeader.keys();

            JSONObject newValues = new JSONObject();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                keys.add(key);
                keyValues.add(tableHeader.get(key).toString());

            }

        // TODO: Loop Para ingresar null los nuevos valores en cada objeto

            //Write into the file
            try (FileWriter file = new FileWriter("json_file"))
            {
                // file.write(root.toString());
            }
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
    public boolean alterDeleteColumn(String nombreDeTabla, String nombreDeColumnaParaDelete) {
        try {
            boolean columnaEncontrada = false;
            // globalVariables.getBaseDeDatosEnUso();
            FileReader tablaFile = new FileReader("DBs/" + "santiago" + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);

            // Read line
            String temporal = bufferedReader.readLine();
            if (temporal == null){
                globalVariables.addErrorMessage("No hay nada en la tabla");
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
                if (! key.equals(nombreDeColumnaParaDelete)) {
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
                    if (! key.equals(nombreDeColumnaParaDelete)) {
                        row.put(key, raw.get(key).toString());
                    }
                }
                // Agrega a tabla el row
                tabla.addRow(row);
            }


            // Escribir

            // Borramos primero el file
            //globalVariables.getBaseDeDatosEnUso()
            FileWriter writer = new FileWriter("DBs/" + "santiago" + "/" + nombreDeTabla);
            writer.write("");
            writer.close();

            // Lo abrimos de forma append
            //globalVariables.getBaseDeDatosEnUso()
            writer = new FileWriter("DBs/" + "santiago" + "/" + nombreDeTabla, true);
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
    public boolean alterDropColumn(String nombreDeTabla, String nombreDeColumnaParaDrop) {
        try {
            boolean columnaEncontrada = false;
            FileReader tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);

            // Read line
            String temporal = bufferedReader.readLine();
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

            // Borra el row
            row = new HashMap<>();

            // Read Next Line
            temporal = bufferedReader.readLine();
            raw = new JSONObject(temporal);

            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                // Solo agrega las que no son igual a la columna
                if (! key.equals(nombreDeColumnaParaDrop)) {
                    row.put(key, tableHeader.get(key).toString());
                }
            }

            // Escribir

            // Borramos primero el file
            FileWriter writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            writer.write("");
            writer.close();

            // Lo abrimos de forma append
            writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla, true);

            for (int i = 0; i < tabla.getLines(); i++){
                JSONObject rowToWrite = new JSONObject(tabla.getRow(i));
                writer.write(rowToWrite.toString());
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
            tablaFile = new FileReader("DBs/" + "santiago"/*TODO cambiar*/ + "/" + nombreDeTabla);
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

            FileWriter writeToFile = new FileWriter("DBs/" + "santiago"/*TODO cambiar*/ + "/");
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

}
