package com.dambra.paul.example.not.found;

import javax.ws.rs.NotFoundException;

class ExampleLogger {
    void error(final String notFoundUrl, final NotFoundException exception) {
        System.out.println("someone tried to load " + notFoundUrl);
        System.out.println(exception.getMessage());
    }
}
