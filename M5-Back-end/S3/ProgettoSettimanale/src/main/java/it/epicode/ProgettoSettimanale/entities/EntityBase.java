package it.epicode.ProgettoSettimanale.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class EntityBase {

    @Id
    @GeneratedValue
    private Long id;
}
