/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Issue Attachment Contract details.
 */
@JsonFlatten
public class IssueAttachmentContractInner extends ProxyResource {
    /**
     * Filename by which the binary data will be saved.
     */
    @JsonProperty(value = "properties.title", required = true)
    private String title;

    /**
     * Either 'link' if content is provided via an HTTP link or the MIME type
     * of the Base64-encoded binary data provided in the 'content' property.
     */
    @JsonProperty(value = "properties.contentFormat", required = true)
    private String contentFormat;

    /**
     * An HTTP link or Base64-encoded binary data.
     */
    @JsonProperty(value = "properties.content", required = true)
    private String content;

    /**
     * Get filename by which the binary data will be saved.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set filename by which the binary data will be saved.
     *
     * @param title the title value to set
     * @return the IssueAttachmentContractInner object itself.
     */
    public IssueAttachmentContractInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get either 'link' if content is provided via an HTTP link or the MIME type of the Base64-encoded binary data provided in the 'content' property.
     *
     * @return the contentFormat value
     */
    public String contentFormat() {
        return this.contentFormat;
    }

    /**
     * Set either 'link' if content is provided via an HTTP link or the MIME type of the Base64-encoded binary data provided in the 'content' property.
     *
     * @param contentFormat the contentFormat value to set
     * @return the IssueAttachmentContractInner object itself.
     */
    public IssueAttachmentContractInner withContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }

    /**
     * Get an HTTP link or Base64-encoded binary data.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set an HTTP link or Base64-encoded binary data.
     *
     * @param content the content value to set
     * @return the IssueAttachmentContractInner object itself.
     */
    public IssueAttachmentContractInner withContent(String content) {
        this.content = content;
        return this;
    }

}