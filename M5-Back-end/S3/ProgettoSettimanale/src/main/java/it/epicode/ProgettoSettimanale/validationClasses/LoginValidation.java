package it.epicode.ProgettoSettimanale.validationClasses;

import it.epicode.ProgettoSettimanale.entities.RoleEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record LoginValidation(

        @NotNull
        @NotBlank
        String password,
        @NotNull
        @NotBlank
        String username


) {
}
