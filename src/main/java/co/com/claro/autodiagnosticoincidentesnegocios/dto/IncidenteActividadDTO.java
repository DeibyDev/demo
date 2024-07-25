/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.dto;

import java.util.List;

/**
 *
 * @author deiby-sierra
 */
public class IncidenteActividadDTO {
    
    private List<String> descripcion;
    private String incidenteRelacionado;
    private TipoIncidente incidente;

    public IncidenteActividadDTO(List<String> descripcion, String incidenteRelacionado, TipoIncidente incidente) {
        this.descripcion = descripcion;
        this.incidenteRelacionado = incidenteRelacionado;
        this.incidente = incidente;
    }
    
    

    public List<String> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(List<String> descripcion) {
        this.descripcion = descripcion;
    }

    public String getIncidenteRelacionado() {
        return incidenteRelacionado;
    }

    public void setIncidenteRelacionado(String incidenteRelacionado) {
        this.incidenteRelacionado = incidenteRelacionado;
    }

    public TipoIncidente getIncidente() {
        return incidente;
    }

    public void setIncidente(TipoIncidente incidente) {
        this.incidente = incidente;
    }
    
    
}
