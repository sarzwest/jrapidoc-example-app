package org.jrapidoc.example.resource;

import org.jrapidoc.example.entity.Destination;
import org.jrapidoc.example.entity.DestinationEntity;

import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by papa on 3.5.15.
 */
@Path("/simple")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class SimpleResource {

    @GET
    @Path("get/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Destination get(@PathParam("id")String id){
        return null;
    }

    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void post(DestinationEntity d){
    }

    @GET
    @Path("get")
    public GenericEntity<List<Destination>> getAll(){
        return null;
    }

    @PUT
    @Path("asynchronous/long/running/process")
    public void asynchronousMethod(@Suspended final AsyncResponse ar, @QueryParam("q") boolean q, Destination d){
    }

    @Path("sub/resource/locator")
    public AnotherResource subresourceLocator(){
        return null;
    }
}
