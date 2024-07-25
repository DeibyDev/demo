/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticador.controller;

import co.com.claro.autodiagnosticoincidentesnegocios.dto.IMNotaDTO;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.IncidenteActividadDTO;
import co.com.claro.autodiagnosticoincidentesnegocios.services.AutoDiagnostico;
import co.com.claro.autodiagnosticoincidentesnegocios.services.GetIncidentesServiceRest;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Stateless
@Path("/diagnostico")
public class controllerAutoDiagnostico {

    @EJB
    private AutoDiagnostico autoDiagnostico;

    @EJB
    private GetIncidentesServiceRest getIncidentesServiceRest;

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

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/consumirServicio")
    public Response ejecutarServicio(IncidenteActividadDTO actividadDTO) {
        getIncidentesServiceRest.crearActividadIncidenteMayor(actividadDTO);
        return Response
                .ok("Proceso Ejecutado")
                .status(Response.Status.OK)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/consumirServicio/{numero}")
    public Response ejecutarServicio(@PathParam("idIncidente") String idIncidente, IMNotaDTO imndto) {
        getIncidentesServiceRest.actualizarActividadIncidenteMayor(idIncidente, imndto);
        return Response
                .ok("Proceso Ejecutado")
                .status(Response.Status.OK)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }

}
