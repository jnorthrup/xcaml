//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.04 at 01:11:38 AM PST
//

package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for marshalDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marshalDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputDefinition">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://camel.apache.org/schema/spring}avro"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}base64"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}beanio"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}bindy"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}castor"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}crypto"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}csv"/>
 *           &lt;element name="custom" type="{http://camel.apache.org/schema/spring}customDataFormat"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}flatpack"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}gzip"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}hl7"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}jaxb"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}jibx"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}json"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}protobuf"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}rss"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}secureXML"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}serialization"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}soapjaxb"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}string"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}syslog"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}tidyMarkup"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}xmlBeans"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}xmljson"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}xmlrpc"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}xstream"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pgp"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}zip"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}zipFile"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marshalDefinition", propOrder = {
    "avro", "base64", "beanio", "bindy", "castor", "crypto", "csv", "custom", "flatpack", "gzip",
    "hl7", "jaxb", "jibx", "json", "protobuf", "rss", "secureXML", "serialization", "soapjaxb",
    "string", "syslog", "tidyMarkup", "xmlBeans", "xmljson", "xmlrpc", "xstream", "pgp", "zip",
    "zipFile"})
public class MarshalDefinition extends NoOutputDefinition {

  protected AvroDataFormat avro;
  protected Base64Element base64;
  protected BeanioElement beanio;
  protected BindyDataFormat bindy;
  protected CastorDataFormat castor;
  protected CryptoDataFormat crypto;
  protected CsvDataFormat csv;
  protected CustomDataFormat custom;
  protected FlatpackDataFormat flatpack;
  protected GzipDataFormat gzip;
  protected Hl7DataFormat hl7;
  protected JaxbElement jaxb;
  protected JibxDataFormat jibx;
  protected JsonElement json;
  protected ProtobufDataFormat protobuf;
  protected RssDataFormat rss;
  protected XmlSecurityDataFormat secureXML;
  protected SerializationDataFormat serialization;
  protected SoapJaxbDataFormat soapjaxb;
  protected StringElement string;
  protected SyslogElement syslog;
  protected TidyMarkupDataFormat tidyMarkup;
  protected XmlBeansDataFormat xmlBeans;
  protected XmlJsonDataFormat xmljson;
  protected XmlRpcDataFormat xmlrpc;
  protected XstreamElement xstream;
  protected PgpDataFormat pgp;
  protected ZipDataFormat zip;
  protected ZipFileDataFormat zipFile;
  @XmlAttribute(name = "ref")
  protected String ref;

  /**
   * Gets the value of the avro property.
   * 
   * @return possible object is {@link AvroDataFormat }
   * 
   */
  public AvroDataFormat getAvro() {
    return avro;
  }

  /**
   * Sets the value of the avro property.
   * 
   * @param value allowed object is {@link AvroDataFormat }
   * 
   */
  public void setAvro(AvroDataFormat value) {
    this.avro = value;
  }

  /**
   * Gets the value of the base64 property.
   * 
   * @return possible object is {@link Base64Element }
   * 
   */
  public Base64Element getBase64() {
    return base64;
  }

  /**
   * Sets the value of the base64 property.
   * 
   * @param value allowed object is {@link Base64Element }
   * 
   */
  public void setBase64(Base64Element value) {
    this.base64 = value;
  }

  /**
   * Gets the value of the beanio property.
   * 
   * @return possible object is {@link BeanioElement }
   * 
   */
  public BeanioElement getBeanio() {
    return beanio;
  }

  /**
   * Sets the value of the beanio property.
   * 
   * @param value allowed object is {@link BeanioElement }
   * 
   */
  public void setBeanio(BeanioElement value) {
    this.beanio = value;
  }

  /**
   * Gets the value of the bindy property.
   * 
   * @return possible object is {@link BindyDataFormat }
   * 
   */
  public BindyDataFormat getBindy() {
    return bindy;
  }

  /**
   * Sets the value of the bindy property.
   * 
   * @param value allowed object is {@link BindyDataFormat }
   * 
   */
  public void setBindy(BindyDataFormat value) {
    this.bindy = value;
  }

  /**
   * Gets the value of the castor property.
   * 
   * @return possible object is {@link CastorDataFormat }
   * 
   */
  public CastorDataFormat getCastor() {
    return castor;
  }

  /**
   * Sets the value of the castor property.
   * 
   * @param value allowed object is {@link CastorDataFormat }
   * 
   */
  public void setCastor(CastorDataFormat value) {
    this.castor = value;
  }

  /**
   * Gets the value of the crypto property.
   * 
   * @return possible object is {@link CryptoDataFormat }
   * 
   */
  public CryptoDataFormat getCrypto() {
    return crypto;
  }

