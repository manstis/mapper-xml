//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalOmega"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalStateVector"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}HVector" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface KalmanState {

  /**
   * Gets the value of the finalOmega property.
   *
   * @return possible object is {@link FinalOmega }
   */
  FinalOmega getFinalOmega();

  /**
   * Sets the value of the finalOmega property.
   *
   * @param value allowed object is {@link FinalOmega }
   */
  void setFinalOmega(FinalOmega value);

  /**
   * Gets the value of the finalStateVector property.
   *
   * @return possible object is {@link FinalStateVector }
   */
  FinalStateVector getFinalStateVector();

  /**
   * Sets the value of the finalStateVector property.
   *
   * @param value allowed object is {@link FinalStateVector }
   */
  void setFinalStateVector(FinalStateVector value);

  /**
   * Gets the value of the hVector property.
   *
   * @return possible object is {@link HVector }
   */
  HVector getHVector();

  /**
   * Sets the value of the hVector property.
   *
   * @param value allowed object is {@link HVector }
   */
  void setHVector(HVector value);
}
