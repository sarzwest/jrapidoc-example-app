package org.jrapidoc.example.service;

import org.jrapidoc.example.entity.Destination;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by papa on 14.3.15.
 */
@WebService
public class MessageRPCStyle {

    @WebMethod
    @SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
    public Destination rpc(Destination rpc, String s){
        return new Destination();
    }
}
