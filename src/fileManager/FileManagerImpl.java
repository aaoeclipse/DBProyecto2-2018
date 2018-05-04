package fileManager;

import objects.Tabla;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class FileManagerImpl implements FileManager {
    private static String Databases = "DBs/";
    private String[] constraints = {"primaryKey", "foreignKey", "check","unique"};
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
    public boolean alterAddConstraint(String nombreDeTabla, String tipoDeConstraint, String columna) {
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



            //HEADER
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (!key.equals("primaryKey")) {
                    row.put(key, tableHeader.get(key).toString());
                } else {
                    repetido = true;
                }
            }

            // Agrega a tabla el row
            tabla.addRow(row);

            boolean uniqueRepeats = false;
            // DATA
            while ((temporal = bufferedReader.readLine()) != null) {
                // Borra el row
                row = new HashMap<>();
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


            switch (tipoDeConstraint){
                case "PRIMARYKEY":
                    if (repetido){
                        globalVariables.addErrorMessage("ERROR: Solo 1 PK por tabla");
                        return false;
                    }
                    // agregar la nueva columna
                    tabla.getRow(0).put("primaryKey", columna);
                    break;
                case "FOREIGNKEY":
                    // agregar la nueva columna
                    tabla.getRow(0).put("foreignKey", columna);
                    break;
                case "CHECK":
                    // agregar la nueva columna
                    tabla.getRow(0).put("check", columna);
                    break;
                case "UNIQUE":
                    if (tabla.checkIfValuesRepeat(columna)){
                        globalVariables.addErrorMessage("ERROR: Hay repeticiones en el UNIQUE");
                        return false;
                    }
                    // agregar la nueva columna
                    tabla.getRow(0).put("unique", columna);
                    break;
            }


            // Escribir
            // Borramos primero el file
            FileWriter writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            writer.write("");
            writer.close();

            // Lo abrimos de forma append
            writer = new FileWriter("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla, true);
            writer.append("{\"header\":");
            boolean isHeader = true;

            for (int i = 0; i < tabla.getLines(); i++) {
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
        boolean esConstraint = false;
        for (String s: constraints) {
            if (nombreDeConstraintParaBotar.equals(s)){
                esConstraint = true;
            }
        }
        if(!esConstraint){
            globalVariables.addErrorMessage("ERROR: Contraint Invalido");
            return false;
        }
        FileReader tablaFile = null;
        try {
            tablaFile = new FileReader("DBs/" + globalVariables.getBaseDeDatosEnUso() + "/" + nombreDeTabla);
            BufferedReader bufferedReader = new BufferedReader(tablaFile);
            // Read line
            String temporal = bufferedReader.readLine();
            if (temporal == null){
                globalVariables.addErrorMessage("ERROR: Tabla vacia");
                return false;
            }
            // Object
            JSONObject raw = new JSONObject(temporal);
            JSONObject tableHeader = (JSONObject) raw.get("header");
            Iterator<?> iterator = tableHeader.keys();

            HashMap<String, String> row = new HashMap<>();
            Tabla tabla = new Tabla();

            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (key.equals(nombreDeConstraintParaBotar))
                    columnaEncontrada = true;
                else
                    row.put(key, tableHeader.get(key).toString());
            }
            if (!columnaEncontrada){
                globalVariables.addErrorMessage("ERROR: No existe el constraint");
                return false;
            }
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

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean updateNoWhere(String nombreDeTabla, String nombreDecolumna, String nuevoValor) {
        int counter = 0;
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
                    if (key.equals(nombreDecolumna)) {
                        counter++;
                        row.put(key, nuevoValor);
                    }else
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
            globalVariables.addErrorMessage("ERROR: Tabla No Existe");
            return false;
        } catch (IOException e) {
            globalVariables.addErrorMessage("ERROR: Lectura del archivo");
            return false;

        } catch (JSONException e) {
            globalVariables.addErrorMessage("ERROR: problema con el JSON");
            return false;
        }
        globalVariables.addErrorMessage("Tuplas Modificadas: " + counter);
        return true;
    }

    @Override
    public boolean updateConWhere(String nombreDeTabla, String nombreDeColuma, String nuevoValor, ParseTree whereClause) {
        int counter = 0;
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
                tabla.addColumnas(key);
                row.put(key, tableHeader.get(key).toString());
            }
            // Agrega a tabla el row
            tabla.addRow(row);
            // DATA
            while ((temporal = bufferedReader.readLine()) != null) {
                // Borra el row
                row = new HashMap<>();

                // Read Next Line
                raw = new JSONObject(temporal);
                iterator = raw.keys();

                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    if (evaluateWhereClause(whereClause, raw, tabla.getColumnas())){
                        if(key.equals(nombreDeColuma)){
                            counter++;
                            row.put(key, nuevoValor);
                        }else{
                            row.put(key, raw.get(key).toString());
                        }
                    }else{
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
            globalVariables.addErrorMessage("ERROR: Tabla No Existe");
            return false;
        } catch (IOException e) {
            globalVariables.addErrorMessage("ERROR: Lectura del archivo");
            return false;

        } catch (JSONException e) {
            globalVariables.addErrorMessage("ERROR: problema con el JSON");
            return false;
        } catch (ParseException e) {
            globalVariables.addErrorMessage("ERROR: Problemas interpretando el WHERE");
            return false;
        }
        globalVariables.addErrorMessage("Tuplas Modificadas: " + counter);
        return true;
    }

    public boolean evaluateWhereClause(ParseTree whereClause, JSONObject row, ArrayList<String> columns) throws ParseException, JSONException {
        //Checking that the tree is the main one
        while (whereClause.getChildCount()==1)
            whereClause = (ParseTree) whereClause.getChild(0);
        // Getting the values from the parse tree: left and right operator and the operation itself
        String left = whereClause.getChild(0).getText();
        String operator = whereClause.getChild(1).getText();
        String right = whereClause.getChild(2).getText();
        // Either obtaining the actual value or keeping it for left operator
        String leftTest= isValueAColumn(left,columns);
        if(!leftTest.equals("")){
            left = row.getString(leftTest);
        }
        // Either obtaining the actual value or keeping it for right operator
        String rightTest= isValueAColumn(right,columns);
        if(!rightTest.equals("")){
            right = row.getString(rightTest);
        }
        String type = getType(right);
        // Converting and operating according to the operator
        if(operator.equals("<")){
            if(type.equals("INT")){
                return (Integer.parseInt(left) < Integer.parseInt(right));
            }else if (type.equals("FLOAT")){
                return (Float.parseFloat(left) < Float.parseFloat(right));
            }else{
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dateLeft = format.parse(left);
                Date dateRight = format.parse(right);
                return dateLeft.before(dateRight);
            }
        }else if(operator.equals("<=")){
            if(type.equals("INT")){
                return (Integer.parseInt(left) <= Integer.parseInt(right));
            }else if (type.equals("FLOAT")){
                return (Float.parseFloat(left) <= Float.parseFloat(right));
            }else {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dateLeft = format.parse(left);
                Date dateRight = format.parse(right);
                return dateLeft.before(dateRight) || dateLeft.equals(dateRight);
            }
        }else if(operator.equals(">")){
            if(type.equals("INT")){
                return (Integer.parseInt(left) > Integer.parseInt(right));
            }else if (type.equals("FLOAT")){
                return (Float.parseFloat(left) > Float.parseFloat(right));
            }else{
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dateLeft = format.parse(left);
                Date dateRight = format.parse(right);
                return dateLeft.after(dateRight);
            }
        }else if(operator.equals(">=")){
            if(type.equals("INT")){
                return (Integer.parseInt(left) >= Integer.parseInt(right));
            }else if (type.equals("FLOAT")){
                return (Float.parseFloat(left) >= Float.parseFloat(right));
            }else{
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dateLeft = format.parse(left);
                Date dateRight = format.parse(right);
                return dateLeft.after(dateRight) || dateLeft.equals(dateRight);
            }
        }else if(operator.equals("<>")){
            if(type.equals("INT")){
                return (Integer.parseInt(left) != Integer.parseInt(right));
            }else if (type.equals("FLOAT")){
                return (Float.parseFloat(left) != Float.parseFloat(right));
            }else if (type.equals("DATE")){
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dateLeft = format.parse(left);
                Date dateRight = format.parse(right);
                return !dateLeft.equals(dateRight);
            }else{
                return !left.equals(right);
            }
        }else if(operator.equals("=")){
            if(type.equals("INT")){
                return (Integer.parseInt(left) == Integer.parseInt(right));
            }else if (type.equals("FLOAT")){
                return (Float.parseFloat(left) == Float.parseFloat(right));
            }else if (type.equals("DATE")){
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date dateLeft = format.parse(left);
                Date dateRight = format.parse(right);
                return dateLeft.equals(dateRight);
            }else{
                return left.equals(right);
            }
            // In case of a composed evaluation recursion will be taken
        }else if(operator.equals("AND")){
            return evaluateWhereClause((ParseTree) whereClause.getChild(0), row, columns) && evaluateWhereClause((ParseTree) whereClause.getChild(2), row, columns);
        }else{
            return  evaluateWhereClause((ParseTree) whereClause.getChild(0), row, columns) || evaluateWhereClause((ParseTree) whereClause.getChild(2), row, columns);
        }
    }

    public String isValueAColumn(String value, ArrayList<String> keys){
        if(value.indexOf("'") > 0)
            return "";
        if(getType(value).equals("CHAR")){
            String column = "";
            for(String t : keys){
                if (value.equals(t)) {
                    column = t;
                }
            }
            return  column;
        }else{
            return "";
        }
    }

    public String getType(String value){
        try{
            int temop = Integer.parseInt(value );
            return "INT";
        }catch (Exception e){
//            e.printStackTrace();
            try {
                float temp = Float.parseFloat(value);
                return "FLOAT";
            }catch (Exception e1){
//                e.printStackTrace();
                try {
                    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = format.parse(value);
                    return "DATE";
                } catch (Exception e2){
                    return "CHAR";
                }
            }
        }
    }








}
