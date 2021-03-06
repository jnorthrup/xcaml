//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for errorHandlerDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorHandlerDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}identifiedType">
 *       &lt;sequence>
 *         &lt;element name="redeliveryPolicy" type="{http://camel.apache.org/schema/spring}camelRedeliveryPolicyFactoryBean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://camel.apache.org/schema/spring}errorHandlerType" />
 *       &lt;attribute name="deadLetterUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://camel.apache.org/schema/spring}loggingLevel" />
 *       &lt;attribute name="rollbackLoggingLevel" type="{http://camel.apache.org/schema/spring}loggingLevel" />
 *       &lt;attribute name="logName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useOriginalMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transactionTemplateRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionManagerRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="onRedeliveryRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="retryWhileRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeliveryPolicyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="executorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorHandlerDefinition", propOrder = {
    "redeliveryPolicy"
})
public class ErrorHandlerDefinition
    extends IdentifiedType
{

    protected CamelRedeliveryPolicyFactoryBean redeliveryPolicy;
    @XmlAttribute(name = "type")
    protected ErrorHandlerType type;
    @XmlAttribute(name = "deadLetterUri")
    protected String deadLetterUri;
    @XmlAttribute(name = "level")
    protected LoggingLevel level;
    @XmlAttribute(name = "rollbackLoggingLevel")
    protected LoggingLevel rollbackLoggingLevel;
    @XmlAttribute(name = "logName")
    protected String logName;
    @XmlAttribute(name = "useOriginalMessage")
    protected Boolean useOriginalMessage;
    @XmlAttribute(name = "transactionTemplateRef")
    protected String transactionTemplateRef;
    @XmlAttribute(name = "transactionManagerRef")
    protected String transactionManagerRef;
    @XmlAttribute(name = "onRedeliveryRef")
    protected String onRedeliveryRef;
    @XmlAttribute(name = "retryWhileRef")
    protected String retryWhileRef;
    @XmlAttribute(name = "redeliveryPolicyRef")
    protected String redeliveryPolicyRef;
    @XmlAttribute(name = "executorServiceRef")
    protected String executorServiceRef;

    /**
     * Gets the value of the redeliveryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CamelRedeliveryPolicyFactoryBean }
     *     
     */
    public CamelRedeliveryPolicyFactoryBean getRedeliveryPolicy() {
        return redeliveryPolicy;
    }

    /**
     * Sets the value of the redeliveryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamelRedeliveryPolicyFactoryBean }
     *     
     */
    public void setRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean value) {
        this.redeliveryPolicy = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandlerType }
     *     
     */
    public ErrorHandlerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandlerType }
     *     
     */
    public void setType(ErrorHandlerType value) {
        this.type = value;
    }

    /**
     * Gets the value of the deadLetterUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadLetterUri() {
        return deadLetterUri;
    }

    /**
     * Sets the value of the deadLetterUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadLetterUri(String value) {
        this.deadLetterUri = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LoggingLevel }
     *     
     */
    public LoggingLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggingLevel }
     *     
     */
    public void setLevel(LoggingLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the rollbackLoggingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LoggingLevel }
     *     
     */
    public LoggingLevel getRollbackLoggingLevel() {
        return rollbackLoggingLevel;
    }

    /**
     * Sets the value of the rollbackLoggingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggingLevel }
     *     
     */
    public void setRollbackLoggingLevel(LoggingLevel value) {
        this.rollbackLoggingLevel = value;
    }

    /**
     * Gets the value of the logName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogName() {
        return logName;
    }

    /**
     * Sets the value of the logName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogName(String value) {
        this.logName = value;
    }

    /**
     * Gets the value of the useOriginalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOriginalMessage() {
        return useOriginalMessage;
    }

    /**
     * Sets the value of the useOriginalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOriginalMessage(Boolean value) {
        this.useOriginalMessage = value;
    }

    /**
     * Gets the value of the transactionTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTemplateRef() {
        return transactionTemplateRef;
    }

    /**
     * Sets the value of the transactionTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTemplateRef(String value) {
        this.transactionTemplateRef = value;
    }

    /**
     * Gets the value of the transactionManagerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionManagerRef() {
        return transactionManagerRef;
    }

    /**
     * Sets the value of the transactionManagerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionManagerRef(String value) {
        this.transactionManagerRef = value;
    }

    /**
     * Gets the value of the onRedeliveryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnRedeliveryRef() {
        return onRedeliveryRef;
    }

    /**
     * Sets the value of the onRedeliveryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnRedeliveryRef(String value) {
        this.onRedeliveryRef = value;
    }

    /**
     * Gets the value of the retryWhileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryWhileRef() {
        return retryWhileRef;
    }

    /**
     * Sets the value of the retryWhileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryWhileRef(String value) {
        this.retryWhileRef = value;
    }

    /**
     * Gets the value of the redeliveryPolicyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeliveryPolicyRef() {
        return redeliveryPolicyRef;
    }

    /**
     * Sets the value of the redeliveryPolicyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeliveryPolicyRef(String value) {
        this.redeliveryPolicyRef = value;
    }

    /**
     * Gets the value of the executorServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorServiceRef() {
        return executorServiceRef;
    }

    /**
     * Sets the value of the executorServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorServiceRef(String value) {
        this.executorServiceRef = value;
    }

    public ErrorHandlerDefinition withRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean value) {
        setRedeliveryPolicy(value);
        return this;
    }

    public ErrorHandlerDefinition withType(ErrorHandlerType value) {
        setType(value);
        return this;
    }

    public ErrorHandlerDefinition withDeadLetterUri(String value) {
        setDeadLetterUri(value);
        return this;
    }

    public ErrorHandlerDefinition withLevel(LoggingLevel value) {
        setLevel(value);
        return this;
    }

    public ErrorHandlerDefinition withRollbackLoggingLevel(LoggingLevel value) {
        setRollbackLoggingLevel(value);
        return this;
    }

    public ErrorHandlerDefinition withLogName(String value) {
        setLogName(value);
        return this;
    }

    public ErrorHandlerDefinition withUseOriginalMessage(Boolean value) {
        setUseOriginalMessage(value);
        return this;
    }

    public ErrorHandlerDefinition withTransactionTemplateRef(String value) {
        setTransactionTemplateRef(value);
        return this;
    }

    public ErrorHandlerDefinition withTransactionManagerRef(String value) {
        setTransactionManagerRef(value);
        return this;
    }

    public ErrorHandlerDefinition withOnRedeliveryRef(String value) {
        setOnRedeliveryRef(value);
        return this;
    }

    public ErrorHandlerDefinition withRetryWhileRef(String value) {
        setRetryWhileRef(value);
        return this;
    }

    public ErrorHandlerDefinition withRedeliveryPolicyRef(String value) {
        setRedeliveryPolicyRef(value);
        return this;
    }

    public ErrorHandlerDefinition withExecutorServiceRef(String value) {
        setExecutorServiceRef(value);
        return this;
    }

    @Override
    public ErrorHandlerDefinition withId(String value) {
        setId(value);
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
