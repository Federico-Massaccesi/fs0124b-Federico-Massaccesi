package it.epicode.ProgettoSettimanale.repositories;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DipendenteRepository extends JpaRepository<Dipendente,Long>, PagingAndSortingRepository<Dipendente,Long> {
}
