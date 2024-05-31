package it.epicode.ProgettoSettimanale.mappers;

import it.epicode.ProgettoSettimanale.entities.UserEntity;
import it.epicode.ProgettoSettimanale.validationClasses.UserValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ValidatorToUserEntity {

    public UserEntity toUserEntity(UserValidation validator) {

       UserEntity user = UserEntity.builder()
               .withEmail(validator.email())
               .withPassword(validator.password())
               .withUsername(validator.username())
               .withRoles(validator.roles())
               .build();
       return user;

    }
}
