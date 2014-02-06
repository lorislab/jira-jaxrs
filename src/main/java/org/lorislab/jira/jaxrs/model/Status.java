/*
 * Copyright 2013 lorislab.org.
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
 * The status.
 *
 * @author Andrej Petras
 */
public class Status {

    /**
     * The id.
     */
    private String id;
    /**
     * The self.
     */
    private String self;
    /**
     * The description.
     */
    private String description;
    /**
     * The icon URL.
     */
    private String iconUrl;
    /**
     * The name.
     */
    private String name;

    /**
     * Gets the id.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the self.
     *
     * @return the self.
     */
    public String getSelf() {
        return self;
    }

    /**
     * Sets the self.
     *
     * @param self the self to set.
     */
    public void setSelf(String self) {
        this.self = self;
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
     * @param description the description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the icon URL.
     *
     * @return the icon URL.
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the icon URL.
     *
     * @param iconUrl the icon URL.
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

}
