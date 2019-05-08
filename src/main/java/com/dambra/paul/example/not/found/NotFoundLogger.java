package com.dambra.paul.example.not.found;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;


public class NotFoundLogger implements ExceptionMapper<NotFoundException> {

    @Context
    private HttpServletRequest request;

    private ExampleLogger logger = new ExampleLogger();

    @Override
    public Response toResponse(final NotFoundException exception) {
        logger.error("exception mapper: " + request.getRequestURI(), exception);
        return Response.status(404).build();
    }

}

