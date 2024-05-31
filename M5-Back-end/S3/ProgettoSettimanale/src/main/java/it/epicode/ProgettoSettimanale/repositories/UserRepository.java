package it.epicode.ProgettoSettimanale.repositories;

import it.epicode.ProgettoSettimanale.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
