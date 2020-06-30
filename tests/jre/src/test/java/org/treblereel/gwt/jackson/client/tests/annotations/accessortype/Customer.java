package org.treblereel.gwt.jackson.client.tests.annotations.accessortype;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlCData;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.treblereel.gwt.jackson.api.annotation.XMLMapper;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 6/30/20
 */

@XMLMapper
@XmlAccessorType(value = XmlAccessType.NONE)
@XmlType(propOrder={"id", "firstName", "lastName"})
public class Customer {
    @XmlCData
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlAttribute
    private int id;
    private String notInPropOrder;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                Objects.equals(getFirstName(), customer.getFirstName()) &&
                Objects.equals(getLastName(), customer.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getId());
    }

    public String getNotInPropOrder() {
        return notInPropOrder;
    }

    public void setNotInPropOrder(String notInPropOrder) {
        this.notInPropOrder = notInPropOrder;
    }
}
