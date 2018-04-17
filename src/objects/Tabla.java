package objects;

import java.util.ArrayList;

public class Tabla {
    private String nombre;
    private ArrayList<Columna> columnas;

    public Tabla(String nombre, ArrayList<Columna> columnas) {
        this.nombre = nombre;
        this.columnas = columnas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Columna> getColumnas() {
        return columnas;
    }

    public void setColumnas(ArrayList<Columna> columnas) {
        this.columnas = columnas;
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "nombre='" + nombre + '\'' +
                ", columnas=" + columnas +
                '}';
    }
}
