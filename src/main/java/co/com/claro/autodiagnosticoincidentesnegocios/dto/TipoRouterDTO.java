/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.dto;

import java.io.Serializable;

/**
 *
 * @author deiby-sierra
 */
public class TipoRouterDTO implements Serializable {

    private String swip;
    private String interfaceSW;
    private String evaluacionTitulo;

    public String getSwip() {
        return swip;
    }

    public void setSwip(String swip) {
        this.swip = swip;
    }

    public String getInterfaceSW() {
        return interfaceSW;
    }

    public void setInterfaceSW(String interfaceSW) {
        this.interfaceSW = interfaceSW;
    }

    public String getEvaluacionTitulo() {
        return evaluacionTitulo;
    }

    public void setEvaluacionTitulo(String evaluacionTitulo) {
        this.evaluacionTitulo = evaluacionTitulo;
    }

    public TipoRouterDTO() {
    }

    public TipoRouterDTO(String swip, String interfaceSW, String evaluacionTitulo) {

        this.swip = swip;
        this.interfaceSW = interfaceSW;
        this.evaluacionTitulo = evaluacionTitulo;
    }

}
