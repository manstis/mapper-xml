//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.IExpression;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TextIndexNormalization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}EXPRESSION"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="textField" use="required" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="localTermWeights" default="termFrequency"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="termFrequency"/&gt;
 *             &lt;enumeration value="binary"/&gt;
 *             &lt;enumeration value="logarithmic"/&gt;
 *             &lt;enumeration value="augmentedNormalizedTermFrequency"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="maxLevenshteinDistance" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="countHits" default="allHits"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="allHits"/&gt;
 *             &lt;enumeration value="bestHits"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="wordSeparatorCharacterRE" type="{http://www.w3.org/2001/XMLSchema}string" default="\s+" /&gt;
 *       &lt;attribute name="tokenize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension", "textIndexNormalization", "expression"})
@XmlRootElement(name = "TextIndex")
public class TextIndex
    implements IExpression, org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TextIndex {

  @XmlElement(name = "Extension", type = Extension.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> extension;

  @XmlElement(name = "TextIndexNormalization", type = TextIndexNormalization.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TextIndexNormalization>
      textIndexNormalization;

  @XmlElementRefs({
    @XmlElementRef(
        name = "Constant",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = Constant.class,
        required = false),
    @XmlElementRef(
        name = "FieldRef",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = FieldRef.class,
        required = false),
    @XmlElementRef(
        name = "NormContinuous",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = NormContinuous.class,
        required = false),
    @XmlElementRef(
        name = "NormDiscrete",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = NormDiscrete.class,
        required = false),
    @XmlElementRef(
        name = "Discretize",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = Discretize.class,
        required = false),
    @XmlElementRef(
        name = "MapValues",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = MapValues.class,
        required = false),
    @XmlElementRef(
        name = "TextIndex",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = TextIndex.class,
        required = false),
    @XmlElementRef(
        name = "Apply",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = Apply.class,
        required = false),
    @XmlElementRef(
        name = "Aggregate",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = Aggregate.class,
        required = false),
    @XmlElementRef(
        name = "Lag",
        namespace = "http://www.dmg.org/PMML-4_4",
        type = Lag.class,
        required = false)
  })
  protected IExpression expression;

  @XmlAttribute(name = "textField", required = true)
  protected String textField;

  @XmlAttribute(name = "localTermWeights")
  protected String localTermWeights;

  @XmlAttribute(name = "isCaseSensitive")
  protected Boolean isCaseSensitive;

  @XmlAttribute(name = "maxLevenshteinDistance")
  protected BigInteger maxLevenshteinDistance;

  @XmlAttribute(name = "countHits")
  protected String countHits;

  @XmlAttribute(name = "wordSeparatorCharacterRE")
  protected String wordSeparatorCharacterRE;

  @XmlAttribute(name = "tokenize")
  protected Boolean tokenize;

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
   * Gets the value of the textIndexNormalization property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the textIndexNormalization property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getTextIndexNormalization().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link TextIndexNormalization }
   */
  public List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TextIndexNormalization>
      getTextIndexNormalization() {
    if (textIndexNormalization == null) {
      textIndexNormalization =
          new ArrayList<
              org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.TextIndexNormalization>();
    }
    return this.textIndexNormalization;
  }

  /**
   * Gets the value of the expression property.
   *
   * @return possible object is {@link Constant } {@link FieldRef } {@link NormContinuous } {@link
   *     NormDiscrete } {@link Discretize } {@link MapValues } {@link TextIndex } {@link Apply }
   *     {@link Aggregate } {@link Lag }
   */
  public IExpression getExpression() {
    return expression;
  }

  /**
   * Sets the value of the expression property.
   *
   * @param value allowed object is {@link Constant } {@link FieldRef } {@link NormContinuous }
   *     {@link NormDiscrete } {@link Discretize } {@link MapValues } {@link TextIndex } {@link
   *     Apply } {@link Aggregate } {@link Lag }
   */
  public void setExpression(IExpression value) {
    this.expression = value;
  }

  /**
   * Gets the value of the textField property.
   *
   * @return possible object is {@link String }
   */
  public String getTextField() {
    return textField;
  }

  /**
   * Sets the value of the textField property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTextField(String value) {
    this.textField = value;
  }

  /**
   * Gets the value of the localTermWeights property.
   *
   * @return possible object is {@link String }
   */
  public String getLocalTermWeights() {
    if (localTermWeights == null) {
      return "termFrequency";
    } else {
      return localTermWeights;
    }
  }

  /**
   * Sets the value of the localTermWeights property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLocalTermWeights(String value) {
    this.localTermWeights = value;
  }

  /**
   * Gets the value of the isCaseSensitive property.
   *
   * @return possible object is {@link Boolean }
   */
  public boolean isIsCaseSensitive() {
    if (isCaseSensitive == null) {
      return false;
    } else {
      return isCaseSensitive;
    }
  }

  /**
   * Sets the value of the isCaseSensitive property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsCaseSensitive(Boolean value) {
    this.isCaseSensitive = value;
  }

  /**
   * Gets the value of the maxLevenshteinDistance property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getMaxLevenshteinDistance() {
    if (maxLevenshteinDistance == null) {
      return new BigInteger("0");
    } else {
      return maxLevenshteinDistance;
    }
  }

  /**
   * Sets the value of the maxLevenshteinDistance property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setMaxLevenshteinDistance(BigInteger value) {
    this.maxLevenshteinDistance = value;
  }

  /**
   * Gets the value of the countHits property.
   *
   * @return possible object is {@link String }
   */
  public String getCountHits() {
    if (countHits == null) {
      return "allHits";
    } else {
      return countHits;
    }
  }

  /**
   * Sets the value of the countHits property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCountHits(String value) {
    this.countHits = value;
  }

  /**
   * Gets the value of the wordSeparatorCharacterRE property.
   *
   * @return possible object is {@link String }
   */
  public String getWordSeparatorCharacterRE() {
    if (wordSeparatorCharacterRE == null) {
      return "\\s+";
    } else {
      return wordSeparatorCharacterRE;
    }
  }

  /**
   * Sets the value of the wordSeparatorCharacterRE property.
   *
   * @param value allowed object is {@link String }
   */
  public void setWordSeparatorCharacterRE(String value) {
    this.wordSeparatorCharacterRE = value;
  }

  /**
   * Gets the value of the tokenize property.
   *
   * @return possible object is {@link Boolean }
   */
  public boolean isTokenize() {
    if (tokenize == null) {
      return true;
    } else {
      return tokenize;
    }
  }

  /**
   * Sets the value of the tokenize property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setTokenize(Boolean value) {
    this.tokenize = value;
  }
}
