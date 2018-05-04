package fileManager;


import org.antlr.v4.runtime.tree.ParseTree;

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
    public boolean updateConWhere(String nombreDeTabla, String nombreDeColuma, String nuevoValor, ParseTree whereClause);
    // =======================                                                           =================================//
   /* public void createTable(String nombre, ArrayList<String> atributos, String pk, ArrayList<String> fk) throws JSONException;
    public void dropDatabase(String database);
    public void showColumnStatement(String tableName);
    public void deleteFromTable(String tableName, ParseTree whereClause);
    public void insertIntoTable(String tableName,  ArrayList<String> values,  ArrayList<String> columns) throws JSONException;*/

}
