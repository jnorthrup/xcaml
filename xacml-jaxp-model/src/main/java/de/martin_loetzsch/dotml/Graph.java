//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 04:25:41 AM PST
//

package de.martin_loetzsch.dotml;

import java.math.BigDecimal;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.martin-loetzsch.de/DOTML}cluster-or-graph">
 *       &lt;attribute name="file-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="margin" type="{http://www.martin-loetzsch.de/DOTML}point" />
 *       &lt;attribute name="nodesep" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rankdir" type="{http://www.martin-loetzsch.de/DOTML}rankdir" />
 *       &lt;attribute name="ranksep" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ratio" type="{http://www.martin-loetzsch.de/DOTML}ratio" />
 *       &lt;attribute name="size" type="{http://www.martin-loetzsch.de/DOTML}point" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "graph")
public class Graph extends ClusterOrGraph {

  @XmlAttribute(name = "file-name", required = true)
  protected String fileName;
  @XmlAttribute(name = "margin")
  protected String margin;
  @XmlAttribute(name = "nodesep")
  protected BigDecimal nodesep;
  @XmlAttribute(name = "rankdir")
  protected Rankdir rankdir;
  @XmlAttribute(name = "ranksep")
  protected BigDecimal ranksep;
  @XmlAttribute(name = "ratio")
  protected String ratio;
  @XmlAttribute(name = "size")
  protected String size;

  /**
   * Gets the value of the fileName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Sets the value of the fileName property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFileName(String value) {
    this.fileName = value;
  }

  /**
   * Gets the value of the margin property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMargin() {
    return margin;
  }

  /**
   * Sets the value of the margin property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMargin(String value) {
    this.margin = value;
  }

  /**
   * Gets the value of the nodesep property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getNodesep() {
    return nodesep;
  }

  /**
   * Sets the value of the nodesep property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  public void setNodesep(BigDecimal value) {
    this.nodesep = value;
  }

  /**
   * Gets the value of the rankdir property.
   * 
   * @return possible object is {@link Rankdir }
   * 
   */
  public Rankdir getRankdir() {
    return rankdir;
  }

  /**
   * Sets the value of the rankdir property.
   * 
   * @param value allowed object is {@link Rankdir }
   * 
   */
  public void setRankdir(Rankdir value) {
    this.rankdir = value;
  }

  /**
   * Gets the value of the ranksep property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getRanksep() {
    return ranksep;
  }

  /**
   * Sets the value of the ranksep property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  public void setRanksep(BigDecimal value) {
    this.ranksep = value;
  }

  /**
   * Gets the value of the ratio property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRatio() {
    return ratio;
  }

  /**
   * Sets the value of the ratio property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRatio(String value) {
    this.ratio = value;
  }

  /**
   * Gets the value of the size property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getSize() {
    return size;
  }

  /**
   * Sets the value of the size property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setSize(String value) {
    this.size = value;
  }

  public Graph withFileName(String value) {
    setFileName(value);
    return this;
  }

  public Graph withMargin(String value) {
    setMargin(value);
    return this;
  }

  public Graph withNodesep(BigDecimal value) {
    setNodesep(value);
    return this;
  }

  public Graph withRankdir(Rankdir value) {
    setRankdir(value);
    return this;
  }

  public Graph withRanksep(BigDecimal value) {
    setRanksep(value);
    return this;
  }

  public Graph withRatio(String value) {
    setRatio(value);
    return this;
  }

  public Graph withSize(String value) {
    setSize(value);
    return this;
  }

  @Override
  public Graph withNodeOrClusterOrSubGraph(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getNodeOrClusterOrSubGraph().add(value);
      }
    }
    return this;
  }

  @Override
  public Graph withNodeOrClusterOrSubGraph(Collection<Object> values) {
    if (values != null) {
      getNodeOrClusterOrSubGraph().addAll(values);
    }
    return this;
  }

  @Override
  public Graph withBgcolor(String value) {
    setBgcolor(value);
    return this;
  }

  @Override
  public Graph withLabel(String value) {
    setLabel(value);
    return this;
  }

  @Override
  public Graph withFontname(String value) {
    setFontname(value);
    return this;
  }

  @Override
  public Graph withFontsize(BigDecimal value) {
    setFontsize(value);
    return this;
  }

  @Override
  public Graph withFontcolor(String value) {
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
