package classes;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Pizza extends Prodotti{

    private List<Toppings> condimenti;
//            = new ArrayList<>(Arrays.asList(
//            Toppings.builder()
//                    .withNome("Pomodoro")
//                    .withPrezzo(3)
//                    .withInfoNutrizionali(120)
//                    .build(),
//            Toppings.builder()
//                    .withNome("Mozzarella")
//                    .withPrezzo(3)
//                    .withInfoNutrizionali(200)
//                    .build()
//    ));

    public Pizza(Integer prezzo, Integer infoNutrizionali, List<Toppings> condimenti,String nome) {
        super(nome, prezzo,infoNutrizionali);
        this.condimenti.addAll(condimenti);
    }

}
