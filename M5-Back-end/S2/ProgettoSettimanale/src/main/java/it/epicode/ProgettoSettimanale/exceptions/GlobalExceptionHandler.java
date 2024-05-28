package it.epicode.ProgettoSettimanale.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(NoElementFoundExc.class)
    public ResponseEntity<Object> handleNoElementFoundExc(NoElementFoundExc e) {
        return new ResponseEntity<>(e,e.getStatus());
    }

    @ExceptionHandler(InvalidDataProvided.class)
    public ResponseEntity<Map<String,String>> handleInvalidDataProvided(InvalidDataProvided e) {
        Map<String, String> error = new HashMap<>();
        error.put("message", e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<Object> buildResponseEntity(APIError apiError){

    return new ResponseEntity<>(apiError,apiError.getStatus());
    }
}
