//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

import java.math.BigInteger;
import java.util.List;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}NUM-ARRAY" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MatCell" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="kind" default="any"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="diagonal"/&gt;
 *             &lt;enumeration value="symmetric"/&gt;
 *             &lt;enumeration value="any"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="nbRows" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="nbCols" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="diagDefault" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="offDiagDefault" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface Matrix {

  /**
   * Gets the value of the matrix property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the matrix property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getMatrix().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link NUMARRAY } {@link MatCell }
   */
  List<IMatrix> getMatrix();

  /**
   * Gets the value of the kind property.
   *
   * @return possible object is {@link String }
   */
  String getKind();

  /**
   * Sets the value of the kind property.
   *
   * @param value allowed object is {@link String }
   */
  void setKind(String value);

  /**
   * Gets the value of the nbRows property.
   *
   * @return possible object is {@link BigInteger }
   */
  BigInteger getNbRows();

  /**
   * Sets the value of the nbRows property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  void setNbRows(BigInteger value);

  /**
   * Gets the value of the nbCols property.
   *
   * @return possible object is {@link BigInteger }
   */
  BigInteger getNbCols();

  /**
   * Sets the value of the nbCols property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  void setNbCols(BigInteger value);

  /**
   * Gets the value of the diagDefault property.
   *
   * @return possible object is {@link Double }
   */
  Double getDiagDefault();

  /**
   * Sets the value of the diagDefault property.
   *
   * @param value allowed object is {@link Double }
   */
  void setDiagDefault(Double value);

  /**
   * Gets the value of the offDiagDefault property.
   *
   * @return possible object is {@link Double }
   */
  Double getOffDiagDefault();

  /**
   * Sets the value of the offDiagDefault property.
   *
   * @param value allowed object is {@link Double }
   */
  void setOffDiagDefault(Double value);
}
