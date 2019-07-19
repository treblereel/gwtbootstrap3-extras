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

import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.dom.client.NativeEvent;

/**
 * Mouse and click callback interface
 *
 * @author Jeff Isenhart
 */
public interface ClickAndHoverEventCallback {
    void eventClick(JavaScriptObject calendarEvent, NativeEvent event, JavaScriptObject viewObject);

    void dayClick(JavaScriptObject moment, NativeEvent event, JavaScriptObject viewObject);

    void eventMouseover(JavaScriptObject calendarEvent, NativeEvent event, JavaScriptObject viewObject);

    void eventMouseout(JavaScriptObject calendarEvent, NativeEvent event, JavaScriptObject viewObject);
}
