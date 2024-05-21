package it.epicode.Blog.repositories;

import it.epicode.Blog.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
