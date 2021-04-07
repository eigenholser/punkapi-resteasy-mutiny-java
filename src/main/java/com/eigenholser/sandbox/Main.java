package com.eigenholser.sandbox;

import com.eigenholser.sandbox.model.Beer;
import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/")
public class Main {
    @Inject
    @RestClient
    PunkApi punk;

    @GET
    @Path("/punk")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Beer> getBeers() {
        System.out.println("**** Getting Beers ****");
        return Multi.createBy().repeating()
                .uni(() -> new AtomicInteger(), p -> {
                    System.out.println("Page: " + p);
                    return punk.get(p.incrementAndGet());
                })
                .until(l -> l.isEmpty())
        .onItem().disjoint();
    }
}