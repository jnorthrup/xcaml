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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for ResultType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Decision"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Status" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Obligations" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AssociatedAdvice" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Attributes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicyIdentifierList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "decision", "status", "obligations", "associatedAdvice", "attributes", "policyIdentifierList"})
public class ResultType {

  @XmlElement(name = "Decision", required = true)
  @XmlSchemaType(name = "string")
  protected DecisionType decision;
  @XmlElement(name = "Status")
  protected StatusType status;
  @XmlElement(name = "Obligations")
  protected ObligationsType obligations;
  @XmlElement(name = "AssociatedAdvice")
  protected AssociatedAdviceType associatedAdvice;
  @XmlElement(name = "Attributes")
  protected List<AttributesType> attributes;
  @XmlElement(name = "PolicyIdentifierList")
  protected PolicyIdentifierListType policyIdentifierList;

  /**
   * Gets the value of the decision property.
   * 
   * @return possible object is {@link DecisionType }
   * 
   */
  public DecisionType getDecision() {
    return decision;
  }

  /**
   * Sets the value of the decision property.
   * 
   * @param value allowed object is {@link DecisionType }
   * 
   */
  public void setDecision(DecisionType value) {
    this.decision = value;
  }

  /**
   * Gets the value of the status property.
   * 
   * @return possible object is {@link StatusType }
   * 
   */
  public StatusType getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   * 
   * @param value allowed object is {@link StatusType }
   * 
   */
  public void setStatus(StatusType value) {
    this.status = value;
  }

  /**
   * Gets the value of the obligations property.
   * 
   * @return possible object is {@link ObligationsType }
   * 
   */
  public ObligationsType getObligations() {
    return obligations;
  }

  /**
   * Sets the value of the obligations property.
   * 
   * @param value allowed object is {@link ObligationsType }
   * 
   */
  public void setObligations(ObligationsType value) {
    this.obligations = value;
  }

  /**
   * Gets the value of the associatedAdvice property.
   * 
   * @return possible object is {@link AssociatedAdviceType }
   * 
   */
  public AssociatedAdviceType getAssociatedAdvice() {
    return associatedAdvice;
  }

  /**
   * Sets the value of the associatedAdvice property.
   * 
   * @param value allowed object is {@link AssociatedAdviceType }
   * 
   */
  public void setAssociatedAdvice(AssociatedAdviceType value) {
    this.associatedAdvice = value;
  }

  /**
   * Gets the value of the attributes property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the attributes property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getAttributes().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AttributesType }
   * 
   * 
   */
  public List<AttributesType> getAttributes() {
    if (attributes == null) {
      attributes = new ArrayList<AttributesType>();
    }
    return this.attributes;
  }

  /**
   * Gets the value of the policyIdentifierList property.
   * 
   * @return possible object is {@link PolicyIdentifierListType }
   * 
   */
  public PolicyIdentifierListType getPolicyIdentifierList() {
    return policyIdentifierList;
  }

  /**
   * Sets the value of the policyIdentifierList property.
   * 
   * @param value allowed object is {@link PolicyIdentifierListType }
   * 
   */
  public void setPolicyIdentifierList(PolicyIdentifierListType value) {
    this.policyIdentifierList = value;
  }

  public ResultType withDecision(DecisionType value) {
    setDecision(value);
    return this;
  }

  public ResultType withStatus(StatusType value) {
    setStatus(value);
    return this;
  }

  public ResultType withObligations(ObligationsType value) {
    setObligations(value);
    return this;
  }

  public ResultType withAssociatedAdvice(AssociatedAdviceType value) {
    setAssociatedAdvice(value);
    return this;
  }

  public ResultType withAttributes(AttributesType... values) {
    if (values != null) {
      for (AttributesType value : values) {
        getAttributes().add(value);
      }
    }
    return this;
  }

  public ResultType withAttributes(Collection<AttributesType> values) {
    if (values != null) {
      getAttributes().addAll(values);
    }
    return this;
  }

  public ResultType withPolicyIdentifierList(PolicyIdentifierListType value) {
    setPolicyIdentifierList(value);
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
