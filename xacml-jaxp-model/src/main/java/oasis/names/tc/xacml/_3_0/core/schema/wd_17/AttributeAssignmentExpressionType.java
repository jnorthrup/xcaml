//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for AttributeAssignmentExpressionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeAssignmentExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Expression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeAssignmentExpressionType", propOrder = {"expression"})
public class AttributeAssignmentExpressionType {

  @XmlElementRef(name = "Expression", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class)
  protected JAXBElement<?> expression;
  @XmlAttribute(name = "AttributeId", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String attributeId;
  @XmlAttribute(name = "Category")
  @XmlSchemaType(name = "anyURI")
  protected String category;
  @XmlAttribute(name = "Issuer")
  protected String issuer;

  /**
   * Gets the value of the expression property.
   * 
   * @return possible object is {@link JAXBElement }{@code <}{@link FunctionType }{@code >} {@link JAXBElement }{@code <}
   *         {@link ExpressionType }{@code >} {@link JAXBElement }{@code <}{@link AttributeDesignatorType }{@code >}
   *         {@link JAXBElement }{@code <}{@link ApplyType }{@code >} {@link JAXBElement }{@code <}
   *         {@link AttributeSelectorType }{@code >} {@link JAXBElement }{@code <}{@link AttributeValueType }{@code >}
   *         {@link JAXBElement }{@code <}{@link VariableReferenceType }{@code >}
   * 
   */
  public JAXBElement<?> getExpression() {
    return expression;
  }

  /**
   * Sets the value of the expression property.
   * 
   * @param value allowed object is {@link JAXBElement }{@code <}{@link FunctionType }{@code >} {@link JAXBElement }
   *          {@code <}{@link ExpressionType }{@code >} {@link JAXBElement }{@code <}{@link AttributeDesignatorType }
   *          {@code >} {@link JAXBElement }{@code <}{@link ApplyType }{@code >} {@link JAXBElement }{@code <}
   *          {@link AttributeSelectorType }{@code >} {@link JAXBElement }{@code <}{@link AttributeValueType }{@code >}
   *          {@link JAXBElement }{@code <}{@link VariableReferenceType }{@code >}
   * 
   */
  public void setExpression(JAXBElement<?> value) {
    this.expression = value;
  }

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

  public AttributeAssignmentExpressionType withExpression(JAXBElement<?> value) {
    setExpression(value);
    return this;
  }

  public AttributeAssignmentExpressionType withAttributeId(String value) {
    setAttributeId(value);
    return this;
  }

  public AttributeAssignmentExpressionType withCategory(String value) {
    setCategory(value);
    return this;
  }

  public AttributeAssignmentExpressionType withIssuer(String value) {
    setIssuer(value);
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
