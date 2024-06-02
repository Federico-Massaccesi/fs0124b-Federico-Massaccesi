package it.epicode.ProgettoSettimanale.validationClasses;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record EventPostValidation(
        @NotNull
                @NotBlank
        String titolo,
        @NotNull
                @NotBlank
                @Length(max = 500, min = 100)
        String descrizione,
        @NotNull
        String data,
        @NotNull
                @NotBlank
        String luogo,
        @NotNull
                @NotBlank
        Integer postiDisponibili

) {
}
