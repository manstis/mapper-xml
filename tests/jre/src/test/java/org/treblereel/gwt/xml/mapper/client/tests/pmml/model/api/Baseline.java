//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

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
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}CONTINUOUS-DISTRIBUTION-TYPES"/&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}DISCRETE-DISTRIBUTION-TYPES"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface Baseline {

  /**
   * Gets the value of the distribution property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the distribution property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getDistribution().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link AnyDistribution } {@link
   * GaussianDistribution } {@link PoissonDistribution } {@link UniformDistribution } {@link
   * CountTable } {@link NormalizedCountTable } {@link FieldRef }
   */
  List<IDistribution> getDistribution();
}
