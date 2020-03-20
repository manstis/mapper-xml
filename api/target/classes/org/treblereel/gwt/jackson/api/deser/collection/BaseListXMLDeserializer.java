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

import java.util.List;

/**
 * Base {@link XMLDeserializer} implementation for {@link java.util.List}.
 *
 * @param <L> {@link java.util.List} type
 * @param <T> Type of the elements inside the {@link java.util.List}
 * @author Nicolas Morel
 * @version $Id: $
 */
public abstract class BaseListXMLDeserializer<L extends List<T>, T> extends BaseCollectionXMLDeserializer<L, T> {

    /**
     * <p>Constructor for BaseListXMLDeserializer.</p>
     *
     * @param deserializer {@link XMLDeserializer} used to map the objects inside the {@link java.util.List}.
     */
    public BaseListXMLDeserializer(XMLDeserializer<T> deserializer) {
        super(deserializer);
    }
}
