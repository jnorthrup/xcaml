//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 09:43:07 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for AdviceExpressionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdviceExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeAssignmentExpression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AdviceId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AppliesTo" use="required" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}EffectType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdviceExpressionType", propOrder = {"attributeAssignmentExpression"})
public class AdviceExpressionType {

  @XmlElement(name = "AttributeAssignmentExpression")
  protected List<AttributeAssignmentExpressionType> attributeAssignmentExpression;
  @XmlAttribute(name = "AdviceId", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String adviceId;
  @XmlAttribute(name = "AppliesTo", required = true)
  protected EffectType appliesTo;

  /**
   * Gets the value of the attributeAssignmentExpression property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the attributeAssignmentExpression property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getAttributeAssignmentExpression().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AttributeAssignmentExpressionType }
   * 
   * 
   */
  public List<AttributeAssignmentExpressionType> getAttributeAssignmentExpression() {
    if (attributeAssignmentExpression == null) {
      attributeAssignmentExpression = new ArrayList<AttributeAssignmentExpressionType>();
    }
    return this.attributeAssignmentExpression;
  }

  /**
   * Gets the value of the adviceId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAdviceId() {
    return adviceId;
  }

  /**
   * Sets the value of the adviceId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAdviceId(String value) {
    this.adviceId = value;
  }

  /**
   * Gets the value of the appliesTo property.
   * 
   * @return possible object is {@link EffectType }
   * 
   */
  public EffectType getAppliesTo() {
    return appliesTo;
  }

  /**
   * Sets the value of the appliesTo property.
   * 
   * @param value allowed object is {@link EffectType }
   * 
   */
  public void setAppliesTo(EffectType value) {
    this.appliesTo = value;
  }

  public AdviceExpressionType withAttributeAssignmentExpression(
      AttributeAssignmentExpressionType... values) {
    if (values != null) {
      for (AttributeAssignmentExpressionType value : values) {
        getAttributeAssignmentExpression().add(value);
      }
    }
    return this;
  }

  public AdviceExpressionType withAttributeAssignmentExpression(
      Collection<AttributeAssignmentExpressionType> values) {
    if (values != null) {
      getAttributeAssignmentExpression().addAll(values);
    }
    return this;
  }

  public AdviceExpressionType withAdviceId(String value) {
    setAdviceId(value);
    return this;
  }

  public AdviceExpressionType withAppliesTo(EffectType value) {
    setAppliesTo(value);
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
