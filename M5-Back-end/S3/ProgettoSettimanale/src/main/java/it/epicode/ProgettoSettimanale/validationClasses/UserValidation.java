package it.epicode.ProgettoSettimanale.validationClasses;

import it.epicode.ProgettoSettimanale.entities.RoleEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public record UserValidation(
        @NotNull
                @Email
         String email,
        @NotNull
        @NotBlank
         String password,
        @NotNull
        @NotBlank
         String username,
@NotNull
List<RoleEntity> roles
) {}
