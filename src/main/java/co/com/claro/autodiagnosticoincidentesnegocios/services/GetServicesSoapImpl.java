/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.services;

import client.runws.ProbeVO;
import client.runws.Runws;
import client.runws.Runws_Service;
import client.runws.ServiceData;
import co.com.claro.autodiagnosticoincidentesnegocios.conexion.ConexionDiagnoticadorFO;
import co.com.claro.autodiagnosticoincidentesnegocios.constants.Constantes;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.AsociacionDTO;
import co.com.claro.autodiagnosticoincidentesnegocios.soapClient.RelationCpeOltPe;
import co.com.claro.autodiagnosticoincidentesnegocios.soapClient.RelationCpeOltPeBean;
import co.com.claro.autodiagnosticoincidentesnegocios.soapClient.RelationCpeOltPeService;
import com.claro.matriz.Exception_Exception;
import com.claro.matriz.MalformedURLException_Exception;
import com.claro.matriz.Ont;
import com.claro.matriz.ServiceNeighborsWs;
import com.claro.matriz.ServiceNeighborsWs_Service;
import com.claro.ppamdiag.IMasociarWS;
import com.claro.ppamdiag.IMasociarWS_Service;
import com.claro.ppde.IOException_Exception;
import com.claro.ppde.PingPlotterDF;
import com.claro.ppde.SMPPDE;
import com.claro.ppde.SMPPDE_Service;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author gachae
 */
@Stateless
public class GetServicesSoapImpl implements GetServicesSoap {

    @Override
    public List<RelationCpeOltPeBean> getRelation(String idService) throws Exception {

        Integer readTimeout = 0;
        try {
//            String urlString = config.find(EConfigProperty.WS_EXT_CMDBWEBSERVICES_ENDPOINT);
//           readTimeout = config.findInteger(EConfigProperty.WS_EXT_CMDBWEBSERVICES_TIMEOUT);

            String cpeIp = null;
            String cpeMac = null;

            URL url = new URL("http://localhost:9090/CMDBWebServices/services/RelationCpeOltPe");

            //  UtilPingConection.testConectionWsdl(url);
            RelationCpeOltPeService service = new RelationCpeOltPeService(url);
            RelationCpeOltPe management = service.getRelationCpeOltPe();

            BindingProvider bindingProvider = (BindingProvider) management;
            Map<String, Object> requestContext = bindingProvider.getRequestContext();
            requestContext.put(Constantes.TIMEOUT_CONNECT_JAX, (readTimeout * 1000));
            requestContext.put(Constantes.TIMEOUT_REQUEST_JAX, (readTimeout * 1000));
            return management.getServiceRelation(idService, cpeIp, cpeMac);

        } catch (Exception ex) {
            if (ex.getCause() instanceof SocketTimeoutException) {
                throw new Exception(String.format(Constantes.WS_MSG_SOCKETTIMEOUT,
                        "CMDBWebServices.getServiceRelation",
                        readTimeout));
            }
            throw ex;
        }

    }

    @Override
    public String getUltimaMilla(String testName, ServiceData serviceData) {

        String url = ConexionDiagnoticadorFO.urlDiagnosticadorFO().toString();
        String puerto = ConexionDiagnoticadorFO.puertoDiagnosticadorFO().toString();

        try {
            //Crear instancia del servcio
            URL wsdlURL = new URL("http://" + url + ":" + puerto + "/Diagpymews/Runws?wsdl"); //localhost:8282/Diagpymews/Runws?wsdl");
            QName SERVICE_NAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "Runws");
            Runws_Service service = new Runws_Service(wsdlURL, SERVICE_NAME);
            Runws port = service.getRunwsPort();

            // Invocar el método run
            ProbeVO runResult = port.run(testName, serviceData);

            return runResult.getOutput();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (WebServiceException e) {
            e.printStackTrace();
        }
        return "n";
    }

    @Override
    public String getEstadoTroncal(String swInterFace, String swIp) {

        try {
            ServiceNeighborsWs_Service service = new ServiceNeighborsWs_Service();
            ServiceNeighborsWs port = service.getServiceNeighborsWsPort();

            String result = port.getStateTroncalHuawei(swInterFace, swIp);

            return result;

        } catch (Exception e) {
            System.out.println("Error de verificacion en troncal: " + e.getMessage());
        }

        return "n";
    }

    @Override
    public List<PingPlotterDF> getListadoAvisos() {
        try {

            SMPPDE_Service avisos = new SMPPDE_Service();
            SMPPDE smppde = avisos.getSMPPDEPort();
            List<PingPlotterDF> lstAvisos = smppde.smppde();

            return lstAvisos;

        } catch (IOException_Exception e) {
            System.out.println("Error al obtener el listado de avisos: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void asoiciarNotaIM(AsociacionDTO asociacionDTO) {

        IMasociarWS_Service asociar = new IMasociarWS_Service();
        IMasociarWS iMasociarWS = asociar.getIMasociarWSPort();

        iMasociarWS.iMasociarWS(asociacionDTO.getIncidencia(),
                asociacionDTO.getFechaOpenIm(),
                asociacionDTO.getEstadoIM(),
                asociacionDTO.getGrupoIM(),
                asociacionDTO.getTituloIM(),
                asociacionDTO.getPrioridadIM(),
                asociacionDTO.getUsuario(),
                asociacionDTO.getIdServicio(),
                asociacionDTO.getCpeip());
    }

    @Override
    public List<Ont> listadoOntZte(String service, String ipsw) {
        ServiceNeighborsWs_Service serviceNeighborsWs = new ServiceNeighborsWs_Service();
        ServiceNeighborsWs neighborsWs = serviceNeighborsWs.getServiceNeighborsWsPort();
        return neighborsWs.getMatrizOntZte(service, ipsw);
    }

    @Override
    public List<Ont> listadoOntHuawei(String service, String ipsw) {
        ServiceNeighborsWs_Service serviceNeighborsWs = new ServiceNeighborsWs_Service();
        ServiceNeighborsWs neighborsWs = serviceNeighborsWs.getServiceNeighborsWsPort();
        try {
            return neighborsWs.getMatrizOntHuawei(service, ipsw);
        } catch (Exception_Exception | MalformedURLException_Exception ex) {
            Logger.getLogger(GetServicesSoapImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();

    }

}
