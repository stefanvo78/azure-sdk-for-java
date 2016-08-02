/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources;

import java.util.List;

/**
 * The AliasType model.
 */
public class AliasType {
    /**
     * The alias name.
     */
    private String name;

    /**
     * The paths for an alias.
     */
    private List<AliasPathType> paths;

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
     * @return the AliasType object itself.
     */
    public AliasType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the paths value.
     *
     * @return the paths value
     */
    public List<AliasPathType> paths() {
        return this.paths;
    }

    /**
     * Set the paths value.
     *
     * @param paths the paths value to set
     * @return the AliasType object itself.
     */
    public AliasType withPaths(List<AliasPathType> paths) {
        this.paths = paths;
        return this;
    }

}
