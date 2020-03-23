/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StatusType.
 */
public final class StatusType extends ExpandableStringEnum<StatusType> {
    /** Static value Active for StatusType. */
    public static final StatusType ACTIVE = fromString("Active");

    /** Static value Inactive for StatusType. */
    public static final StatusType INACTIVE = fromString("Inactive");

    /**
     * Creates or finds a StatusType from its string representation.
     * @param name a name to look for
     * @return the corresponding StatusType
     */
    @JsonCreator
    public static StatusType fromString(String name) {
        return fromString(name, StatusType.class);
    }

    /**
     * @return known StatusType values
     */
    public static Collection<StatusType> values() {
        return values(StatusType.class);
    }
}