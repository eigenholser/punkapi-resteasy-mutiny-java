package com.eigenholser.sandbox;

import com.eigenholser.sandbox.model.Beer;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class Main {
    @Inject
    @RestClient
    PunkApi punk;

    @GET
    @Path("/punk")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Beer>> getBeers() {
        System.out.println("**** Getting Beers ****");
        return punk.get(1);
    }
}