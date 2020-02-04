/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Output for task that migrates SQL Server databases to Azure SQL Database
 * Managed Instance.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrateSqlServerSqlMITaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateSqlServerSqlMITaskOutputError.class),
    @JsonSubTypes.Type(name = "LoginLevelOutput", value = MigrateSqlServerSqlMITaskOutputLoginLevel.class),
    @JsonSubTypes.Type(name = "AgentJobLevelOutput", value = MigrateSqlServerSqlMITaskOutputAgentJobLevel.class),
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = MigrateSqlServerSqlMITaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "MigrationLevelOutput", value = MigrateSqlServerSqlMITaskOutputMigrationLevel.class)
})
public class MigrateSqlServerSqlMITaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}