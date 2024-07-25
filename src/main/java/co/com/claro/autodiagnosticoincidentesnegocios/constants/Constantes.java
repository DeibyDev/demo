package co.com.claro.autodiagnosticoincidentesnegocios.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase de constantes. Valores que no cambiaran durante la ejecución del programa
 *
 * @author rodriguezpaan
 */
public final class Constantes {
    
    private Constantes(){
    }
    
    //Operaciones expuestas por este WS
    public static final String OPERATION_GET_CONTACTOS = "OPERATION_GET_CONTACTOS";
    public static final String OPERATION_PARTICIPACION_SERVICIOS_CLIENTE = "OPERATION_PARTICIPACION_SERVICIOS_CLIENTE";
    public static final String OPERATION_TELEFONIA_TIPO_LINEA = "OPERATION_TELEFONIA_TIPO_LINEA";
    public static final String OPERATION_TELEFONIA_CORPORATIVA = "OPERATION_TELEFONIA_CORPORATIVA";
    public static final String OPERATION_TELEFONIA_TPBCL = "OPERATION_TELEFONIA_TPBCL";
    public static final String OPERATION_DATOS_CLIENTE = "OPERATION_DATOS_CLIENTE";
    
    //Parametrizacion de mensajes de validacion de negocio
    public static final String VALIDATE_REQ_MSG_PARAMETER_REQUIRED = "El campo {%s} es requerido y no puede estar vacio";
    public static final String VALIDATE_REQ_MSG_PARAMETER_NUMERIC_REQUIRED = "El campo {%s} es requerido y solo se permiten caracteres numericos";
    public static final String VALIDATE_PARAMETER_DEFAULT_VALUES = "El campo {%s} no coincide con los valores: %s";
    
    //Tipos contactos - Corresponde a los tipos de contacto que se pueden consultar en Onyx
    public static final Integer TYPE_CONTACT_INTERNO = 1;
    public static final Integer TYPE_CONTACT_TECNICO = 2;
    public static final Integer TYPE_CONTACT_CLIENTE = 3;
    
    public static final List<Integer> LIST_TYPE_CONTACT_ONYX = Collections.unmodifiableList(
            Arrays.asList(TYPE_CONTACT_INTERNO,
                    TYPE_CONTACT_TECNICO,
                    TYPE_CONTACT_CLIENTE));
    
    //Tipos telefonia - Corresponde a los tipos de información de telefonia a consultar en Onyx
    public static final Integer TELEFONIA_TYPE_INFO_TIPOLINEA = 1;
    public static final Integer TELEFONIA_TYPE_INFO_CORPORATIVA = 2;
    public static final Integer TELEFONIA_TYPE_INFO_TPBCL = 3;
    
    //Parametrizacion consumo WS externo
    public static final String WS_CONNECTION_NOT_REACHED = "Se ha presentado un error al consumir el servicio externo %s, no se ha podido establecer conexión con el recurso solicitado en '%s', no se encuentra disponible en el servidor (404 Not Found)";
    public static final String WS_ERROR_500 = "Se ha producido un error 500 (Internal Server Error) con el recurso solicitado en el servicio externo: %s";
    public static final String WS_ERROR_CONNECT_SOAP = "No se pudo establecer conexión con el servicio externo web SOAP: '%s'";
    public static final String WS_MSG_SOCKETTIMEOUT = "Se ha generado un error consumiendo el servicio externo web SOAP: '%s'. El tiempo de espera es superior a %d segundos";
    
    public static final String WS_REST = "REST";
    public static final String WS_SOAP = "SOAP";
    
    //Parametrizaciones para timeout WS SOAP
    public static final String TIMEOUT_CONNECT_JAX = "com.sun.xml.ws.connect.timeout";
    public static final String TIMEOUT_REQUEST_JAX = "com.sun.xml.ws.request.timeout";
    
    //Constantes de WS Externo ESB Onyx
    public static final Integer WS_EXT_ONY_TRANSACTION_CODE_EXITOSO = 1;
    public static final String WS_EXT_ONYX_PARAM_HEADER_SYSTEM_DEFAULT = "DiagFO";
    public static final String MSG_ERROR_WS_EXT_ONYX_RESPONSE_CON_EXCEPTION = "Error consumiendo WS ESB Onyx. Error: %s";
    public static final String MSG_ERROR_WS_EXT_ONYX_RESPONSE_POR_ERROR_SIN_MENSAJE = "Error en Onyx. Se recibio transactionCode: %d, sin mensaje sobre el resultado de la ejecucion.";
    
}
