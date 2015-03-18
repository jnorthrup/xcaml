//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package com.microsoft.schemas.visio._2003.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for FaceNames_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaceNames_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaceName" type="{http://schemas.microsoft.com/visio/2003/core}FaceName_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceNames_Type", propOrder = {"faceName"})
public class FaceNamesType {

  @XmlElement(name = "FaceName")
  protected List<FaceNameType> faceName;

  /**
   * Gets the value of the faceName property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the faceName property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getFaceName().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link FaceNameType }
   * 
   * 
   */
  public List<FaceNameType> getFaceName() {
    if (faceName == null) {
      faceName = new ArrayList<FaceNameType>();
    }
    return this.faceName;
  }

  public FaceNamesType withFaceName(FaceNameType... values) {
    if (values != null) {
      for (FaceNameType value : values) {
        getFaceName().add(value);
      }
    }
    return this;
  }

  public FaceNamesType withFaceName(Collection<FaceNameType> values) {
    if (values != null) {
      getFaceName().addAll(values);
    }
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