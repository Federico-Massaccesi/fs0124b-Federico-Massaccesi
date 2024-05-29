package it.epicode.ProgettoSettimanale.exceptions;


import org.springframework.http.HttpStatus;

public class NoElementFoundExc extends  BaseExc{

    private String message;

    private HttpStatus status;

    public NoElementFoundExc(String message, HttpStatus status){
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
