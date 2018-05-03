package objects;

import java.util.ArrayList;
import java.util.HashMap;

public class Tabla {
    ArrayList<HashMap<String, String>> tabla;

    public Tabla (){
        this.tabla = new ArrayList<>();
    }
    public Tabla(ArrayList<HashMap<String, String>> tabla) {
        this.tabla = tabla;
    }
    public int getLines(){
        return tabla.size();
    }
    public void addRow(HashMap<String, String> newHashmap){
        tabla.add(newHashmap);
    }
    public HashMap<String, String> getRow(int row){
        return tabla.get(row);
    }
    public ArrayList<HashMap<String, String>> getTabla(){
        return tabla;
    }
    public boolean changeValuesNoWhere(String keyColumnName, String newValue){
        for (int i = 1; i < tabla.size(); i++){
            tabla.get(i).put(keyColumnName, newValue);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "tabla=" + tabla +
                '}';
    }
}
