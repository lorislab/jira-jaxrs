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
 * The user information.
 *
 * @author Andrej Petras
 */
public class UserInfo {

    /**
     * The self.
     */
    private String self;
    /**
     * The name.
     */
    private String name;
    /**
     * The login information.
     */
    private LoginInfo loginInfo;

    /**
     * Gets the login information.
     *
     * @return the login information.
     */
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**
     * Sets the login information.
     *
     * @param loginInfo the login information.
     */
    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
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
     * @param self the self.
     */
    public void setSelf(String self) {
        this.self = self;
    }
}
