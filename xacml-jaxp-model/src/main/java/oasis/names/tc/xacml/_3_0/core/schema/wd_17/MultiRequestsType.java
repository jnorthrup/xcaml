//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 09:47:06 AM PDT 
//


package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRequestsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRequestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}RequestReference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRequestsType", propOrder = {
    "requestReference"
})
public class MultiRequestsType {

    @XmlElement(name = "RequestReference", required = true)
    protected List<RequestReferenceType> requestReference;

    /**
     * Gets the value of the requestReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestReferenceType }
     * 
     * 
     */
    public List<RequestReferenceType> getRequestReference() {
        if (requestReference == null) {
            requestReference = new ArrayList<RequestReferenceType>();
        }
        return this.requestReference;
    }

    public MultiRequestsType withRequestReference(RequestReferenceType... values) {
        if (values!= null) {
            for (RequestReferenceType value: values) {
                getRequestReference().add(value);
            }
        }
        return this;
    }

    public MultiRequestsType withRequestReference(Collection<RequestReferenceType> values) {
        if (values!= null) {
            getRequestReference().addAll(values);
        }
        return this;
    }

}
