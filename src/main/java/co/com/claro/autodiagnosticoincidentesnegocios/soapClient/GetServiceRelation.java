
package co.com.claro.autodiagnosticoincidentesnegocios.soapClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpeIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpeMac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceId",
    "cpeIp",
    "cpeMac"
})
@XmlRootElement(name = "getServiceRelation")
public class GetServiceRelation {

    @XmlElement(required = true)
    protected String serviceId;
    @XmlElement(required = true)
    protected String cpeIp;
    @XmlElement(required = true)
    protected String cpeMac;

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

    /**
     * Obtiene el valor de la propiedad cpeIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpeIp() {
        return cpeIp;
    }

    /**
     * Define el valor de la propiedad cpeIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpeIp(String value) {
        this.cpeIp = value;
    }

    /**
     * Obtiene el valor de la propiedad cpeMac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpeMac() {
        return cpeMac;
    }

    /**
     * Define el valor de la propiedad cpeMac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpeMac(String value) {
        this.cpeMac = value;
    }

}
