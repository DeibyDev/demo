/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.services;

import client.runws.ServiceData;
import co.com.claro.autodiagnosticoincidentesnegocios.dto.AsociacionDTO;
import co.com.claro.autodiagnosticoincidentesnegocios.soapClient.RelationCpeOltPeBean;
import com.claro.matriz.Ont;
import com.claro.ppde.PingPlotterDF;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gachae
 */
@Local
public interface GetServicesSoap {

    List<RelationCpeOltPeBean> getRelation(String idService) throws Exception;

    String getUltimaMilla(String testName, ServiceData serviceData);

    String getEstadoTroncal(String swInterFace, String swIp);

    List<PingPlotterDF> getListadoAvisos();

    void asoiciarNotaIM(AsociacionDTO asociacionDTO);

    List<Ont> listadoOntZte(String service, String ipsw);

    List<Ont> listadoOntHuawei(String service, String ipsw);

}
