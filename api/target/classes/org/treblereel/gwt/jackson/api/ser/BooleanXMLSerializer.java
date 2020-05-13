/*
 * Copyright 2013 Nicolas Morel
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

package org.treblereel.gwt.jackson.api.ser;

import javax.xml.stream.XMLStreamException;

import org.treblereel.gwt.jackson.api.XMLSerializationContext;
import org.treblereel.gwt.jackson.api.XMLSerializer;
import org.treblereel.gwt.jackson.api.XMLSerializerParameters;
import org.treblereel.gwt.jackson.api.stream.XMLWriter;

/**
 * Default {@link XMLSerializer} implementation for {@link Boolean}.
 * @author Nicolas Morel
 * @version $Id: $
 */
public class BooleanXMLSerializer extends XMLSerializer<Boolean> {

    private static final BooleanXMLSerializer INSTANCE = new BooleanXMLSerializer();

    private BooleanXMLSerializer() {
    }

    /**
     * <p>getInstance</p>
     * @return an instance of {@link XMLSerializer}
     */
    public static BooleanXMLSerializer getInstance() {
        return INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSerialize(XMLWriter writer, Boolean value, XMLSerializationContext ctx, XMLSerializerParameters params) throws XMLStreamException {
        if (isAttribute) {
            writer.writeAttribute(propertyName, value.toString());
            isAttribute = false;
        } else {
            writer.value(value);
        }
    }
}
