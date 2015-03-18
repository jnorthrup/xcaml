//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
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
 * Java class for MissingAttributeDetailType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MissingAttributeDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingAttributeDetailType", propOrder = {"attributeValue"})
public class MissingAttributeDetailType {

  @XmlElement(name = "AttributeValue")
  protected List<AttributeValueType> attributeValue;
  @XmlAttribute(name = "Category", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String category;
  @XmlAttribute(name = "AttributeId", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String attributeId;
  @XmlAttribute(name = "DataType", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String dataType;
  @XmlAttribute(name = "Issuer")
  protected String issuer;

  /**
   * Gets the value of the attributeValue property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the attributeValue property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getAttributeValue().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AttributeValueType }
   * 
   * 
   */
  public List<AttributeValueType> getAttributeValue() {
    if (attributeValue == null) {
      attributeValue = new ArrayList<AttributeValueType>();
    }
    return this.attributeValue;
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
   * Gets the value of the dataType property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * Sets the value of the dataType property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDataType(String value) {
    this.dataType = value;
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

  public MissingAttributeDetailType withAttributeValue(AttributeValueType... values) {
    if (values != null) {
      for (AttributeValueType value : values) {
        getAttributeValue().add(value);
      }
    }
    return this;
  }

  public MissingAttributeDetailType withAttributeValue(Collection<AttributeValueType> values) {
    if (values != null) {
      getAttributeValue().addAll(values);
    }
    return this;
  }

  public MissingAttributeDetailType withCategory(String value) {
    setCategory(value);
    return this;
  }

  public MissingAttributeDetailType withAttributeId(String value) {
    setAttributeId(value);
    return this;
  }

  public MissingAttributeDetailType withDataType(String value) {
    setDataType(value);
    return this;
  }

  public MissingAttributeDetailType withIssuer(String value) {
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