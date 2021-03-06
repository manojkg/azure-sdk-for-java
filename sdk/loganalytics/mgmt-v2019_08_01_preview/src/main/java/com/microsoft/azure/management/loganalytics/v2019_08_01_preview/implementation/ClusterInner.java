/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2019_08_01_preview.Identity;
import com.microsoft.azure.management.loganalytics.v2019_08_01_preview.Sku;
import com.microsoft.azure.management.loganalytics.v2019_08_01_preview.EntityStatus;
import com.microsoft.azure.management.loganalytics.v2019_08_01_preview.KeyVaultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The top level Log Analytics cluster resource container.
 */
@JsonFlatten
@SkipParentValidation
public class ClusterInner extends Resource {
    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * The sku properties.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The link used to get the next page of recommendations.
     */
    @JsonProperty(value = "properties.nextLink")
    private String nextLink;

    /**
     * The ID associated with the cluster.
     */
    @JsonProperty(value = "properties.clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /**
     * The provisioning state of the cluster. Possible values include:
     * 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting',
     * 'ProvisioningAccount'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EntityStatus provisioningState;

    /**
     * The associated key properties.
     */
    @JsonProperty(value = "properties.keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /**
     * Get the identity of the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the resource.
     *
     * @param identity the identity value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku properties.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku properties.
     *
     * @param sku the sku value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the link used to get the next page of recommendations.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the link used to get the next page of recommendations.
     *
     * @param nextLink the nextLink value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the ID associated with the cluster.
     *
     * @return the clusterId value
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the provisioning state of the cluster. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount'.
     *
     * @return the provisioningState value
     */
    public EntityStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the associated key properties.
     *
     * @return the keyVaultProperties value
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the associated key properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

}
