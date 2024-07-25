
package com.claro.matriz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ont complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ont">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attenuationDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attenuationUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="olt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oltDownTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oltUpRx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onuDownRx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onuUpTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puertoGpon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ultimaCaida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ont", propOrder = {
    "attenuationDown",
    "attenuationUp",
    "description",
    "enlace",
    "estado",
    "olt",
    "oltDownTx",
    "oltUpRx",
    "ont",
    "onuDownRx",
    "onuUpTx",
    "puertoGpon",
    "ultimaCaida"
})
public class Ont {

    protected String attenuationDown;
    protected String attenuationUp;
    protected String description;
    protected String enlace;
    protected String estado;
    protected String olt;
    protected String oltDownTx;
    protected String oltUpRx;
    protected String ont;
    protected String onuDownRx;
    protected String onuUpTx;
    protected String puertoGpon;
    protected String ultimaCaida;

    /**
     * Obtiene el valor de la propiedad attenuationDown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttenuationDown() {
        return attenuationDown;
    }

    /**
     * Define el valor de la propiedad attenuationDown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttenuationDown(String value) {
        this.attenuationDown = value;
    }

    /**
     * Obtiene el valor de la propiedad attenuationUp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttenuationUp() {
        return attenuationUp;
    }

    /**
     * Define el valor de la propiedad attenuationUp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttenuationUp(String value) {
        this.attenuationUp = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad enlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Define el valor de la propiedad enlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnlace(String value) {
        this.enlace = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad olt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlt() {
        return olt;
    }

    /**
     * Define el valor de la propiedad olt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlt(String value) {
        this.olt = value;
    }

    /**
     * Obtiene el valor de la propiedad oltDownTx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOltDownTx() {
        return oltDownTx;
    }

    /**
     * Define el valor de la propiedad oltDownTx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOltDownTx(String value) {
        this.oltDownTx = value;
    }

    /**
     * Obtiene el valor de la propiedad oltUpRx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOltUpRx() {
        return oltUpRx;
    }

    /**
     * Define el valor de la propiedad oltUpRx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOltUpRx(String value) {
        this.oltUpRx = value;
    }

    /**
     * Obtiene el valor de la propiedad ont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnt() {
        return ont;
    }

    /**
     * Define el valor de la propiedad ont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnt(String value) {
        this.ont = value;
    }

    /**
     * Obtiene el valor de la propiedad onuDownRx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnuDownRx() {
        return onuDownRx;
    }

    /**
     * Define el valor de la propiedad onuDownRx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnuDownRx(String value) {
        this.onuDownRx = value;
    }

    /**
     * Obtiene el valor de la propiedad onuUpTx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnuUpTx() {
        return onuUpTx;
    }

    /**
     * Define el valor de la propiedad onuUpTx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnuUpTx(String value) {
        this.onuUpTx = value;
    }

    /**
     * Obtiene el valor de la propiedad puertoGpon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuertoGpon() {
        return puertoGpon;
    }

    /**
     * Define el valor de la propiedad puertoGpon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuertoGpon(String value) {
        this.puertoGpon = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimaCaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimaCaida() {
        return ultimaCaida;
    }

    /**
     * Define el valor de la propiedad ultimaCaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimaCaida(String value) {
        this.ultimaCaida = value;
    }

}
