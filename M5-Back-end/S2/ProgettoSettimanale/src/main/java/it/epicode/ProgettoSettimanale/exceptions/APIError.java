package it.epicode.ProgettoSettimanale.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
public class APIError extends RuntimeException{

    private HttpStatus status;

    public APIError(String message) {
        super(message);

    }
}
