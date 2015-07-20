package org.jrapidoc.example.resource;

import org.projectodd.jrapidoc.annotation.DocDescription;
import org.projectodd.jrapidoc.annotation.DocIsRequired;
import org.projectodd.jrapidoc.annotation.rest.DocReturn;
import org.jrapidoc.example.entity.Destination;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

/**
 * Created by papa on 4.5.15.
 */
public class InheritedResource {

    @PUT
    @Path("class")
    @DocDescription("Description of method")
    @DocReturn(http = 200,
            description = "Description of this response",
            headers = {"X-Custom", "Y-Custom"},
            cookies = {"token"},
            type = Destination.class,
            typeDescription = "Description of returned type in response"
    )
    public Response pathExampleAnnotation(@DocDescription("Parameter is not required")@DocIsRequired(false)@MatrixParam("matrixParam")String m) {
        return Response.status(Response.Status.OK).header("X-Custom", null).header("Y-Custom", null)
                .cookie(new NewCookie("token", null)).entity(new Destination()).build();
    }
}
