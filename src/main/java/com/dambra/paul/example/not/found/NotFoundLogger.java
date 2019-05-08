package com.dambra.paul.example.not.found;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class NotFoundLogger implements ExceptionMapper<NotFoundException> {

    ExampleLogger logger = new ExampleLogger();

    @Override
    public Response toResponse(final NotFoundException exception) {
        logger.error(urlFrom(exception), exception);
        return Response.status(404).build();
    }

    private String urlFrom(final NotFoundException exception) {
        return "why is this not a property on the exception?!";
    }

    private class ExampleLogger {
        void error(final String notFoundUrl, final NotFoundException exception) {
            System.out.println("someone tried to load " + notFoundUrl);
            System.out.println(exception.getMessage());
        }
    }
}
