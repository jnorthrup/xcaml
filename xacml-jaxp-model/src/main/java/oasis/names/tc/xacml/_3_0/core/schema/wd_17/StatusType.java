//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 09:43:07 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for StatusType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}StatusCode"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}StatusMessage" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}StatusDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {"statusCode", "statusMessage", "statusDetail"})
public class StatusType {

  @XmlElement(name = "StatusCode", required = true)
  protected StatusCodeType statusCode;
  @XmlElement(name = "StatusMessage")
  protected String statusMessage;
  @XmlElement(name = "StatusDetail")
  protected StatusDetailType statusDetail;

  /**
   * Gets the value of the statusCode property.
   * 
   * @return possible object is {@link StatusCodeType }
   * 
   */
  public StatusCodeType getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the value of the statusCode property.
   * 
   * @param value allowed object is {@link StatusCodeType }
   * 
   */
  public void setStatusCode(StatusCodeType value) {
    this.statusCode = value;
  }

  /**
   * Gets the value of the statusMessage property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Sets the value of the statusMessage property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setStatusMessage(String value) {
    this.statusMessage = value;
  }

  /**
   * Gets the value of the statusDetail property.
   * 
   * @return possible object is {@link StatusDetailType }
   * 
   */
  public StatusDetailType getStatusDetail() {
    return statusDetail;
  }

  /**
   * Sets the value of the statusDetail property.
   * 
   * @param value allowed object is {@link StatusDetailType }
   * 
   */
  public void setStatusDetail(StatusDetailType value) {
    this.statusDetail = value;
  }

  public StatusType withStatusCode(StatusCodeType value) {
    setStatusCode(value);
    return this;
  }

  public StatusType withStatusMessage(String value) {
    setStatusMessage(value);
    return this;
  }

  public StatusType withStatusDetail(StatusDetailType value) {
    setStatusDetail(value);
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
