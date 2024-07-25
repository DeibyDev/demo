
package com.claro.ppamdiag;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.claro.ppamdiag package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IMasociarWS_QNAME = new QName("http://ppamdiag.claro.com/", "IMasociarWS");
    private final static QName _IMasociarWSResponse_QNAME = new QName("http://ppamdiag.claro.com/", "IMasociarWSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.claro.ppamdiag
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IMasociarWS_Type }
     * 
     */
    public IMasociarWS_Type createIMasociarWS_Type() {
        return new IMasociarWS_Type();
    }

    /**
     * Create an instance of {@link IMasociarWSResponse }
     * 
     */
    public IMasociarWSResponse createIMasociarWSResponse() {
        return new IMasociarWSResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMasociarWS_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ppamdiag.claro.com/", name = "IMasociarWS")
    public JAXBElement<IMasociarWS_Type> createIMasociarWS(IMasociarWS_Type value) {
        return new JAXBElement<IMasociarWS_Type>(_IMasociarWS_QNAME, IMasociarWS_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMasociarWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ppamdiag.claro.com/", name = "IMasociarWSResponse")
    public JAXBElement<IMasociarWSResponse> createIMasociarWSResponse(IMasociarWSResponse value) {
        return new JAXBElement<IMasociarWSResponse>(_IMasociarWSResponse_QNAME, IMasociarWSResponse.class, null, value);
    }

}
