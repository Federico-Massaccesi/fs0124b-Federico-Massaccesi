package it.epicode.ProgettoSettimanale.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@AllArgsConstructor
public class APIError{

    private String message;
    private HttpStatus status;

}
