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
package org.lorislab.jira.jaxrs.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.lorislab.jira.jaxrs.model.LoginInfo;
import org.lorislab.jira.jaxrs.model.LoginRequest;
import org.lorislab.jira.jaxrs.model.UserInfo;

/**
 * The session client.
 *
 * @author Andrej Petras
 */
@Path("session")
public interface SessionClient {

    /**
     * Creates a new session for a user in JIRA. Once a session has been
     * successfully created it can be used to access any of JIRA's remote APIs
     * and also the web UI by passing the appropriate HTTP Cookie header.
     * Available response representations: 200, 401, 403
     *
     * @param request the login request.
     * @return the login info.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    LoginInfo login(LoginRequest request);

    /**
     * Returns information about the currently authenticated user's session. If
     * the caller is not authenticated they will get a 401 Unauthorised status
     * code. Available response representations: 200, 401
     * 
     * @param session the session id.
     * 
     * @return the user information.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    UserInfo getUserInfo(@HeaderParam("JSESSIONID") String session);
    
    /**
     * Returns information about the currently authenticated user's session. If
     * the caller is not authenticated they will get a 401 Unauthorised status
     * code. Available response representations: 200, 401
     *
     * @return the user information.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    UserInfo getUserInfo();
    
    /**
     * Logs the current user out of JIRA, destroying the existing session, if any.
     * Available response representations: 204, 401
     * 
     * @param session the session id.
     */
    @DELETE
    void delete(@HeaderParam("JSESSIONID") String session);
    
    /**
     * Logs the current user out of JIRA, destroying the existing session, if any.
     * Available response representations: 204, 401
     */
    @DELETE
    void delete();    
}
