package org.gwtbootstrap3.extras.toggleswitch.client;

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

import org.gwtproject.core.client.EntryPoint;
import org.gwtproject.core.client.ScriptInjector;

/**
 * @author Grant Slender
 */
public class ToggleSwitchEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        ScriptInjector.fromString(ToggleSwitchClientBundle.INSTANCE.toggleswitch().getText()).setWindow(ScriptInjector.TOP_WINDOW)
                .inject();
    }
}
