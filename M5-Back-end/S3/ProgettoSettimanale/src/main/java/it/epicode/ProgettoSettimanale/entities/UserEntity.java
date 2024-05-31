package it.epicode.ProgettoSettimanale.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class UserEntity extends EntityBase{

    private String email;

    private String password;

    private String username;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<RoleEntity> roles = new ArrayList<>();
}
