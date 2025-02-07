//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}REAL-ARRAY"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="additive"/&gt;
 *             &lt;enumeration value="multiplicative"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="period" use="required" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="phase" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="delta" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"realarray"})
@XmlRootElement(name = "Seasonality_ExpoSmooth")
public class SeasonalityExpoSmooth {

  @XmlElement(name = "REAL-ARRAY", required = true)
  protected REALARRAY realarray;

  @XmlAttribute(name = "type", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String type;

  @XmlAttribute(name = "period", required = true)
  protected BigInteger period;

  @XmlAttribute(name = "unit")
  protected String unit;

  @XmlAttribute(name = "phase")
  protected BigInteger phase;

  @XmlAttribute(name = "delta")
  protected Double delta;

  /**
   * Gets the value of the realarray property.
   *
   * @return possible object is {@link REALARRAY }
   */
  public REALARRAY getREALARRAY() {
    return realarray;
  }

  /**
   * Sets the value of the realarray property.
   *
   * @param value allowed object is {@link REALARRAY }
   */
  public void setREALARRAY(REALARRAY value) {
    this.realarray = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is {@link String }
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is {@link String }
   */
  public void setType(String value) {
    this.type = value;
  }

  /**
   * Gets the value of the period property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getPeriod() {
    return period;
  }

  /**
   * Sets the value of the period property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setPeriod(BigInteger value) {
    this.period = value;
  }

  /**
   * Gets the value of the unit property.
   *
   * @return possible object is {@link String }
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the value of the unit property.
   *
   * @param value allowed object is {@link String }
   */
  public void setUnit(String value) {
    this.unit = value;
  }

  /**
   * Gets the value of the phase property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getPhase() {
    return phase;
  }

  /**
   * Sets the value of the phase property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setPhase(BigInteger value) {
    this.phase = value;
  }

  /**
   * Gets the value of the delta property.
   *
   * @return possible object is {@link Double }
   */
  public Double getDelta() {
    return delta;
  }

  /**
   * Sets the value of the delta property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setDelta(Double value) {
    this.delta = value;
  }
}
