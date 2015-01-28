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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for RuleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Description" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Target" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Condition" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}ObligationExpressions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AdviceExpressions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RuleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Effect" use="required" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}EffectType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = {
    "description", "target", "condition", "obligationExpressions", "adviceExpressions"})
public class RuleType {

  @XmlElement(name = "Description")
  protected String description;
  @XmlElement(name = "Target")
  protected TargetType target;
  @XmlElement(name = "Condition")
  protected ConditionType condition;
  @XmlElement(name = "ObligationExpressions")
  protected ObligationExpressionsType obligationExpressions;
  @XmlElement(name = "AdviceExpressions")
  protected AdviceExpressionsType adviceExpressions;
  @XmlAttribute(name = "RuleId", required = true)
  protected String ruleId;
  @XmlAttribute(name = "Effect", required = true)
  protected EffectType effect;

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDescription(String value) {
    this.description = value;
  }

  /**
   * Gets the value of the target property.
   * 
   * @return possible object is {@link TargetType }
   * 
   */
  public TargetType getTarget() {
    return target;
  }

  /**
   * Sets the value of the target property.
   * 
   * @param value allowed object is {@link TargetType }
   * 
   */
  public void setTarget(TargetType value) {
    this.target = value;
  }

  /**
   * Gets the value of the condition property.
   * 
   * @return possible object is {@link ConditionType }
   * 
   */
  public ConditionType getCondition() {
    return condition;
  }

  /**
   * Sets the value of the condition property.
   * 
   * @param value allowed object is {@link ConditionType }
   * 
   */
  public void setCondition(ConditionType value) {
    this.condition = value;
  }

  /**
   * Gets the value of the obligationExpressions property.
   * 
   * @return possible object is {@link ObligationExpressionsType }
   * 
   */
  public ObligationExpressionsType getObligationExpressions() {
    return obligationExpressions;
  }

  /**
   * Sets the value of the obligationExpressions property.
   * 
   * @param value allowed object is {@link ObligationExpressionsType }
   * 
   */
  public void setObligationExpressions(ObligationExpressionsType value) {
    this.obligationExpressions = value;
  }

  /**
   * Gets the value of the adviceExpressions property.
   * 
   * @return possible object is {@link AdviceExpressionsType }
   * 
   */
  public AdviceExpressionsType getAdviceExpressions() {
    return adviceExpressions;
  }

  /**
   * Sets the value of the adviceExpressions property.
   * 
   * @param value allowed object is {@link AdviceExpressionsType }
   * 
   */
  public void setAdviceExpressions(AdviceExpressionsType value) {
    this.adviceExpressions = value;
  }

  /**
   * Gets the value of the ruleId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRuleId() {
    return ruleId;
  }

  /**
   * Sets the value of the ruleId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRuleId(String value) {
    this.ruleId = value;
  }

  /**
   * Gets the value of the effect property.
   * 
   * @return possible object is {@link EffectType }
   * 
   */
  public EffectType getEffect() {
    return effect;
  }

  /**
   * Sets the value of the effect property.
   * 
   * @param value allowed object is {@link EffectType }
   * 
   */
  public void setEffect(EffectType value) {
    this.effect = value;
  }

  public RuleType withDescription(String value) {
    setDescription(value);
    return this;
  }

  public RuleType withTarget(TargetType value) {
    setTarget(value);
    return this;
  }

  public RuleType withCondition(ConditionType value) {
    setCondition(value);
    return this;
  }

  public RuleType withObligationExpressions(ObligationExpressionsType value) {
    setObligationExpressions(value);
    return this;
  }

  public RuleType withAdviceExpressions(AdviceExpressionsType value) {
    setAdviceExpressions(value);
    return this;
  }

  public RuleType withRuleId(String value) {
    setRuleId(value);
    return this;
  }

  public RuleType withEffect(EffectType value) {
    setEffect(value);
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
