/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.scheduledTask;


import co.com.claro.autodiagnosticoincidentesnegocios.services.AutoDiagnosticoImpl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

/**
 *
 * @author gachae
 */
public class TaskManager extends TimerTask {

    private AutoDiagnosticoImpl autoDiagnosticoImpl;

    public TaskManager(AutoDiagnosticoImpl autoDiagnosticoImpl) {
        this.autoDiagnosticoImpl = autoDiagnosticoImpl;
    }



    @Override
    public void run() {
        LocalDateTime hora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatoFechaHora = hora.format(formato);

        System.out.println("Ejecución: " + formatoFechaHora);

        autoDiagnosticoImpl.ejecutar();
    }

}
