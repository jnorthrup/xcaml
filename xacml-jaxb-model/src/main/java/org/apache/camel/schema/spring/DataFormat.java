//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for dataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}identifiedType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataFormat")
@XmlSeeAlso({
    CustomDataFormat.class,
    CsvDataFormat.class,
    ZipFileDataFormat.class,
    CastorDataFormat.class,
    AvroDataFormat.class,
    ZipDataFormat.class,
    BindyDataFormat.class,
    RssDataFormat.class,
    PgpDataFormat.class,
    XmlBeansDataFormat.class,
    GzipDataFormat.class,
    XmlJsonDataFormat.class,
    ProtobufDataFormat.class,
    TidyMarkupDataFormat.class,
    XmlRpcDataFormat.class,
    XmlSecurityDataFormat.class,
    CryptoDataFormat.class,
    SoapJaxbDataFormat.class,
    Hl7DataFormat.class,
    JibxDataFormat.class,
    FlatpackDataFormat.class,
    SerializationDataFormat.class,
    JsonElement.class,
    StringElement.class,
    Base64Element.class,
    JaxbElement.class,
    SyslogElement.class,
    XstreamElement.class,
    BeanioElement.class
})
public class DataFormat
    extends IdentifiedType
{


    @Override
    public DataFormat withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
