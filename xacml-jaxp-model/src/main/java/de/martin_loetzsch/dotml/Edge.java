//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 04:51:52 PM PST
//

package de.martin_loetzsch.dotml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Represents a single edge in the graph.
 * 
 * <p>
 * Java class for edge complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.martin-loetzsch.de/DOTML}font-attributes"/>
 *       &lt;attribute name="arrowhead" type="{http://www.martin-loetzsch.de/DOTML}arrow-type" />
 *       &lt;attribute name="arrowsize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="arrowtail" type="{http://www.martin-loetzsch.de/DOTML}arrow-type" />
 *       &lt;attribute name="color" type="{http://www.martin-loetzsch.de/DOTML}color" />
 *       &lt;attribute name="constraint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="decorate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dir" type="{http://www.martin-loetzsch.de/DOTML}dir" />
 *       &lt;attribute name="from" use="required" type="{http://www.martin-loetzsch.de/DOTML}id" />
 *       &lt;attribute name="headlabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headport" type="{http://www.martin-loetzsch.de/DOTML}node-port" />
 *       &lt;attribute name="label" type="{http://www.martin-loetzsch.de/DOTML}label" />
 *       &lt;attribute name="labeldistance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="labelfloat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="labelfontcolor" type="{http://www.martin-loetzsch.de/DOTML}color" />
 *       &lt;attribute name="labelfontname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="labelfontsize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="lhead" type="{http://www.martin-loetzsch.de/DOTML}id" />
 *       &lt;attribute name="ltail" type="{http://www.martin-loetzsch.de/DOTML}id" />
 *       &lt;attribute name="minlen" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="style" type="{http://www.martin-loetzsch.de/DOTML}style" />
 *       &lt;attribute name="samehead" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="sametail" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="taillabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tailport" type="{http://www.martin-loetzsch.de/DOTML}node-port" />
 *       &lt;attribute name="to" use="required" type="{http://www.martin-loetzsch.de/DOTML}id" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edge")
public class Edge {

  @XmlAttribute(name = "arrowhead")
  protected ArrowType arrowhead;
  @XmlAttribute(name = "arrowsize")
  protected BigDecimal arrowsize;
  @XmlAttribute(name = "arrowtail")
  protected ArrowType arrowtail;
  @XmlAttribute(name = "color")
  protected String color;
  @XmlAttribute(name = "constraint")
  protected Boolean constraint;
  @XmlAttribute(name = "decorate")
  protected Boolean decorate;
  @XmlAttribute(name = "dir")
  protected Dir dir;
  @XmlAttribute(name = "from", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String from;
  @XmlAttribute(name = "headlabel")
  protected String headlabel;
  @XmlAttribute(name = "headport")
  protected NodePort headport;
  @XmlAttribute(name = "label")
  protected String label;
  @XmlAttribute(name = "labeldistance")
  protected BigDecimal labeldistance;
  @XmlAttribute(name = "labelfloat")
  protected Boolean labelfloat;
  @XmlAttribute(name = "labelfontcolor")
  protected String labelfontcolor;
  @XmlAttribute(name = "labelfontname")
  protected String labelfontname;
  @XmlAttribute(name = "labelfontsize")
  protected BigDecimal labelfontsize;
  @XmlAttribute(name = "lhead")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String lhead;
  @XmlAttribute(name = "ltail")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String ltail;
  @XmlAttribute(name = "minlen")
  protected BigInteger minlen;
  @XmlAttribute(name = "style")
  protected Style style;
  @XmlAttribute(name = "samehead")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String samehead;
  @XmlAttribute(name = "sametail")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String sametail;
  @XmlAttribute(name = "taillabel")
  protected String taillabel;
  @XmlAttribute(name = "tailport")
  protected NodePort tailport;
  @XmlAttribute(name = "to", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String to;
  @XmlAttribute(name = "fontname")
  protected String fontname;
  @XmlAttribute(name = "fontsize")
  protected BigDecimal fontsize;
  @XmlAttribute(name = "fontcolor")
  protected String fontcolor;

  /**
   * Gets the value of the arrowhead property.
   * 
   * @return possible object is {@link ArrowType }
   * 
   */
  public ArrowType getArrowhead() {
    return arrowhead;
  }

  /**
   * Sets the value of the arrowhead property.
   * 
   * @param value allowed object is {@link ArrowType }
   * 
   */
  public void setArrowhead(ArrowType value) {
    this.arrowhead = value;
  }

  /**
   * Gets the value of the arrowsize property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getArrowsize() {
    return arrowsize;
  }

  /**
   * Sets the value of the arrowsize property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  public void setArrowsize(BigDecimal value) {
    this.arrowsize = value;
  }

  /**
   * Gets the value of the arrowtail property.
   * 
   * @return possible object is {@link ArrowType }
   * 
   */
  public ArrowType getArrowtail() {
    return arrowtail;
  }

  /**
   * Sets the value of the arrowtail property.
   * 
   * @param value allowed object is {@link ArrowType }
   * 
   */
  public void setArrowtail(ArrowType value) {
    this.arrowtail = value;
  }

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
   * Gets the value of the constraint property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isConstraint() {
    return constraint;
  }

  /**
   * Sets the value of the constraint property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setConstraint(Boolean value) {
    this.constraint = value;
  }

  /**
   * Gets the value of the decorate property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isDecorate() {
    return decorate;
  }

  /**
   * Sets the value of the decorate property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setDecorate(Boolean value) {
    this.decorate = value;
  }

  /**
   * Gets the value of the dir property.
   * 
   * @return possible object is {@link Dir }
   * 
   */
  public Dir getDir() {
    return dir;
  }

  /**
   * Sets the value of the dir property.
   * 
   * @param value allowed object is {@link Dir }
   * 
   */
  public void setDir(Dir value) {
    this.dir = value;
  }

  /**
   * Gets the value of the from property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFrom() {
    return from;
  }

  /**
   * Sets the value of the from property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFrom(String value) {
    this.from = value;
  }

  /**
   * Gets the value of the headlabel property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getHeadlabel() {
    return headlabel;
  }

  /**
   * Sets the value of the headlabel property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setHeadlabel(String value) {
    this.headlabel = value;
  }

  /**
   * Gets the value of the headport property.
   * 
   * @return possible object is {@link NodePort }
   * 
   */
  public NodePort getHeadport() {
    return headport;
  }

  /**
   * Sets the value of the headport property.
   * 
   * @param value allowed object is {@link NodePort }
   * 
   */
  public void setHeadport(NodePort value) {
    this.headport = value;
  }

  /**
   * Gets the value of the label property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLabel(String value) {
    this.label = value;
  }

  /**
   * Gets the value of the labeldistance property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getLabeldistance() {
    return labeldistance;
  }

  /**
   * Sets the value of the labeldistance property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  public void setLabeldistance(BigDecimal value) {
    this.labeldistance = value;
  }

  /**
   * Gets the value of the labelfloat property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isLabelfloat() {
    return labelfloat;
  }

  /**
   * Sets the value of the labelfloat property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setLabelfloat(Boolean value) {
    this.labelfloat = value;
  }

  /**
   * Gets the value of the labelfontcolor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLabelfontcolor() {
    return labelfontcolor;
  }

  /**
   * Sets the value of the labelfontcolor property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLabelfontcolor(String value) {
    this.labelfontcolor = value;
  }

  /**
   * Gets the value of the labelfontname property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLabelfontname() {
    return labelfontname;
  }

  /**
   * Sets the value of the labelfontname property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLabelfontname(String value) {
    this.labelfontname = value;
  }

  /**
   * Gets the value of the labelfontsize property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getLabelfontsize() {
    return labelfontsize;
  }

  /**
   * Sets the value of the labelfontsize property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  public void setLabelfontsize(BigDecimal value) {
    this.labelfontsize = value;
  }

  /**
   * Gets the value of the lhead property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLhead() {
    return lhead;
  }

  /**
   * Sets the value of the lhead property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLhead(String value) {
    this.lhead = value;
  }

  /**
   * Gets the value of the ltail property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLtail() {
    return ltail;
  }

  /**
   * Sets the value of the ltail property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLtail(String value) {
    this.ltail = value;
  }

  /**
   * Gets the value of the minlen property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getMinlen() {
    return minlen;
  }

  /**
   * Sets the value of the minlen property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setMinlen(BigInteger value) {
    this.minlen = value;
  }

  /**
   * Gets the value of the style property.
   * 
   * @return possible object is {@link Style }
   * 
   */
  public Style getStyle() {
    return style;
  }

  /**
   * Sets the value of the style property.
   * 
   * @param value allowed object is {@link Style }
   * 
   */
  public void setStyle(Style value) {
    this.style = value;
  }

  /**
   * Gets the value of the samehead property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getSamehead() {
    return samehead;
  }

  /**
   * Sets the value of the samehead property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setSamehead(String value) {
    this.samehead = value;
  }

  /**
   * Gets the value of the sametail property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getSametail() {
    return sametail;
  }

  /**
   * Sets the value of the sametail property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setSametail(String value) {
    this.sametail = value;
  }

  /**
   * Gets the value of the taillabel property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTaillabel() {
    return taillabel;
  }

  /**
   * Sets the value of the taillabel property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTaillabel(String value) {
    this.taillabel = value;
  }

  /**
   * Gets the value of the tailport property.
   * 
   * @return possible object is {@link NodePort }
   * 
   */
  public NodePort getTailport() {
    return tailport;
  }

  /**
   * Sets the value of the tailport property.
   * 
   * @param value allowed object is {@link NodePort }
   * 
   */
  public void setTailport(NodePort value) {
    this.tailport = value;
  }

  /**
   * Gets the value of the to property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTo() {
    return to;
  }

  /**
   * Sets the value of the to property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTo(String value) {
    this.to = value;
  }

  /**
   * Gets the value of the fontname property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFontname() {
    return fontname;
  }

  /**
   * Sets the value of the fontname property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFontname(String value) {
    this.fontname = value;
  }

  /**
   * Gets the value of the fontsize property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getFontsize() {
    return fontsize;
  }

  /**
   * Sets the value of the fontsize property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  public void setFontsize(BigDecimal value) {
    this.fontsize = value;
  }

  /**
   * Gets the value of the fontcolor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFontcolor() {
    return fontcolor;
  }

  /**
   * Sets the value of the fontcolor property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFontcolor(String value) {
    this.fontcolor = value;
  }

  public Edge withArrowhead(ArrowType value) {
    setArrowhead(value);
    return this;
  }

  public Edge withArrowsize(BigDecimal value) {
    setArrowsize(value);
    return this;
  }

  public Edge withArrowtail(ArrowType value) {
    setArrowtail(value);
    return this;
  }

  public Edge withColor(String value) {
    setColor(value);
    return this;
  }

  public Edge withConstraint(Boolean value) {
    setConstraint(value);
    return this;
  }

  public Edge withDecorate(Boolean value) {
    setDecorate(value);
    return this;
  }

  public Edge withDir(Dir value) {
    setDir(value);
    return this;
  }

  public Edge withFrom(String value) {
    setFrom(value);
    return this;
  }

  public Edge withHeadlabel(String value) {
    setHeadlabel(value);
    return this;
  }

  public Edge withHeadport(NodePort value) {
    setHeadport(value);
    return this;
  }

  public Edge withLabel(String value) {
    setLabel(value);
    return this;
  }

  public Edge withLabeldistance(BigDecimal value) {
    setLabeldistance(value);
    return this;
  }

  public Edge withLabelfloat(Boolean value) {
    setLabelfloat(value);
    return this;
  }

  public Edge withLabelfontcolor(String value) {
    setLabelfontcolor(value);
    return this;
  }

  public Edge withLabelfontname(String value) {
    setLabelfontname(value);
    return this;
  }

  public Edge withLabelfontsize(BigDecimal value) {
    setLabelfontsize(value);
    return this;
  }

  public Edge withLhead(String value) {
    setLhead(value);
    return this;
  }

  public Edge withLtail(String value) {
    setLtail(value);
    return this;
  }

  public Edge withMinlen(BigInteger value) {
    setMinlen(value);
    return this;
  }

  public Edge withStyle(Style value) {
    setStyle(value);
    return this;
  }

  public Edge withSamehead(String value) {
    setSamehead(value);
    return this;
  }

  public Edge withSametail(String value) {
    setSametail(value);
    return this;
  }

  public Edge withTaillabel(String value) {
    setTaillabel(value);
    return this;
  }

  public Edge withTailport(NodePort value) {
    setTailport(value);
    return this;
  }

  public Edge withTo(String value) {
    setTo(value);
    return this;
  }

  public Edge withFontname(String value) {
    setFontname(value);
    return this;
  }

  public Edge withFontsize(BigDecimal value) {
    setFontsize(value);
    return this;
  }

  public Edge withFontcolor(String value) {
    setFontcolor(value);
    return this;
  }

}
