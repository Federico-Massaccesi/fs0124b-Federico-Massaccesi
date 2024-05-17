package configuration;

import classes.Pizza;
import classes.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationProdotti {


    @Bean(name = "Mozzarella")
    Toppings Mozzarella(){
        return Toppings.builder()
                .withInfoNutrizionali(200)
                .withNome("Mozzarella")
                .withPrezzo(3)
                .build();
    }


//    @Bean(name = "Pizza Margherita")
//    Pizza PizzaMargherita(){
//        Pizza.builder()
//                .withPrezzo()                .
//
//    }
}
