package org.gwtbootstrap3.extras.tagsinput.client.ui.base;

import org.gwtbootstrap3.extras.tagsinput.client.event.BeforeItemAddEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.BeforeItemRemoveEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.HasBeforeItemAddHandlers;
import org.gwtbootstrap3.extras.tagsinput.client.event.HasBeforeItemRemoveHandlers;
import org.gwtbootstrap3.extras.tagsinput.client.event.HasItemAddedHandlers;
import org.gwtbootstrap3.extras.tagsinput.client.event.HasItemAddedOnInitHandlers;
import org.gwtbootstrap3.extras.tagsinput.client.event.HasItemRemovedHandlers;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemAddedEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemAddedOnInitEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemRemovedEvent;

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

/**
 * Convenience interface used to implement all tagsinput handlers at once.
 *
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
public interface HasAllTagsInputEvents<T> extends HasItemAddedOnInitHandlers<T>, HasBeforeItemAddHandlers<T>, HasItemAddedHandlers<T>,
                                                  HasBeforeItemRemoveHandlers<T>, HasItemRemovedHandlers<T> {

    /**
     * The {@link ItemAddedOnInitEvent} name
     */
    String ITEM_ADDED_ON_INIT_EVENT = "itemAddedOnInit";

    /**
     * The {@link BeforeItemAddEvent} name
     */
    String BEFORE_ITEM_ADD_EVENT = "beforeItemAdd";

    /**
     * The {@link ItemAddedEvent} name
     */
    String ITEM_ADDED_EVENT = "itemAdded";

    /**
     * The {@link BeforeItemRemoveEvent} name
     */
    String BEFORE_ITEM_REMOVE_EVENT = "beforeItemRemove";

    /**
     * The {@link ItemRemovedEvent} name
     */
    String ITEM_REMOVED_EVENT = "itemRemoved";

    /**
     * The {@link ItemChangedEvent} name
     */
    String ITEM_CHANGED_EVENT = "change";
}
