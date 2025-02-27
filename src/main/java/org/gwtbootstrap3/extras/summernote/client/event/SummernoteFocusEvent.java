package org.gwtbootstrap3.extras.summernote.client.event;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2015 GwtBootstrap3
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

import org.gwtproject.event.legacy.shared.GwtEvent;

/**
 * The {@link SummernoteFocusEvent} is fired when the summernote editor is focused.
 *
 * @author Xiaodong Sun
 */
public class SummernoteFocusEvent extends GwtEvent<SummernoteFocusHandler> {

    private static Type<SummernoteFocusHandler> TYPE;

    /**
     * Fires a summernote focus event on all registered handlers in the handler
     * manager. If no such handlers exist, this method will do nothing.
     *
     * @param source the source of the handlers
     */
    public static void fire(final HasSummernoteFocusHandlers source) {
        if (TYPE != null) {
            SummernoteFocusEvent event = new SummernoteFocusEvent();
            source.fireEvent(event);
        }
    }

    /**
     * Gets the type associated with this event.
     *
     * @return returns the handler type
     */
    public static Type<SummernoteFocusHandler> getType() {
        if (TYPE == null) {
            TYPE = new Type<SummernoteFocusHandler>();
        }
        return TYPE;
    }

    @Override
    public Type<SummernoteFocusHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final SummernoteFocusHandler handler) {
        handler.onSummernoteFocus(this);
    }

    /**
     * Creates a summernote focus event.
     */
    protected SummernoteFocusEvent() {}
}