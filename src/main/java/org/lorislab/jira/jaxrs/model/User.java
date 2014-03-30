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

import java.util.Map;

/**
 * The user.
 *
 * @author Andrej Petras
 */
public class User {

    /**
     * The self.
     */
    private String self;
    /**
     * The name.
     */
    private String name;
    /**
     * The map of avatar URL's.
     */
    private Map<String, String> avatarUrls;
    /**
     * The display name.
     */
    private String displayName;
    /**
     * The active flag.
     */
    private boolean active;
    /**
     * The email address.
     */
    private String emailAddress;
    /**
     * The time zone.
     */
    private String timeZone;

    /**
     * The groups.
     */
    private Groups groups;

    /**
     * The expand attribute.
     */
    private String expand;

    /**
     * The user key.
     */
    private String key;

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
     * Gets the expand.
     *
     * @return the expand.
     */
    public String getExpand() {
        return expand;
    }

    /**
     * Sets the expand.
     *
     * @param expand the expand.
     */
    public void setExpand(String expand) {
        this.expand = expand;
    }

    /**
     * Gets the groups.
     *
     * @return the groups.
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the groups.
     *
     * @param groups the groups.
     */
    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    /**
     * Gets the time zone.
     *
     * @return the time zone.
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the time zone.
     *
     * @param timeZone the time zone.
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
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

    /**
     * Gets the map of avatar URL's.
     *
     * @return the map of avatar URL's.
     */
    public Map<String, String> getAvatarUrls() {
        return avatarUrls;
    }

    /**
     * Sets the map of avatar URL's.
     *
     * @param avatarUrls the map of avatar URL's.
     */
    public void setAvatarUrls(Map<String, String> avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    /**
     * Gets the display name.
     *
     * @return the display name.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the display name.
     *
     * @param displayName the display name.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets the active flag.
     *
     * @return the active flag.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the active flag.
     *
     * @param active the active flag.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Gets the email address.
     *
     * @return the email address.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address.
     *
     * @param emailAddress the email address.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
