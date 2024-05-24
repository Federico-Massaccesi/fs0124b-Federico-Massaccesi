package it.epicode.ProgettoSettimanale.repositories;

import it.epicode.ProgettoSettimanale.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DispositivoRepository extends JpaRepository<Dispositivo,Long>, PagingAndSortingRepository<Dispositivo,Long> {
}
