
package client.runws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para serviceData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpeHostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpeIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpeMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpeVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peHostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peVrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swHostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceData", propOrder = {
    "cpeHostname",
    "cpeIp",
    "cpeMac",
    "cpeVendor",
    "peHostname",
    "peInterface",
    "peIp",
    "peService",
    "peVrf",
    "swBrand",
    "swDesc",
    "swHostname",
    "swInterface",
    "swIp"
})
public class ServiceData {

    protected String cpeHostname;
    protected String cpeIp;
    protected String cpeMac;
    protected String cpeVendor;
    protected String peHostname;
    protected String peInterface;
    protected String peIp;
    protected String peService;
    protected String peVrf;
    protected String swBrand;
    protected String swDesc;
    protected String swHostname;
    protected String swInterface;
    protected String swIp;

    /**
     * Obtiene el valor de la propiedad cpeHostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpeHostname() {
        return cpeHostname;
    }

    /**
     * Define el valor de la propiedad cpeHostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpeHostname(String value) {
        this.cpeHostname = value;
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

    /**
     * Obtiene el valor de la propiedad cpeVendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpeVendor() {
        return cpeVendor;
    }

    /**
     * Define el valor de la propiedad cpeVendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpeVendor(String value) {
        this.cpeVendor = value;
    }

    /**
     * Obtiene el valor de la propiedad peHostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeHostname() {
        return peHostname;
    }

    /**
     * Define el valor de la propiedad peHostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeHostname(String value) {
        this.peHostname = value;
    }

    /**
     * Obtiene el valor de la propiedad peInterface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeInterface() {
        return peInterface;
    }

    /**
     * Define el valor de la propiedad peInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeInterface(String value) {
        this.peInterface = value;
    }

    /**
     * Obtiene el valor de la propiedad peIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeIp() {
        return peIp;
    }

    /**
     * Define el valor de la propiedad peIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeIp(String value) {
        this.peIp = value;
    }

    /**
     * Obtiene el valor de la propiedad peService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeService() {
        return peService;
    }

    /**
     * Define el valor de la propiedad peService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeService(String value) {
        this.peService = value;
    }

    /**
     * Obtiene el valor de la propiedad peVrf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeVrf() {
        return peVrf;
    }

    /**
     * Define el valor de la propiedad peVrf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeVrf(String value) {
        this.peVrf = value;
    }

    /**
     * Obtiene el valor de la propiedad swBrand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwBrand() {
        return swBrand;
    }

    /**
     * Define el valor de la propiedad swBrand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwBrand(String value) {
        this.swBrand = value;
    }

    /**
     * Obtiene el valor de la propiedad swDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwDesc() {
        return swDesc;
    }

    /**
     * Define el valor de la propiedad swDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwDesc(String value) {
        this.swDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad swHostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwHostname() {
        return swHostname;
    }

    /**
     * Define el valor de la propiedad swHostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwHostname(String value) {
        this.swHostname = value;
    }

    /**
     * Obtiene el valor de la propiedad swInterface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwInterface() {
        return swInterface;
    }

    /**
     * Define el valor de la propiedad swInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwInterface(String value) {
        this.swInterface = value;
    }

    /**
     * Obtiene el valor de la propiedad swIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwIp() {
        return swIp;
    }

    /**
     * Define el valor de la propiedad swIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwIp(String value) {
        this.swIp = value;
    }

}
