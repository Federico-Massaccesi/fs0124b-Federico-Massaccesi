package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Utente {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String nomeCompleto;

    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> listaPrenotazioni;
}
