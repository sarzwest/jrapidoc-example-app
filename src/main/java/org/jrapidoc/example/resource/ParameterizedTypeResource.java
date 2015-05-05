package org.jrapidoc.example.resource;

import org.jrapidoc.example.entity.Destination;
import org.jrapidoc.example.entity.DestinationEntity;
import org.jrapidoc.example.entity.Wrapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
import java.util.Map;

/**
 * Created by papa on 25.4.15.
 */
@Path("parameterized/type/examples")
public class ParameterizedTypeResource {

    @GET
    @Path("foo1")
    public void foo1 (List<String> l){

    }

    @GET
    @Path("foo2")
    public List<String> foo2 (){
        return null;
    }

    @GET
    @Path("foo3")
    public void foo3 (Map<String, String> m){

    }

    @GET
    @Path("foo4")
    public Map<String, String> foo4 (){
        return null;
    }

    @GET
    @Path("foo5")
    public void foo5 (Wrapper<DestinationEntity> d){
    }

    @GET
    @Path("foo6")
    public Wrapper<DestinationEntity> foo6 (){
        return null;
    }

    @GET
    @Path("foo7")
    public <T extends DestinationEntity> void foo7 (T t){
    }

    @GET
    @Path("foo8")
    public <T extends Destination> T foo8 (){
        return null;
    }

    @GET
    @Path("foo9")
    public <T extends DestinationEntity> void foo9 (List<T> t){
    }

    @GET
    @Path("foo10")
    public <T extends DestinationEntity> List<T> foo10 (){
        return null;
    }

    @GET
    @Path("foo11")
    public <T extends List<DestinationEntity>> void foo11 (T l){
    }

    @GET
    @Path("foo12")
    public <T extends List<DestinationEntity>> T foo12 (){
        return null;
    }

    @GET
    @Path("foo13")
    public <T> void foo13 (T t){
    }

    @GET
    @Path("foo14")
    public <T> T foo14 (){
        return null;
    }

}
