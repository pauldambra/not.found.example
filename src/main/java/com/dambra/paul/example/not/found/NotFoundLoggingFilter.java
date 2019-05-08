package com.dambra.paul.example.not.found;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class NotFoundLoggingFilter implements ContainerResponseFilter {
    private ExampleLogger logger = new ExampleLogger();

    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) {
        if (responseContext.getStatus() != 404) {
            return;
        }

        logger.error("filter: " + requestContext.getUriInfo().getAbsolutePath(), new NotFoundException());
    }
}
