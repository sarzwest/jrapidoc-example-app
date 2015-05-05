package org.jrapidoc.example.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.jrapidoc.example.entity.ExceptionEntity;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * Created by papa on 3.5.15.
 */
@JsonIgnoreProperties({"cause", "stackTrace", "suppressed", "localizedMessage", "response"})
public class CustomException extends WebApplicationException {

    private ExceptionEntity exceptionEntity;

    public ExceptionEntity getExceptionEntity() {
        return exceptionEntity;
    }

    public void setExceptionEntity(ExceptionEntity exceptionEntity) {
        this.exceptionEntity = exceptionEntity;
    }
}
