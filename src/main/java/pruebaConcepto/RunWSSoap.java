/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaConcepto;

import client.runws.ProbeVO;
import client.runws.Runws;
import client.runws.Runws_Service;
import client.runws.ServiceData;
import co.com.claro.autodiagnosticoincidentesnegocios.conexion.ConexionDiagnoticadorFO;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author gachae
 */
public class RunWSSoap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Otro main funcionando desde incidentes");
        String url = ConexionDiagnoticadorFO.urlDiagnosticadorFO().toString();
        String puerto = ConexionDiagnoticadorFO.puertoDiagnosticadorFO().toString();

        try {
            //Crear instancia del servcio
            URL wsdlURL = new URL("http://" + url + ":" + puerto + "/Diagpymews/Runws?wsdl"); //localhost:8282/Diagpymews/Runws?wsdl");
            QName SERVICE_NAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "Runws");
            Runws_Service service = new Runws_Service(wsdlURL, SERVICE_NAME);
            Runws port = service.getRunwsPort();

            // Preparar los parámetros para el método run
            String testName = "CPE_Ping_Cpe";

            // Crear y configurar el objeto ServiceData
            ServiceData serviceData = new ServiceData();
            serviceData.setCpeHostname("MCJPA12_39");
            serviceData.setCpeIp("10.166.75.218");
            serviceData.setCpeMac("000eb41d50b0");
            serviceData.setCpeVendor("gaoke");
            serviceData.setPeHostname("A9KVALLEDUPAR");
            serviceData.setPeInterface("GigabitEthernet0/0/0/19.1600");
            serviceData.setPeIp("10.10.66.229");
            serviceData.setPeService("MCJPA12");
            serviceData.setPeVrf("pymes-internet");
            serviceData.setSwBrand("huawei");
            serviceData.setSwDesc("INTERNET  - MCJPA12");
            serviceData.setSwHostname("HAC-VAD.VALLEDUPAR-CP1");
            serviceData.setSwInterface("0/1/6:5");
            serviceData.setSwIp("172.30.61.186");

            // Invocar el método run
            ProbeVO runResult = port.run(testName, serviceData);
// Mostrar el resultado
            System.out.println("run Resultado del consumo: \n" + runResult.getOutput());

            if (!runResult.getOutput().contains("0% packet loss")) {
                System.out.println("Ultima milla Down");
            } else {
                System.out.println("Ultima milla UP");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (WebServiceException e) {
            e.printStackTrace();
        }

    }

}
