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

package org.treblereel.gwt.jackson.api.deser;

import java.util.UUID;

import javax.xml.stream.XMLStreamException;

import org.treblereel.gwt.jackson.api.XMLDeserializationContext;
import org.treblereel.gwt.jackson.api.XMLDeserializer;
import org.treblereel.gwt.jackson.api.XMLDeserializerParameters;
import org.treblereel.gwt.jackson.api.exception.XMLDeserializationException;
import org.treblereel.gwt.jackson.api.stream.XMLReader;

/**
 * Default {@link XMLDeserializer} implementation for {@link java.util.UUID}.
 * @author Nicolas Morel
 * @version $Id: $Id
 */
public class UUIDXMLDeserializer extends XMLDeserializer<UUID> {

    private static final UUIDXMLDeserializer INSTANCE = new UUIDXMLDeserializer();

    private UUIDXMLDeserializer() {
    }

    /**
     * <p>getInstance.</p>
     * @return an instance of {@link UUIDXMLDeserializer}
     */
    public static UUIDXMLDeserializer getInstance() {
        return INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID doDeserialize(XMLReader reader, XMLDeserializationContext ctx, XMLDeserializerParameters params) throws XMLStreamException {
        String uuid = reader.nextString();
        if (uuid != null) {
            return UUID.fromString(uuid);
        }
        return null;
    }

    @Override
    public UUID deserialize(String uuid, XMLDeserializationContext ctx, XMLDeserializerParameters params) throws
            XMLDeserializationException {
        if (uuid != null) {
            return UUID.fromString(uuid);
        }
        return null;
    }
}
