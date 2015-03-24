//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="output">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}processorDefinition">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://camel.apache.org/schema/spring}aop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}aggregate"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}bean"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doCatch"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}when"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}choice"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}otherwise"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}convertBodyTo"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}delay"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}dynamicRouter"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}enrich"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}filter"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doFinally"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}idempotentConsumer"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}inOnly"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}inOut"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}intercept"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}interceptFrom"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}interceptToEndpoint"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}loadBalance"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}log"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}loop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}marshal"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}multicast"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}onCompletion"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}onException"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pipeline"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}policy"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pollEnrich"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}process"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}recipientList"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeHeaders"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeProperty"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}resequence"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}rollback"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}route"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}routingSlip"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}sample"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setBody"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setExchangePattern"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setFaultBody"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setOutHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setProperty"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}sort"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}split"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}stop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}threads"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}throttle"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}throwException"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}to"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}transacted"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}transform"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doTry"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}unmarshal"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}validate"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}wireTap"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}restBinding"/>
 *         &lt;/choice>
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
@XmlType(name = "output", propOrder = {
    "aopOrAggregateOrBean"
})
@XmlSeeAlso({
    AopDefinition.class,
    FinallyDefinition.class,
    InterceptDefinition.class,
    InterceptSendToEndpointDefinition.class,
    MulticastDefinition.class,
    PolicyDefinition.class,
    SamplingDefinition.class,
    ThreadsDefinition.class,
    TransactedDefinition.class,
    TryDefinition.class,
    OtherwiseElement.class,
    PipelineElement.class
})
public class Output
    extends ProcessorDefinition
{

    @XmlElements({
        @XmlElement(name = "aop", type = AopDefinition.class),
        @XmlElement(name = "aggregate", type = AggregateElement.class),
        @XmlElement(name = "bean", type = BeanElement.class),
        @XmlElement(name = "doCatch", type = CatchDefinition.class),
        @XmlElement(name = "when", type = WhenDefinition.class),
        @XmlElement(name = "choice", type = ChoiceElement.class),
        @XmlElement(name = "otherwise", type = OtherwiseElement.class),
        @XmlElement(name = "convertBodyTo", type = ConvertBodyDefinition.class),
        @XmlElement(name = "delay", type = DelayElement.class),
        @XmlElement(name = "dynamicRouter", type = DynamicRouterDefinition.class),
        @XmlElement(name = "enrich", type = EnrichDefinition.class),
        @XmlElement(name = "filter", type = FilterElement.class),
        @XmlElement(name = "doFinally", type = FinallyDefinition.class),
        @XmlElement(name = "idempotentConsumer", type = IdempotentConsumerDefinition.class),
        @XmlElement(name = "inOnly", type = InOnlyDefinition.class),
        @XmlElement(name = "inOut", type = InOutDefinition.class),
        @XmlElement(name = "intercept", type = InterceptDefinition.class),
        @XmlElement(name = "interceptFrom", type = InterceptFromDefinition.class),
        @XmlElement(name = "interceptToEndpoint", type = InterceptSendToEndpointDefinition.class),
        @XmlElement(name = "loadBalance", type = LoadBalanceDefinition.class),
        @XmlElement(name = "log", type = LogElement.class),
        @XmlElement(name = "loop", type = LoopDefinition.class),
        @XmlElement(name = "marshal", type = MarshalDefinition.class),
        @XmlElement(name = "multicast", type = MulticastDefinition.class),
        @XmlElement(name = "onCompletion", type = OnCompletionDefinition.class),
        @XmlElement(name = "onException", type = OnExceptionDefinition.class),
        @XmlElement(name = "pipeline", type = PipelineElement.class),
        @XmlElement(name = "policy", type = PolicyDefinition.class),
        @XmlElement(name = "pollEnrich", type = PollEnrichDefinition.class),
        @XmlElement(name = "process", type = ProcessElement.class),
        @XmlElement(name = "recipientList", type = RecipientListDefinition.class),
        @XmlElement(name = "removeHeader", type = RemoveHeaderDefinition.class),
        @XmlElement(name = "removeHeaders", type = RemoveHeadersDefinition.class),
        @XmlElement(name = "removeProperty", type = RemovePropertyDefinition.class),
        @XmlElement(name = "resequence", type = ResequenceDefinition.class),
        @XmlElement(name = "rollback", type = RollbackDefinition.class),
        @XmlElement(name = "route", type = RouteElement.class),
        @XmlElement(name = "routingSlip", type = RoutingSlipDefinition.class),
        @XmlElement(name = "sample", type = SamplingDefinition.class),
        @XmlElement(name = "setBody", type = SetBodyDefinition.class),
        @XmlElement(name = "setExchangePattern", type = SetExchangePatternDefinition.class),
        @XmlElement(name = "setFaultBody", type = SetFaultBodyDefinition.class),
        @XmlElement(name = "setHeader", type = SetHeaderDefinition.class),
        @XmlElement(name = "setOutHeader", type = SetOutHeaderDefinition.class),
        @XmlElement(name = "setProperty", type = SetPropertyDefinition.class),
        @XmlElement(name = "sort", type = SortDefinition.class),
        @XmlElement(name = "split", type = SplitDefinition.class),
        @XmlElement(name = "stop", type = StopDefinition.class),
        @XmlElement(name = "threads", type = ThreadsDefinition.class),
        @XmlElement(name = "throttle", type = ThrottleDefinition.class),
        @XmlElement(name = "throwException", type = ThrowExceptionDefinition.class),
        @XmlElement(name = "to", type = ToElement.class),
        @XmlElement(name = "transacted", type = TransactedDefinition.class),
        @XmlElement(name = "transform", type = TransformElement.class),
        @XmlElement(name = "doTry", type = TryDefinition.class),
        @XmlElement(name = "unmarshal", type = UnmarshalDefinition.class),
        @XmlElement(name = "validate", type = ValidateDefinition.class),
        @XmlElement(name = "wireTap", type = WireTapDefinition.class),
        @XmlElement(name = "restBinding", type = RestBindingElement.class)
    })
    protected List<ProcessorDefinition> aopOrAggregateOrBean;

    /**
     * Gets the value of the aopOrAggregateOrBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aopOrAggregateOrBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAopOrAggregateOrBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AopDefinition }
     * {@link AggregateElement }
     * {@link BeanElement }
     * {@link CatchDefinition }
     * {@link WhenDefinition }
     * {@link ChoiceElement }
     * {@link OtherwiseElement }
     * {@link ConvertBodyDefinition }
     * {@link DelayElement }
     * {@link DynamicRouterDefinition }
     * {@link EnrichDefinition }
     * {@link FilterElement }
     * {@link FinallyDefinition }
     * {@link IdempotentConsumerDefinition }
     * {@link InOnlyDefinition }
     * {@link InOutDefinition }
     * {@link InterceptDefinition }
     * {@link InterceptFromDefinition }
     * {@link InterceptSendToEndpointDefinition }
     * {@link LoadBalanceDefinition }
     * {@link LogElement }
     * {@link LoopDefinition }
     * {@link MarshalDefinition }
     * {@link MulticastDefinition }
     * {@link OnCompletionDefinition }
     * {@link OnExceptionDefinition }
     * {@link PipelineElement }
     * {@link PolicyDefinition }
     * {@link PollEnrichDefinition }
     * {@link ProcessElement }
     * {@link RecipientListDefinition }
     * {@link RemoveHeaderDefinition }
     * {@link RemoveHeadersDefinition }
     * {@link RemovePropertyDefinition }
     * {@link ResequenceDefinition }
     * {@link RollbackDefinition }
     * {@link RouteElement }
     * {@link RoutingSlipDefinition }
     * {@link SamplingDefinition }
     * {@link SetBodyDefinition }
     * {@link SetExchangePatternDefinition }
     * {@link SetFaultBodyDefinition }
     * {@link SetHeaderDefinition }
     * {@link SetOutHeaderDefinition }
     * {@link SetPropertyDefinition }
     * {@link SortDefinition }
     * {@link SplitDefinition }
     * {@link StopDefinition }
     * {@link ThreadsDefinition }
     * {@link ThrottleDefinition }
     * {@link ThrowExceptionDefinition }
     * {@link ToElement }
     * {@link TransactedDefinition }
     * {@link TransformElement }
     * {@link TryDefinition }
     * {@link UnmarshalDefinition }
     * {@link ValidateDefinition }
     * {@link WireTapDefinition }
     * {@link RestBindingElement }
     * 
     * 
     */
    public List<ProcessorDefinition> getAopOrAggregateOrBean() {
        if (aopOrAggregateOrBean == null) {
            aopOrAggregateOrBean = new ArrayList<ProcessorDefinition>();
        }
        return this.aopOrAggregateOrBean;
    }

    public Output withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    public Output withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    @Override
    public Output withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public Output withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public Output withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public Output withId(String value) {
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
