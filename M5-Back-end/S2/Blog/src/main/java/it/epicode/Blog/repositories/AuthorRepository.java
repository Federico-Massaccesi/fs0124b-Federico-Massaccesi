package it.epicode.Blog.repositories;

import it.epicode.Blog.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorRepository extends JpaRepository<Author,Long>, PagingAndSortingRepository<Author,Long> {


}
