package org.jrapidoc.example.resource;

import org.jrapidoc.example.entity.DestinationEntity;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

/**
 * Created by papa on 3.5.15.
 */
public class AnotherResource {

    @GET
    @Path("some/path")
    public DestinationEntity somePath(@HeaderParam("h")int i){
        return null;
    }
}
