/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.utils;


import co.com.claro.autodiagnosticoincidentesnegocios.scheduledTask.TaskManager;
import co.com.claro.autodiagnosticoincidentesnegocios.services.AutoDiagnosticoImpl;
import co.com.claro.autodiagnosticoincidentesnegocios.services.GetIncidentesServiceRestImpl;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author gachae
 */
public class ConfigurarTarea {

    public void iniciar() {

        try {
            AutoDiagnosticoImpl validacionIncidentesServiceManager = new AutoDiagnosticoImpl();

            Timer tiempo = new Timer();
            TimerTask tarea = new TaskManager(validacionIncidentesServiceManager);

            //tiempo.schedule(tarea, 0, 1800000);
            //tiempo.schedule(tarea, 0, 1000);
            //System.out.println("Ejecucion correcta");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
