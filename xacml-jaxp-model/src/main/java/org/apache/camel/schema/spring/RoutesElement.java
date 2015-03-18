//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.04 at 01:11:38 AM PST
//

package org.apache.camel.schema.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}optionalIdentifiedDefinition">
 *       &lt;sequence>
 *         &lt;element ref="{http://camel.apache.org/schema/spring}route" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"route"})
@XmlRootElement(name = "routes")
public class RoutesElement extends OptionalIdentifiedDefinition {

  protected List<RouteElement> route;

  /**
   * Gets the value of the route property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the route property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getRoute().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link RouteElement }
   * 
   * 
   */
  public List<RouteElement> getRoute() {
    if (route == null) {
      route = new ArrayList<RouteElement>();
    }
    return this.route;
  }

  public RoutesElement withRoute(RouteElement... values) {
    if (values != null) {
      for (RouteElement value : values) {
        getRoute().add(value);
      }
    }
    return this;
  }

  public RoutesElement withRoute(Collection<RouteElement> values) {
    if (values != null) {
      getRoute().addAll(values);
    }
    return this;
  }

  @Override
  public RoutesElement withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public RoutesElement withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public RoutesElement withId(String value) {
    setId(value);
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