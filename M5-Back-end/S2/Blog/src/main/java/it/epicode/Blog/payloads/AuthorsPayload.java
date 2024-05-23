package it.epicode.Blog.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;
import java.util.Date;


public record AuthorsPayload(

        @NotNull(message = "Il nome non può essere omesso")
        @NotBlank(message = "Il campo non può essere vuoto o composto solo da spazi")
        String name,
        @NotNull(message = "Il cognome non può essere omesso")
        @NotBlank(message = "Il campo non può essere vuoto o composto solo da spazi")
        String surname,
        @NotNull(message = "L'email non può essere omessa")
        @NotBlank(message = "Il campo non può essere vuoto o composto solo da spazi")
        @Email(message = "Formato email non valido")
        String email,
        @NotNull(message = "La data di nascita non può essere omessa")
        Date birthdate,
        @URL(message = "Il campo deve essere un URL valido")
        String avatar
) {


}
