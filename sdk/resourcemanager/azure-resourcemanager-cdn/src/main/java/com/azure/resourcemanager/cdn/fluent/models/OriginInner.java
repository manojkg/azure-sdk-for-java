// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.OriginResourceState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do
 * not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
 */
@JsonFlatten
@Fluent
public class OriginInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OriginInner.class);

    /*
     * The address of the origin. Domain names, IPv4 addresses, and IPv6
     * addresses are supported.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /*
     * The value of the HTTP port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpPort")
    private Integer httpPort;

    /*
     * The value of the https port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpsPort")
    private Integer httpsPort;

    /*
     * Resource status of the origin.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private OriginResourceState resourceState;

    /*
     * Provisioning status of the origin.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.
     *
     * @param hostname the hostname value to set.
     * @return the OriginInner object itself.
     */
    public OriginInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set.
     * @return the OriginInner object itself.
     */
    public OriginInner withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort property: The value of the https port. Must be between 1 and 65535.
     *
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort property: The value of the https port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set.
     * @return the OriginInner object itself.
     */
    public OriginInner withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the origin.
     *
     * @return the resourceState value.
     */
    public OriginResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the origin.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
