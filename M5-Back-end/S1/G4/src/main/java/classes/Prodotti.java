package classes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Prodotti {

    private String nome;

    private Integer prezzo;

    private Integer infoNutrizionali;


}
