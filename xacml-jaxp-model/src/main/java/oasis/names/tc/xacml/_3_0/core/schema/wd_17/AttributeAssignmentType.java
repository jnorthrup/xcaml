//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.29 at 11:10:27 AM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for AttributeAssignmentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeAssignmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeValueType">
 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeAssignmentType")
public class AttributeAssignmentType extends AttributeValueType {

  @XmlAttribute(name = "AttributeId", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String attributeId;
  @XmlAttribute(name = "Category")
  @XmlSchemaType(name = "anyURI")
  protected String category;
  @XmlAttribute(name = "Issuer")
  protected String issuer;

  /**
   * Gets the value of the attributeId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAttributeId() {
    return attributeId;
  }

  /**
   * Sets the value of the attributeId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAttributeId(String value) {
    this.attributeId = value;
  }

  /**
   * Gets the value of the category property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCategory() {
    return category;
  }

  /**
   * Sets the value of the category property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCategory(String value) {
    this.category = value;
  }

  /**
   * Gets the value of the issuer property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Sets the value of the issuer property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setIssuer(String value) {
    this.issuer = value;
  }

  public AttributeAssignmentType withAttributeId(String value) {
    setAttributeId(value);
    return this;
  }

  public AttributeAssignmentType withCategory(String value) {
    setCategory(value);
    return this;
  }

  public AttributeAssignmentType withIssuer(String value) {
    setIssuer(value);
    return this;
  }

  @Override
  public AttributeAssignmentType withContent(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getContent().add(value);
      }
    }
    return this;
  }

  @Override
  public AttributeAssignmentType withContent(Collection<Object> values) {
    if (values != null) {
      getContent().addAll(values);
    }
    return this;
  }

  @Override
  public AttributeAssignmentType withDataType(String value) {
    setDataType(value);
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
