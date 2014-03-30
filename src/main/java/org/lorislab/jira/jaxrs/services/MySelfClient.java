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
import javax.ws.rs.core.MediaType;
import org.lorislab.jira.jaxrs.model.User;

/**
 * The my self client currently logged user resource
 * 
 * @author Andrej Petras
 */
@Path("myself")
public interface MySelfClient {

    /**
     * Returns currently logged user. This resource cannot be accessed
     * anonymously.
     * Available response representations: 200, 403, 404
     * @return the user information.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    User getCurrentlyLoggedUser();
}
