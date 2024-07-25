
package com.claro.ppde;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.claro.ppde package. 
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

    private final static QName _IOException_QNAME = new QName("http://ppde.claro.com/", "IOException");
    private final static QName _SMPPDEResponse_QNAME = new QName("http://ppde.claro.com/", "SMPPDEResponse");
    private final static QName _SMPPDE_QNAME = new QName("http://ppde.claro.com/", "SMPPDE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.claro.ppde
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link SMPPDEResponse }
     * 
     */
    public SMPPDEResponse createSMPPDEResponse() {
        return new SMPPDEResponse();
    }

    /**
     * Create an instance of {@link SMPPDE_Type }
     * 
     */
    public SMPPDE_Type createSMPPDE_Type() {
        return new SMPPDE_Type();
    }

    /**
     * Create an instance of {@link PingPlotterDF }
     * 
     */
    public PingPlotterDF createPingPlotterDF() {
        return new PingPlotterDF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ppde.claro.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMPPDEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ppde.claro.com/", name = "SMPPDEResponse")
    public JAXBElement<SMPPDEResponse> createSMPPDEResponse(SMPPDEResponse value) {
        return new JAXBElement<SMPPDEResponse>(_SMPPDEResponse_QNAME, SMPPDEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMPPDE_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ppde.claro.com/", name = "SMPPDE")
    public JAXBElement<SMPPDE_Type> createSMPPDE(SMPPDE_Type value) {
        return new JAXBElement<SMPPDE_Type>(_SMPPDE_QNAME, SMPPDE_Type.class, null, value);
    }

}