  /**
   * Sets the value of the crypto property.
   * 
   * @param value allowed object is {@link CryptoDataFormat }
   * 
   */
  public void setCrypto(CryptoDataFormat value) {
    this.crypto = value;
  }

  /**
   * Gets the value of the csv property.
   * 
   * @return possible object is {@link CsvDataFormat }
   * 
   */
  public CsvDataFormat getCsv() {
    return csv;
  }

  /**
   * Sets the value of the csv property.
   * 
   * @param value allowed object is {@link CsvDataFormat }
   * 
   */
  public void setCsv(CsvDataFormat value) {
    this.csv = value;
  }

  /**
   * Gets the value of the custom property.
   * 
   * @return possible object is {@link CustomDataFormat }
   * 
   */
  public CustomDataFormat getCustom() {
    return custom;
  }

  /**
   * Sets the value of the custom property.
   * 
   * @param value allowed object is {@link CustomDataFormat }
   * 
   */
  public void setCustom(CustomDataFormat value) {
    this.custom = value;
  }

  /**
   * Gets the value of the flatpack property.
   * 
   * @return possible object is {@link FlatpackDataFormat }
   * 
   */
  public FlatpackDataFormat getFlatpack() {
    return flatpack;
  }

  /**
   * Sets the value of the flatpack property.
   * 
   * @param value allowed object is {@link FlatpackDataFormat }
   * 
   */
  public void setFlatpack(FlatpackDataFormat value) {
    this.flatpack = value;
  }

  /**
   * Gets the value of the gzip property.
   * 
   * @return possible object is {@link GzipDataFormat }
   * 
   */
  public GzipDataFormat getGzip() {
    return gzip;
  }

  /**
   * Sets the value of the gzip property.
   * 
   * @param value allowed object is {@link GzipDataFormat }
   * 
   */
  public void setGzip(GzipDataFormat value) {
    this.gzip = value;
  }

  /**
   * Gets the value of the hl7 property.
   * 
   * @return possible object is {@link Hl7DataFormat }
   * 
   */
  public Hl7DataFormat getHl7() {
    return hl7;
  }

  /**
   * Sets the value of the hl7 property.
   * 
   * @param value allowed object is {@link Hl7DataFormat }
   * 
   */
  public void setHl7(Hl7DataFormat value) {
    this.hl7 = value;
  }

  /**
   * Gets the value of the jaxb property.
   * 
   * @return possible object is {@link JaxbElement }
   * 
   */
  public JaxbElement getJaxb() {
    return jaxb;
  }

  /**
   * Sets the value of the jaxb property.
   * 
   * @param value allowed object is {@link JaxbElement }
   * 
   */
  public void setJaxb(JaxbElement value) {
    this.jaxb = value;
  }

  /**
   * Gets the value of the jibx property.
   * 
   * @return possible object is {@link JibxDataFormat }
   * 
   */
  public JibxDataFormat getJibx() {
    return jibx;
  }

  /**
   * Sets the value of the jibx property.
   * 
   * @param value allowed object is {@link JibxDataFormat }
   * 
   */
  public void setJibx(JibxDataFormat value) {
    this.jibx = value;
  }

  /**
   * Gets the value of the json property.
   * 
   * @return possible object is {@link JsonElement }
   * 
   */
  public JsonElement getJson() {
    return json;
  }

  /**
   * Sets the value of the json property.
   * 
   * @param value allowed object is {@link JsonElement }
   * 
   */
  public void setJson(JsonElement value) {
    this.json = value;
  }

  /**
   * Gets the value of the protobuf property.
   * 
   * @return possible object is {@link ProtobufDataFormat }
   * 
   */
  public ProtobufDataFormat getProtobuf() {
    return protobuf;
  }

  /**
   * Sets the value of the protobuf property.
   * 
   * @param value allowed object is {@link ProtobufDataFormat }
   * 
   */
  public void setProtobuf(ProtobufDataFormat value) {
    this.protobuf = value;
  }

  /**
   * Gets the value of the rss property.
   * 
   * @return possible object is {@link RssDataFormat }
   * 
   */
  public RssDataFormat getRss() {
    return rss;
  }

  /**
   * Sets the value of the rss property.
   * 
   * @param value allowed object is {@link RssDataFormat }
   * 
   */
  public void setRss(RssDataFormat value) {
    this.rss = value;
  }

  /**
   * Gets the value of the secureXML property.
   * 
   * @return possible object is {@link XmlSecurityDataFormat }
   * 
   */
  public XmlSecurityDataFormat getSecureXML() {
    return secureXML;
  }

