package it.epicode.Blog.controllers;

import it.epicode.Blog.entities.Post;
import it.epicode.Blog.exceptions.BadRequestExc;
import it.epicode.Blog.services.PostService;
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
@RequestMapping("/api/posts")
public class PostsController {

    private static final Logger log = LoggerFactory.getLogger(PostsController.class);
    @Autowired
    private PostService postsService;

    @PostMapping
    public ResponseEntity<Post> savePost(@RequestBody @Validated Post post, BindingResult validator) {

        if(validator.hasErrors()) {
            throw new BadRequestExc(validator.getAllErrors());
        }

        var u = postsService.savePost(post);

            return new ResponseEntity<Post>(u, HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<Page<Post>> getAllAuthors(Pageable p) {

        return new ResponseEntity<Page<Post>>(postsService.getPostList(p), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        Optional<Post> post = postsService.getPostById(id);
        return post.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post post){

        Optional<Post> p= postsService.updatePost(id, post);
        return p.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable Long id){

        Optional<Post> p= postsService.deletePost(id);
        return p.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
