package it.epicode.ProgettoSettimanale.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dipendenti")
@Builder(setterPrefix = "with")
public class Dipendente {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String cognome;

    private String username;

    private String email;

    @OneToMany(mappedBy = "dipendente")
    private List<Dispositivo> dispositivi;
}
