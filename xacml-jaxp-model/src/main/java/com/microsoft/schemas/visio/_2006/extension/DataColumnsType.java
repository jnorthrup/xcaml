//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.visio._2006.extension;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for DataColumns_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataColumns_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataColumn" type="{http://schemas.microsoft.com/visio/2006/extension}DataColumn_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SortColumn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SortAsc" type="{http://schemas.microsoft.com/visio/2006/extension}ISOBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataColumns_Type", propOrder = {"dataColumn"})
public class DataColumnsType {

  @XmlElement(name = "DataColumn", required = true)
  protected List<DataColumnType> dataColumn;
  @XmlAttribute(name = "SortColumn")
  protected String sortColumn;
  @XmlAttribute(name = "SortAsc")
  protected BigInteger sortAsc;

  /**
   * Gets the value of the dataColumn property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the dataColumn property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getDataColumn().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link DataColumnType }
   * 
   * 
   */
  public List<DataColumnType> getDataColumn() {
    if (dataColumn == null) {
      dataColumn = new ArrayList<DataColumnType>();
    }
    return this.dataColumn;
  }

  /**
   * Gets the value of the sortColumn property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getSortColumn() {
    return sortColumn;
  }

  /**
   * Sets the value of the sortColumn property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setSortColumn(String value) {
    this.sortColumn = value;
  }

  /**
   * Gets the value of the sortAsc property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getSortAsc() {
    return sortAsc;
  }

  /**
   * Sets the value of the sortAsc property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setSortAsc(BigInteger value) {
    this.sortAsc = value;
  }

  public DataColumnsType withDataColumn(DataColumnType... values) {
    if (values != null) {
      for (DataColumnType value : values) {
        getDataColumn().add(value);
      }
    }
    return this;
  }

  public DataColumnsType withDataColumn(Collection<DataColumnType> values) {
    if (values != null) {
      getDataColumn().addAll(values);
    }
    return this;
  }

  public DataColumnsType withSortColumn(String value) {
    setSortColumn(value);
    return this;
  }

  public DataColumnsType withSortAsc(BigInteger value) {
    setSortAsc(value);
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