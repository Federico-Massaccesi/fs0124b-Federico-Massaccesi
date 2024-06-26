package it.biblioteca.prodotti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("libri")
public class Libri extends Prodotti {

    private String autore;

    private String genere;


    public Libri() {
    }

    public Libri(String titolo, Integer numeroPagine, Integer annoPubblicazione, String autore, String genere) {
        super(titolo, numeroPagine, annoPubblicazione);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "ISBN=" + getISBN() +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", numeroPagine=" + getNumeroPagine() +
                " autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';


    }
}


