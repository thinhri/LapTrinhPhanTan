
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static QName _Hello_QNAME = new QName("http://Test/", "hello");
    private final static QName _Tich_QNAME = new QName("http://Test/", "Tich");
    private final static QName _GetSach_QNAME = new QName("http://Test/", "getSach");
    private final static QName _TimkiemResponse_QNAME = new QName("http://Test/", "TimkiemResponse");
    private final static QName _TichResponse_QNAME = new QName("http://Test/", "TichResponse");
    private final static QName _GetSachResponse_QNAME = new QName("http://Test/", "getSachResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://Test/", "helloResponse");
    private final static QName _Getnv_QNAME = new QName("http://Test/", "getnv");
    private final static QName _GetnvResponse_QNAME = new QName("http://Test/", "getnvResponse");
    private final static QName _Timkiem_QNAME = new QName("http://Test/", "Timkiem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimkiemResponse }
     * 
     */
    public TimkiemResponse createTimkiemResponse() {
        return new TimkiemResponse();
    }

    /**
     * Create an instance of {@link Timkiem }
     * 
     */
    public Timkiem createTimkiem() {
        return new Timkiem();
    }

    /**
     * Create an instance of {@link Getnv }
     * 
     */
    public Getnv createGetnv() {
        return new Getnv();
    }

    /**
     * Create an instance of {@link GetnvResponse }
     * 
     */
    public GetnvResponse createGetnvResponse() {
        return new GetnvResponse();
    }

    /**
     * Create an instance of {@link GetSachResponse }
     * 
     */
    public GetSachResponse createGetSachResponse() {
        return new GetSachResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link TichResponse }
     * 
     */
    public TichResponse createTichResponse() {
        return new TichResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetSach }
     * 
     */
    public GetSach createGetSach() {
        return new GetSach();
    }

    /**
     * Create an instance of {@link Tich }
     * 
     */
    public Tich createTich() {
        return new Tich();
    }

    /**
     * Create an instance of {@link Nhanvienbean }
     * 
     */
    public Nhanvienbean createNhanvienbean() {
        return new Nhanvienbean();
    }

    /**
     * Create an instance of {@link Sachbean }
     * 
     */
    public Sachbean createSachbean() {
        return new Sachbean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tich }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "Tich")
    public JAXBElement<Tich> createTich(Tich value) {
        return new JAXBElement<Tich>(_Tich_QNAME, Tich.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "getSach")
    public JAXBElement<GetSach> createGetSach(GetSach value) {
        return new JAXBElement<GetSach>(_GetSach_QNAME, GetSach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimkiemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "TimkiemResponse")
    public JAXBElement<TimkiemResponse> createTimkiemResponse(TimkiemResponse value) {
        return new JAXBElement<TimkiemResponse>(_TimkiemResponse_QNAME, TimkiemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TichResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "TichResponse")
    public JAXBElement<TichResponse> createTichResponse(TichResponse value) {
        return new JAXBElement<TichResponse>(_TichResponse_QNAME, TichResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "getSachResponse")
    public JAXBElement<GetSachResponse> createGetSachResponse(GetSachResponse value) {
        return new JAXBElement<GetSachResponse>(_GetSachResponse_QNAME, GetSachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getnv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "getnv")
    public JAXBElement<Getnv> createGetnv(Getnv value) {
        return new JAXBElement<Getnv>(_Getnv_QNAME, Getnv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetnvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "getnvResponse")
    public JAXBElement<GetnvResponse> createGetnvResponse(GetnvResponse value) {
        return new JAXBElement<GetnvResponse>(_GetnvResponse_QNAME, GetnvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Timkiem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "Timkiem")
    public JAXBElement<Timkiem> createTimkiem(Timkiem value) {
        return new JAXBElement<Timkiem>(_Timkiem_QNAME, Timkiem.class, null, value);
    }

}
