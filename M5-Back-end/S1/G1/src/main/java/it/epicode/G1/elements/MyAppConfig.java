package it.epicode.G1.elements;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean(name = "pizza1")
    Pizza getPizza(){

        return new Pizza();
    }


}
