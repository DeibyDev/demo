/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticador.controller;

import co.com.claro.autodiagnosticoincidentesnegocios.services.AutoDiagnostico;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author deiby-sierra
 */
@Stateless
@Path("/diagnostico")
public class controllerAutoDiagnostico {
    
    @EJB
    private AutoDiagnostico autoDiagnostico;

    
    
    
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/ping")
    public Response ejecutarAutoDiagnosticador() {   
        autoDiagnostico.ejecutar();
            return Response
                    .ok("Proceso Completado")
                    .status(Response.Status.OK)
                    .type(MediaType.APPLICATION_JSON_TYPE)
                    .build();
    }

}
