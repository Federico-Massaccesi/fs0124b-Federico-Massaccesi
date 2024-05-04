package it.biblioteca.prodotti;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "prodotti_generici")
@NamedQuery(name = "GET_BY_ISBN", query = "SELECT r FROM Prodotti r WHERE ISBN = :ISBN")
@NamedQuery(name = "GET_BY_AUTORE",query = "SELECT r FROM Prodotti r WHERE autore = :AUTORE")
@NamedQuery(name = "GET_BY_ANNO",query = "SELECT r FROM Prodotti r WHERE annopubblicazione = :ANNOPUBBLICAZIONE")
public abstract class Prodotti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ISBN;

    private String titolo;

    private Integer annoPubblicazione;

    private Integer numeroPagine;

    public Prodotti() {
    }

    public Prodotti(String titolo, Integer numeroPagine, Integer annoPubblicazione) {
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.annoPubblicazione = annoPubblicazione;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Prodotti{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
