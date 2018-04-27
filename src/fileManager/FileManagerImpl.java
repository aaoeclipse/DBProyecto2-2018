package fileManager;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

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

        header.put("primaryKey",pk.split(" ")[2]);
        for(int i = 0;i<atributos.size();i++){
            String[] attr = atributos.get(i).split(" ");
            header.put(attr[0],attr[1]);
        }
        table.put("header",header);
        System.out.println(Databases);
        try (FileWriter file = new FileWriter(Databases+"/"+globalVariables.getBaseDeDatosEnUso()+"/"+nombre+".json")) {

            file.write(table.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
