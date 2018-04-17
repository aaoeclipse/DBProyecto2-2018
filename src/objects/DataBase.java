package objects;


import java.util.ArrayList;

public class DataBase {
    private String nombre;
    private String location;
    private ArrayList<Tabla> tablas;

    public DataBase(String nombre, String location, ArrayList<Tabla> tablas) {
        this.nombre = nombre;
        this.location = location;
        this.tablas = tablas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "nombre='" + nombre + '\'' +
                ", location='" + location + '\'' +
                ", tablas=" + tablas +
                '}';
    }
}
