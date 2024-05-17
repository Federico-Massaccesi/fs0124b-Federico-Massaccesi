package classes;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Bevande extends Prodotti{

    @Builder(setterPrefix = "with")

    public Bevande(Integer prezzo, Integer infoNutrizionali, String nome) {
        super(nome, infoNutrizionali,prezzo);

    }
}
