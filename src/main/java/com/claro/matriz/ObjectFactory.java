
package com.claro.matriz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.claro.matriz package. 
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

    private final static QName _GetMatrizOntHuaweiResponse_QNAME = new QName("http://matriz.claro.com/", "getMatrizOntHuaweiResponse");
    private final static QName _MalformedURLException_QNAME = new QName("http://matriz.claro.com/", "MalformedURLException");
    private final static QName _GetMatrizOntZteResponse_QNAME = new QName("http://matriz.claro.com/", "getMatrizOntZteResponse");
    private final static QName _GetStateTroncalHuaweiResponse_QNAME = new QName("http://matriz.claro.com/", "getStateTroncalHuaweiResponse");
    private final static QName _GetStateTroncalZte_QNAME = new QName("http://matriz.claro.com/", "getStateTroncalZte");
    private final static QName _GetMatrizOntZte_QNAME = new QName("http://matriz.claro.com/", "getMatrizOntZte");
    private final static QName _GetServiceRelation_QNAME = new QName("http://matriz.claro.com/", "getServiceRelation");
    private final static QName _GetStateTroncalHuawei_QNAME = new QName("http://matriz.claro.com/", "getStateTroncalHuawei");
    private final static QName _GetServiceRelationResponse_QNAME = new QName("http://matriz.claro.com/", "getServiceRelationResponse");
    private final static QName _Exception_QNAME = new QName("http://matriz.claro.com/", "Exception");
    private final static QName _GetMatrizOntHuawei_QNAME = new QName("http://matriz.claro.com/", "getMatrizOntHuawei");
    private final static QName _GetStateTroncalZteResponse_QNAME = new QName("http://matriz.claro.com/", "getStateTroncalZteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.claro.matriz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMatrizOntHuaweiResponse }
     * 
     */
    public GetMatrizOntHuaweiResponse createGetMatrizOntHuaweiResponse() {
        return new GetMatrizOntHuaweiResponse();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link GetMatrizOntZteResponse }
     * 
     */
    public GetMatrizOntZteResponse createGetMatrizOntZteResponse() {
        return new GetMatrizOntZteResponse();
    }

    /**
     * Create an instance of {@link GetStateTroncalHuaweiResponse }
     * 
     */
    public GetStateTroncalHuaweiResponse createGetStateTroncalHuaweiResponse() {
        return new GetStateTroncalHuaweiResponse();
    }

    /**
     * Create an instance of {@link GetStateTroncalZte }
     * 
     */
    public GetStateTroncalZte createGetStateTroncalZte() {
        return new GetStateTroncalZte();
    }

    /**
     * Create an instance of {@link GetMatrizOntZte }
     * 
     */
    public GetMatrizOntZte createGetMatrizOntZte() {
        return new GetMatrizOntZte();
    }

    /**
     * Create an instance of {@link GetServiceRelation }
     * 
     */
    public GetServiceRelation createGetServiceRelation() {
        return new GetServiceRelation();
    }

    /**
     * Create an instance of {@link GetStateTroncalHuawei }
     * 
     */
    public GetStateTroncalHuawei createGetStateTroncalHuawei() {
        return new GetStateTroncalHuawei();
    }

    /**
     * Create an instance of {@link GetServiceRelationResponse }
     * 
     */
    public GetServiceRelationResponse createGetServiceRelationResponse() {
        return new GetServiceRelationResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetMatrizOntHuawei }
     * 
     */
    public GetMatrizOntHuawei createGetMatrizOntHuawei() {
        return new GetMatrizOntHuawei();
    }

    /**
     * Create an instance of {@link GetStateTroncalZteResponse }
     * 
     */
    public GetStateTroncalZteResponse createGetStateTroncalZteResponse() {
        return new GetStateTroncalZteResponse();
    }

    /**
     * Create an instance of {@link ServiceOnt }
     * 
     */
    public ServiceOnt createServiceOnt() {
        return new ServiceOnt();
    }

    /**
     * Create an instance of {@link Ont }
     * 
     */
    public Ont createOnt() {
        return new Ont();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatrizOntHuaweiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getMatrizOntHuaweiResponse")
    public JAXBElement<GetMatrizOntHuaweiResponse> createGetMatrizOntHuaweiResponse(GetMatrizOntHuaweiResponse value) {
        return new JAXBElement<GetMatrizOntHuaweiResponse>(_GetMatrizOntHuaweiResponse_QNAME, GetMatrizOntHuaweiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatrizOntZteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getMatrizOntZteResponse")
    public JAXBElement<GetMatrizOntZteResponse> createGetMatrizOntZteResponse(GetMatrizOntZteResponse value) {
        return new JAXBElement<GetMatrizOntZteResponse>(_GetMatrizOntZteResponse_QNAME, GetMatrizOntZteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateTroncalHuaweiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getStateTroncalHuaweiResponse")
    public JAXBElement<GetStateTroncalHuaweiResponse> createGetStateTroncalHuaweiResponse(GetStateTroncalHuaweiResponse value) {
        return new JAXBElement<GetStateTroncalHuaweiResponse>(_GetStateTroncalHuaweiResponse_QNAME, GetStateTroncalHuaweiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateTroncalZte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getStateTroncalZte")
    public JAXBElement<GetStateTroncalZte> createGetStateTroncalZte(GetStateTroncalZte value) {
        return new JAXBElement<GetStateTroncalZte>(_GetStateTroncalZte_QNAME, GetStateTroncalZte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatrizOntZte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getMatrizOntZte")
    public JAXBElement<GetMatrizOntZte> createGetMatrizOntZte(GetMatrizOntZte value) {
        return new JAXBElement<GetMatrizOntZte>(_GetMatrizOntZte_QNAME, GetMatrizOntZte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getServiceRelation")
    public JAXBElement<GetServiceRelation> createGetServiceRelation(GetServiceRelation value) {
        return new JAXBElement<GetServiceRelation>(_GetServiceRelation_QNAME, GetServiceRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateTroncalHuawei }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getStateTroncalHuawei")
    public JAXBElement<GetStateTroncalHuawei> createGetStateTroncalHuawei(GetStateTroncalHuawei value) {
        return new JAXBElement<GetStateTroncalHuawei>(_GetStateTroncalHuawei_QNAME, GetStateTroncalHuawei.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getServiceRelationResponse")
    public JAXBElement<GetServiceRelationResponse> createGetServiceRelationResponse(GetServiceRelationResponse value) {
        return new JAXBElement<GetServiceRelationResponse>(_GetServiceRelationResponse_QNAME, GetServiceRelationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatrizOntHuawei }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getMatrizOntHuawei")
    public JAXBElement<GetMatrizOntHuawei> createGetMatrizOntHuawei(GetMatrizOntHuawei value) {
        return new JAXBElement<GetMatrizOntHuawei>(_GetMatrizOntHuawei_QNAME, GetMatrizOntHuawei.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateTroncalZteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.claro.com/", name = "getStateTroncalZteResponse")
    public JAXBElement<GetStateTroncalZteResponse> createGetStateTroncalZteResponse(GetStateTroncalZteResponse value) {
        return new JAXBElement<GetStateTroncalZteResponse>(_GetStateTroncalZteResponse_QNAME, GetStateTroncalZteResponse.class, null, value);
    }

}
