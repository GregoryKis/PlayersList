package com.webapp;

import com.webapp.resource.PlayersListResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PlayersListApplication extends Application<PlayersListConfiguration> {

    public static void main(String[] args) {
        try {
            new PlayersListApplication().run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(Bootstrap<PlayersListConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    public void run(PlayersListConfiguration playersListConfiguration, Environment environment) {
        PlayersListResource resource = new PlayersListResource();

        environment.jersey().register(resource);
    }
}
