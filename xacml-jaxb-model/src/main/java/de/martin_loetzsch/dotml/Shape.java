//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for shape.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="shape">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assembly"/>
 *     &lt;enumeration value="box"/>
 *     &lt;enumeration value="box3d"/>
 *     &lt;enumeration value="cds"/>
 *     &lt;enumeration value="circle"/>
 *     &lt;enumeration value="component"/>
 *     &lt;enumeration value="diamond"/>
 *     &lt;enumeration value="doublecircle"/>
 *     &lt;enumeration value="doubleoctagon"/>
 *     &lt;enumeration value="egg"/>
 *     &lt;enumeration value="ellipse"/>
 *     &lt;enumeration value="fivepoverhang"/>
 *     &lt;enumeration value="folder"/>
 *     &lt;enumeration value="hexagon"/>
 *     &lt;enumeration value="house"/>
 *     &lt;enumeration value="insulator"/>
 *     &lt;enumeration value="invhouse"/>
 *     &lt;enumeration value="invtrapezium"/>
 *     &lt;enumeration value="invtriangle"/>
 *     &lt;enumeration value="larrow"/>
 *     &lt;enumeration value="lpromoter"/>
 *     &lt;enumeration value="Mcircle"/>
 *     &lt;enumeration value="Mdiamond"/>
 *     &lt;enumeration value="Msquare"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="noverhang"/>
 *     &lt;enumeration value="octagon"/>
 *     &lt;enumeration value="oval"/>
 *     &lt;enumeration value="parallelogram"/>
 *     &lt;enumeration value="pentagon"/>
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="plaintext"/>
 *     &lt;enumeration value="point"/>
 *     &lt;enumeration value="polygon"/>
 *     &lt;enumeration value="primersite"/>
 *     &lt;enumeration value="promoter"/>
 *     &lt;enumeration value="proteasesite"/>
 *     &lt;enumeration value="proteinstab"/>
 *     &lt;enumeration value="rarrow"/>
 *     &lt;enumeration value="rect"/>
 *     &lt;enumeration value="rectangle"/>
 *     &lt;enumeration value="restrictionsite"/>
 *     &lt;enumeration value="ribosite"/>
 *     &lt;enumeration value="rnastab"/>
 *     &lt;enumeration value="rpromoter"/>
 *     &lt;enumeration value="septagon"/>
 *     &lt;enumeration value="signature"/>
 *     &lt;enumeration value="square"/>
 *     &lt;enumeration value="star"/>
 *     &lt;enumeration value="tab"/>
 *     &lt;enumeration value="terminator"/>
 *     &lt;enumeration value="threepoverhang"/>
 *     &lt;enumeration value="trapezium"/>
 *     &lt;enumeration value="triangle"/>
 *     &lt;enumeration value="tripleoctagon"/>
 *     &lt;enumeration value="underline"/>
 *     &lt;enumeration value="utr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "shape")
@XmlEnum
public enum Shape {

  @XmlEnumValue("assembly")
  ASSEMBLY("assembly"), @XmlEnumValue("box")
  BOX("box"), @XmlEnumValue("box3d")
  BOX_3_D("box3d"), @XmlEnumValue("cds")
  CDS("cds"), @XmlEnumValue("circle")
  CIRCLE("circle"), @XmlEnumValue("component")
  COMPONENT("component"), @XmlEnumValue("diamond")
  DIAMOND("diamond"), @XmlEnumValue("doublecircle")
  DOUBLECIRCLE("doublecircle"), @XmlEnumValue("doubleoctagon")
  DOUBLEOCTAGON("doubleoctagon"), @XmlEnumValue("egg")
  EGG("egg"), @XmlEnumValue("ellipse")
  ELLIPSE("ellipse"), @XmlEnumValue("fivepoverhang")
  FIVEPOVERHANG("fivepoverhang"), @XmlEnumValue("folder")
  FOLDER("folder"), @XmlEnumValue("hexagon")
  HEXAGON("hexagon"), @XmlEnumValue("house")
  HOUSE("house"), @XmlEnumValue("insulator")
  INSULATOR("insulator"), @XmlEnumValue("invhouse")
  INVHOUSE("invhouse"), @XmlEnumValue("invtrapezium")
  INVTRAPEZIUM("invtrapezium"), @XmlEnumValue("invtriangle")
  INVTRIANGLE("invtriangle"), @XmlEnumValue("larrow")
  LARROW("larrow"), @XmlEnumValue("lpromoter")
  LPROMOTER("lpromoter"), @XmlEnumValue("Mcircle")
  MCIRCLE("Mcircle"), @XmlEnumValue("Mdiamond")
  MDIAMOND("Mdiamond"), @XmlEnumValue("Msquare")
  MSQUARE("Msquare"), @XmlEnumValue("none")
  NONE("none"), @XmlEnumValue("note")
  NOTE("note"), @XmlEnumValue("noverhang")
  NOVERHANG("noverhang"), @XmlEnumValue("octagon")
  OCTAGON("octagon"), @XmlEnumValue("oval")
  OVAL("oval"), @XmlEnumValue("parallelogram")
  PARALLELOGRAM("parallelogram"), @XmlEnumValue("pentagon")
  PENTAGON("pentagon"), @XmlEnumValue("plain")
  PLAIN("plain"), @XmlEnumValue("plaintext")
  PLAINTEXT("plaintext"), @XmlEnumValue("point")
  POINT("point"), @XmlEnumValue("polygon")
  POLYGON("polygon"), @XmlEnumValue("primersite")
  PRIMERSITE("primersite"), @XmlEnumValue("promoter")
  PROMOTER("promoter"), @XmlEnumValue("proteasesite")
  PROTEASESITE("proteasesite"), @XmlEnumValue("proteinstab")
  PROTEINSTAB("proteinstab"), @XmlEnumValue("rarrow")
  RARROW("rarrow"), @XmlEnumValue("rect")
  RECT("rect"), @XmlEnumValue("rectangle")
  RECTANGLE("rectangle"), @XmlEnumValue("restrictionsite")
  RESTRICTIONSITE("restrictionsite"), @XmlEnumValue("ribosite")
  RIBOSITE("ribosite"), @XmlEnumValue("rnastab")
  RNASTAB("rnastab"), @XmlEnumValue("rpromoter")
  RPROMOTER("rpromoter"), @XmlEnumValue("septagon")
  SEPTAGON("septagon"), @XmlEnumValue("signature")
  SIGNATURE("signature"), @XmlEnumValue("square")
  SQUARE("square"), @XmlEnumValue("star")
  STAR("star"), @XmlEnumValue("tab")
  TAB("tab"), @XmlEnumValue("terminator")
  TERMINATOR("terminator"), @XmlEnumValue("threepoverhang")
  THREEPOVERHANG("threepoverhang"), @XmlEnumValue("trapezium")
  TRAPEZIUM("trapezium"), @XmlEnumValue("triangle")
  TRIANGLE("triangle"), @XmlEnumValue("tripleoctagon")
  TRIPLEOCTAGON("tripleoctagon"), @XmlEnumValue("underline")
  UNDERLINE("underline"), @XmlEnumValue("utr")
  UTR("utr");
  private final String value;

  Shape(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static Shape fromValue(String v) {
    for (Shape c : Shape.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}