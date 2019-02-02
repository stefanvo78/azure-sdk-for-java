/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation;

import com.microsoft.azure.management.kusto.v2018_09_07_preview.DataFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing an event hub connection.
 */
@JsonFlatten
public class EventHubConnectionInner extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The resource ID of the event hub to be used to create a data connection.
     */
    @JsonProperty(value = "properties.eventHubResourceId", required = true)
    private String eventHubResourceId;

    /**
     * The event hub consumer group.
     */
    @JsonProperty(value = "properties.consumerGroup", required = true)
    private String consumerGroup;

    /**
     * The table where the data should be ingested. Optionally the table
     * information can be added to each message.
     */
    @JsonProperty(value = "properties.tableName")
    private String tableName;

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     */
    @JsonProperty(value = "properties.mappingRuleName")
    private String mappingRuleName;

    /**
     * The data format of the message. Optionally the data format can be added
     * to each message. Possible values include: 'MULTIJSON', 'JSON', 'CSV'.
     */
    @JsonProperty(value = "properties.dataFormat")
    private DataFormat dataFormat;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the EventHubConnectionInner object itself.
     */
    public EventHubConnectionInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the resource ID of the event hub to be used to create a data connection.
     *
     * @return the eventHubResourceId value
     */
    public String eventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * Set the resource ID of the event hub to be used to create a data connection.
     *
     * @param eventHubResourceId the eventHubResourceId value to set
     * @return the EventHubConnectionInner object itself.
     */
    public EventHubConnectionInner withEventHubResourceId(String eventHubResourceId) {
        this.eventHubResourceId = eventHubResourceId;
        return this;
    }

    /**
     * Get the event hub consumer group.
     *
     * @return the consumerGroup value
     */
    public String consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * Set the event hub consumer group.
     *
     * @param consumerGroup the consumerGroup value to set
     * @return the EventHubConnectionInner object itself.
     */
    public EventHubConnectionInner withConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Get the table where the data should be ingested. Optionally the table information can be added to each message.
     *
     * @return the tableName value
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the table where the data should be ingested. Optionally the table information can be added to each message.
     *
     * @param tableName the tableName value to set
     * @return the EventHubConnectionInner object itself.
     */
    public EventHubConnectionInner withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     *
     * @return the mappingRuleName value
     */
    public String mappingRuleName() {
        return this.mappingRuleName;
    }

    /**
     * Set the mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     *
     * @param mappingRuleName the mappingRuleName value to set
     * @return the EventHubConnectionInner object itself.
     */
    public EventHubConnectionInner withMappingRuleName(String mappingRuleName) {
        this.mappingRuleName = mappingRuleName;
        return this;
    }

    /**
     * Get the data format of the message. Optionally the data format can be added to each message. Possible values include: 'MULTIJSON', 'JSON', 'CSV'.
     *
     * @return the dataFormat value
     */
    public DataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set the data format of the message. Optionally the data format can be added to each message. Possible values include: 'MULTIJSON', 'JSON', 'CSV'.
     *
     * @param dataFormat the dataFormat value to set
     * @return the EventHubConnectionInner object itself.
     */
    public EventHubConnectionInner withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

}
