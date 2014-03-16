/*
 * Copyright 2013 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.chronicle;

import net.openhft.lang.model.constraints.NotNull;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author peter.lawrey
 */
public interface Chronicle extends Closeable {
    String name();

    @NotNull
    Excerpt createExcerpt() throws IOException;

    @NotNull
    ExcerptTailer createTailer() throws IOException;

    @NotNull
    ExcerptAppender createAppender() throws IOException;

    long lastWrittenIndex();

    long size();
}
