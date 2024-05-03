package it.biblioteca.data;

import it.biblioteca.prodotti.Prodotti;

import java.sql.Date;

public class Prestito {

    private Utente utente;

    private Prodotti elementoPrestato;

    private Date inizioPrestito;

    private Date restituzionePrevista;

    private Date dataRestituzione;

    public Prestito(Utente utente, Prodotti elementoPrestato, Date inizioPrestito, Date restituzionePrevista, Date dataRestituzione) {
        this.utente = utente;
        this.elementoPrestato = elementoPrestato;
        this.inizioPrestito = inizioPrestito;
        this.restituzionePrevista = restituzionePrevista;
        this.dataRestituzione = dataRestituzione;
    }

    public Prestito() {
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Prodotti getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(Prodotti elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public Date getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(Date inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public Date getRestituzionePrevista() {
        return restituzionePrevista;
    }

    public void setRestituzionePrevista(Date restituzionePrevista) {
        this.restituzionePrevista = restituzionePrevista;
    }

    public Date getDataRestituzione() {
        return dataRestituzione;
    }

    public void setDataRestituzione(Date dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", elementoPrestato=" + elementoPrestato +
                ", inizioPrestito=" + inizioPrestito +
                ", restituzionePrevista=" + restituzionePrevista +
                ", dataRestituzione=" + dataRestituzione +
                '}';
    }
}
