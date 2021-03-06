/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestackhci.v2020_10_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties reported by cluster agent.
 */
public class ClusterReportedProperties {
    /**
     * Name of the on-prem cluster connected to this resource.
     */
    @JsonProperty(value = "clusterName", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterName;

    /**
     * Unique id generated by the on-prem cluster.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /**
     * Version of the cluster software.
     */
    @JsonProperty(value = "clusterVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterVersion;

    /**
     * List of nodes reported by the cluster.
     */
    @JsonProperty(value = "nodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterNode> nodes;

    /**
     * Last time the cluster reported the data.
     */
    @JsonProperty(value = "lastUpdated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdated;

    /**
     * Get name of the on-prem cluster connected to this resource.
     *
     * @return the clusterName value
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Get unique id generated by the on-prem cluster.
     *
     * @return the clusterId value
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get version of the cluster software.
     *
     * @return the clusterVersion value
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Get list of nodes reported by the cluster.
     *
     * @return the nodes value
     */
    public List<ClusterNode> nodes() {
        return this.nodes;
    }

    /**
     * Get last time the cluster reported the data.
     *
     * @return the lastUpdated value
     */
    public DateTime lastUpdated() {
        return this.lastUpdated;
    }

}
