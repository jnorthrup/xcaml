//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.29 at 11:10:27 AM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for IdReferenceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdReferenceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *       &lt;attribute name="Version" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}VersionMatchType" />
 *       &lt;attribute name="EarliestVersion" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}VersionMatchType" />
 *       &lt;attribute name="LatestVersion" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}VersionMatchType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdReferenceType", propOrder = {"value"})
public class IdReferenceType {

  @XmlValue
  @XmlSchemaType(name = "anyURI")
  protected String value;
  @XmlAttribute(name = "Version")
  protected String version;
  @XmlAttribute(name = "EarliestVersion")
  protected String earliestVersion;
  @XmlAttribute(name = "LatestVersion")
  protected String latestVersion;

  /**
   * Gets the value of the value property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the version property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setVersion(String value) {
    this.version = value;
  }

  /**
   * Gets the value of the earliestVersion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getEarliestVersion() {
    return earliestVersion;
  }

  /**
   * Sets the value of the earliestVersion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setEarliestVersion(String value) {
    this.earliestVersion = value;
  }

  /**
   * Gets the value of the latestVersion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLatestVersion() {
    return latestVersion;
  }

  /**
   * Sets the value of the latestVersion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLatestVersion(String value) {
    this.latestVersion = value;
  }

  public IdReferenceType withValue(String value) {
    setValue(value);
    return this;
  }

  public IdReferenceType withVersion(String value) {
    setVersion(value);
    return this;
  }

  public IdReferenceType withEarliestVersion(String value) {
    setEarliestVersion(value);
    return this;
  }

  public IdReferenceType withLatestVersion(String value) {
    setLatestVersion(value);
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
