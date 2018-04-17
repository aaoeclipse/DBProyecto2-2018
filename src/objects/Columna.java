package objects;

import java.util.ArrayList;

public class Columna {
    private String cabezera;
    private Tipos tipo;
    private ArrayList<Valor> valores;
    private ArrayList<Restriccion> restriccion;

    public Columna(String cabezera, Tipos tipo, ArrayList<Valor> valores, ArrayList<Restriccion> restriccion) {
        this.cabezera = cabezera;
        this.tipo = tipo;
        this.valores = valores;
        this.restriccion = restriccion;
    }

    public String getCabezera() {
        return cabezera;
    }

    public void setCabezera(String cabezera) {
        this.cabezera = cabezera;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Valor> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Valor> valores) {
        this.valores = valores;
    }

    public ArrayList<Restriccion> getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(ArrayList<Restriccion> restriccion) {
        this.restriccion = restriccion;
    }

    @Override
    public String toString() {
        return "Columna{" +
                "cabezera='" + cabezera + '\'' +
                ", tipo=" + tipo +
                ", valores=" + valores +
                ", restriccion=" + restriccion +
                '}';
    }
}
