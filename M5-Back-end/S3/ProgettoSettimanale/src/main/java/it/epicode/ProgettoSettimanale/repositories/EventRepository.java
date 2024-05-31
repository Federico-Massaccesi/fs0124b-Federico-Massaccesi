package it.epicode.ProgettoSettimanale.repositories;

import it.epicode.ProgettoSettimanale.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
