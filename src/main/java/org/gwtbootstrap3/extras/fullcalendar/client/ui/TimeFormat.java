package org.gwtbootstrap3.extras.fullcalendar.client.ui;

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

import java.util.Map;

import org.gwtproject.core.client.JavaScriptObject;

/**
 * @author Jeff Isenhart
 * @http://arshaw.com/fullcalendar/docs/text/timeFormat/
 */
public class TimeFormat extends AbstractViewOptionFormat implements IsJavaScriptObject {
    private JavaScriptObject format;

    public TimeFormat() {
        this("h(:mm)t", null);
    }

    public TimeFormat(final String defaultValue, Map<ViewOptionHash, String> options) {
        newInstance(defaultValue);
        if (options == null) {
            options = getDefaultOptions();
        }
        for (final ViewOptionHash option : options.keySet()) {
            setFormat(option.name(), options.get(option));
        }
    }

    @Override
    /**
     * @see http://arshaw.com/fullcalendar/docs/text/timeFormat/
     */
    protected void populateDefaultOptions(final Map<ViewOptionHash, String> options) {
        options.put(ViewOptionHash.agenda, "h:mm{ - h:mm}");
    }

    private native void newInstance(String defaultValue) /*-{
        var theInstance = this;
        theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.TimeFormat::format = {};
        theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.TimeFormat::format.timeFormat = {
            // for all other views
            '': defaultValue
        };

    }-*/;

    private native void setFormat(String format, String viewOption) /*-{
        var theInstance = this;
        theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.TimeFormat::format.timeFormat[viewOption] = format;
    }-*/;

    @Override
    public JavaScriptObject toJavaScript() {
        return format;
    }
}
