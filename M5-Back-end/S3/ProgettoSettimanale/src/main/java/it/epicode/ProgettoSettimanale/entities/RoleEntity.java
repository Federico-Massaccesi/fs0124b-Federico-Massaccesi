package it.epicode.ProgettoSettimanale.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true,onlyExplicitlyIncluded = true)
@Entity
@Table(name = "roles")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity extends EntityBase{

    private String name;

    @ManyToMany(mappedBy = "roles")
    private final List<UserEntity> users = new ArrayList<>();
}
