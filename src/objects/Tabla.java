package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Tabla {
    ArrayList<HashMap<String, String>> tabla;
    private ArrayList<String> columnas;

    public Tabla (){
        this.tabla = new ArrayList<>();
        this.columnas = new ArrayList<>();
    }
    public void addColumnas(String columnaParaAdd){columnas.add(columnaParaAdd);}
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
    public boolean checkIfValuesRepeat(String columnName){
        ArrayList<String> listForRepeat = new ArrayList<>();
        Iterator<?> iterator;
        for (HashMap<String, String> hash : tabla){
            for (String s: listForRepeat)
                if (hash.get(columnName).equals(s)){
                    return true;
                } else {
                    listForRepeat.add(hash.get(columnName));
                }
        }
        return false;
    }
    public ArrayList<String> getColumnas(){return columnas;}
    @Override
    public String toString() {
        return "Tabla{" +
                "tabla=" + tabla +
                '}';
    }
}
