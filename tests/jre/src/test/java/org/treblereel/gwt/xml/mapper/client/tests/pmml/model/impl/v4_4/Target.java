//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TargetValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="field" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_4}OPTYPE" /&gt;
 *       &lt;attribute name="castInteger"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="round"/&gt;
 *             &lt;enumeration value="ceiling"/&gt;
 *             &lt;enumeration value="floor"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="rescaleConstant" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *       &lt;attribute name="rescaleFactor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension", "targetValue"})
@XmlRootElement(name = "Target")
public class Target implements org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Target {

  @XmlElement(name = "Extension", type = Extension.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> extension;

  @XmlElement(name = "TargetValue", type = TargetValue.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TargetValue> targetValue;

  @XmlAttribute(name = "field")
  protected String field;

  @XmlAttribute(name = "optype")
  protected org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.OPTYPE optype;

  @XmlAttribute(name = "castInteger")
  protected String castInteger;

  @XmlAttribute(name = "min")
  protected Double min;

  @XmlAttribute(name = "max")
  protected Double max;

  @XmlAttribute(name = "rescaleConstant")
  protected Double rescaleConstant;

  @XmlAttribute(name = "rescaleFactor")
  protected Double rescaleFactor;

  /**
   * Gets the value of the extension property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the extension property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getExtension().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Extension }
   */
  public List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> getExtension() {
    if (extension == null) {
      extension =
          new ArrayList<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the targetValue property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the targetValue property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getTargetValue().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link TargetValue }
   */
  public List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TargetValue>
      getTargetValue() {
    if (targetValue == null) {
      targetValue =
          new ArrayList<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TargetValue>();
    }
    return this.targetValue;
  }

  /**
   * Gets the value of the field property.
   *
   * @return possible object is {@link String }
   */
  public String getField() {
    return field;
  }

  /**
   * Sets the value of the field property.
   *
   * @param value allowed object is {@link String }
   */
  public void setField(String value) {
    this.field = value;
  }

  /**
   * Gets the value of the optype property.
   *
   * @return possible object is {@link OPTYPE }
   */
  public org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.OPTYPE getOptype() {
    return optype;
  }

  /**
   * Sets the value of the optype property.
   *
   * @param value allowed object is {@link OPTYPE }
   */
  public void setOptype(org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.OPTYPE value) {
    this.optype = value;
  }

  /**
   * Gets the value of the castInteger property.
   *
   * @return possible object is {@link String }
   */
  public String getCastInteger() {
    return castInteger;
  }

  /**
   * Sets the value of the castInteger property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCastInteger(String value) {
    this.castInteger = value;
  }

  /**
   * Gets the value of the min property.
   *
   * @return possible object is {@link Double }
   */
  public Double getMin() {
    return min;
  }

  /**
   * Sets the value of the min property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setMin(Double value) {
    this.min = value;
  }

  /**
   * Gets the value of the max property.
   *
   * @return possible object is {@link Double }
   */
  public Double getMax() {
    return max;
  }

  /**
   * Sets the value of the max property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setMax(Double value) {
    this.max = value;
  }

  /**
   * Gets the value of the rescaleConstant property.
   *
   * @return possible object is {@link Double }
   */
  public double getRescaleConstant() {
    if (rescaleConstant == null) {
      return 0.0D;
    } else {
      return rescaleConstant;
    }
  }

  /**
   * Sets the value of the rescaleConstant property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setRescaleConstant(Double value) {
    this.rescaleConstant = value;
  }

  /**
   * Gets the value of the rescaleFactor property.
   *
   * @return possible object is {@link Double }
   */
  public double getRescaleFactor() {
    if (rescaleFactor == null) {
      return 1.0D;
    } else {
      return rescaleFactor;
    }
  }

  /**
   * Sets the value of the rescaleFactor property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setRescaleFactor(Double value) {
    this.rescaleFactor = value;
  }
}
