package org.treblereel.gwt.jackson.tests.primitive;

import java.util.Objects;

import javax.xml.stream.XMLStreamException;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;
import org.treblereel.gwt.jackson.api.annotation.XMLMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 4/22/20
 */
@J2clTestInput(BooleanTest.class)
public class BooleanTest {

    private static final String XML_TRUE = "<?xml version='1.0' encoding='UTF-8'?><BooleanBean><check>true</check></BooleanBean>";
    private static final String XML_FALSE = "<?xml version='1.0' encoding='UTF-8'?><BooleanBean><check>false</check></BooleanBean>";

    private BooleanTest_BooleanBean_MapperImpl mapper = BooleanTest_BooleanBean_MapperImpl.INSTANCE;

    @Test
    public void testSerializeValue() throws XMLStreamException {
        BooleanBean test = new BooleanBean();
        assertEquals(XML_FALSE, mapper.write(test));
        test.setCheck(true);
        assertEquals(XML_TRUE, mapper.write(test));
        assertEquals(test, mapper.read(mapper.write(test)));
        test.setCheck(false);
        assertEquals(XML_FALSE, mapper.write(test));
        assertEquals(test, mapper.read(mapper.write(test)));
    }

    @Test
    public void testDeserializeValue() throws XMLStreamException {
        assertTrue(mapper.read(XML_TRUE).isCheck());
        assertFalse(mapper.read(XML_FALSE).isCheck());
    }

    @XMLMapper
    public static class BooleanBean {

        private boolean check;

        @Override
        public int hashCode() {
            return Objects.hash(isCheck());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof BooleanBean)) {
                return false;
            }
            BooleanBean that = (BooleanBean) o;
            return isCheck() == that.isCheck();
        }

        public boolean isCheck() {
            return check;
        }

        public void setCheck(boolean check) {
            this.check = check;
        }
    }
}