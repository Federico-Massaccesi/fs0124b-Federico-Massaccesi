package it.epicode.progettosettimanale.repositories;

import it.epicode.progettosettimanale.entities.Postazione;
import it.epicode.progettosettimanale.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {


    List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione);
}
