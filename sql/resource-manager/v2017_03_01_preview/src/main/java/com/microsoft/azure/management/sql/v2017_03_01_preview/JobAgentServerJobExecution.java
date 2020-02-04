/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.JobExecutionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * Type representing JobAgentServerJobExecution.
 */
public interface JobAgentServerJobExecution extends HasInner<JobExecutionInner>, Indexable, Updatable<JobAgentServerJobExecution.Update>, HasManager<SqlManager> {
    /**
     * @return the createTime value.
     */
    DateTime createTime();

    /**
     * @return the currentAttempts value.
     */
    Integer currentAttempts();

    /**
     * @return the currentAttemptStartTime value.
     */
    DateTime currentAttemptStartTime();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the jobExecutionId value.
     */
    UUID jobExecutionId();

    /**
     * @return the jobVersion value.
     */
    Integer jobVersion();

    /**
     * @return the lastMessage value.
     */
    String lastMessage();

    /**
     * @return the lifecycle value.
     */
    JobExecutionLifecycle lifecycle();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the stepId value.
     */
    Integer stepId();

    /**
     * @return the stepName value.
     */
    String stepName();

    /**
     * @return the target value.
     */
    JobExecutionTarget target();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the JobAgentServerJobExecution definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithJobAgent, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of JobAgentServerJobExecution definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a JobAgentServerJobExecution definition.
         */
        interface Blank extends WithJobAgent {
        }

        /**
         * The stage of the jobagentserverjobexecution definition allowing to specify JobAgent.
         */
        interface WithJobAgent {
           /**
            * Specifies resourceGroupName, serverName, jobAgentName, jobName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param jobAgentName The name of the job agent
            * @param jobName The name of the job to get
            * @return the next definition stage
            */
            WithCreate withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName, String jobName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<JobAgentServerJobExecution> {
        }
    }
    /**
     * The template for a JobAgentServerJobExecution update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<JobAgentServerJobExecution> {
    }

    /**
     * Grouping of JobAgentServerJobExecution update stages.
     */
    interface UpdateStages {
    }
}