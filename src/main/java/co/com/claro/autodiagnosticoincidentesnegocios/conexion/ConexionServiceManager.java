/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.conexion;

/**
 *
 * @author gachae
 */
public class ConexionServiceManager {

    /*
    Desarrollo Configuracion
     */
    //Servidor Desarrollo
    public static String urlDesarollo = "localhost";
    public static String userDesarrollo = "SMDIAGNOSTICADORFO";
    public static String passDesarollo = "$Md[46n@St1caD0R7O";
    public static String puertoDesarrollo = "13090";

    /*
     Produccion Configuracion
     */
    //Servidor Produccion
    public static String urlProduccion = "172.22.108.160";
    public static String userProduccion = "SMDIAGNOSTICADORFO";
    public static String passProduccion = "$Md[46n@St1caD0R7O";
    public static String puertoProduccion = "14093";

    //Mode = 0; Local Mode = 1 Produccion
    public static int mode = 0;

    //Informacion para servidor de conexion Service Manager.
    public static String urlServiceManager() {
        return (mode == 0) ? urlDesarollo : urlProduccion;
    }

    public static String userServiceManager() {
        return (mode == 0) ? userDesarrollo : userProduccion;
    }

    public static String passServiceManager() {
        return (mode == 0) ? passDesarollo : passProduccion;
    }

    public static String puertoServiceManager() {
        return (mode == 0) ? puertoDesarrollo : puertoProduccion;
    }

}
