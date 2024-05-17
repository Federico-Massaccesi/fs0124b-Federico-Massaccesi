package it.epicode.progettosettimanale.repositories;

import it.epicode.progettosettimanale.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente,Long> {
}
