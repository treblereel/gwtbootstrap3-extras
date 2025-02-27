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

import java.util.Collection;

import elemental2.core.JsArray;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayString;

/**
 * @author Florian Kremser <florian.kremser@sage.com>
 */
public class SuggestionCallback<T> {
    private final JavaScriptObject jsCallback;

    public SuggestionCallback(final JavaScriptObject jsCallback) {
        this.jsCallback = jsCallback;
    }

    public void execute(final Collection<Suggestion<T>> suggestions) {
        JsArray<Suggestion<T>> jsArray = JsArrayString.createArray().cast();
        if (suggestions != null) {
            for (Suggestion<T> s : suggestions) {
                jsArray.push(s);
            }
        }
        invokeCallback(jsCallback, jsArray);
    }

    private native void invokeCallback(JavaScriptObject callback, JsArray<Suggestion<T>> matches) /*-{
        callback(matches);
    }-*/;
}
