package it.epicode.progettosettimanale.repositories;

import it.epicode.progettosettimanale.entities.Postazione;
import it.epicode.progettosettimanale.entities.Prenotazione;
import it.epicode.progettosettimanale.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    public default void avviaPrenotazione(Postazione postazione, Utente utente, Date prenotazione){

//        List<Date> datePostazione = new ArrayList<Date>();
//
//        datePostazione.addAll(postazione
//                .getPrenotazioni()
//                .stream().forEach(p -> log.p.getDataPrenotazione()););



    }
}
