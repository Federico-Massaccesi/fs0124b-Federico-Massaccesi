package it.epicode.Blog.services;

import it.epicode.Blog.entities.Post;
import it.epicode.Blog.repositories.PostRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post savePost(Post post) {

        return postRepository.save(post);
    }

    public List<Post> getPostList() {

        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {

        return postRepository.findById(id);
    }

    public Optional<Post> updatePost(Long id,Post post) {

        Optional<Post> foundedPost = postRepository.findById(id);

        if(foundedPost.isPresent()){

            var definedPost = foundedPost.get();

            if(post.getTitle()!= null){

                definedPost.setTitle(post.getTitle());
            }
            if(post.getCategory()!= null){

                definedPost.setCategory(post.getCategory());
            }
            if(post.getContent()!= null){

                definedPost.setContent(post.getContent());
            }
            if(post.getMinutesToRead()!= null){

                definedPost.setMinutesToRead(post.getMinutesToRead());
            }
            if(post.getCover()!= null){

                definedPost.setCover(post.getCover());
            }

            return Optional.of(postRepository.save(definedPost));
        }else{
            return Optional.empty();
        }
    }

    public Optional<Post> deletePost(Long id) {

        Optional<Post> foundedPost = postRepository.findById(id);

        if(foundedPost.isPresent()){
            postRepository.deleteById(id);
            return Optional.of(foundedPost.get());
        }else {
            return Optional.empty();
        }
    }

}
