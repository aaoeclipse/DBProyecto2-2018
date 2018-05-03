package fileManager;

import java.io.File;

public class globalVariables {
    public static String baseDeDatosEnUso;
    public static boolean utilizandoBaseDeDatos = false;
    public static String errorMessage = "";
    // public static File Directory=  new File("DBs/");

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

    public static String getErrorMessage() {
        return errorMessage;
    }

    public static void setErrorMessage(String errorMessage) {
        globalVariables.errorMessage = errorMessage;
    }
    public static void addErrorMessage(String errorMessage) {
        globalVariables.errorMessage += errorMessage;
    }

    public static void resetErrors(){
        globalVariables.errorMessage = "";
    }

    public static String printError(){
        String toReturn = globalVariables.getErrorMessage();
        globalVariables.resetErrors();
        return toReturn;
    }
}
