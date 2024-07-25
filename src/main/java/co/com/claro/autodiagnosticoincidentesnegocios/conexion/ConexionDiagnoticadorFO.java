/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.conexion;

/**
 *
 * @author gachae
 */
public class ConexionDiagnoticadorFO {

    /*
    Desarrollo Configuracion
     */
    //Servidor Desarrollo
    public static String urlDesarollo = "localhost";
    public static String puertoDesarrollo = "8282";

    /*
     Produccion Configuracion
     */
    //Servidor Produccion
    public static String urlProduccion = "172.18.191.79";
    public static String puertoProduccion = "8080";

    //Mode = 0; Local Mode = 1 Produccion
    public static int mode = 0;

    public static String urlDiagnosticadorFO() {
        return (mode == 0) ? urlDesarollo : urlProduccion;
    }

    public static String puertoDiagnosticadorFO() {
        return (mode == 0) ? puertoDesarrollo : puertoProduccion;
    }
}