  /**
   * Sets the value of the secureXML property.
   * 
   * @param value allowed object is {@link XmlSecurityDataFormat }
   * 
   */
  public void setSecureXML(XmlSecurityDataFormat value) {
    this.secureXML = value;
  }

  /**
   * Gets the value of the serialization property.
   * 
   * @return possible object is {@link SerializationDataFormat }
   * 
   */
  public SerializationDataFormat getSerialization() {
    return serialization;
  }

  /**
   * Sets the value of the serialization property.
   * 
   * @param value allowed object is {@link SerializationDataFormat }
   * 
   */
  public void setSerialization(SerializationDataFormat value) {
    this.serialization = value;
  }

  /**
   * Gets the value of the soapjaxb property.
   * 
   * @return possible object is {@link SoapJaxbDataFormat }
   * 
   */
  public SoapJaxbDataFormat getSoapjaxb() {
    return soapjaxb;
  }

  /**
   * Sets the value of the soapjaxb property.
   * 
   * @param value allowed object is {@link SoapJaxbDataFormat }
   * 
   */
  public void setSoapjaxb(SoapJaxbDataFormat value) {
    this.soapjaxb = value;
  }

  /**
   * Gets the value of the string property.
   * 
   * @return possible object is {@link StringElement }
   * 
   */
  public StringElement getString() {
    return string;
  }

  /**
   * Sets the value of the string property.
   * 
   * @param value allowed object is {@link StringElement }
   * 
   */
  public void setString(StringElement value) {
    this.string = value;
  }

  /**
   * Gets the value of the syslog property.
   * 
   * @return possible object is {@link SyslogElement }
   * 
   */
  public SyslogElement getSyslog() {
    return syslog;
  }

  /**
   * Sets the value of the syslog property.
   * 
   * @param value allowed object is {@link SyslogElement }
   * 
   */
  public void setSyslog(SyslogElement value) {
    this.syslog = value;
  }

  /**
   * Gets the value of the tidyMarkup property.
   * 
   * @return possible object is {@link TidyMarkupDataFormat }
   * 
   */
  public TidyMarkupDataFormat getTidyMarkup() {
    return tidyMarkup;
  }

  /**
   * Sets the value of the tidyMarkup property.
   * 
   * @param value allowed object is {@link TidyMarkupDataFormat }
   * 
   */
  public void setTidyMarkup(TidyMarkupDataFormat value) {
    this.tidyMarkup = value;
  }

  /**
   * Gets the value of the xmlBeans property.
   * 
   * @return possible object is {@link XmlBeansDataFormat }
   * 
   */
  public XmlBeansDataFormat getXmlBeans() {
    return xmlBeans;
  }

  /**
   * Sets the value of the xmlBeans property.
   * 
   * @param value allowed object is {@link XmlBeansDataFormat }
   * 
   */
  public void setXmlBeans(XmlBeansDataFormat value) {
    this.xmlBeans = value;
  }

  /**
   * Gets the value of the xmljson property.
   * 
   * @return possible object is {@link XmlJsonDataFormat }
   * 
   */
  public XmlJsonDataFormat getXmljson() {
    return xmljson;
  }

  /**
   * Sets the value of the xmljson property.
   * 
   * @param value allowed object is {@link XmlJsonDataFormat }
   * 
   */
  public void setXmljson(XmlJsonDataFormat value) {
    this.xmljson = value;
  }

  /**
   * Gets the value of the xmlrpc property.
   * 
   * @return possible object is {@link XmlRpcDataFormat }
   * 
   */
  public XmlRpcDataFormat getXmlrpc() {
    return xmlrpc;
  }

  /**
   * Sets the value of the xmlrpc property.
   * 
   * @param value allowed object is {@link XmlRpcDataFormat }
   * 
   */
  public void setXmlrpc(XmlRpcDataFormat value) {
    this.xmlrpc = value;
  }

  /**
   * Gets the value of the xstream property.
   * 
   * @return possible object is {@link XstreamElement }
   * 
   */
  public XstreamElement getXstream() {
    return xstream;
  }

  /**
   * Sets the value of the xstream property.
   * 
   * @param value allowed object is {@link XstreamElement }
   * 
   */
  public void setXstream(XstreamElement value) {
    this.xstream = value;
  }

  /**
   * Gets the value of the pgp property.
   * 
   * @return possible object is {@link PgpDataFormat }
   * 
   */
  public PgpDataFormat getPgp() {
    return pgp;
  }

  /**
   * Sets the value of the pgp property.
   * 
   * @param value allowed object is {@link PgpDataFormat }
   * 
   */
  public void setPgp(PgpDataFormat value) {
    this.pgp = value;
  }

