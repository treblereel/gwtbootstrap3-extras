package org.gwtbootstrap3.extras.tagsinput.client.callback;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap3
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

import org.gwtproject.dom.client.Element;

/**
 * Callback method called when adding tag that already exists.
 * 
 * @author Marko Nikolić
 *
 * @param <T> type of item
 */

public interface OnTagExistsCallback<T> {
    
    /**
     * Called when adding tag that already exists.
     * 
     * @param item item that is adding
     * @param tag existing tag element
     */
    void onTagExists(T item, Element tag);
}
