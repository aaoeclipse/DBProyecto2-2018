package fileManager;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


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
    public void createTable(String nombre, List<String> atributos, String pk, List<String> fk){

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

            file.write(table.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void insertIntoTable(String tableName, ArrayList values, ArrayList columns) {
        try (FileWriter file = new FileWriter(Databases + "/" + globalVariables.getBaseDeDatosEnUso() + "/" + tableName + ".json")) {
            JSONParser parser = new JSONParser();
            FileReader fileJSON = new FileReader(Databases + "/" + globalVariables.getBaseDeDatosEnUso() + "/" + tableName + ".json");
            BufferedReader bufferedReader = new BufferedReader(fileJSON);
            String temporal = bufferedReader.readLine();
            System.out.println("GIRLLL + "+ temporal);
            JSONObject tableHeader = (JSONObject) parser.parse(temporal);

            ArrayList<String> keys = new ArrayList<>();
            ArrayList<String> keyValues = new ArrayList<>();
            for(Object o : tableHeader.keySet()){
                String key = (String) o;
                keys.add(key);
                keyValues.add((String)tableHeader.get(key));
            }
            System.out.println("SIZE " + keys.size());
            String raw = new String(Files.readAllBytes(Paths.get(tableName)), StandardCharsets.UTF_8);
             //= new JSONObject(raw);
        } catch (IOException  | ParseException e) {
            e.printStackTrace();
        }
    }
}
