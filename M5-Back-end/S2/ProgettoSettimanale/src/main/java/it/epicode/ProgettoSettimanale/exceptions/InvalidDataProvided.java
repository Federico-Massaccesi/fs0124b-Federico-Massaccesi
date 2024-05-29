package it.epicode.ProgettoSettimanale.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidDataProvided extends BaseExc {

    private String message;

    private HttpStatus status;

    public InvalidDataProvided(String message, HttpStatus status){
        super(message);
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
