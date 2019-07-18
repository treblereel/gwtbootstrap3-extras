package org.gwtbootstrap3.extras.select.client.ui;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import org.gwtbootstrap3.client.shared.js.JQuery;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.shared.Event;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/18/19
 */
class SelectPicker extends JQuery {

    @JsOverlay
    public static SelectPicker jQuery(Element e) {
        return (SelectPicker) JQuery.jQuery(e);
    }

    native Object selectpicker(String val);

    native Object selectpicker(String val, Object value);

    native Object selectpicker(Object value);

    public native JQuery on(String var1, Fn var2);

    public native JQuery on(String var1, Fn4Args var2);

    @FunctionalInterface
    @JsFunction
    interface Fn {
        void onInvoke(Event arg);
    }

    @FunctionalInterface
    @JsFunction
    interface Fn2Args {
        Object onInvoke(int selectedCount, int totalCount);
    }

    @FunctionalInterface
    @JsFunction
    interface Fn4Args {
        void onInvoke(Event event, int clickedIndex, Object newValue, Object oldValue);
    }
}
