package org.gwtbootstrap3.extras.typeahead.client.base;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import jsinterop.annotations.JsConstructor;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * @author Florian Kremser <florian.kremser@sage.com>
 */
public final class Suggestion<T> extends JavaScriptObject {

    @JsConstructor
    protected Suggestion() {
    }

    public String getValue() {
        return (String) Js.asPropertyMap(this).get("value");
    }

    public T getData() {
        return (T) Js.asPropertyMap(this).get("data");
    }

    public Dataset<T> getDataset() {
        return (Dataset<T>) Js.asPropertyMap(this).get("data");
    }

    /**
     * Create a suggestion for a data instance.
     *
     * @param value the display value that represents the suggestion's data
     * @param data the suggestions data
     * @param dataset the source dataset
     * @param <T> the type of the data
     * @return a Suggestion object
     */
    public static <T> Suggestion<T> create(String value, T data, Dataset<T> dataset) {
        JsPropertyMap result = JsPropertyMap.of();
        result.set("value", value);
        result.set("data", data);
        result.set("dataset", dataset);
        return Js.uncheckedCast(result);
    }
}
