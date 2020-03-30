package org.treblereel.gwt.jackson.tests.ser;

import javax.xml.stream.XMLStreamException;

import org.junit.Test;
import org.treblereel.gwt.jackson.tests.beans.CharacterBean;
import org.treblereel.gwt.jackson.tests.beans.CharacterBean_MapperImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 3/26/20
 */
public class CharacterXMLSerializerTest {

    CharacterBean_MapperImpl mapper = CharacterBean_MapperImpl.INSTANCE;

    @Test
    public void testDeserializeValue() throws XMLStreamException {
        CharacterBean test = new CharacterBean();
        test.setCharVal('c');
        assertEquals("<?xml version='1.0' encoding='UTF-8'?><CharacterBean><charVal>c</charVal></CharacterBean>", mapper.write(test));
        assertEquals(test, mapper.read(mapper.write(test)));
    }
}