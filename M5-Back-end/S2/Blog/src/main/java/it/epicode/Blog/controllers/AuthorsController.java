package it.epicode.Blog.controllers;

import it.epicode.Blog.entities.Author;
import it.epicode.Blog.entities.Post;
import it.epicode.Blog.exceptions.BadRequestExc;
import it.epicode.Blog.services.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("/api/authors")
public class AuthorsController {

    private static final Logger log = LoggerFactory.getLogger(PostsController.class);
    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<Author> savePost(@RequestBody @Validated Author author, BindingResult validator) {

        if(validator.hasErrors()) {

        throw new BadRequestExc(validator.getAllErrors());
        }
        var u = authorService.saveAuthor(author);

        return new ResponseEntity<Author>(u, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<Page<Author>> getAllAuthors(Pageable p) {

        return new ResponseEntity<Page<Author>>(authorService.getAuthorList(p), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Author> getPostById(@PathVariable Long id){
        Optional<Author> author = authorService.getAuthorById(id);
        return author.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Author> updatePost(@PathVariable Long id, @RequestBody Author author){

        Optional<Author> aut = authorService.updateAuthor(id, author);
        return aut.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Author> deletePost(@PathVariable Long id){

        Optional<Author> p= authorService.deleteAuthor(id);
        return p.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
