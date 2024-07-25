
package com.claro.ppamdiag;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IMasociarWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IMasociarWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Incidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaOpenIm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrupoIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TituloIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrioridadIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPEIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMasociarWS", propOrder = {
    "incidencia",
    "fechaOpenIm",
    "estadoIM",
    "grupoIM",
    "tituloIM",
    "prioridadIM",
    "usuario",
    "idServicio",
    "cpeip"
})
public class IMasociarWS_Type {

    @XmlElement(name = "Incidencia")
    protected String incidencia;
    @XmlElement(name = "FechaOpenIm")
    protected String fechaOpenIm;
    @XmlElement(name = "EstadoIM")
    protected String estadoIM;
    @XmlElement(name = "GrupoIM")
    protected String grupoIM;
    @XmlElement(name = "TituloIM")
    protected String tituloIM;
    @XmlElement(name = "PrioridadIM")
    protected String prioridadIM;
    protected String usuario;
    @XmlElement(name = "IDServicio")
    protected String idServicio;
    @XmlElement(name = "CPEIP")
    protected String cpeip;

    /**
     * Obtiene el valor de la propiedad incidencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidencia() {
        return incidencia;
    }

    /**
     * Define el valor de la propiedad incidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidencia(String value) {
        this.incidencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOpenIm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOpenIm() {
        return fechaOpenIm;
    }

    /**
     * Define el valor de la propiedad fechaOpenIm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOpenIm(String value) {
        this.fechaOpenIm = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoIM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoIM() {
        return estadoIM;
    }

    /**
     * Define el valor de la propiedad estadoIM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoIM(String value) {
        this.estadoIM = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoIM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoIM() {
        return grupoIM;
    }

    /**
     * Define el valor de la propiedad grupoIM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoIM(String value) {
        this.grupoIM = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloIM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloIM() {
        return tituloIM;
    }

    /**
     * Define el valor de la propiedad tituloIM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloIM(String value) {
        this.tituloIM = value;
    }

    /**
     * Obtiene el valor de la propiedad prioridadIM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrioridadIM() {
        return prioridadIM;
    }

    /**
     * Define el valor de la propiedad prioridadIM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrioridadIM(String value) {
        this.prioridadIM = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDServicio() {
        return idServicio;
    }

    /**
     * Define el valor de la propiedad idServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDServicio(String value) {
        this.idServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad cpeip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPEIP() {
        return cpeip;
    }

    /**
     * Define el valor de la propiedad cpeip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPEIP(String value) {
        this.cpeip = value;
    }

}
