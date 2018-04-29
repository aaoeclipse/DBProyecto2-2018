package fileManager;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public interface FileManager {
    /** TODO LIST
     *      1. CREATE DB
     *      2. ALTER TABLE nombre RENAME TO nuevoNombre ; cambia nombre de DB
     *      3. DROP DB
     *      4. SHOW DB
     *      5. USE DB
     *      6. CREATE TABLE
     *          6.1 CREATE TABLE nombre(nombre columna tipo (default valor) ? [,..] CONTRAINT C [,..)
     *          6.2 c puede ser
     *              6.2.1   nombre_constraint PRIMARY KEY (nombre_columna [,..])
     *              6.2.2   nombre_constraint FOREIGN KEY (nombre_columna [,..] REFERENCES nombre_table (nombre_columna [,..])
     *              6.2.3   nombre_constraint CHECK (exp)
     *              6.2.4   nombre_constraint UNIQUE (nombre_columna [,..])
     *          6.3 Tipos disponibles
     *              6.3.1   INT
     *              6.3.2   FLOAT
     *              6.3.3   DATE
     *              6.3.4   CHAR
     *          6.4 exp puede ser una expresion booleana
     *              6.4.1   Logicos: AND, OR, NOT, IS NULL, IS NOT NULL
     *              6.4.2   Relaciones  <, <=, >, <, =, >, =>
     *      7. ALTER TABLE nombre RENAME TO nuevo_nombre ; cambia nombre de la tabla
     *      8. ALTER TABLE nombre_accion
     *          8.1 ADD COLUMN nombre_columna tipo [,..]
     *          8.2 ADD CONSTRAINT C
     *          8.3 DROP COLUMN nombre_columna
     *          8.4 DROP CONSTRAINT nombre_constraint
     *      9. DROP TABLE nombre
     *      10.SHOW TABLES
     *      11.SHOW COLUMNS FROM nombre
     */


    public boolean createDB(String nombre);
    public String[] showDatabases();
    public boolean useDatabase(String nombreDeBaseDeDatos);
    public String[] listTables();
    public void createTable(String nombre, List<String> atributos, String pk, List<String> fk) throws JSONException;
    public void insertIntoTable(String tableName,  ArrayList<String> values,  ArrayList<String> columns) throws JSONException;


}
