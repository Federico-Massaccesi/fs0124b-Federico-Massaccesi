package it.epicode.progettosettimanale.configuration;

import it.epicode.progettosettimanale.entities.Edificio;
import it.epicode.progettosettimanale.entities.Postazione;
import it.epicode.progettosettimanale.entities.TipoPostazione;
import it.epicode.progettosettimanale.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeanConfig {

    @Bean(name = "edificio1")
    Edificio edificio1(){
        return Edificio.builder()
                .withIndirizzo("via vai")
                .withCitta("Pisa")
                .withNome("Star Hotel")
                .build();
    }

    @Bean(name = "edificio2")
    Edificio edificio2(){
        return Edificio.builder()
                .withIndirizzo("via roma")
                .withCitta("Roma")
                .withNome("Life Hotel")
                .build();
    }

    @Bean(name = "edificio3")
    Edificio edificio3(){
        return Edificio.builder()
                .withIndirizzo("via lucca")
                .withCitta("Lucca")
                .withNome("Beach Hotel")
                .build();
    }

    @Bean(name = "edifici")
    List<Edificio> edifici(){
        return Arrays.asList(edificio1(), edificio2(), edificio3());
    }

    @Bean(name = "post1")
    Postazione post1(){
        return Postazione.builder()
               .withDescrizione("Postazione 1")
               .withTipoPostazione(TipoPostazione.PRIVATO)
                .withDisponibilita(true)
                .withCapienzaMassima(2500L)
                .withEdificio(edificio3())
               .build();
    }
    @Bean(name = "post2")
    Postazione post2(){
        return Postazione.builder()
                .withDescrizione("Postazione 2")
                .withTipoPostazione(TipoPostazione.OPENSPACE)
                .withDisponibilita(false)
                .withCapienzaMassima(500L)
                .withEdificio(edificio1())
                .build();
    }

    @Bean(name = "post3")
    Postazione post3(){
        return Postazione.builder()
                .withDescrizione("Postazione 3")
                .withTipoPostazione(TipoPostazione.PRIVATO)
                .withDisponibilita(true)
                .withCapienzaMassima(500L)
                .withEdificio(edificio1())
                .build();
    }

    @Bean(name = "posts")
    List<Postazione> postazioni(){
        return Arrays.asList(post1(), post2(), post3());
    }

    @Bean(name = "utente1")
    Utente utente1(){
        return Utente.builder()
                .withEmail("fabio@io.it")
                .withUsername("Fabiox")
                .withNomeCompleto("Fabio Fabi")
                .build();
    }

    @Bean(name = "utente2")
    Utente utente2(){
        return Utente.builder()
                .withEmail("paolo@io.it")
                .withUsername("Paolox")
                .withNomeCompleto("Paolo Fabi")
                .build();
    }

    @Bean(name = "utente3")
    Utente utente3(){
        return Utente.builder()
                .withEmail("luigi@io.it")
                .withUsername("Luigix")
                .withNomeCompleto("Luigi Fabi")
                .build();
    }

    @Bean(name = "utenti")
    List<Utente> utenti(){
        return Arrays.asList(utente1(), utente2(), utente3());
    }
}
