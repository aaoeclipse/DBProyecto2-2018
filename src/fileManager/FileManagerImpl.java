package fileManager;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

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
    public boolean alterAddColumn() {

        return false;
    }

    @Override
    public boolean alterDeleteColumn() {
        return false;
    }

    @Override
    public boolean alterDropColumn() {
        return false;
    }

    @Override
    public boolean alterDropConstraint() {
        return false;
    }


}
