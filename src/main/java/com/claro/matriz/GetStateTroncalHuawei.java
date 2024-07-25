
package com.claro.matriz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStateTroncalHuawei complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStateTroncalHuawei">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceSW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getStateTroncalHuawei", propOrder = {
    "interfaceSW",
    "swIp"
})
public class GetStateTroncalHuawei {

    protected String interfaceSW;
    protected String swIp;

    /**
     * Obtiene el valor de la propiedad interfaceSW.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceSW() {
        return interfaceSW;
    }

    /**
     * Define el valor de la propiedad interfaceSW.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceSW(String value) {
        this.interfaceSW = value;
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
