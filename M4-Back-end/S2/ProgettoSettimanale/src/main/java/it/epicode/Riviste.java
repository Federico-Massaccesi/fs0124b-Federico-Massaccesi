package it.epicode;

public class Riviste extends Prodotti {

    private Periodicità periodicità;

    public Riviste(String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicità periodicità) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }
    @Override
    public String toString() {
        return "Rivista{"+
                "ISBN:"+ getNewISBN() +
                ",Titolo:" + getTitolo() +
                ",numeroPagine:" + getNumeroPagine() +
                ",annoPubblicazione:" + getAnnoPubblicazione() +
                ",periodicità:" + getPeriodicità() +
                '}';
    }
}
