//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package de.martin_loetzsch.dotml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * A group of nodes with rank constraints
 * 
 * <p>
 * Java class for sub-graph complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sub-graph">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;element name="node" type="{http://www.martin-loetzsch.de/DOTML}node"/>
 *           &lt;element name="record" type="{http://www.martin-loetzsch.de/DOTML}record-node"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="rank" use="required" type="{http://www.martin-loetzsch.de/DOTML}rank" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sub-graph", propOrder = {"nodeOrRecord"})
public class SubGraph {

  @XmlElements({
      @XmlElement(name = "node", type = Node.class),
      @XmlElement(name = "record", type = RecordNode.class)})
  protected List<Object> nodeOrRecord;
  @XmlAttribute(name = "rank", required = true)
  protected Rank rank;

  /**
   * Gets the value of the nodeOrRecord property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the nodeOrRecord property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getNodeOrRecord().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Node } {@link RecordNode }
   * 
   * 
   */
  public List<Object> getNodeOrRecord() {
    if (nodeOrRecord == null) {
      nodeOrRecord = new ArrayList<Object>();
    }
    return this.nodeOrRecord;
  }

  /**
   * Gets the value of the rank property.
   * 
   * @return possible object is {@link Rank }
   * 
   */
  public Rank getRank() {
    return rank;
  }

  /**
   * Sets the value of the rank property.
   * 
   * @param value allowed object is {@link Rank }
   * 
   */
  public void setRank(Rank value) {
    this.rank = value;
  }

  public SubGraph withNodeOrRecord(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getNodeOrRecord().add(value);
      }
    }
    return this;
  }

  public SubGraph withNodeOrRecord(Collection<Object> values) {
    if (values != null) {
      getNodeOrRecord().addAll(values);
    }
    return this;
  }

  public SubGraph withRank(Rank value) {
    setRank(value);
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