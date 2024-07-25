/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.services;

import co.com.claro.autodiagnosticoincidentesnegocios.dto.ContentDTO;
import javax.ejb.Local;

/**
 *
 * @author gachae
 */
@Local
public interface GetIncidentesServiceRest {
      ContentDTO getIncidentes();
      
      void crearNotaTrabajo(String titulo, String tipoActualizacion,String notaTrabajo,String estado);
}
