//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="alpha" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="smoothedValue" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Level")
public class Level {

  @XmlAttribute(name = "alpha")
  protected Double alpha;

  @XmlAttribute(name = "smoothedValue")
  protected Double smoothedValue;

  /**
   * Gets the value of the alpha property.
   *
   * @return possible object is {@link Double }
   */
  public Double getAlpha() {
    return alpha;
  }

  /**
   * Sets the value of the alpha property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setAlpha(Double value) {
    this.alpha = value;
  }

  /**
   * Gets the value of the smoothedValue property.
   *
   * @return possible object is {@link Double }
   */
  public Double getSmoothedValue() {
    return smoothedValue;
  }

  /**
   * Sets the value of the smoothedValue property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setSmoothedValue(Double value) {
    this.smoothedValue = value;
  }
}
