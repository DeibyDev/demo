
package client.runws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para diagVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="diagVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditorLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagnostic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagnosticLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagVO", propOrder = {
    "auditorLog",
    "diagnostic",
    "diagnosticLog",
    "serviceId"
})
public class DiagVO {

    protected String auditorLog;
    protected String diagnostic;
    protected String diagnosticLog;
    protected String serviceId;

    /**
     * Obtiene el valor de la propiedad auditorLog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditorLog() {
        return auditorLog;
    }

    /**
     * Define el valor de la propiedad auditorLog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditorLog(String value) {
        this.auditorLog = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnostic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnostic() {
        return diagnostic;
    }

    /**
     * Define el valor de la propiedad diagnostic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnostic(String value) {
        this.diagnostic = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnosticLog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticLog() {
        return diagnosticLog;
    }

    /**
     * Define el valor de la propiedad diagnosticLog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticLog(String value) {
        this.diagnosticLog = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Define el valor de la propiedad serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

}
