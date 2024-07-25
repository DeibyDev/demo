
package com.claro.ppde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pingPlotterDF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pingPlotterDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assigGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pingPlotterDF", propOrder = {
    "assigGroup",
    "incidentID",
    "openTime",
    "status",
    "title",
    "userPriority"
})
public class PingPlotterDF {

    protected String assigGroup;
    protected String incidentID;
    protected String openTime;
    protected String status;
    protected String title;
    protected String userPriority;

    /**
     * Obtiene el valor de la propiedad assigGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigGroup() {
        return assigGroup;
    }

    /**
     * Define el valor de la propiedad assigGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigGroup(String value) {
        this.assigGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad incidentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentID() {
        return incidentID;
    }

    /**
     * Define el valor de la propiedad incidentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentID(String value) {
        this.incidentID = value;
    }

    /**
     * Obtiene el valor de la propiedad openTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenTime() {
        return openTime;
    }

    /**
     * Define el valor de la propiedad openTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenTime(String value) {
        this.openTime = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad userPriority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPriority() {
        return userPriority;
    }

    /**
     * Define el valor de la propiedad userPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPriority(String value) {
        this.userPriority = value;
    }

    @Override
    public String toString() {
        return "PingPlotterDF{" + "assigGroup=" + assigGroup + ", incidentID=" + incidentID + ", openTime=" + openTime + ", status=" + status + ", title=" + title + ", userPriority=" + userPriority + '}';
    }

}
