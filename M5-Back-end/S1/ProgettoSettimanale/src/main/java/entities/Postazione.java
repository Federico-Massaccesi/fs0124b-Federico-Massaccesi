package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Postazione {

    @Id
    @GeneratedValue
    private Long id;

    private String descrizione;

    private TipoPostazione tipoPostazione;

    private Long capienzaMassima;

    private Edificio edificio;

    private Boolean disponibilita;

    private List<Date> datePrenotate;


    public void setDatePrenotate(Date data){

        this.datePrenotate.add(data);
    }
}
