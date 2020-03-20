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

package org.treblereel.gwt.jackson.api.deser.collection;

import org.treblereel.gwt.jackson.api.XMLDeserializer;
import org.treblereel.gwt.jackson.api.deser.EnumXMLDeserializer;

import java.util.EnumSet;

/**
 * Default {@link XMLDeserializer} implementation for {@link java.util.EnumSet}.
 *
 * @param <E> Type of the enumeration inside the {@link java.util.EnumSet}
 * @author Nicolas Morel
 * @version $Id: $
 */
public class EnumSetXMLDeserializer<E extends Enum<E>> extends BaseSetXMLDeserializer<EnumSet<E>, E> {

    /**
     * <p>newInstance</p>
     *
     * @param deserializer {@link EnumXMLDeserializer} used to deserialize the enums inside the {@link java.util.EnumSet}.
     * @return a new instance of {@link EnumSetXMLDeserializer}
     */
    public static <E extends Enum<E>> EnumSetXMLDeserializer<E> newInstance(EnumXMLDeserializer<E> deserializer) {
        return new EnumSetXMLDeserializer<E>(deserializer);
    }

    private final Class<E> enumClass;

    /**
     * @param deserializer {@link EnumXMLDeserializer} used to deserialize the enums inside the {@link EnumSet}.
     */
    private EnumSetXMLDeserializer(EnumXMLDeserializer<E> deserializer) {
        super(deserializer);
        this.enumClass = deserializer.getEnumClass();
    }

    /** {@inheritDoc} */
    @Override
    protected EnumSet<E> newCollection() {
        return EnumSet.noneOf(enumClass);
    }

    /** {@inheritDoc} */
    @Override
    protected boolean isNullValueAllowed() {
        return false;
    }
}
