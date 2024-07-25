/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.claro.autodiagnosticoincidentesnegocios.services;


import co.com.claro.autodiagnosticoincidentesnegocios.utils.ConfigurarTarea;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author gachae
 */
@WebListener
public class EjecutarTarea implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ConfigurarTarea configurarTarea = new ConfigurarTarea();
        configurarTarea.iniciar();

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
