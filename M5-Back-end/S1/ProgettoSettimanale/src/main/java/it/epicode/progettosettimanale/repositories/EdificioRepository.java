package it.epicode.progettosettimanale.repositories;

import it.epicode.progettosettimanale.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificioRepository extends JpaRepository<Edificio,Long> {

    List<Edificio> findByCitta(String citta);

}
