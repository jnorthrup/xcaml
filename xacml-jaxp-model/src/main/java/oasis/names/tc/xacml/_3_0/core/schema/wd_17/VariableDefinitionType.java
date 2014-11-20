//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 09:47:06 AM PDT 
//


package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Expression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VariableId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableDefinitionType", propOrder = {
    "expression"
})
public class VariableDefinitionType {

    @XmlElementRef(name = "Expression", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class)
    protected JAXBElement<?> expression;
    @XmlAttribute(name = "VariableId", required = true)
    protected String variableId;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link VariableReferenceType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FunctionType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AttributeValueType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AttributeSelectorType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ExpressionType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AttributeDesignatorType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ApplyType }{@code >}
     *     
     */
    public JAXBElement<?> getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link VariableReferenceType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link FunctionType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AttributeValueType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AttributeSelectorType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ExpressionType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AttributeDesignatorType }{@code >}
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ApplyType }{@code >}
     *     
     */
    public void setExpression(JAXBElement<?> value) {
        this.expression = value;
    }

    /**
     * Gets the value of the variableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableId() {
        return variableId;
    }

    /**
     * Sets the value of the variableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableId(String value) {
        this.variableId = value;
    }

    public VariableDefinitionType withExpression(JAXBElement<?> value) {
        setExpression(value);
        return this;
    }

    public VariableDefinitionType withVariableId(String value) {
        setVariableId(value);
        return this;
    }

}
