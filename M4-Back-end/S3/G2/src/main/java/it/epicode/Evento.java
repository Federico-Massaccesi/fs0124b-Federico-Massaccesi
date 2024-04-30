package it.epicode;

import jakarta.persistence.*;

import java.util.Date;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data")
    private Date dataEvento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo_evento")
    private TipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti")
    private Integer numeroMassimoPartecipanti;

    public Evento(){

    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }

    public Evento(String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento, Integer numeroMassimoPartecipanti){


        this.titolo = titolo;

        this.dataEvento = dataEvento;

        this.descrizione = descrizione;

        this.tipoEvento = tipoEvento;

        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;


    }

    public Integer getId() {
        return id;
    }




    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Integer getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
