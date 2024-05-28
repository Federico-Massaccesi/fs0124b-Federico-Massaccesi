package it.epicode.ProgettoSettimanale.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidDataProvided extends APIError {

    private String message;

    private HttpStatus status = HttpStatus.BAD_REQUEST;

    public InvalidDataProvided(String message) {
        super(message);

    }
}
