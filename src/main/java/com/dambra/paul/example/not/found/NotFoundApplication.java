package com.dambra.paul.example.not.found;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NotFoundApplication extends Application<NotFoundConfiguration> {
    public static void main(String[] args) throws Exception {
        new NotFoundApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<NotFoundConfiguration> bootstrap) {

    }

    @Override
    public void run(NotFoundConfiguration configuration, Environment environment) {
        environment.jersey().register(NotFoundLogger.class);
        environment.jersey().register(new FoundResource());
    }

}

