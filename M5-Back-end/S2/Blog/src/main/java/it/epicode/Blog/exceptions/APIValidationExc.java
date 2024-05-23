package it.epicode.Blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class APIValidationExc extends RuntimeException{

    public final List<ObjectError> errors;

    public final HttpStatus status;

    public APIValidationExc(List<ObjectError> errors, HttpStatus status,String message) {
        super(message);
        this.errors = errors;
        this.status = status;
    }
    public APIValidationExc(List<ObjectError> errors){

        this(errors, HttpStatus.SERVICE_UNAVAILABLE,"Invalid");
    }
}
