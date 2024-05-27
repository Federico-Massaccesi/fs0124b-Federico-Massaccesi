package it.epicode.ProgettoSettimanale.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class NoElementFoundExc extends  RuntimeException{

public final Long noFoundId;


    public NoElementFoundExc(Long noFoundId,String message) {
        super(message);
        this.noFoundId = noFoundId;
    }

    @ExceptionHandler(NoElementFoundExc.class)
    protected ResponseEntity<?> handleApplicationException(NoElementFoundExc e){
    }
}
