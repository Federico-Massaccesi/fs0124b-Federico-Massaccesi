package it.epicode.ProgettoSettimanale.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Event extends EntityBase{

    private String titolo;

    private String descrizione;

    private String data;

    private String luogo;

    private Integer postiDisponibili;

    private Integer postiPrenotati;

    private boolean disponibilitàPrenotazione = true;

    private List<UserEntity> utentiPrenotati;
}
