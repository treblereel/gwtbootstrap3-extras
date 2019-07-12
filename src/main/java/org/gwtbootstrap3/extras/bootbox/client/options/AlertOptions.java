package org.gwtbootstrap3.extras.bootbox.client.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.gwtbootstrap3.extras.bootbox.client.callback.SimpleCallback;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/19
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AlertOptions extends DialogOptions<AlertOptions> {

    SimpleCallback callback;

    @JsOverlay
    public final AlertOptions setCallback(SimpleCallback callback) {
        this.callback = callback;
        return this;
    }

}
