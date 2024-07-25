/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaConcepto;

import com.claro.ppamdiag.IMasociarWS;
import com.claro.ppamdiag.IMasociarWS_Service;

/**
 *
 * @author gachae
 */
public class Asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            IMasociarWS_Service asociar = new IMasociarWS_Service();
            IMasociarWS iMasociarWS = asociar.getIMasociarWSPort();
            //Data que retorna PingPlotterDF hasta 
            iMasociarWS.iMasociarWS(
                    "POV0008",
                    "2024-07-24T14:35:25+00:00",
                    "Work In Progress",
                    "EYN - Soporte Back Negocios",
                    "POV0008 + HAC-MED.SANDIEGO-CP2 + 0/5/4/47 + MODEN NO ENCIENDE + MEDELLIN + HUAWEI MA5675",
                    "1", "AutoTicket", "POV0008",
                    "");

        } catch (Exception e) {
        }
    }

}
