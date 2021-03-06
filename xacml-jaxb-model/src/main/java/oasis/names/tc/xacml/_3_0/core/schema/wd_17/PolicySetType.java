//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PolicySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicySetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Description" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicyIssuer" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicySetDefaults" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Target"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicySet"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Policy"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicySetIdReference"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicyIdReference"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}CombinerParameters"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicyCombinerParameters"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicySetCombinerParameters"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}ObligationExpressions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AdviceExpressions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PolicySetId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Version" use="required" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}VersionType" />
 *       &lt;attribute name="PolicyCombiningAlgId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="MaxDelegationDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicySetType", propOrder = {
    "description",
    "policyIssuer",
    "policySetDefaults",
    "target",
    "policySetOrPolicyOrPolicySetIdReference",
    "obligationExpressions",
    "adviceExpressions"
})
public class PolicySetType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PolicyIssuer")
    protected PolicyIssuerType policyIssuer;
    @XmlElement(name = "PolicySetDefaults")
    protected DefaultsType policySetDefaults;
    @XmlElement(name = "Target", required = true)
    protected TargetType target;
    @XmlElementRefs({
        @XmlElementRef(name = "PolicySet", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicySetCombinerParameters", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicyIdReference", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicyCombinerParameters", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicySetIdReference", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Policy", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CombinerParameters", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> policySetOrPolicyOrPolicySetIdReference;
    @XmlElement(name = "ObligationExpressions")
    protected ObligationExpressionsType obligationExpressions;
    @XmlElement(name = "AdviceExpressions")
    protected AdviceExpressionsType adviceExpressions;
    @XmlAttribute(name = "PolicySetId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policySetId;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "PolicyCombiningAlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String policyCombiningAlgId;
    @XmlAttribute(name = "MaxDelegationDepth")
    protected BigInteger maxDelegationDepth;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the policyIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyIssuerType }
     *     
     */
    public PolicyIssuerType getPolicyIssuer() {
        return policyIssuer;
    }

    /**
     * Sets the value of the policyIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyIssuerType }
     *     
     */
    public void setPolicyIssuer(PolicyIssuerType value) {
        this.policyIssuer = value;
    }

    /**
     * Gets the value of the policySetDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultsType }
     *     
     */
    public DefaultsType getPolicySetDefaults() {
        return policySetDefaults;
    }

    /**
     * Sets the value of the policySetDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultsType }
     *     
     */
    public void setPolicySetDefaults(DefaultsType value) {
        this.policySetDefaults = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TargetType }
     *     
     */
    public TargetType getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetType }
     *     
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

    /**
     * Gets the value of the policySetOrPolicyOrPolicySetIdReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policySetOrPolicyOrPolicySetIdReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicySetOrPolicyOrPolicySetIdReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PolicySetType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicySetCombinerParametersType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyCombinerParametersType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CombinerParametersType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPolicySetOrPolicyOrPolicySetIdReference() {
        if (policySetOrPolicyOrPolicySetIdReference == null) {
            policySetOrPolicyOrPolicySetIdReference = new ArrayList<JAXBElement<?>>();
        }
        return this.policySetOrPolicyOrPolicySetIdReference;
    }

    /**
     * Gets the value of the obligationExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link ObligationExpressionsType }
     *     
     */
    public ObligationExpressionsType getObligationExpressions() {
        return obligationExpressions;
    }

    /**
     * Sets the value of the obligationExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationExpressionsType }
     *     
     */
    public void setObligationExpressions(ObligationExpressionsType value) {
        this.obligationExpressions = value;
    }

    /**
     * Gets the value of the adviceExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceExpressionsType }
     *     
     */
    public AdviceExpressionsType getAdviceExpressions() {
        return adviceExpressions;
    }

    /**
     * Sets the value of the adviceExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceExpressionsType }
     *     
     */
    public void setAdviceExpressions(AdviceExpressionsType value) {
        this.adviceExpressions = value;
    }

    /**
     * Gets the value of the policySetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySetId() {
        return policySetId;
    }

    /**
     * Sets the value of the policySetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySetId(String value) {
        this.policySetId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the policyCombiningAlgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCombiningAlgId() {
        return policyCombiningAlgId;
    }

    /**
     * Sets the value of the policyCombiningAlgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCombiningAlgId(String value) {
        this.policyCombiningAlgId = value;
    }

    /**
     * Gets the value of the maxDelegationDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDelegationDepth() {
        return maxDelegationDepth;
    }

    /**
     * Sets the value of the maxDelegationDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDelegationDepth(BigInteger value) {
        this.maxDelegationDepth = value;
    }

    public PolicySetType withDescription(String value) {
        setDescription(value);
        return this;
    }

    public PolicySetType withPolicyIssuer(PolicyIssuerType value) {
        setPolicyIssuer(value);
        return this;
    }

    public PolicySetType withPolicySetDefaults(DefaultsType value) {
        setPolicySetDefaults(value);
        return this;
    }

    public PolicySetType withTarget(TargetType value) {
        setTarget(value);
        return this;
    }

    public PolicySetType withPolicySetOrPolicyOrPolicySetIdReference(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getPolicySetOrPolicyOrPolicySetIdReference().add(value);
            }
        }
        return this;
    }

    public PolicySetType withPolicySetOrPolicyOrPolicySetIdReference(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getPolicySetOrPolicyOrPolicySetIdReference().addAll(values);
        }
        return this;
    }

    public PolicySetType withObligationExpressions(ObligationExpressionsType value) {
        setObligationExpressions(value);
        return this;
    }

    public PolicySetType withAdviceExpressions(AdviceExpressionsType value) {
        setAdviceExpressions(value);
        return this;
    }

    public PolicySetType withPolicySetId(String value) {
        setPolicySetId(value);
        return this;
    }

    public PolicySetType withVersion(String value) {
        setVersion(value);
        return this;
    }

    public PolicySetType withPolicyCombiningAlgId(String value) {
        setPolicyCombiningAlgId(value);
        return this;
    }

    public PolicySetType withMaxDelegationDepth(BigInteger value) {
        setMaxDelegationDepth(value);
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
