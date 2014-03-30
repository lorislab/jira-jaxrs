/*
 * Copyright 2014 lorislab.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lorislab.jira.jaxrs.model;

/**
 * The permission.
 *
 * @author Andrej Petras
 */
public class Permission {

    /**
     * The ID.
     */
    private String id;
    /**
     * The key.
     */
    private String key;
    /**
     * The name.
     */
    private String name;
    /**
     * The description.
     */
    private String description;
    /**
     * The have permission flag.
     */
    private boolean havePermission;

    /**
     * Gets the Id.
     *
     * @return the Id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the Id.
     *
     * @param id the Id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the key.
     *
     * @return the key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets the description.
     *
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the have permission flag.
     *
     * @return the have permission flag.
     */
    public boolean isHavePermission() {
        return havePermission;
    }

    /**
     * Sets the have permission flag.
     *
     * @param havePermission the have permission flag.
     */
    public void setHavePermission(boolean havePermission) {
        this.havePermission = havePermission;
    }
}
