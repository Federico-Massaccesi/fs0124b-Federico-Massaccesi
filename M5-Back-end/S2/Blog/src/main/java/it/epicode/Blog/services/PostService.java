package it.epicode.Blog.services;

import it.epicode.Blog.entities.Post;
import it.epicode.Blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Optional<Post> savePost(Post post) {

        return Optional.of(postRepository.save(post));
    }

    public List<Post> getPostList() {

        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {

        return postRepository.findById(id);
    }
}
