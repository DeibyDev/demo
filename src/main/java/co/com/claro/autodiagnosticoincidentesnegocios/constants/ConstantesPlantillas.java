/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.autodiagnosticoincidentesnegocios.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jader Yepez
 */
public class ConstantesPlantillas {
    
    //Tipos de falllas para las plantillas
    public static final String INTERNET_CAIDO = "Internet Caído";
    public static final String INTERMITENCIA = "Intermitencia";
    public static final String LENTITUD = "Lentitud";
    public static final String FALLA_PBX = "Falla De PBX";
    public static final String SIN_SALIDA = "Sin Salida De Llamadas";
    public static final String FALLA_WIFI = "Falla WIFI";
    public static final String SIN_INGRESO_LLAMADAS = "Sin ingreso de llamadas";
    public static final String SIN_TONO = "Sin Tono";
    public static final String OTROS = "Otros";
    
    public static final List<String> LIST_TYPE_FALLAS_ONYX = Collections.unmodifiableList(
            Arrays.asList(
                    INTERNET_CAIDO,INTERMITENCIA,LENTITUD, FALLA_PBX,
                    SIN_SALIDA,FALLA_WIFI,SIN_INGRESO_LLAMADAS,SIN_TONO,
                    OTROS
            ));
    
    // Tipos de Permisos Requeridos o marca bool
    public static final List<String> BOLL = Collections.unmodifiableList(
            Arrays.asList("SI", "NO"));
    
    public static final List<String> BOLLOPTIONS = Collections.unmodifiableList(
            Arrays.asList("NO", "Parafiscales", "Curso Alturas", "Correo", OTROS));
    
    // horarioAtencion
    public static final List<String> HORARIOATENCION = Collections.unmodifiableList(
            Arrays.asList("L - V 8 -18 hs",
                              "L - V 8 -17 hs",
                              "S 8 - 12 hs",
                              "L - D 7x24 hs"));
    
    // horarioAtencionNoHabil
    public static final List<String> HORARIOATENCIONNOHABIL = Collections.unmodifiableList(
            Arrays.asList("S 8 - 12 hs",
                              "S 8 - 17 hs",
                              "D - F 8 - 12 hs",
                              "D – F 8 - 17 hs"));
    
    //Subsegmento
    public static final String CLIENTES_ESPECIALES = "Clientes especiales";
    public static final String CLIENTES_ESPECIALES_BBVA = "Clientes especiales BBVA";
    public static final String CLIENTES_ESPECIALES_EXITO = "Clientes especiales ÉXITO";
    public static final String CNOC_CORPORATIVO = "CNOC corporativo";
    public static final String NOC_VIP = "NOC VIP";
    public static final String SOPORTE_CORPORATIVO = "Soporte corporativo – IRE";
    public static final String GESTION_INMEDIATA = "Gestión inmediata empresas";
    public static final String FRONT_NEGOCIOS_AST = "Front negocios AST";
    public static final String FRONT_NEGOCIOS_COS = "Front negocios COS";
    public static final String GESTION_INMEDIATA_NEGOCIOS = "Gestión inmediata negocios";
    public static final String NOC_PYMES = "NOC Pymes";
    public static final String BACK_NEGOCIOS = "Back negocios";
    public static final String FRONT_EMPRESAS_ESTANDAR = "Front empresas estándar";
    public static final String CLIENTES_ESPECIALES_ALKOSTO = "Clientes especiales ALKOSTO";
    
    public static final List<String> SUBSEGMENTO = Collections.unmodifiableList(
            Arrays.asList(CLIENTES_ESPECIALES,CLIENTES_ESPECIALES_BBVA,
                    CLIENTES_ESPECIALES_EXITO,CNOC_CORPORATIVO,NOC_VIP,
                    SOPORTE_CORPORATIVO,GESTION_INMEDIATA,FRONT_NEGOCIOS_AST,
                    FRONT_NEGOCIOS_COS,GESTION_INMEDIATA_NEGOCIOS,NOC_PYMES,
                    BACK_NEGOCIOS,FRONT_EMPRESAS_ESTANDAR,CLIENTES_ESPECIALES_ALKOSTO,OTROS));
    
    //descricionActividad Plantilla de Datos
    public static final String CERTIFICAR_SERVICIOS = "Certificar servicio";
    public static final String REVISAR_CONEXIONES_FISICAS = "Revisar Conexiones Físicas";
    public static final String POSIBLE_CAMBIO_EQUIPO = "Posible cambio de equipo";
    public static final String REVISION_CONFIGURACION_EQUIPO = "Revisión Configuración Equipo";
    public static final String VALIDA_CABLEADO = "Validar Cableado Interno";
    public static final String VALIDA_ANCHO_BANDA = "Validación Ancho de Banda";
    public static final String CERTIFICAR_EQUIPO = "Certificar Equipo";
    public static final String RECUPERAR_GESTION_EQUIPO = "Recuperar Gestión de equipo";
    public static final String REPLANTEAMIENTO_ACOMETIDA = "Replanteamiento de acometida";
    public static final String VALIDA_REDES_INTERNAS = "Validar Redes Internas";
    
    public static final List<String> DESCRIPCION_ACTIVIDAD = Collections.unmodifiableList(
            Arrays.asList(CERTIFICAR_SERVICIOS,REVISAR_CONEXIONES_FISICAS,
                    POSIBLE_CAMBIO_EQUIPO, REVISION_CONFIGURACION_EQUIPO, 
                    VALIDA_CABLEADO, VALIDA_ANCHO_BANDA,CERTIFICAR_EQUIPO,
                    RECUPERAR_GESTION_EQUIPO, REPLANTEAMIENTO_ACOMETIDA, 
                    VALIDA_REDES_INTERNAS, OTROS));
    
    //descricionActividad Plantilla de OT Planta Externa
    public static final String CERTIFICAR_FIBRA = "Certificar Fibra desde cliente";
    public static final String CERTIFICAR_FIBRA_SDS = "Certificar Fibra desde SDS";
    public static final String CAMBIO_PIGTAIL = "Cambio de Pigtail";
    public static final String AJUSTAR_POTENCIA = "Ajustar Potencias Atenuadas";
    public static final String PROSIBLE_HILO_TROCADO = "Posible Hilo Trocado";
        
    public static final List<String> DESCRIPCION_ACTIVIDAD_PLANTA_EXTERNA = Collections.unmodifiableList(
            Arrays.asList(CERTIFICAR_FIBRA,CERTIFICAR_FIBRA_SDS,
                    CAMBIO_PIGTAIL, AJUSTAR_POTENCIA, PROSIBLE_HILO_TROCADO, OTROS));
    
    public static final List<String> EQUIPO_ALTERNATIVO = Collections.unmodifiableList(
            Arrays.asList("GAOKE","ONT L3 F680", "ONT L3 HUAWEI EG8245",
                    "CISCO 891", "HUAWEI AR617", "HUAWEI AR611", "HUAWEI AR651",
                    "HUAWEI AR6120", "ISR CISCO C11 TRV", "DEMARCADOR", "OTROS"));
    
    public static final List<String> ENLACE_PPAL_BACKUP = Collections.unmodifiableList(
            Arrays.asList("PRINCIPAL", "BACKUP"));
    
    
}
