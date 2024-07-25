/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.dto;

/**
 *
 * @author gachae
 */
public class AsociacionDTO {

    private String marca;
    
    private String incidencia;
    private String fechaOpenIm;
    private String estadoIM;
    private String grupoIM;
    private String tituloIM;
    private String prioridadIM;
    private String usuario;
    private String idServicio;
    private String cpeip;

    public AsociacionDTO(String incidencia, String fechaOpenIm, String estadoIM, String grupoIM, String tituloIM, String prioridadIM, String usuario, String idServicio, String cpeip) {
        this.incidencia = incidencia;
        this.fechaOpenIm = fechaOpenIm;
        this.estadoIM = estadoIM;
        this.grupoIM = grupoIM;
        this.tituloIM = tituloIM;
        this.prioridadIM = prioridadIM;
        this.usuario = usuario;
        this.idServicio = idServicio;
        this.cpeip = cpeip;
    }

    public AsociacionDTO() {
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getFechaOpenIm() {
        return fechaOpenIm;
    }

    public void setFechaOpenIm(String fechaOpenIm) {
        this.fechaOpenIm = fechaOpenIm;
    }

    public String getEstadoIM() {
        return estadoIM;
    }

    public void setEstadoIM(String estadoIM) {
        this.estadoIM = estadoIM;
    }

    public String getGrupoIM() {
        return grupoIM;
    }

    public void setGrupoIM(String grupoIM) {
        this.grupoIM = grupoIM;
    }

    public String getTituloIM() {
        return tituloIM;
    }

    public void setTituloIM(String tituloIM) {
        this.tituloIM = tituloIM;
    }

    public String getPrioridadIM() {
        return prioridadIM;
    }

    public void setPrioridadIM(String prioridadIM) {
        this.prioridadIM = prioridadIM;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getCpeip() {
        return cpeip;
    }

    public void setCpeip(String cpeip) {
        this.cpeip = cpeip;
    }

}
