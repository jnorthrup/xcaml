//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
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
 * <p>Java class for PolicySetCombinerParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicySetCombinerParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}CombinerParametersType">
 *       &lt;attribute name="PolicySetIdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicySetCombinerParametersType")
public class PolicySetCombinerParametersType
    extends CombinerParametersType
{

    @XmlAttribute(name = "PolicySetIdRef", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policySetIdRef;

    /**
     * Gets the value of the policySetIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySetIdRef() {
        return policySetIdRef;
    }

    /**
     * Sets the value of the policySetIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySetIdRef(String value) {
        this.policySetIdRef = value;
    }

    public PolicySetCombinerParametersType withPolicySetIdRef(String value) {
        setPolicySetIdRef(value);
        return this;
    }

    @Override
    public PolicySetCombinerParametersType withCombinerParameter(CombinerParameterType... values) {
        if (values!= null) {
            for (CombinerParameterType value: values) {
                getCombinerParameter().add(value);
            }
        }
        return this;
    }

    @Override
    public PolicySetCombinerParametersType withCombinerParameter(Collection<CombinerParameterType> values) {
        if (values!= null) {
            getCombinerParameter().addAll(values);
        }
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
