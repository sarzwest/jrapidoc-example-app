package org.jrapidoc.example.resource;

import org.jrapidoc.annotation.DocDescription;
import org.jrapidoc.annotation.rest.DocIsRequired;
import org.jrapidoc.annotation.rest.DocPathExample;
import org.jrapidoc.annotation.rest.DocReturn;
import org.jrapidoc.annotation.rest.DocReturns;
import org.jrapidoc.example.entity.Destination;
import org.jrapidoc.example.entity.DestinationEntity;
import org.jrapidoc.example.exception.CustomException;

import javax.ws.rs.*;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

/**
 * Created by papa on 3.5.15.
 */
@Path("annotations")
public class WithJRAPIDocAnnotationsResource {

    @HeaderParam("requiredHeader")
    @DocIsRequired
    @DocDescription("Parameter is required")
    String h;

    String q;
    String p;

    public WithJRAPIDocAnnotationsResource(@DocDescription("Parameter is required")@DocIsRequired@PathParam("pathParam") String p) {
        this.p = p;
    }

    @QueryParam("notRequiredQuery")
    @DocIsRequired(false)
    @DocDescription("Parameter is not required")
    public void setQ(String q) {
        this.q = q;
    }

    @PUT
    @Path("path/example/{id:.+}")
    @DocPathExample("path/example/5")
    @DocDescription("Description of method")
    @DocReturn(http = 200,
            description = "Description of this response",
            headers = {"X-Custom", "Y-Custom"},
            cookies = {"token"},
            type = Destination.class,
            typeDescription = "Description of returned type in response"
    )
    public Response pathExampleAnnotation(@DocDescription("Parameter is not required")@DocIsRequired(false)@MatrixParam("matrixParam")String m) {
        return Response.status(Response.Status.OK).header("X-Custom", "example").header("Y-Custom", "example")
                .cookie(new NewCookie("token", "example")).entity(new Destination()).build();
    }

    @PUT
    @Path("multiple/responses")
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
    public Response multipleResponses() throws CustomException {
        return null;
    }
}
