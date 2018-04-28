package utils;

import objects.Columna;
import objects.Tabla;
import objects.Valor;

import java.util.ArrayList;

public class manager {
    private ArrayList<Columna> columnas;
    public String[][] toTable(Tabla table){
        columnas = table.getColumnas();
        String[][] columnsByRow;
        columnsByRow = new String [columnas.getSize()][];
    }
}
