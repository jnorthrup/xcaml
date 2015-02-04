//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.office.visio._2010.extension;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for RowMap_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowMap_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RowID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="PageID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="ShapeID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowMap_Type")
public class RowMapType {

  @XmlAttribute(name = "RowID")
  @XmlSchemaType(name = "unsignedLong")
  protected BigInteger rowID;
  @XmlAttribute(name = "PageID")
  @XmlSchemaType(name = "unsignedLong")
  protected BigInteger pageID;
  @XmlAttribute(name = "ShapeID")
  @XmlSchemaType(name = "unsignedLong")
  protected BigInteger shapeID;

  /**
   * Gets the value of the rowID property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getRowID() {
    return rowID;
  }

  /**
   * Sets the value of the rowID property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setRowID(BigInteger value) {
    this.rowID = value;
  }

  /**
   * Gets the value of the pageID property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getPageID() {
    return pageID;
  }

  /**
   * Sets the value of the pageID property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setPageID(BigInteger value) {
    this.pageID = value;
  }

  /**
   * Gets the value of the shapeID property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getShapeID() {
    return shapeID;
  }

  /**
   * Sets the value of the shapeID property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setShapeID(BigInteger value) {
    this.shapeID = value;
  }

  public RowMapType withRowID(BigInteger value) {
    setRowID(value);
    return this;
  }

  public RowMapType withPageID(BigInteger value) {
    setPageID(value);
    return this;
  }

  public RowMapType withShapeID(BigInteger value) {
    setShapeID(value);
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
