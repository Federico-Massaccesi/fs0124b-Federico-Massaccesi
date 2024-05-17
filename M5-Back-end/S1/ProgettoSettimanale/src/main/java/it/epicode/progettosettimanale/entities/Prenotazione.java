package it.epicode.progettosettimanale.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Prenotazione {

    @Id
    @GeneratedValue
    private Long id;

    private Date dataPrenotazione;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
}
