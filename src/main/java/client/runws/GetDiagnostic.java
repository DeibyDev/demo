
package client.runws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDiagnostic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDiagnostic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oltBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpeVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="probeList" type="{http://runws.webservices.pymes.diagnosticador.claro.com.co/}probeVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDiagnostic", propOrder = {
    "oltBrand",
    "cpeVendor",
    "probeList"
})
public class GetDiagnostic {

    protected String oltBrand;
    protected String cpeVendor;
    protected List<ProbeVO> probeList;

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

    /**
     * Gets the value of the probeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the probeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProbeVO }
     * 
     * 
     */
    public List<ProbeVO> getProbeList() {
        if (probeList == null) {
            probeList = new ArrayList<ProbeVO>();
        }
        return this.probeList;
    }

}
