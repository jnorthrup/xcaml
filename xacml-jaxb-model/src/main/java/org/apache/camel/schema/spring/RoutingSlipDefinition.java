//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for routingSlipDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routingSlipDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputExpressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uriDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignoreInvalidEndpoints" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cacheSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routingSlipDefinition")
public class RoutingSlipDefinition
    extends NoOutputExpressionNode
{

    @XmlAttribute(name = "uriDelimiter")
    protected String uriDelimiter;
    @XmlAttribute(name = "ignoreInvalidEndpoints")
    protected Boolean ignoreInvalidEndpoints;
    @XmlAttribute(name = "cacheSize")
    protected Integer cacheSize;

    /**
     * Gets the value of the uriDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriDelimiter() {
        return uriDelimiter;
    }

    /**
     * Sets the value of the uriDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriDelimiter(String value) {
        this.uriDelimiter = value;
    }

    /**
     * Gets the value of the ignoreInvalidEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreInvalidEndpoints() {
        return ignoreInvalidEndpoints;
    }

    /**
     * Sets the value of the ignoreInvalidEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreInvalidEndpoints(Boolean value) {
        this.ignoreInvalidEndpoints = value;
    }

    /**
     * Gets the value of the cacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheSize() {
        return cacheSize;
    }

    /**
     * Sets the value of the cacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheSize(Integer value) {
        this.cacheSize = value;
    }

    public RoutingSlipDefinition withUriDelimiter(String value) {
        setUriDelimiter(value);
        return this;
    }

    public RoutingSlipDefinition withIgnoreInvalidEndpoints(Boolean value) {
        setIgnoreInvalidEndpoints(value);
        return this;
    }

    public RoutingSlipDefinition withCacheSize(Integer value) {
        setCacheSize(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withExpressionDefinition(Expression value) {
        setExpressionDefinition(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withConstant(ConstantElement value) {
        setConstant(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withEl(ElElement value) {
        setEl(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withGroovy(GroovyElement value) {
        setGroovy(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withHeader(HeaderElement value) {
        setHeader(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withJxpath(JxpathElement value) {
        setJxpath(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withJavaScript(JavaScriptElement value) {
        setJavaScript(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withJsonpath(JsonpathElement value) {
        setJsonpath(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withLanguage(LanguageElement value) {
        setLanguage(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withMethod(MethodElement value) {
        setMethod(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withMvel(MvelElement value) {
        setMvel(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withOgnl(OgnlElement value) {
        setOgnl(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withPhp(PhpElement value) {
        setPhp(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withPython(PythonElement value) {
        setPython(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withRef(RefElement value) {
        setRef(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withRuby(RubyElement value) {
        setRuby(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withSimple(SimpleElement value) {
        setSimple(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withSpel(SpELExpression value) {
        setSpel(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withSql(SqlElement value) {
        setSql(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withTokenize(TokenizerExpression value) {
        setTokenize(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withVtdxml(VtdXmlExpression value) {
        setVtdxml(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withXtokenize(XmlTokenizerExpression value) {
        setXtokenize(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withXpath(XpathElement value) {
        setXpath(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withXquery(XqueryElement value) {
        setXquery(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    @Override
    public RoutingSlipDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    @Override
    public RoutingSlipDefinition withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public RoutingSlipDefinition withId(String value) {
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
