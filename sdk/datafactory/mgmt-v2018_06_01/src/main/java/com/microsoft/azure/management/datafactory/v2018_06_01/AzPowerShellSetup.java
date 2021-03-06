/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The express custom setup of installing Azure PowerShell.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzPowerShellSetup.class)
@JsonTypeName("AzPowerShellSetup")
@JsonFlatten
public class AzPowerShellSetup extends CustomSetupBase {
    /**
     * The required version of Azure PowerShell to install.
     */
    @JsonProperty(value = "typeProperties.version", required = true)
    private String version;

    /**
     * Get the required version of Azure PowerShell to install.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the required version of Azure PowerShell to install.
     *
     * @param version the version value to set
     * @return the AzPowerShellSetup object itself.
     */
    public AzPowerShellSetup withVersion(String version) {
        this.version = version;
        return this;
    }

}
