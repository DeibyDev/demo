
package client.runws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para geList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="geList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oltBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpeVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geList", propOrder = {
    "oltBrand",
    "cpeVendor"
})
public class GeList {

    protected String oltBrand;
    protected String cpeVendor;

    /**
     * Obtiene el valor de la propiedad oltBrand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOltBrand() {
        return oltBrand;
    }

    /**
     * Define el valor de la propiedad oltBrand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOltBrand(String value) {
        this.oltBrand = value;
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

}
