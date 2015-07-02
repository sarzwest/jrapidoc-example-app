package org.jrapidoc.example.resource;

import org.projectodd.jrapidoc.annotation.rest.DocPathExample;
import org.jrapidoc.example.bean.FromStringBean;
import org.jrapidoc.example.bean.FromStringConstructorBean;
import org.jrapidoc.example.bean.ParamConverBean;
import org.jrapidoc.example.bean.ValueOfBean;
import org.jrapidoc.example.entity.Destination;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by papa on 3.5.15.
 */
@Path("more/advanced")
public class MoreAdvancedResource {

    @MatrixParam("matrixparam")
    List<String> matrixParam;

    private String headerFromSetter;


    @HeaderParam("headerFromSetterMethod")
    public void setHeaderFromSetter(String headerFromSetter) {
        this.headerFromSetter = headerFromSetter;
    }

    public MoreAdvancedResource(@QueryParam("queryparam")boolean b,
                                @QueryParam("fromStringMethod")FromStringBean fsb,
                                @CookieParam("fromParamConverter")ParamConverBean pcb){
    }

    @DELETE
    public void bean(@FormParam("fromConstructor")FromStringConstructorBean fscb,
                     @FormParam("fromValueOfMethod")ValueOfBean vob){
    }

    @GET
    @POST
    @PUT
    @Path("more/designators/{id:.+}")
    @DocPathExample("more/designators/5")
    public Destination moreHttpDesignatorsOnMethod(){
        return null;
    }

}
