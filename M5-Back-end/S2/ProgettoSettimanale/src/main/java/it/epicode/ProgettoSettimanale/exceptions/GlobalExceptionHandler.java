package it.epicode.ProgettoSettimanale.exceptions;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

@ExceptionHandler(NoElementFoundExc.class)
    public ResponseEntity<Object> handleNoElementFoundExc(NoElementFoundExc e) {

    APIError apierr = new APIError(e.getMessage(),e.getStatus());

        return buildResponseEntity(apierr);
    }

    @ExceptionHandler(InvalidDataProvided.class)
    public ResponseEntity<Object> handleInvalidDataProvided(InvalidDataProvided e) {
        APIError apierr = new APIError(e.getMessage(),e.getStatus());

        return buildResponseEntity(apierr);
    }

    private ResponseEntity<Object> buildResponseEntity(APIError apiError){

    return new ResponseEntity<>(apiError,apiError.getStatus());
    }
}
