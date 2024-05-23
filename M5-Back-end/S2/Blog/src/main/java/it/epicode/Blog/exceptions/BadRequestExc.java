package it.epicode.Blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class BadRequestExc extends APIValidationExc{

    public BadRequestExc(List<ObjectError> errors) {
        super(errors, HttpStatus.BAD_REQUEST,"Bad Request");
    }
}
