package fileManager;

public class globalVariables {
    public static String baseDeDatosEnUso;
    public static boolean utilizandoBaseDeDatos = false;

    public static String getBaseDeDatosEnUso() {
        return baseDeDatosEnUso;
    }

    public static void setBaseDeDatosEnUso(String baseDeDatosEnUso) {
        globalVariables.baseDeDatosEnUso = baseDeDatosEnUso;
    }

    public static boolean getUtilizandoBaseDeDatos() {
        return utilizandoBaseDeDatos;
    }

    public static void setUtilizandoBaseDeDatos(boolean utilizandoBaseDeDatos) {
        globalVariables.utilizandoBaseDeDatos = utilizandoBaseDeDatos;
    }
}
