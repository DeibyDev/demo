
package client.runws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.runws package. 
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

    private final static QName _DiagnoseByService_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "diagnoseByService");
    private final static QName _Diagnose_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "diagnose");
    private final static QName _GeListResponse_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "geListResponse");
    private final static QName _GetDiagnostic_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "getDiagnostic");
    private final static QName _RunResponse_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "runResponse");
    private final static QName _GeList_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "geList");
    private final static QName _GetDiagnosticResponse_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "getDiagnosticResponse");
    private final static QName _Run_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "run");
    private final static QName _DiagnoseByServiceResponse_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "diagnoseByServiceResponse");
    private final static QName _DiagnoseResponse_QNAME = new QName("http://runws.webservices.pymes.diagnosticador.claro.com.co/", "diagnoseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.runws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDiagnostic }
     * 
     */
    public GetDiagnostic createGetDiagnostic() {
        return new GetDiagnostic();
    }

    /**
     * Create an instance of {@link GeListResponse }
     * 
     */
    public GeListResponse createGeListResponse() {
        return new GeListResponse();
    }

    /**
     * Create an instance of {@link DiagnoseByService }
     * 
     */
    public DiagnoseByService createDiagnoseByService() {
        return new DiagnoseByService();
    }

    /**
     * Create an instance of {@link Diagnose }
     * 
     */
    public Diagnose createDiagnose() {
        return new Diagnose();
    }

    /**
     * Create an instance of {@link DiagnoseByServiceResponse }
     * 
     */
    public DiagnoseByServiceResponse createDiagnoseByServiceResponse() {
        return new DiagnoseByServiceResponse();
    }

    /**
     * Create an instance of {@link DiagnoseResponse }
     * 
     */
    public DiagnoseResponse createDiagnoseResponse() {
        return new DiagnoseResponse();
    }

    /**
     * Create an instance of {@link GeList }
     * 
     */
    public GeList createGeList() {
        return new GeList();
    }

    /**
     * Create an instance of {@link GetDiagnosticResponse }
     * 
     */
    public GetDiagnosticResponse createGetDiagnosticResponse() {
        return new GetDiagnosticResponse();
    }

    /**
     * Create an instance of {@link Run }
     * 
     */
    public Run createRun() {
        return new Run();
    }

    /**
     * Create an instance of {@link RunResponse }
     * 
     */
    public RunResponse createRunResponse() {
        return new RunResponse();
    }

    /**
     * Create an instance of {@link ProbeVO }
     * 
     */
    public ProbeVO createProbeVO() {
        return new ProbeVO();
    }

    /**
     * Create an instance of {@link ServiceData }
     * 
     */
    public ServiceData createServiceData() {
        return new ServiceData();
    }

    /**
     * Create an instance of {@link DiagVO }
     * 
     */
    public DiagVO createDiagVO() {
        return new DiagVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnoseByService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "diagnoseByService")
    public JAXBElement<DiagnoseByService> createDiagnoseByService(DiagnoseByService value) {
        return new JAXBElement<DiagnoseByService>(_DiagnoseByService_QNAME, DiagnoseByService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagnose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "diagnose")
    public JAXBElement<Diagnose> createDiagnose(Diagnose value) {
        return new JAXBElement<Diagnose>(_Diagnose_QNAME, Diagnose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "geListResponse")
    public JAXBElement<GeListResponse> createGeListResponse(GeListResponse value) {
        return new JAXBElement<GeListResponse>(_GeListResponse_QNAME, GeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiagnostic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "getDiagnostic")
    public JAXBElement<GetDiagnostic> createGetDiagnostic(GetDiagnostic value) {
        return new JAXBElement<GetDiagnostic>(_GetDiagnostic_QNAME, GetDiagnostic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "runResponse")
    public JAXBElement<RunResponse> createRunResponse(RunResponse value) {
        return new JAXBElement<RunResponse>(_RunResponse_QNAME, RunResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "geList")
    public JAXBElement<GeList> createGeList(GeList value) {
        return new JAXBElement<GeList>(_GeList_QNAME, GeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiagnosticResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "getDiagnosticResponse")
    public JAXBElement<GetDiagnosticResponse> createGetDiagnosticResponse(GetDiagnosticResponse value) {
        return new JAXBElement<GetDiagnosticResponse>(_GetDiagnosticResponse_QNAME, GetDiagnosticResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Run }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "run")
    public JAXBElement<Run> createRun(Run value) {
        return new JAXBElement<Run>(_Run_QNAME, Run.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnoseByServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "diagnoseByServiceResponse")
    public JAXBElement<DiagnoseByServiceResponse> createDiagnoseByServiceResponse(DiagnoseByServiceResponse value) {
        return new JAXBElement<DiagnoseByServiceResponse>(_DiagnoseByServiceResponse_QNAME, DiagnoseByServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnoseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://runws.webservices.pymes.diagnosticador.claro.com.co/", name = "diagnoseResponse")
    public JAXBElement<DiagnoseResponse> createDiagnoseResponse(DiagnoseResponse value) {
        return new JAXBElement<DiagnoseResponse>(_DiagnoseResponse_QNAME, DiagnoseResponse.class, null, value);
    }

}
