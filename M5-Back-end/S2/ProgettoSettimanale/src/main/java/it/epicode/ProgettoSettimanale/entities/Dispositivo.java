package it.epicode.ProgettoSettimanale.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dispositivi")
@Builder(setterPrefix = "with")
public class Dispositivo {

    @Id
    @GeneratedValue
    private Long id;

    private Status status;

    private TipoDispositivo tipoDispositivo;

    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;

}
