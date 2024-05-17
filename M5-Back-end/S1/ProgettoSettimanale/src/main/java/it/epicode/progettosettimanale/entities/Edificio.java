package it.epicode.progettosettimanale.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "edifici")
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Edificio {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nome;
    @Column
    private String indirizzo;
    @Column
    private String citta;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;
}
