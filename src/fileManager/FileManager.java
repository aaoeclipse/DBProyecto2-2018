package fileManager;


public interface FileManager {
    /** TODO LIST
     *      7. ALTER TABLE nombre RENAME TO nuevo_nombre ; cambia nombre de la tabla
     *      8. ALTER TABLE nombre_accion
     *          8.1 ADD COLUMN nombre_columna tipo [,..]
     *          8.2 ADD CONSTRAINT C
     *          8.3 DROP COLUMN nombre_columna
     *          8.4 DROP CONSTRAINT nombre_constraint
     *    UPDATE nombre SET columna = valor [..,] WHERE condición
     *      Se actualizan los valores de las columnas especificadas en todas las filas que satisfagan la condición.
     *      Si la cláusula WHERE está ausente, el efecto es modificar todas las filas de la tabla.
     *      Únicamente las columnas a ser modificadas deben ser mencionadas en la cláusula SET .
     *      Las columnas que no sean explícitamente modificadas retendrán sus valores previos.
     *      Como salida, al terminar exitosamente un UPDATE se muestra en pantalla lo siguiente
     *          UPDATE (cont) con éxito , donde cont es la cantidad de filas modificadas.
     *
     */


    public boolean createDB(String nombre);
    public String[] showDatabases();
    public boolean useDatabase(String nombreDeBaseDeDatos);
    public String[] listTables();
    public boolean renameTable(String nombreTablaViejo, String nombreTablaNuevo);
    public boolean alterAddColumn(String nombreDeTabla, String nombreDeColumna, String tipo);
    public boolean alterAddConstraint(String nombreDeTabla, String nombreDeconstraint, String tipoDeConstraint, String columna);
    public boolean alterDropColumn(String nombreDeTabla, String nombreDeColumnaParaDrop);
    public boolean alterDropConstraint(String nombreDeTabla, String nombreDeConstraintParaBotar);
    public boolean updateNoWhere(String nombreDeTabla, String nombreDecolumna, String nuevoValor);
    public boolean updateConWhere();

}
