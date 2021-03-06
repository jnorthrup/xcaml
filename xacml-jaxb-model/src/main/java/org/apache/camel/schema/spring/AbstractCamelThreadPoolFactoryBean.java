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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for abstractCamelThreadPoolFactoryBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCamelThreadPoolFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractCamelFactoryBean">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="poolSize" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxPoolSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keepAliveTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxQueueSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectedPolicy" type="{http://camel.apache.org/schema/spring}threadPoolRejectedPolicy" />
 *       &lt;attribute name="threadName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractCamelThreadPoolFactoryBean")
@XmlSeeAlso({
    CamelThreadPoolFactoryBean.class
})
public abstract class AbstractCamelThreadPoolFactoryBean
    extends AbstractCamelFactoryBean
{

    @XmlAttribute(name = "poolSize", required = true)
    protected String poolSize;
    @XmlAttribute(name = "maxPoolSize")
    protected String maxPoolSize;
    @XmlAttribute(name = "keepAliveTime")
    protected String keepAliveTime;
    @XmlAttribute(name = "timeUnit")
    protected String timeUnit;
    @XmlAttribute(name = "maxQueueSize")
    protected String maxQueueSize;
    @XmlAttribute(name = "rejectedPolicy")
    protected ThreadPoolRejectedPolicy rejectedPolicy;
    @XmlAttribute(name = "threadName", required = true)
    protected String threadName;
    @XmlAttribute(name = "scheduled")
    protected Boolean scheduled;

    /**
     * Gets the value of the poolSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolSize() {
        return poolSize;
    }

    /**
     * Sets the value of the poolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolSize(String value) {
        this.poolSize = value;
    }

    /**
     * Gets the value of the maxPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * Sets the value of the maxPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPoolSize(String value) {
        this.maxPoolSize = value;
    }

    /**
     * Gets the value of the keepAliveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * Sets the value of the keepAliveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepAliveTime(String value) {
        this.keepAliveTime = value;
    }

    /**
     * Gets the value of the timeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets the value of the timeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeUnit(String value) {
        this.timeUnit = value;
    }

    /**
     * Gets the value of the maxQueueSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxQueueSize() {
        return maxQueueSize;
    }

    /**
     * Sets the value of the maxQueueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxQueueSize(String value) {
        this.maxQueueSize = value;
    }

    /**
     * Gets the value of the rejectedPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadPoolRejectedPolicy }
     *     
     */
    public ThreadPoolRejectedPolicy getRejectedPolicy() {
        return rejectedPolicy;
    }

    /**
     * Sets the value of the rejectedPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadPoolRejectedPolicy }
     *     
     */
    public void setRejectedPolicy(ThreadPoolRejectedPolicy value) {
        this.rejectedPolicy = value;
    }

    /**
     * Gets the value of the threadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * Sets the value of the threadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadName(String value) {
        this.threadName = value;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduled(Boolean value) {
        this.scheduled = value;
    }

    public AbstractCamelThreadPoolFactoryBean withPoolSize(String value) {
        setPoolSize(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withMaxPoolSize(String value) {
        setMaxPoolSize(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withKeepAliveTime(String value) {
        setKeepAliveTime(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withTimeUnit(String value) {
        setTimeUnit(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withMaxQueueSize(String value) {
        setMaxQueueSize(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withRejectedPolicy(ThreadPoolRejectedPolicy value) {
        setRejectedPolicy(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withThreadName(String value) {
        setThreadName(value);
        return this;
    }

    public AbstractCamelThreadPoolFactoryBean withScheduled(Boolean value) {
        setScheduled(value);
        return this;
    }

    @Override
    public AbstractCamelThreadPoolFactoryBean withCamelContextId(String value) {
        setCamelContextId(value);
        return this;
    }

    @Override
    public AbstractCamelThreadPoolFactoryBean withId(String value) {
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
