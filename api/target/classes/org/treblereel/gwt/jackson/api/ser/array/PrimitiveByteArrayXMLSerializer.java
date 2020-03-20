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

package org.treblereel.gwt.jackson.api.ser.array;

import org.treblereel.gwt.jackson.api.XMLSerializationContext;
import org.treblereel.gwt.jackson.api.XMLSerializer;
import org.treblereel.gwt.jackson.api.XMLSerializerParameters;
import org.treblereel.gwt.jackson.api.stream.XMLWriter;
import org.treblereel.gwt.jackson.api.utils.Base64Utils;

/**
 * Default {@link XMLSerializer} implementation for array of byte.
 *
 * @author Nicolas Morel
 * @version $Id: $Id
 */
public class PrimitiveByteArrayXMLSerializer extends XMLSerializer<byte[]> {

    private static final PrimitiveByteArrayXMLSerializer INSTANCE = new PrimitiveByteArrayXMLSerializer();

    /**
     * <p>getInstance.</p>
     *
     * @return an instance of {@link PrimitiveByteArrayXMLSerializer}
     */
    public static PrimitiveByteArrayXMLSerializer getInstance() {
        return INSTANCE;
    }

    private PrimitiveByteArrayXMLSerializer() {
    }

    /** {@inheritDoc} */
    @Override
    protected boolean isEmpty(byte[] value) {
        return null == value || value.length == 0;
    }

    /** {@inheritDoc} */
    @Override
    public void doSerialize(XMLWriter writer, byte[] values, XMLSerializationContext ctx, XMLSerializerParameters params) {
        if (!ctx.isWriteEmptyXMLArrays() && values.length == 0) {
            writer.cancelName();
            return;
        }

        writer.unescapeValue(Base64Utils.toBase64(values));
    }
}
