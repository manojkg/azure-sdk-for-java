/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A model object containing the name of the custom prebuilt entity and the
 * name of the domain to which this model belongs.
 */
public class PrebuiltDomainCreateBaseObject {
    /**
     * The domain name.
     */
    @JsonProperty(value = "domainName")
    private String domainName;

    /**
     * Get the domainName value.
     *
     * @return the domainName value
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName value.
     *
     * @param domainName the domainName value to set
     * @return the PrebuiltDomainCreateBaseObject object itself.
     */
    public PrebuiltDomainCreateBaseObject withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

}
