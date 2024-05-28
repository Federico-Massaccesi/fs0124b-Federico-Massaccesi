package it.epicode.ProgettoSettimanale.records;

import it.epicode.ProgettoSettimanale.entities.Dispositivo;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DipendenteValidation(

        @NotNull(message="Campo obbligatorio")
                @NotBlank(message = "Il campo non può essere composto solo da spazi")
         String nome,
         @NotNull(message="Campo obbligatorio")
         @NotBlank(message = "Il campo non può essere composto solo da spazi")
         String cognome,
         @NotNull(message="Campo obbligatorio")
         @NotBlank(message = "Il campo non può essere composto solo da spazi")
         String username,
        @NotNull(message="Campo obbligatorio")
                @Email(message = "Formato email non valido")
         String email,
        List<Dispositivo> dispositivi
) {
}
