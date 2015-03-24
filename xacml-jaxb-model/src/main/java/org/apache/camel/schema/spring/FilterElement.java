//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}expressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "filter")
public class FilterElement
    extends ExpressionNode
{


    @Override
    public FilterElement withExpressionDefinition(Expression value) {
        setExpressionDefinition(value);
        return this;
    }

    @Override
    public FilterElement withConstant(ConstantElement value) {
        setConstant(value);
        return this;
    }

    @Override
    public FilterElement withEl(ElElement value) {
        setEl(value);
        return this;
    }

    @Override
    public FilterElement withGroovy(GroovyElement value) {
        setGroovy(value);
        return this;
    }

    @Override
    public FilterElement withHeader(HeaderElement value) {
        setHeader(value);
        return this;
    }

    @Override
    public FilterElement withJxpath(JxpathElement value) {
        setJxpath(value);
        return this;
    }

    @Override
    public FilterElement withJavaScript(JavaScriptElement value) {
        setJavaScript(value);
        return this;
    }

    @Override
    public FilterElement withJsonpath(JsonpathElement value) {
        setJsonpath(value);
        return this;
    }

    @Override
    public FilterElement withLanguage(LanguageElement value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FilterElement withMethod(MethodElement value) {
        setMethod(value);
        return this;
    }

    @Override
    public FilterElement withMvel(MvelElement value) {
        setMvel(value);
        return this;
    }

    @Override
    public FilterElement withOgnl(OgnlElement value) {
        setOgnl(value);
        return this;
    }

    @Override
    public FilterElement withPhp(PhpElement value) {
        setPhp(value);
        return this;
    }

    @Override
    public FilterElement withPython(PythonElement value) {
        setPython(value);
        return this;
    }

    @Override
    public FilterElement withRef(RefElement value) {
        setRef(value);
        return this;
    }

    @Override
    public FilterElement withRuby(RubyElement value) {
        setRuby(value);
        return this;
    }

    @Override
    public FilterElement withSimple(SimpleElement value) {
        setSimple(value);
        return this;
    }

    @Override
    public FilterElement withSpel(SpELExpression value) {
        setSpel(value);
        return this;
    }

    @Override
    public FilterElement withSql(SqlElement value) {
        setSql(value);
        return this;
    }

    @Override
    public FilterElement withTokenize(TokenizerExpression value) {
        setTokenize(value);
        return this;
    }

    @Override
    public FilterElement withVtdxml(VtdXmlExpression value) {
        setVtdxml(value);
        return this;
    }

    @Override
    public FilterElement withXtokenize(XmlTokenizerExpression value) {
        setXtokenize(value);
        return this;
    }

    @Override
    public FilterElement withXpath(XpathElement value) {
        setXpath(value);
        return this;
    }

    @Override
    public FilterElement withXquery(XqueryElement value) {
        setXquery(value);
        return this;
    }

    @Override
    public FilterElement withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    @Override
    public FilterElement withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    @Override
    public FilterElement withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public FilterElement withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public FilterElement withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public FilterElement withId(String value) {
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
