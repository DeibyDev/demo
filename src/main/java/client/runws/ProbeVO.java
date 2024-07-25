
package client.runws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para probeVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="probeVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="r" type="{http://runws.webservices.pymes.diagnosticador.claro.com.co/}result" minOccurs="0"/>
 *         &lt;element name="recommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="t" type="{http://runws.webservices.pymes.diagnosticador.claro.com.co/}test" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "probeVO", propOrder = {
    "command",
    "output",
    "r",
    "recommendation",
    "status",
    "t"
})
public class ProbeVO {

    protected String command;
    protected String output;
    @XmlSchemaType(name = "string")
    protected Result r;
    protected String recommendation;
    protected boolean status;
    @XmlSchemaType(name = "string")
    protected Test t;

    /**
     * Obtiene el valor de la propiedad command.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Define el valor de la propiedad command.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Obtiene el valor de la propiedad output.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutput() {
        return output;
    }

    /**
     * Define el valor de la propiedad output.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutput(String value) {
        this.output = value;
    }

    /**
     * Obtiene el valor de la propiedad r.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getR() {
        return r;
    }

    /**
     * Define el valor de la propiedad r.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setR(Result value) {
        this.r = value;
    }

    /**
     * Obtiene el valor de la propiedad recommendation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * Define el valor de la propiedad recommendation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendation(String value) {
        this.recommendation = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad t.
     * 
     * @return
     *     possible object is
     *     {@link Test }
     *     
     */
    public Test getT() {
        return t;
    }

    /**
     * Define el valor de la propiedad t.
     * 
     * @param value
     *     allowed object is
     *     {@link Test }
     *     
     */
    public void setT(Test value) {
        this.t = value;
    }

}
