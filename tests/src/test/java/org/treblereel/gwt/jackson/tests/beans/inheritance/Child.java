package org.treblereel.gwt.jackson.tests.beans.inheritance;

import javax.xml.bind.annotation.JacksonXmlProperty;

import com.google.common.base.Objects;
import org.treblereel.gwt.jackson.api.annotation.XMLMapper;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 4/8/20
 */
@XMLMapper
public class Child extends Parent {

    //Check override
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private String type;

    @Override
    public int hashCode() {
        return Objects.hashCode(getName(), getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Child child = (Child) o;
        return Objects.equal(getName(), child.getName()) &&
                Objects.equal(getId(), child.getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
