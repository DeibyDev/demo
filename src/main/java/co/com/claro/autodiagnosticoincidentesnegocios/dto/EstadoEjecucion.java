/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.dto;

/**
 *
 * @author gachae
 */
public class EstadoEjecucion {
    
    private boolean procesado;
    private String idService;
    private String respuestaSoap;
    private Integer cantidad;

    public EstadoEjecucion(boolean procesado, String idService, String respuestaSoap, Integer cantidad) {
        this.procesado = procesado;
        this.idService = idService;
        this.respuestaSoap = respuestaSoap;
        this.cantidad = cantidad;
    }
    
    

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getRespuestaSoap() {
        return respuestaSoap;
    }

    public void setRespuestaSoap(String respuestaSoap) {
        this.respuestaSoap = respuestaSoap;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "EstadoEjecucion{" + "procesado=" + procesado + ", idService=" + idService + ", respuestaSoap=" + respuestaSoap + ", cantidad=" + cantidad + '}';
    }
    
    
}
