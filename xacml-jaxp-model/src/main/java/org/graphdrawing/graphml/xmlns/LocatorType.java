//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.03 at 12:41:02 AM PST
//

package org.graphdrawing.graphml.xmlns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * 
 * Complex type for the <locator> element. Content type: (empty)
 * 
 * 
 * <p>
 * Java class for locator.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locator.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}locator.extra.attrib"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href use="required""/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locator.type")
public class LocatorType {

  @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String href;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
  protected String type;

  /**
   * 
   * points to the resource of this locator.
   * 
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the value of the href property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setHref(String value) {
    this.href = value;
  }

  /**
   * 
   * type of the hyperlink (fixed as simple).
   * 
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setType(String value) {
    this.type = value;
  }

  public LocatorType withHref(String value) {
    setHref(value);
    return this;
  }

  public LocatorType withType(String value) {
    setType(value);
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
