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
 * The login response.
 *
 * @author Andrej Petras
 */
public class LoginResponse {

    /**
     * The session.
     */
    private Session session;

    /**
     * The login info.
     */
    private LoginInfo loginInfo;
    
    /**
     * Gets the session.
     *
     * @return the session.
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the session.
     *
     * @param session the session.
     */
    public void setSession(Session session) {
        this.session = session;
    }
}
