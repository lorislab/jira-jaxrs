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

import java.util.Map;

/**
 * The permissions.
 *
 * @author Andrej Petras
 */
public class Permissions {

    /**
     * The map of permissions.
     */
    private Map<String, Permission> permissions;

    /**
     * Gets the map of permissions.
     *
     * @return the map of permissions.
     */
    public Map<String, Permission> getPermissions() {
        return permissions;
    }

    /**
     * Sets the map of permissions.
     *
     * @param permissions the map of permissions.
     */
    public void setPermissions(Map<String, Permission> permissions) {
        this.permissions = permissions;
    }

}
