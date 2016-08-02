/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;


/**
 * SKU of application gateway.
 */
public class ApplicationGatewaySku {
    /**
     * Name of application gateway SKU. Possible values include:
     * 'Standard_Small', 'Standard_Medium', 'Standard_Large'.
     */
    private ApplicationGatewaySkuName name;

    /**
     * Tier of application gateway. Possible values include: 'Standard'.
     */
    private ApplicationGatewayTier tier;

    /**
     * Capacity (instance count) of application gateway.
     */
    private Integer capacity;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public ApplicationGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withName(ApplicationGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public ApplicationGatewayTier tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withTier(ApplicationGatewayTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
