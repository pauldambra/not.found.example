package com.dambra.paul.example.not.found;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class FoundResource {

    @GET
    @Path("ping")
    public Response Ping() {
        return Response.ok("pong").build();
    }

}