  /**
   * Gets the value of the zip property.
   * 
   * @return possible object is {@link ZipDataFormat }
   * 
   */
  public ZipDataFormat getZip() {
    return zip;
  }

  /**
   * Sets the value of the zip property.
   * 
   * @param value allowed object is {@link ZipDataFormat }
   * 
   */
  public void setZip(ZipDataFormat value) {
    this.zip = value;
  }

  /**
   * Gets the value of the zipFile property.
   * 
   * @return possible object is {@link ZipFileDataFormat }
   * 
   */
  public ZipFileDataFormat getZipFile() {
    return zipFile;
  }

  /**
   * Sets the value of the zipFile property.
   * 
   * @param value allowed object is {@link ZipFileDataFormat }
   * 
   */
  public void setZipFile(ZipFileDataFormat value) {
    this.zipFile = value;
  }

  /**
   * Gets the value of the ref property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRef() {
    return ref;
  }

  /**
   * Sets the value of the ref property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRef(String value) {
    this.ref = value;
  }

  public MarshalDefinition withAvro(AvroDataFormat value) {
    setAvro(value);
    return this;
  }

  public MarshalDefinition withBase64(Base64Element value) {
    setBase64(value);
    return this;
  }

  public MarshalDefinition withBeanio(BeanioElement value) {
    setBeanio(value);
    return this;
  }

  public MarshalDefinition withBindy(BindyDataFormat value) {
    setBindy(value);
    return this;
  }

  public MarshalDefinition withCastor(CastorDataFormat value) {
    setCastor(value);
    return this;
  }

  public MarshalDefinition withCrypto(CryptoDataFormat value) {
    setCrypto(value);
    return this;
  }

  public MarshalDefinition withCsv(CsvDataFormat value) {
    setCsv(value);
    return this;
  }

  public MarshalDefinition withCustom(CustomDataFormat value) {
    setCustom(value);
    return this;
  }

  public MarshalDefinition withFlatpack(FlatpackDataFormat value) {
    setFlatpack(value);
    return this;
  }

  public MarshalDefinition withGzip(GzipDataFormat value) {
    setGzip(value);
    return this;
  }

  public MarshalDefinition withHl7(Hl7DataFormat value) {
    setHl7(value);
    return this;
  }

  public MarshalDefinition withJaxb(JaxbElement value) {
    setJaxb(value);
    return this;
  }

  public MarshalDefinition withJibx(JibxDataFormat value) {
    setJibx(value);
    return this;
  }

  public MarshalDefinition withJson(JsonElement value) {
    setJson(value);
    return this;
  }

  public MarshalDefinition withProtobuf(ProtobufDataFormat value) {
    setProtobuf(value);
    return this;
  }

  public MarshalDefinition withRss(RssDataFormat value) {
    setRss(value);
    return this;
  }

  public MarshalDefinition withSecureXML(XmlSecurityDataFormat value) {
    setSecureXML(value);
    return this;
  }

  public MarshalDefinition withSerialization(SerializationDataFormat value) {
    setSerialization(value);
    return this;
  }

  public MarshalDefinition withSoapjaxb(SoapJaxbDataFormat value) {
    setSoapjaxb(value);
    return this;
  }

  public MarshalDefinition withString(StringElement value) {
    setString(value);
    return this;
  }

  public MarshalDefinition withSyslog(SyslogElement value) {
    setSyslog(value);
    return this;
  }

  public MarshalDefinition withTidyMarkup(TidyMarkupDataFormat value) {
    setTidyMarkup(value);
    return this;
  }

  public MarshalDefinition withXmlBeans(XmlBeansDataFormat value) {
    setXmlBeans(value);
    return this;
  }

  public MarshalDefinition withXmljson(XmlJsonDataFormat value) {
    setXmljson(value);
    return this;
  }

  public MarshalDefinition withXmlrpc(XmlRpcDataFormat value) {
    setXmlrpc(value);
    return this;
  }

  public MarshalDefinition withXstream(XstreamElement value) {
    setXstream(value);
    return this;
  }

  public MarshalDefinition withPgp(PgpDataFormat value) {
    setPgp(value);
    return this;
  }

  public MarshalDefinition withZip(ZipDataFormat value) {
    setZip(value);
    return this;
  }

  public MarshalDefinition withZipFile(ZipFileDataFormat value) {
    setZipFile(value);
    return this;
  }

  public MarshalDefinition withRef(String value) {
    setRef(value);
    return this;
  }

  @Override
  public MarshalDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public MarshalDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public MarshalDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public MarshalDefinition withId(String value) {
    setId(value);
    return this;
  }

  /**
   * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts'
   * xjc plugin
   * 
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
  }

}
