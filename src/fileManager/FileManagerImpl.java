package fileManager;

import java.io.File;

public class FileManagerImpl implements FileManager {
    @Override
    public boolean createDB(String nombre) {
        new File(nombre).mkdirs();
        return true;
    }
}
