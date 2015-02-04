//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package de.martin_loetzsch.dotml;

import java.math.BigDecimal;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * A rectangular cluster of nodes.
 * 
 * <p>
 * Java class for cluster complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cluster">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.martin-loetzsch.de/DOTML}cluster-or-graph">
 *       &lt;attribute name="color" type="{http://www.martin-loetzsch.de/DOTML}color" />
 *       &lt;attribute name="fillcolor" type="{http://www.martin-loetzsch.de/DOTML}color" />
 *       &lt;attribute name="id" use="required" type="{http://www.martin-loetzsch.de/DOTML}id" />
 *       &lt;attribute name="labeljust" type="{http://www.martin-loetzsch.de/DOTML}labeljust" />
 *       &lt;attribute name="labelloc" type="{http://www.martin-loetzsch.de/DOTML}labelloc" />
 *       &lt;attribute name="style" type="{http://www.martin-loetzsch.de/DOTML}clusterStyle" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cluster")
public class Cluster extends ClusterOrGraph {

  @XmlAttribute(name = "color")
  protected String color;
  @XmlAttribute(name = "fillcolor")
  protected String fillcolor;
  @XmlAttribute(name = "id", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String id;
  @XmlAttribute(name = "labeljust")
  protected Labeljust labeljust;
  @XmlAttribute(name = "labelloc")
  protected Labelloc labelloc;
  @XmlAttribute(name = "style")
  protected ClusterStyle style;

  /**
   * Gets the value of the color property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getColor() {
    return color;
  }

  /**
   * Sets the value of the color property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setColor(String value) {
    this.color = value;
  }

  /**
   * Gets the value of the fillcolor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFillcolor() {
    return fillcolor;
  }

  /**
   * Sets the value of the fillcolor property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFillcolor(String value) {
    this.fillcolor = value;
  }

  /**
   * Gets the value of the id property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the labeljust property.
   * 
   * @return possible object is {@link Labeljust }
   * 
   */
  public Labeljust getLabeljust() {
    return labeljust;
  }

  /**
   * Sets the value of the labeljust property.
   * 
   * @param value allowed object is {@link Labeljust }
   * 
   */
  public void setLabeljust(Labeljust value) {
    this.labeljust = value;
  }

  /**
   * Gets the value of the labelloc property.
   * 
   * @return possible object is {@link Labelloc }
   * 
   */
  public Labelloc getLabelloc() {
    return labelloc;
  }

  /**
   * Sets the value of the labelloc property.
   * 
   * @param value allowed object is {@link Labelloc }
   * 
   */
  public void setLabelloc(Labelloc value) {
    this.labelloc = value;
  }

  /**
   * Gets the value of the style property.
   * 
   * @return possible object is {@link ClusterStyle }
   * 
   */
  public ClusterStyle getStyle() {
    return style;
  }

  /**
   * Sets the value of the style property.
   * 
   * @param value allowed object is {@link ClusterStyle }
   * 
   */
  public void setStyle(ClusterStyle value) {
    this.style = value;
  }

  public Cluster withColor(String value) {
    setColor(value);
    return this;
  }

  public Cluster withFillcolor(String value) {
    setFillcolor(value);
    return this;
  }

  public Cluster withId(String value) {
    setId(value);
    return this;
  }

  public Cluster withLabeljust(Labeljust value) {
    setLabeljust(value);
    return this;
  }

  public Cluster withLabelloc(Labelloc value) {
    setLabelloc(value);
    return this;
  }

  public Cluster withStyle(ClusterStyle value) {
    setStyle(value);
    return this;
  }

  @Override
  public Cluster withNodeOrClusterOrSubGraph(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getNodeOrClusterOrSubGraph().add(value);
      }
    }
    return this;
  }

  @Override
  public Cluster withNodeOrClusterOrSubGraph(Collection<Object> values) {
    if (values != null) {
      getNodeOrClusterOrSubGraph().addAll(values);
    }
    return this;
  }

  @Override
  public Cluster withBgcolor(String value) {
    setBgcolor(value);
    return this;
  }

  @Override
  public Cluster withLabel(String value) {
    setLabel(value);
    return this;
  }

  @Override
  public Cluster withFontname(String value) {
    setFontname(value);
    return this;
  }

  @Override
  public Cluster withFontsize(BigDecimal value) {
    setFontsize(value);
    return this;
  }

  @Override
  public Cluster withFontcolor(String value) {
    setFontcolor(value);
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
