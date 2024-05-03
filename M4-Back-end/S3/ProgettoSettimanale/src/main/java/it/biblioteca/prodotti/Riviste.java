package it.biblioteca.prodotti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("riviste")
public class Riviste extends Prodotti {

    private Periodicita periodicita;

    public Riviste(String titolo, Integer numeroPagine, Integer annoPubblicazione, Periodicita periodicita) {
        super(titolo, numeroPagine, annoPubblicazione);
        this.periodicita = periodicita;
    }

    public Riviste() {
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
}
