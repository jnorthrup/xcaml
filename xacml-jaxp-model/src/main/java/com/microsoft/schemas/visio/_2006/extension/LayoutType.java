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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for Layout_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Layout_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2006/extension}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ShapePermeableX" type="{http://schemas.microsoft.com/visio/2006/extension}ShapePermeableX_Type" minOccurs="0"/>
 *         &lt;element name="ShapePermeableY" type="{http://schemas.microsoft.com/visio/2006/extension}ShapePermeableY_Type" minOccurs="0"/>
 *         &lt;element name="ShapePermeablePlace" type="{http://schemas.microsoft.com/visio/2006/extension}ShapePermeablePlace_Type" minOccurs="0"/>
 *         &lt;element name="ShapeFixedCode" type="{http://schemas.microsoft.com/visio/2006/extension}ShapeFixedCode_Type" minOccurs="0"/>
 *         &lt;element name="ShapePlowCode" type="{http://schemas.microsoft.com/visio/2006/extension}ShapePlowCode_Type" minOccurs="0"/>
 *         &lt;element name="ShapeRouteStyle" type="{http://schemas.microsoft.com/visio/2006/extension}ShapeRouteStyle_Type" minOccurs="0"/>
 *         &lt;element name="ShapePlaceStyle" type="{http://schemas.microsoft.com/visio/2006/extension}ShapePlaceStyle_Type" minOccurs="0"/>
 *         &lt;element name="ConFixedCode" type="{http://schemas.microsoft.com/visio/2006/extension}ConFixedCode_Type" minOccurs="0"/>
 *         &lt;element name="ConLineJumpCode" type="{http://schemas.microsoft.com/visio/2006/extension}ConLineJumpCode_Type" minOccurs="0"/>
 *         &lt;element name="ConLineJumpStyle" type="{http://schemas.microsoft.com/visio/2006/extension}ConLineJumpStyle_Type" minOccurs="0"/>
 *         &lt;element name="ConLineJumpDirX" type="{http://schemas.microsoft.com/visio/2006/extension}ConLineJumpDirX_Type" minOccurs="0"/>
 *         &lt;element name="ConLineJumpDirY" type="{http://schemas.microsoft.com/visio/2006/extension}ConLineJumpDirY_Type" minOccurs="0"/>
 *         &lt;element name="ShapePlaceFlip" type="{http://schemas.microsoft.com/visio/2006/extension}ShapePlaceFlip_Type" minOccurs="0"/>
 *         &lt;element name="ConLineRouteExt" type="{http://schemas.microsoft.com/visio/2006/extension}ConLineRouteExt_Type" minOccurs="0"/>
 *         &lt;element name="ShapeSplit" type="{http://schemas.microsoft.com/visio/2006/extension}ShapeSplit_Type" minOccurs="0"/>
 *         &lt;element name="ShapeSplittable" type="{http://schemas.microsoft.com/visio/2006/extension}ShapeSplittable_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layout_Type", propOrder = {"shapePermeableXOrShapePermeableYOrShapePermeablePlace"})
public class LayoutType extends RowType {

  @XmlElements({
      @XmlElement(name = "ShapePermeableX", type = ShapePermeableXType.class),
      @XmlElement(name = "ShapePermeableY", type = ShapePermeableYType.class),
      @XmlElement(name = "ShapePermeablePlace", type = ShapePermeablePlaceType.class),
      @XmlElement(name = "ShapeFixedCode", type = ShapeFixedCodeType.class),
      @XmlElement(name = "ShapePlowCode", type = ShapePlowCodeType.class),
      @XmlElement(name = "ShapeRouteStyle", type = ShapeRouteStyleType.class),
      @XmlElement(name = "ShapePlaceStyle", type = ShapePlaceStyleType.class),
      @XmlElement(name = "ConFixedCode", type = ConFixedCodeType.class),
      @XmlElement(name = "ConLineJumpCode", type = ConLineJumpCodeType.class),
      @XmlElement(name = "ConLineJumpStyle", type = ConLineJumpStyleType.class),
      @XmlElement(name = "ConLineJumpDirX", type = ConLineJumpDirXType.class),
      @XmlElement(name = "ConLineJumpDirY", type = ConLineJumpDirYType.class),
      @XmlElement(name = "ShapePlaceFlip", type = ShapePlaceFlipType.class),
      @XmlElement(name = "ConLineRouteExt", type = ConLineRouteExtType.class),
      @XmlElement(name = "ShapeSplit", type = ShapeSplitType.class),
      @XmlElement(name = "ShapeSplittable", type = ShapeSplittableType.class)})
  protected List<CellType> shapePermeableXOrShapePermeableYOrShapePermeablePlace;

  /**
   * Gets the value of the shapePermeableXOrShapePermeableYOrShapePermeablePlace property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the shapePermeableXOrShapePermeableYOrShapePermeablePlace property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getShapePermeableXOrShapePermeableYOrShapePermeablePlace().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ShapePermeableXType } {@link ShapePermeableYType }
   * {@link ShapePermeablePlaceType } {@link ShapeFixedCodeType } {@link ShapePlowCodeType } {@link ShapeRouteStyleType }
   * {@link ShapePlaceStyleType } {@link ConFixedCodeType } {@link ConLineJumpCodeType } {@link ConLineJumpStyleType }
   * {@link ConLineJumpDirXType } {@link ConLineJumpDirYType } {@link ShapePlaceFlipType } {@link ConLineRouteExtType }
   * {@link ShapeSplitType } {@link ShapeSplittableType }
   * 
   * 
   */
  public List<CellType> getShapePermeableXOrShapePermeableYOrShapePermeablePlace() {
    if (shapePermeableXOrShapePermeableYOrShapePermeablePlace == null) {
      shapePermeableXOrShapePermeableYOrShapePermeablePlace = new ArrayList<CellType>();
    }
    return this.shapePermeableXOrShapePermeableYOrShapePermeablePlace;
  }

  public LayoutType withShapePermeableXOrShapePermeableYOrShapePermeablePlace(CellType... values) {
    if (values != null) {
      for (CellType value : values) {
        getShapePermeableXOrShapePermeableYOrShapePermeablePlace().add(value);
      }
    }
    return this;
  }

  public LayoutType withShapePermeableXOrShapePermeableYOrShapePermeablePlace(
      Collection<CellType> values) {
    if (values != null) {
      getShapePermeableXOrShapePermeableYOrShapePermeablePlace().addAll(values);
    }
    return this;
  }

  @Override
  public LayoutType withDel(BigInteger value) {
    setDel(value);
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
