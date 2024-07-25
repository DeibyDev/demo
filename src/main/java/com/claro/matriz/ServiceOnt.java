
package com.claro.matriz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para serviceOnt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceOnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gponPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ontPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "serviceOnt", propOrder = {
    "gponPort",
    "hostname",
    "marca",
    "ontPort",
    "swBrand",
    "swInterface",
    "swIp"
})
public class ServiceOnt {

    protected String gponPort;
    protected String hostname;
    protected String marca;
    protected String ontPort;
    protected String swBrand;
    protected String swInterface;
    protected String swIp;

    /**
     * Obtiene el valor de la propiedad gponPort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGponPort() {
        return gponPort;
    }

    /**
     * Define el valor de la propiedad gponPort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGponPort(String value) {
        this.gponPort = value;
    }

    /**
     * Obtiene el valor de la propiedad hostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Define el valor de la propiedad hostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad ontPort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntPort() {
        return ontPort;
    }

    /**
     * Define el valor de la propiedad ontPort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntPort(String value) {
        this.ontPort = value;
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
