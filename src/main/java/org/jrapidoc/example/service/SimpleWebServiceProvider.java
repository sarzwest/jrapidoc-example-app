package org.jrapidoc.example.service;

import org.jrapidoc.example.entity.Destination;
import org.jrapidoc.example.exception.AirserviceException;
import org.jrapidoc.example.exception.AirserviceFault;
import org.projectodd.jrapidoc.annotation.DocDescription;
import org.projectodd.jrapidoc.annotation.soap.DocReturn;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

/**
* Created by papa on 15.7.15.
*/
@WebServiceProvider
@ServiceMode(value= Service.Mode.MESSAGE)
public class SimpleWebServiceProvider implements Provider<SOAPMessage> {

    @Override
    @DocDescription("Operation description")
    @DocReturn(type = Destination.class, description = "Some description", typeDescription = "Destination object description")
    public SOAPMessage invoke(SOAPMessage request){//todo should overwrite type via custom annotation? Can be more than one type of request be specified?
        System.out.println(request);
        return request;
    }
}
