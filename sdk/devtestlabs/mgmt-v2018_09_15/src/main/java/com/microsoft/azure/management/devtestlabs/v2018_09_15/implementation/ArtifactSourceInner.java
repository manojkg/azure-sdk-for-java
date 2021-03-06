/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2018_09_15.SourceControlType;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.EnableStatus;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Properties of an artifact source.
 */
@JsonFlatten
@SkipParentValidation
public class ArtifactSourceInner extends Resource {
    /**
     * The artifact source's display name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The artifact source's URI.
     */
    @JsonProperty(value = "properties.uri")
    private String uri;

    /**
     * The artifact source's type. Possible values include: 'VsoGit', 'GitHub'.
     */
    @JsonProperty(value = "properties.sourceType")
    private SourceControlType sourceType;

    /**
     * The folder containing artifacts.
     */
    @JsonProperty(value = "properties.folderPath")
    private String folderPath;

    /**
     * The folder containing Azure Resource Manager templates.
     */
    @JsonProperty(value = "properties.armTemplateFolderPath")
    private String armTemplateFolderPath;

    /**
     * The artifact source's branch reference.
     */
    @JsonProperty(value = "properties.branchRef")
    private String branchRef;

    /**
     * The security token to authenticate to the artifact source.
     */
    @JsonProperty(value = "properties.securityToken")
    private String securityToken;

    /**
     * Indicates if the artifact source is enabled (values: Enabled, Disabled).
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.status")
    private EnableStatus status;

    /**
     * The artifact source's creation date.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the artifact source's display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the artifact source's display name.
     *
     * @param displayName the displayName value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the artifact source's URI.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the artifact source's URI.
     *
     * @param uri the uri value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the artifact source's type. Possible values include: 'VsoGit', 'GitHub'.
     *
     * @return the sourceType value
     */
    public SourceControlType sourceType() {
        return this.sourceType;
    }

    /**
     * Set the artifact source's type. Possible values include: 'VsoGit', 'GitHub'.
     *
     * @param sourceType the sourceType value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withSourceType(SourceControlType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the folder containing artifacts.
     *
     * @return the folderPath value
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folder containing artifacts.
     *
     * @param folderPath the folderPath value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the folder containing Azure Resource Manager templates.
     *
     * @return the armTemplateFolderPath value
     */
    public String armTemplateFolderPath() {
        return this.armTemplateFolderPath;
    }

    /**
     * Set the folder containing Azure Resource Manager templates.
     *
     * @param armTemplateFolderPath the armTemplateFolderPath value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withArmTemplateFolderPath(String armTemplateFolderPath) {
        this.armTemplateFolderPath = armTemplateFolderPath;
        return this;
    }

    /**
     * Get the artifact source's branch reference.
     *
     * @return the branchRef value
     */
    public String branchRef() {
        return this.branchRef;
    }

    /**
     * Set the artifact source's branch reference.
     *
     * @param branchRef the branchRef value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withBranchRef(String branchRef) {
        this.branchRef = branchRef;
        return this;
    }

    /**
     * Get the security token to authenticate to the artifact source.
     *
     * @return the securityToken value
     */
    public String securityToken() {
        return this.securityToken;
    }

    /**
     * Set the security token to authenticate to the artifact source.
     *
     * @param securityToken the securityToken value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get indicates if the artifact source is enabled (values: Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set indicates if the artifact source is enabled (values: Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the ArtifactSourceInner object itself.
     */
    public ArtifactSourceInner withStatus(EnableStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the artifact source's creation date.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

}
