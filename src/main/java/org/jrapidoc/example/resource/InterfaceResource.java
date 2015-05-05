package org.jrapidoc.example.resource;

import org.jrapidoc.annotation.rest.DocReturn;
import org.jrapidoc.annotation.rest.DocReturns;
import org.jrapidoc.example.entity.Destination;
import org.jrapidoc.example.entity.DestinationEntity;
import org.jrapidoc.example.exception.CustomException;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by papa on 4.5.15.
 */
public interface InterfaceResource {

    @PUT
    @Path("interface")
    @DocReturns({
            @DocReturn(http = 200,
                    description = "Returns array of DestinationEntity",
                    type = DestinationEntity.class,
                    structure = DocReturn.Structure.ARRAY),
            @DocReturn(http = 200,
                    description = "Returns map<string,Destination>",
                    type = Destination.class,
                    structure = DocReturn.Structure.MAP),
            @DocReturn(http = 403,
                    description = "Throw exception",
                    type = CustomException.class)
    })
    public Response fromInterfacemultipleResponses() throws CustomException;
}
