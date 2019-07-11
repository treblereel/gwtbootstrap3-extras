package org.gwtbootstrap3.extras.tagsinput.client.ui;

import java.util.Arrays;

import org.gwtbootstrap3.client.ui.base.mixin.AttributeMixin;
import org.gwtbootstrap3.extras.tagsinput.client.ui.base.SingleValueTagsInput;
import org.gwtbootstrap3.extras.typeahead.client.base.StringDataset;
import org.gwtproject.dom.client.Element;

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

/**
 * Wrapper for Bootstrap Tags Input component.
 *
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
public class TagsInput extends SingleValueTagsInput<String> {
    
    public TagsInput() {
    }

    public TagsInput(StringDataset dataset) {
        super(dataset);
    }

    public TagsInput(Element e) {
        super(e);
    }

    public TagsInput(Element e, StringDataset dataset) {
        super(e, dataset);
    }

    private final AttributeMixin<TagsInput> attributeMixin = new AttributeMixin<TagsInput>(this);
    
    @Override
    public void add(String tag) {
        if (isAttached())
            super.add(tag);
        else {
            String currentValue = attributeMixin.getAttribute("value");
            attributeMixin.setAttribute("value", (currentValue.isEmpty() ? "" : currentValue+",") + tag);
        }
    }
    
    @Override
    public String getValue() {
        if (isAttached())
            return super.getValue();
        else
            return attributeMixin.getAttribute("value");
    }

    public void setValue(String value) {
        removeAll();
        add(Arrays.asList(value.split(",")));
    }
}
