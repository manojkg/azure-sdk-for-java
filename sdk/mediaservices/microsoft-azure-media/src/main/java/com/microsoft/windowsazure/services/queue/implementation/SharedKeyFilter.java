/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.microsoft.windowsazure.services.queue.implementation;

import javax.inject.Named;

import com.microsoft.windowsazure.services.queue.QueueConfiguration;

public class SharedKeyFilter extends
        com.microsoft.windowsazure.services.blob.implementation.SharedKeyFilter {
    public SharedKeyFilter(
            @Named(QueueConfiguration.ACCOUNT_NAME) String accountName,
            @Named(QueueConfiguration.ACCOUNT_KEY) String accountKey) {
        super(accountName, accountKey);
    }
}
