
package client.runws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para test.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="test">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONEXION_NODO"/>
 *     &lt;enumeration value="CONEXION_SWITCH"/>
 *     &lt;enumeration value="REGISTRA_ONT"/>
 *     &lt;enumeration value="REINTENTO_REGISTRA_ONT"/>
 *     &lt;enumeration value="PING_INTERNET"/>
 *     &lt;enumeration value="REINTENTO_PING_INTERNET"/>
 *     &lt;enumeration value="PING_TELEFONIA"/>
 *     &lt;enumeration value="APRENDE_MAC"/>
 *     &lt;enumeration value="REINTENTO_APRENDE_MAC"/>
 *     &lt;enumeration value="PING_GESTION"/>
 *     &lt;enumeration value="PUERTO_OLT"/>
 *     &lt;enumeration value="ACCION_RESET_PORT"/>
 *     &lt;enumeration value="ACCION_CLEAR_MAT"/>
 *     &lt;enumeration value="ACCION_MEDIR_POTENCIA"/>
 *     &lt;enumeration value="DESCONOCIDO"/>
 *     &lt;enumeration value="ACCION_SHOW_CPE_CONFIG"/>
 *     &lt;enumeration value="REGISTRA_INTERFAZ"/>
 *     &lt;enumeration value="REINTENTO_REGISTRA_INTERFAZ"/>
 *     &lt;enumeration value="AUDITOR_PING"/>
 *     &lt;enumeration value="AUDITOR_TELNET_CHK"/>
 *     &lt;enumeration value="AUDITOR_TARGET"/>
 *     &lt;enumeration value="AUDITOR_FIRMWARE"/>
 *     &lt;enumeration value="AUDITOR_PUERTOS"/>
 *     &lt;enumeration value="AUDITOR_VLAN"/>
 *     &lt;enumeration value="AUDITOR_MODOS_TX"/>
 *     &lt;enumeration value="AUDITOR_QOS"/>
 *     &lt;enumeration value="AUDITOR_DHCP"/>
 *     &lt;enumeration value="AUDITOR_SESIONES_NAT"/>
 *     &lt;enumeration value="AUDITOR_WIFI"/>
 *     &lt;enumeration value="AUDITOR_RUTAS_ESTATICAS"/>
 *     &lt;enumeration value="AUDITOR_NAT_PAT"/>
 *     &lt;enumeration value="AUDITOR_FIREWALL"/>
 *     &lt;enumeration value="AUDITOR_SIP_SERVER"/>
 *     &lt;enumeration value="AUDITOR_SIP_USER"/>
 *     &lt;enumeration value="AUDITOR_PUERTOS_VOZ"/>
 *     &lt;enumeration value="AUDITOR_COMBO"/>
 *     &lt;enumeration value="AUDITOR_CISCO_COMBO"/>
 *     &lt;enumeration value="AUDITOR_JUNIPER_COMBO"/>
 *     &lt;enumeration value="AUDITOR_HUAWEI_COMBO"/>
 *     &lt;enumeration value="AUDITOR_CISCO_PUERTOS"/>
 *     &lt;enumeration value="AUDITOR_CISCO_VERSION"/>
 *     &lt;enumeration value="AUDITOR_CISCO_SNMP"/>
 *     &lt;enumeration value="AUDITOR_CISCO_ACL"/>
 *     &lt;enumeration value="AUDITOR_CISCO_QOS"/>
 *     &lt;enumeration value="AUDITOR_CISCO_QOSWAN"/>
 *     &lt;enumeration value="AUDITOR_JUNIPER_VERSION"/>
 *     &lt;enumeration value="AUDITOR_JUNIPER_PUERTOS"/>
 *     &lt;enumeration value="AUDITOR_JUNIPER_QOS"/>
 *     &lt;enumeration value="AUDITOR_HUAWEI_VERSION"/>
 *     &lt;enumeration value="AUDITOR_HUAWEI_PUERTOS"/>
 *     &lt;enumeration value="AUDITOR_HUAWEI_MODOTX"/>
 *     &lt;enumeration value="AUDITOR_HUAWEI_SNMP"/>
 *     &lt;enumeration value="AUDITOR_JUNIPER_SNMP"/>
 *     &lt;enumeration value="AUDITOR_GAOKE_COMBO"/>
 *     &lt;enumeration value="ACCION_PING_CPE"/>
 *     &lt;enumeration value="PE_STATIC_ROUTE"/>
 *     &lt;enumeration value="ANSIBLE_TELEFONIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "test")
@XmlEnum
public enum Test {

    CONEXION_NODO,
    CONEXION_SWITCH,
    REGISTRA_ONT,
    REINTENTO_REGISTRA_ONT,
    PING_INTERNET,
    REINTENTO_PING_INTERNET,
    PING_TELEFONIA,
    APRENDE_MAC,
    REINTENTO_APRENDE_MAC,
    PING_GESTION,
    PUERTO_OLT,
    ACCION_RESET_PORT,
    ACCION_CLEAR_MAT,
    ACCION_MEDIR_POTENCIA,
    DESCONOCIDO,
    ACCION_SHOW_CPE_CONFIG,
    REGISTRA_INTERFAZ,
    REINTENTO_REGISTRA_INTERFAZ,
    AUDITOR_PING,
    AUDITOR_TELNET_CHK,
    AUDITOR_TARGET,
    AUDITOR_FIRMWARE,
    AUDITOR_PUERTOS,
    AUDITOR_VLAN,
    AUDITOR_MODOS_TX,
    AUDITOR_QOS,
    AUDITOR_DHCP,
    AUDITOR_SESIONES_NAT,
    AUDITOR_WIFI,
    AUDITOR_RUTAS_ESTATICAS,
    AUDITOR_NAT_PAT,
    AUDITOR_FIREWALL,
    AUDITOR_SIP_SERVER,
    AUDITOR_SIP_USER,
    AUDITOR_PUERTOS_VOZ,
    AUDITOR_COMBO,
    AUDITOR_CISCO_COMBO,
    AUDITOR_JUNIPER_COMBO,
    AUDITOR_HUAWEI_COMBO,
    AUDITOR_CISCO_PUERTOS,
    AUDITOR_CISCO_VERSION,
    AUDITOR_CISCO_SNMP,
    AUDITOR_CISCO_ACL,
    AUDITOR_CISCO_QOS,
    AUDITOR_CISCO_QOSWAN,
    AUDITOR_JUNIPER_VERSION,
    AUDITOR_JUNIPER_PUERTOS,
    AUDITOR_JUNIPER_QOS,
    AUDITOR_HUAWEI_VERSION,
    AUDITOR_HUAWEI_PUERTOS,
    AUDITOR_HUAWEI_MODOTX,
    AUDITOR_HUAWEI_SNMP,
    AUDITOR_JUNIPER_SNMP,
    AUDITOR_GAOKE_COMBO,
    ACCION_PING_CPE,
    PE_STATIC_ROUTE,
    ANSIBLE_TELEFONIA;

    public String value() {
        return name();
    }

    public static Test fromValue(String v) {
        return valueOf(v);
    }

}
