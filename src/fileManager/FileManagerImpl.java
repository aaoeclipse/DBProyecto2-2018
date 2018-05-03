package fileManager;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



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
        System.out.println(Arrays.toString(directories));
        return directories;
    }

    @Override
    public boolean useDatabase(String nombreDeDataBase) {
        System.out.println(nombreDeDataBase);
        File existingFile = new File("DBs/"+nombreDeDataBase);
        System.out.println(existingFile.getName().toString()+existingFile.exists());
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
    public void createTable(String nombre, List<String> atributos, String pk, List<String> fk) throws JSONException {

        JSONObject table = new JSONObject();
        JSONObject header = new JSONObject();
        JSONArray rows = new JSONArray();
        header.put("primaryKey",pk.split(" ")[2]);
        for(int i = 0;i<atributos.size();i++){
            String[] attr = atributos.get(i).split(" ");
            header.put(attr[0],attr[1]);
        }
        table.put("header",header);
        table.put("rows", rows);
        System.out.println(Databases);
        try (FileWriter file = new FileWriter(Databases+"/"+globalVariables.getBaseDeDatosEnUso()+"/"+nombre+".json")) {

            file.write(table.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void dropDatabase(String database){
        try {
            File databaseFolder = new File(Databases + "/" + database + "/");
            String[] tables = databaseFolder.list();
            for (String s : tables) {
                File currentFile = new File(databaseFolder.getPath(), s);
                currentFile.delete();
            }
            databaseFolder.delete();
        }catch (Exception e){
            e.printStackTrace();
            // TODO return error The desired databse has not been able to be deleted
        }
    }

    public void showColumnStatement(String tableName){
        FileReader fileJSON = null;
        try {
            fileJSON = new FileReader(Databases + "/" + globalVariables.getBaseDeDatosEnUso() +"/" + tableName + ".json");
            BufferedReader bufferedReader = new BufferedReader(fileJSON);
            JSONObject raw = new JSONObject(bufferedReader.readLine());
            JSONObject tableHeader = (JSONObject) raw.get("header");
            Iterator<?> iterator = tableHeader.keys();
            String columnStatement = "Table "+tableName+" Statement:\n";
            while( iterator.hasNext() ) {
                String key = (String) iterator.next();
                String keyValue = tableHeader.get(key).toString();
                /*
                    Special Cases
                 */
                if(key.equals("primaryKey")){
                    columnStatement = columnStatement + "Primary Key : "+keyValue+"\n";
                }else{
                /*
                    Standard Columns
                 */
                    columnStatement = columnStatement + "Column "+key+" , Type "+keyValue+"\n";
                }
            }
            print(columnStatement);
            // TODO return columnsStatement and print to screen
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteFromTable(String tableName, ParseTree whereClause){
        try {
            if (whereClause.getChildCount()==1)
                whereClause = whereClause.getChild(0);
            FileReader fileJSON = new FileReader(Databases + "/" + /*globalVariables.getBaseDeDatosEnUso()+*/"santiago" + "/" + tableName + ".json");
            BufferedReader bufferedReader = new BufferedReader(fileJSON);
            String temporal = bufferedReader.readLine();
            JSONObject raw = new JSONObject(temporal);
            JSONObject tableHeader = (JSONObject) raw.get("header");
            ArrayList<String> keys = new ArrayList<>();
            ArrayList<String> keyValues = new ArrayList<>();
            Iterator<?> iterator = tableHeader.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (!key.equals("primaryKey")){
                    keys.add(key);
                    keyValues.add(tableHeader.get(key).toString());
                }
            }
            boolean isLeftColumn = false;
            String left=isValueAColumn(whereClause.getChild(0).getText(), keys);
            if (left.equals("")){
                left = whereClause.getChild(0).getText();
            }else {
                isLeftColumn = true;
            }
            boolean isRightColumn = false;
            print(whereClause.getText());
            String right = isValueAColumn(whereClause.getChild(2).getText(),keys);
            if (right.equals("")) {
                right = whereClause.getChild(2).getText();
            }else {
                isRightColumn = true;
            }
            FileWriter tempFile = new FileWriter(Databases + "/" +/*  TODO uncomment globalVariables.getBaseDeDatosEnUso()+*/"santiago" + "/temp"  + ".json");
            BufferedWriter bufferedWriter = new BufferedWriter(tempFile);
            bufferedWriter.write(temporal);
            while ((temporal = bufferedReader.readLine()) != null){
                JSONObject tempJSON = new JSONObject(temporal);
                String leftWhere="";
                if(isLeftColumn){
                    leftWhere = tempJSON.getString(left);
                }else{
                    leftWhere = left;
                }
                String rightWhere = "";
                if (isRightColumn){
                    rightWhere = tempJSON.getString(right);
                }else{
                    rightWhere = right;
                }
                String type = getType(rightWhere);
                if (type.equals(getType(leftWhere))) {
                    print(String.valueOf(evaluateWhereClause(whereClause, tempJSON, keys)));
                    if (!evaluateWhereClause(whereClause, tempJSON, keys)) {
                        bufferedWriter.write(temporal);
                    }
                }else{
                    // TODO return error where operator types missmatches
                }
                // TODO RENAME FILE AND DELETE BAD ONE
            }
            tempFile.close();
            fileJSON.close();
        }catch (Exception e){
            e.printStackTrace();
            //TODO return error
        }
    }

    public void insertIntoTable(String tableName, ArrayList<String> values, ArrayList<String> columns) throws JSONException {
        try {
            FileReader fileJSON = new FileReader(Databases + "/" + globalVariables.getBaseDeDatosEnUso()+ "/" + tableName + ".json");
            BufferedReader bufferedReader = new BufferedReader(fileJSON);
            String temporal = bufferedReader.readLine();
            JSONObject raw = new JSONObject(temporal);
            JSONObject tableHeader = (JSONObject) raw.get("header");
            ArrayList<String> keys = new ArrayList<>();
            ArrayList<String> keyValues = new ArrayList<>();
            Iterator<?> iterator = tableHeader.keys();
            while( iterator.hasNext() ) {
                String key = (String) iterator.next();
                System.out.println("YALL"+key + "+"+tableHeader.get(key).toString());
                keys.add(key);
                keyValues.add(tableHeader.get(key).toString());
            }
            int numberOfCol = keys.size()-1 /* TODO Define number of actual columns and if's*/;
            fileJSON.close();
            /*
                1rs Case: No columns were written explicitly
             */
            if(columns == null){
                /*
                    1rst Case: all values are inserted
                 */
                if(values.size() == numberOfCol){
                    JSONObject insert = new JSONObject();
                    for(int i = 0; i<keys.size() ; i ++){
                        if(!keys.get(i).equals("primaryKey")){
                            boolean typeCheck = checkType(values.get(i), keyValues.get(i));
                            if(typeCheck){
                                insert.put(keys.get(i), values.get(i));
                            }
                        }
                    }

                    FileWriter file = new FileWriter(Databases + "/" + globalVariables.getBaseDeDatosEnUso() + "/" + tableName + ".json",true);
                    file.append("\n"+insert.toString());
                    file.close();
                }else if ((values.size() == numberOfCol -1 )){
                /*
                    2nd Case: all values are inserted BUT the primary autoincrementable integer key
                 */
                    String primaryKey = "";
                    boolean hasKey = false;
                    for (String key : keys){
                        if(key.equals("primaryKey")) {
                            primaryKey = keyValues.get(keys.indexOf(key));
                            hasKey =  true;
                        }
                    }
                    if(hasKey){
                        int primaryValue = getLastPrimaryKeyGiven(primaryKey, tableName) + 1;
                        JSONObject insert = new JSONObject();
                        for(int i = 0; i<keys.size() ; i ++){
                            if(!keys.get(i).equals("primaryKey")){
                                if(keys.get(i).equals(primaryKey)){
                                    print("OVER HERE"+keys.get(i));
                                    if(keyValues.get(i).equals("INT")){
                                        insert.put(primaryKey, String.valueOf(primaryValue));
                                    }else{
                                        // TODO return error misisng valye, primary key is not an integer
                                    }
                                }else {
                                    print(values.toString());
                                    print("V"+values.get(i-1)+"K"+keyValues.get(i));
                                    boolean typeCheck = checkType(values.get(i-1), keyValues.get(i));
                                    if (typeCheck) {
                                        insert.put(keys.get(i), values.get(i-1));
                                    }
                                }
                            }
                        }

                        FileWriter file = new FileWriter(Databases + "/" + globalVariables.getBaseDeDatosEnUso() + "/" + tableName + ".json",true);
                        file.append("\n"+insert.toString());
                        file.close();
                    }else{
                        // TODO return error missing value
                    }
                }else{
                    // TODO return error missing value
                }
            }else {
            /*
            2nd Case: Columns were written explicitly
            */
                if (values.size() == columns.size()) {
                    JSONObject insert = new JSONObject();
                    String primaryKey = "";
                    boolean hasKey = false;
                    for (String key : keys) {
                        if (key.equals("primaryKey")) {
                            primaryKey = keyValues.get(keys.indexOf(key));
                            hasKey = true;
                        }
                    }
                    for (int i = 0; i < keys.size(); i++) {
                        if (!keys.get(i).equals("primaryKey")) {
                            boolean valueFound = false;
                            for (int j = 0; j < columns.size(); j++) {
                                if (columns.get(j).equals(keys.get(i))) {
                                    valueFound = true;
                                    boolean typeCheck = checkType(values.get(j), keyValues.get(i));
                                    if (typeCheck) {
                                        insert.put(columns.get(j), values.get(j));
                                    }
                                }
                            }
                            if (!valueFound) {
                                /*
                                3rd Case: Columns were written explicitly but the primary key
                                 */
                                if (keys.get(i).equals(primaryKey)) {
                                    int primaryValue = getLastPrimaryKeyGiven(primaryKey, tableName) + 1;
                                    insert.put(primaryKey, String.valueOf(primaryValue));
                                } else {
                                    insert.put(keys.get(i), "");
                                }
                            }

                        }
                    }
                    FileWriter file = new FileWriter(Databases + "/" + globalVariables.getBaseDeDatosEnUso() + "/" + tableName + ".json", true);
                    file.append("\n" + insert.toString());
                    file.close();
                }else{
                    // TODO return error number of values and columns don't match
                }
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }

    public boolean evaluateWhereClause( ParseTree whereClause, JSONObject row, ArrayList<String> columns) throws ParseException, JSONException {
        //Checking that the tree is the main one
        if(whereClause.getChildCount()==1)
            whereClause = whereClause.getChild(0);
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
            return evaluateWhereClause(whereClause.getChild(0), row, columns) && evaluateWhereClause(whereClause.getChild(2), row, columns);
        }else{
            return  evaluateWhereClause(whereClause.getChild(0), row, columns) || evaluateWhereClause(whereClause.getChild(2), row, columns);
        }
    }

    public int getLastPrimaryKeyGiven(String primaryKey, String tableName) throws IOException, JSONException {
        FileReader fileJSON = new FileReader(Databases + "/" + tableName + "/" + tableName + ".json");
        BufferedReader bufferedReader = new BufferedReader(fileJSON);
        String last = "";
        String temp = "";
        while(true){
            last = bufferedReader.readLine();
            if(last ==null){
                last = temp;
                break;
            }
            print(last);
            temp = bufferedReader.readLine();
            if(temp==null){
                break;
            }
        }
        JSONObject raw = new JSONObject(last);
        System.out.println("YAS QUEEN!"+Integer.parseInt(String.valueOf(raw.get(primaryKey))));
        fileJSON.close();
        return Integer.parseInt(raw.get(primaryKey).toString());
    }

    public String isValueAColumn(String value, ArrayList<String> keys){
        if(value.indexOf("'") < 0)
            return "";
        if(getType(value).equals("CHAR")){
            String column = "";
            for(String t : keys){
                if (value.equals(t))
                    column = t;
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

    public boolean checkType(String value, String desiredType){
        if (desiredType.equals("INT")){
            try{
                int intVale = Integer.parseInt(value);
            }catch (Exception e){
                // TODO Send error
                e.printStackTrace();
                return false;
            }
        }else if(desiredType.equals("FLOAT")){
            try{
                float intVale = Float.parseFloat(value);
            }catch (Exception e){
                // TODO Send error
                e.printStackTrace();
                return false;
            }
        }else if(desiredType.equals("DATE")){
            try {

                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                // Standard date input YEAR '-' MONTH '-' DAY
                Date date = format.parse(value);
            }catch (Exception e){
                // TODO Send error
                e.printStackTrace();
                return false;
            }
        }else{
//            int lengthOfChar = Integer.parseInt(desiredType.substring(desiredType.indexOf("(")+1,
//                    desiredType.indexOf(")")));
//            if(value.length() != lengthOfChar){
//                // TODO Send error
//                return false;
//            }
            return true;
        }

        return true;
    }

    public void print(String printable){
        System.out.println(printable);
    }
}
