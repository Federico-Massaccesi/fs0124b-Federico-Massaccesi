package it.epicode.Blog.payloads;

import it.epicode.Blog.entities.Post;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

import java.util.Date;
import java.util.List;

public record AuthorsPayload(

        @NotNull
        Long id,
        @NotNull
        @NotBlank
        @Size(min=2)
        @Size(max=25)
        String name,
        @NotNull
        @NotBlank
        @Size(min=2)
        @Size(max=25)
        String surname,
        @NotNull
        @NotBlank
        @Email
        String email,
        @NotNull
        Date birthdate,
        @NotNull
        @URL
        String avatar,

        @OneToMany(mappedBy = "author")
                List<Post> postList
) {


}
