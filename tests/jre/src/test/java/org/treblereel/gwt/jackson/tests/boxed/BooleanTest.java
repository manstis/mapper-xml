package org.treblereel.gwt.jackson.tests.boxed;

import javax.xml.stream.XMLStreamException;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;
import org.treblereel.gwt.jackson.tests.beans.BooleanBean_MapperImpl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//@J2clTestInput(BooleanTest.class)
public class BooleanTest {

    @Test
    public void testDeserializeValue() throws XMLStreamException {
        assertTrue(BooleanBean_MapperImpl.INSTANCE.read("<?xml version='1.0' encoding='UTF-8'?><BooleanBean><check>true</check></BooleanBean>").isCheck());
        assertFalse(BooleanBean_MapperImpl.INSTANCE.read("<?xml version='1.0' encoding='UTF-8'?><BooleanBean><check>false</check></BooleanBean>").isCheck());
    }
}