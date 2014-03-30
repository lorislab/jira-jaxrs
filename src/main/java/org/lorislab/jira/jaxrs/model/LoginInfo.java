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
 * The login info.
 *
 * @author Andrej Petras
 */
public class LoginInfo {

    /**
     * The failed login count.
     */
    private int failedLoginCount;

    /**
     * The login count.
     */
    private int loginCount;

    /**
     * The last failed login time.
     */
    private String lastFailedLoginTime;

    /**
     * The previous login time.
     */
    private String previousLoginTime;

    /**
     * Gets the failed count.
     *
     * @return the failed count.
     */
    public int getFailedLoginCount() {
        return failedLoginCount;
    }

    /**
     * Sets the failed count.
     *
     * @param failedLoginCount the failed count.
     */
    public void setFailedLoginCount(int failedLoginCount) {
        this.failedLoginCount = failedLoginCount;
    }

    /**
     * Gets the last failed login time.
     *
     * @return the last failed login time.
     */
    public String getLastFailedLoginTime() {
        return lastFailedLoginTime;
    }

    /**
     * Sets the last failed login time.
     *
     * @param lastFailedLoginTime the last failed login time.
     */
    public void setLastFailedLoginTime(String lastFailedLoginTime) {
        this.lastFailedLoginTime = lastFailedLoginTime;
    }

    /**
     * Gets the login count.
     *
     * @return the login count.
     */
    public int getLoginCount() {
        return loginCount;
    }

    /**
     * Sets the login count.
     *
     * @param loginCount the login count.
     */
    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * Gets the previous login time.
     *
     * @return the previous login time.
     */
    public String getPreviousLoginTime() {
        return previousLoginTime;
    }

    /**
     * Sets the previous login time.
     *
     * @param previousLoginTime the previous login time.
     */
    public void setPreviousLoginTime(String previousLoginTime) {
        this.previousLoginTime = previousLoginTime;
    }
}
