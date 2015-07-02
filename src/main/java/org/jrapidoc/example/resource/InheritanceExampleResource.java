package org.jrapidoc.example.resource;

import org.projectodd.jrapidoc.annotation.rest.DocReturn;
import org.projectodd.jrapidoc.annotation.rest.DocReturns;
import org.jrapidoc.example.entity.Destination;
import org.jrapidoc.example.entity.DestinationEntity;
import org.jrapidoc.example.exception.CustomException;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by papa on 4.5.15.
 */
@Path("methods/defined/in/parent")
public class InheritanceExampleResource extends InheritedResource implements InterfaceResource{

    @Override
    public Response fromInterfacemultipleResponses() throws CustomException {
        return null;
    }
}
