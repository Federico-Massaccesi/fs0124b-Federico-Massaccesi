package it.epicode.Blog.services;

import it.epicode.Blog.entities.Author;
import it.epicode.Blog.entities.Post;
import it.epicode.Blog.repositories.AuthorRepository;
import it.epicode.Blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    public Author saveAuthor(Author author) {

        return authorRepository.save(author);
    }

    public List<Author> getAuthorList() {

        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Long id) {

        return authorRepository.findById(id);
    }

    public Optional<Author> updateAuthor(Long id,Author author) {

        Optional<Author> foundedAuthor = authorRepository.findById(id);

        if(foundedAuthor.isPresent()){

            var definedAuthor = foundedAuthor.get();

            if(author.getBirthdate()!= null){

                definedAuthor.setBirthdate(author.getBirthdate());
            }
            if(author.getPostList()!= null){

                definedAuthor.setPostList(author.getPostList());
            }
            if(author.getAvatar()!= null){

                definedAuthor.setAvatar(author.getAvatar());
            }
            if(author.getEmail()!= null){

                definedAuthor.setEmail(author.getEmail());
            }
            if(author.getName()!= null){

                definedAuthor.setName(author.getName());
            }
            if(author.getSurname()!= null){

                definedAuthor.setSurname(author.getSurname());
            }

            return Optional.of(authorRepository.save(definedAuthor));
        }else{
            return Optional.empty();
        }
    }

    public Optional<Author> deleteAuthor(Long id) {

        Optional<Author> foundedAuthor = authorRepository.findById(id);

        if(foundedAuthor.isPresent()){
            authorRepository.deleteById(id);
            return Optional.of(foundedAuthor.get());
        }else {
            return Optional.empty();
        }
    }
}
