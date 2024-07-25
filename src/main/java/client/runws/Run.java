
package client.runws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para run complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="run">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceData" type="{http://runws.webservices.pymes.diagnosticador.claro.com.co/}serviceData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "run", propOrder = {
    "testName",
    "serviceData"
})
public class Run {

    protected String testName;
    protected ServiceData serviceData;

    /**
     * Obtiene el valor de la propiedad testName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestName() {
        return testName;
    }

    /**
     * Define el valor de la propiedad testName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestName(String value) {
        this.testName = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceData.
     * 
     * @return
     *     possible object is
     *     {@link ServiceData }
     *     
     */
    public ServiceData getServiceData() {
        return serviceData;
    }

    /**
     * Define el valor de la propiedad serviceData.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceData }
     *     
     */
    public void setServiceData(ServiceData value) {
        this.serviceData = value;
    }

}
