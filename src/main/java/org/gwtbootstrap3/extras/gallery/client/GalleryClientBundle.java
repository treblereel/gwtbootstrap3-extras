package org.gwtbootstrap3.extras.gallery.client;

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

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.TextResource;

/**
 * @author Ben Dol
 */
//@Resource
public interface GalleryClientBundle extends ClientBundle {

    GalleryClientBundle INSTANCE = new GalleryClientBundleImpl();

    @ClientBundle.Source("resource/js/jquery.blueimp-gallery-2.18.2.min.cache.js")
    TextResource BLUEIMP_JS();

    @ClientBundle.Source("resource/js/bootstrap-image-gallery-3.4.2.min.cache.js")
    TextResource GALLERY_JS();

    @ClientBundle.Source("resource/css/blueimp-gallery-2.18.2.min.cache.css")
    TextResource GALLERY_CSS();

    @ClientBundle.Source("resource/css/blueimp-gallery-2.18.2-fix.cache.css")
    TextResource GALLERY_FIX_CSS();

    @ClientBundle.Source("resource/css/bootstrap-image-gallery-3.4.2.min.cache.css")
    TextResource GALLERY_IMAGE_CSS();
}
