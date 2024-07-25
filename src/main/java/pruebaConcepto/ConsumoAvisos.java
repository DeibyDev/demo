/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaConcepto;

import com.claro.ppde.PingPlotterDF;
import com.claro.ppde.SMPPDE;
import com.claro.ppde.SMPPDE_Service;
import java.util.List;

/**
 *
 * @author gachae
 */
public class ConsumoAvisos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            SMPPDE_Service avisos = new SMPPDE_Service();
            SMPPDE smppde = avisos.getSMPPDEPort();

            List<PingPlotterDF> respuesta = smppde.smppde();

            String evaluacionTitulo = "MOC-MOC-AN01";
            int posicion = 1;

            for (PingPlotterDF pingPlotterDF : respuesta) {
                if (pingPlotterDF.getTitle().contains(evaluacionTitulo)) {
                    System.out.println("Estoy en la iteracion: " + posicion);
                    System.out.println("Valores obtenidos desde proyacto propio: " + pingPlotterDF.getTitle() + " " + pingPlotterDF.getTitle() + "\n");
                }
                //System.out.println("Valores obtenidos desde proyacto propio: " + pingPlotterDF.getTitle() + " " + pingPlotterDF.getTitle() + posicion + "\n");
                posicion++;
            }

        } catch (Exception e) {
            System.out.println("Error al traer los avisos: " + e.getMessage());
        }
    }

}
