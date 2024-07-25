/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaConcepto;

import com.claro.matriz.Exception_Exception;
import com.claro.matriz.ServiceNeighborsWs;
import com.claro.matriz.ServiceNeighborsWs_Service;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author gachae
 */
public class ConsumoTroncal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        ServiceNeighborsWs_Service service = new ServiceNeighborsWs_Service();
        
        ServiceNeighborsWs port = service.getServiceNeighborsWsPort();
        
        
        String interfaceSW= "0/1/10";
        String swIP = "172.30.71.97";
        
        String result = port.getStateTroncalHuawei(interfaceSW, swIP);
        
            System.out.println("Resultado proyecto propio:"  +result);
            
        } catch (Exception_Exception e) {
            System.out.println("Error: " + e.getMessage());
        }catch(WebServiceException we){
            System.out.println("Error en webservice : " + we.getMessage());
        }
    }
    
}
