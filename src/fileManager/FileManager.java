package fileManager;


public interface FileManager {
    public boolean createDB(String nombre);
    public String[] showDatabases();
    public boolean useDatabase(String nombreDeBaseDeDatos);
    public String[] listTables();
    public boolean renameTable(String nombreTablaViejo, String nombreTablaNuevo);
    public boolean alterAddColumn(String nombreDeTabla, String nombreDeColumna, String tipo);
    public boolean alterAddConstraint(String nombreDeTabla, String tipoDeConstraint, String columna);
    public boolean alterDropColumn(String nombreDeTabla, String nombreDeColumnaParaDrop);
    public boolean alterDropConstraint(String nombreDeTabla, String nombreDeConstraintParaBotar);
    public boolean updateNoWhere(String nombreDeTabla, String nombreDecolumna, String nuevoValor);
    public boolean updateConWhere();
}
