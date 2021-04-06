package com.eigenholser.sandbox;

import com.eigenholser.sandbox.model.Beer;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(baseUri = "https://api.punkapi.com/v2/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface PunkApi {
    @GET
    @Path("/beers")
    Uni<List<Beer>> get(@QueryParam("page") int page);
}
