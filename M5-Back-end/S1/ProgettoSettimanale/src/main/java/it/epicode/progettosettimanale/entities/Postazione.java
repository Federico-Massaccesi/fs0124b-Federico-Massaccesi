package it.epicode.progettosettimanale.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Postazione {

    @Id
    @GeneratedValue
    private Long id;

    private String descrizione;

    private TipoPostazione tipoPostazione;

    private Long capienzaMassima;

    @ManyToOne
    @JoinColumn(name="edificio_id")
    private Edificio edificio;

    private Boolean disponibilita;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;


    public void setDatePrenotate(Prenotazione prenotazione){

        this.prenotazioni.add(prenotazione);
    }
}
