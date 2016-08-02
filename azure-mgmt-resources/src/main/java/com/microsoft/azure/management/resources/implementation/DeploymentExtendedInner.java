/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.management.resources.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment information.
 */
public class DeploymentExtendedInner {
    /**
     * The ID of the deployment.
     */
    private String id;

    /**
     * The name of the deployment.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Deployment properties.
     */
    private DeploymentPropertiesExtended properties;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

}
