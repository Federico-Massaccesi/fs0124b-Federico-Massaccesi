package it.epicode.progettosettimanale.runners;


import it.epicode.progettosettimanale.entities.Edificio;
import it.epicode.progettosettimanale.entities.Postazione;
import it.epicode.progettosettimanale.entities.TipoPostazione;
import it.epicode.progettosettimanale.entities.Utente;
import it.epicode.progettosettimanale.repositories.PostazioneRepository;
import it.epicode.progettosettimanale.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import it.epicode.progettosettimanale.repositories.EdificioRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class AppRunner implements CommandLineRunner {

    @Autowired
    EdificioRepository edificioRepository;

    @Autowired
    PostazioneRepository postRepository;

    @Autowired
    UtenteRepository utenteRepository;

    @Autowired
    @Qualifier("posts")
    List<Postazione> posts;

    @Autowired
    @Qualifier("edifici")
    List<Edificio> edifici;

    @Autowired
    @Qualifier("utenti")
    List<Utente> utenti;


    @Override
    public void run(String... args) throws Exception {

    posts.forEach(post -> postRepository.save(post));

    utenti.forEach(utente -> utenteRepository.save(utente));

    edifici.forEach(edificio -> edificioRepository.save(edificio));

//        postRepository.findByTipoPostazione(TipoPostazione.PRIVATO).stream().
//                forEach(el -> log.debug(el.toString()));

    }
}
