package it.epicode.ProgettoSettimanale.exceptions;


import org.springframework.http.HttpStatus;

public class NoElementFoundExc extends  APIError{

    private String message;

    private HttpStatus status = HttpStatus.NOT_FOUND;

    public NoElementFoundExc(String message){
        super(message);

    }
}
