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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.lorislab.jira.jaxrs.model.Permissions;

/**
 * THe my permissions client.
 *
 * Provide permission information for the current user.
 *
 * @author Andrej Petras
 */
@Path("mypermissions")
public interface MyPermissionsClient {

    /**
     * Returns all permissions in the system and whether the currently logged in
     * user has them. You can optionally provide a specific context to get
     * permissions for (projectKey OR projectId OR issueKey OR issueId)
     * Available response representations: 200, 400, 404
     * 
     * @param issueId id of the issue to scope returned permissions for.
     * @param issueKey key of the issue to scope returned permissions for.
     * @param projectId id of project to scope returned permissions for.
     * @param projectKey key of project to scope returned permissions for.
     * 
     * @return the current logged in user permissions.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)        
    Permissions getPermissions(@QueryParam("projectKey") String projectKey, @QueryParam("projectId") String  projectId, @QueryParam("issueKey") String  issueKey, @QueryParam("issueId") String  issueId);

}
