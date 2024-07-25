/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaConcepto;

import co.com.claro.autodiagnosticoincidentesnegocios.services.AutoDiagnosticoImpl;

/**
 *
 * @author gachae
 */
public class servicio {

    public static final String WS_MSG_SOCKETTIMEOUT = "Se ha generado un error consumiendo el servicio externo web SOAP: '%s'. El tiempo de espera es superior a %d segundos";

    public static void main(String[] args) throws Exception {

        AutoDiagnosticoImpl autoDiagnosticoImpl = new AutoDiagnosticoImpl();
        autoDiagnosticoImpl.ejecutar();

    }

}
