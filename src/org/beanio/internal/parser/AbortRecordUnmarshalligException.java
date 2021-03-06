/*
 * Copyright 2013 Kevin Seim
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.beanio.internal.parser;

/**
 * This exception may be thrown by {@link Parser#unmarshal(UnmarshallingContext)} to
 * abort record unmarshalling after a critical validation error has occurred.
 * @author Kevin Seim
 * @since 2.1.0
 */
@SuppressWarnings("serial")
public class AbortRecordUnmarshalligException extends RuntimeException {

    /**
     * Constructs a new AbortRecordUnmarshalligException.
     */
    public AbortRecordUnmarshalligException() { }

    /**
     * Constructs a new AbortRecordUnmarshalligException.
     * @param message the error message (for debugging purposes only)
     */
    public AbortRecordUnmarshalligException(String message) {
        super(message);
    }
}
