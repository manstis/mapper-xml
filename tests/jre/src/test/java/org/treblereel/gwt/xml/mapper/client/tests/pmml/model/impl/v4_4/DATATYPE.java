//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for DATATYPE.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="DATATYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="dateTime"/&gt;
 *     &lt;enumeration value="dateDaysSince[0]"/&gt;
 *     &lt;enumeration value="dateDaysSince[1960]"/&gt;
 *     &lt;enumeration value="dateDaysSince[1970]"/&gt;
 *     &lt;enumeration value="dateDaysSince[1980]"/&gt;
 *     &lt;enumeration value="timeSeconds"/&gt;
 *     &lt;enumeration value="dateTimeSecondsSince[0]"/&gt;
 *     &lt;enumeration value="dateTimeSecondsSince[1960]"/&gt;
 *     &lt;enumeration value="dateTimeSecondsSince[1970]"/&gt;
 *     &lt;enumeration value="dateTimeSecondsSince[1980]"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DATATYPE")
@XmlEnum
public enum DATATYPE {
  @XmlEnumValue("string")
  STRING("string"),
  @XmlEnumValue("integer")
  INTEGER("integer"),
  @XmlEnumValue("float")
  FLOAT("float"),
  @XmlEnumValue("double")
  DOUBLE("double"),
  @XmlEnumValue("boolean")
  BOOLEAN("boolean"),
  @XmlEnumValue("date")
  DATE("date"),
  @XmlEnumValue("time")
  TIME("time"),
  @XmlEnumValue("dateTime")
  DATE_TIME("dateTime"),
  @XmlEnumValue("dateDaysSince[0]")
  DATE_DAYS_SINCE_0("dateDaysSince[0]"),
  @XmlEnumValue("dateDaysSince[1960]")
  DATE_DAYS_SINCE_1960("dateDaysSince[1960]"),
  @XmlEnumValue("dateDaysSince[1970]")
  DATE_DAYS_SINCE_1970("dateDaysSince[1970]"),
  @XmlEnumValue("dateDaysSince[1980]")
  DATE_DAYS_SINCE_1980("dateDaysSince[1980]"),
  @XmlEnumValue("timeSeconds")
  TIME_SECONDS("timeSeconds"),
  @XmlEnumValue("dateTimeSecondsSince[0]")
  DATE_TIME_SECONDS_SINCE_0("dateTimeSecondsSince[0]"),
  @XmlEnumValue("dateTimeSecondsSince[1960]")
  DATE_TIME_SECONDS_SINCE_1960("dateTimeSecondsSince[1960]"),
  @XmlEnumValue("dateTimeSecondsSince[1970]")
  DATE_TIME_SECONDS_SINCE_1970("dateTimeSecondsSince[1970]"),
  @XmlEnumValue("dateTimeSecondsSince[1980]")
  DATE_TIME_SECONDS_SINCE_1980("dateTimeSecondsSince[1980]");
  private final String value;

  DATATYPE(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static DATATYPE fromValue(String v) {
    for (DATATYPE c : DATATYPE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
