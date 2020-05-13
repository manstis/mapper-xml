/*
 * Copyright 2014 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.treblereel.gwt.jackson.api.ser.array.dd;

import javax.xml.stream.XMLStreamException;

import org.treblereel.gwt.jackson.api.XMLSerializationContext;
import org.treblereel.gwt.jackson.api.XMLSerializer;
import org.treblereel.gwt.jackson.api.XMLSerializerParameters;
import org.treblereel.gwt.jackson.api.ser.array.BasicArrayXMLSerializer;
import org.treblereel.gwt.jackson.api.ser.array.PrimitiveIntegerArrayXMLSerializer;
import org.treblereel.gwt.jackson.api.stream.XMLWriter;

/**
 * Default {@link XMLSerializer} implementation for 2D array of int.
 * @author Nicolas Morel
 * @version $Id: $
 */
public class PrimitiveIntegerArray2dXMLSerializer extends BasicArrayXMLSerializer<int[][]> {

    private static final PrimitiveIntegerArray2dXMLSerializer INSTANCE = new PrimitiveIntegerArray2dXMLSerializer();

    private PrimitiveIntegerArray2dXMLSerializer() {
    }

    /**
     * <p>getInstance</p>
     * @return an instance of {@link PrimitiveIntegerArray2dXMLSerializer}
     */
    public static BasicArrayXMLSerializer getInstance(String propertyName) {
        return INSTANCE.setPropertyName(propertyName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isEmpty(int[][] value) {
        return null == value || value.length == 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSerialize(XMLWriter writer, int[][] values, XMLSerializationContext ctx, XMLSerializerParameters params) throws XMLStreamException {
        if (!ctx.isWriteEmptyXMLArrays() && values.length == 0) {
            writer.nullValue();
            return;
        }

        BasicArrayXMLSerializer serializer = PrimitiveIntegerArrayXMLSerializer.getInstance(propertyName);

        writer.beginObject(propertyName);
        for (int[] value : values) {
            serializer.serialize(writer, value, ctx, params);
        }
        writer.endObject();
    }
}