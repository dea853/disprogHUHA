
package com.ubaya.disprog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubaya.disprog package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _Hello_QNAME = new QName("http://disprog.ubaya.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://disprog.ubaya.com/", "helloResponse");
    private final static QName _RegistrasiMitra_QNAME = new QName("http://disprog.ubaya.com/", "registrasiMitra");
    private final static QName _RegistrasiMitraResponse_QNAME = new QName("http://disprog.ubaya.com/", "registrasiMitraResponse");
    private final static QName _RegistrasiPelanggan_QNAME = new QName("http://disprog.ubaya.com/", "registrasiPelanggan");
    private final static QName _RegistrasiPelangganResponse_QNAME = new QName("http://disprog.ubaya.com/", "registrasiPelangganResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubaya.disprog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegistrasiMitra }
     * 
     */
    public RegistrasiMitra createRegistrasiMitra() {
        return new RegistrasiMitra();
    }

    /**
     * Create an instance of {@link RegistrasiMitraResponse }
     * 
     */
    public RegistrasiMitraResponse createRegistrasiMitraResponse() {
        return new RegistrasiMitraResponse();
    }

    /**
     * Create an instance of {@link RegistrasiPelanggan }
     * 
     */
    public RegistrasiPelanggan createRegistrasiPelanggan() {
        return new RegistrasiPelanggan();
    }

    /**
     * Create an instance of {@link RegistrasiPelangganResponse }
     * 
     */
    public RegistrasiPelangganResponse createRegistrasiPelangganResponse() {
        return new RegistrasiPelangganResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://disprog.ubaya.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://disprog.ubaya.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrasiMitra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrasiMitra }{@code >}
     */
    @XmlElementDecl(namespace = "http://disprog.ubaya.com/", name = "registrasiMitra")
    public JAXBElement<RegistrasiMitra> createRegistrasiMitra(RegistrasiMitra value) {
        return new JAXBElement<RegistrasiMitra>(_RegistrasiMitra_QNAME, RegistrasiMitra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrasiMitraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrasiMitraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://disprog.ubaya.com/", name = "registrasiMitraResponse")
    public JAXBElement<RegistrasiMitraResponse> createRegistrasiMitraResponse(RegistrasiMitraResponse value) {
        return new JAXBElement<RegistrasiMitraResponse>(_RegistrasiMitraResponse_QNAME, RegistrasiMitraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrasiPelanggan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrasiPelanggan }{@code >}
     */
    @XmlElementDecl(namespace = "http://disprog.ubaya.com/", name = "registrasiPelanggan")
    public JAXBElement<RegistrasiPelanggan> createRegistrasiPelanggan(RegistrasiPelanggan value) {
        return new JAXBElement<RegistrasiPelanggan>(_RegistrasiPelanggan_QNAME, RegistrasiPelanggan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrasiPelangganResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrasiPelangganResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://disprog.ubaya.com/", name = "registrasiPelangganResponse")
    public JAXBElement<RegistrasiPelangganResponse> createRegistrasiPelangganResponse(RegistrasiPelangganResponse value) {
        return new JAXBElement<RegistrasiPelangganResponse>(_RegistrasiPelangganResponse_QNAME, RegistrasiPelangganResponse.class, null, value);
    }

}
