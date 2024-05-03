package it.epicode;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private String cognome;

    private String email;

    private Date data_di_nascita;

    private Sesso sesso;

    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazioni;

    public Persona(String nome, String cognome, Sesso sesso, Date data_di_nascita, String email, List<Partecipazione> listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.data_di_nascita = data_di_nascita;
        this.email = email;
        this.listaPartecipazioni = listaPartecipazioni;

    }

    public Persona() {
    }

    public long getId() {
        return id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(Date data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }
}
