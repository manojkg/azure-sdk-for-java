/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain regenerate share access key request.
 */
public class DomainRegenerateKeyRequest {
    /**
     * Key name to regenerate key1 or key2.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get key name to regenerate key1 or key2.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set key name to regenerate key1 or key2.
     *
     * @param keyName the keyName value to set
     * @return the DomainRegenerateKeyRequest object itself.
     */
    public DomainRegenerateKeyRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

}
