package it.epicode.Blog.payloads;

import it.epicode.Blog.entities.Author;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public record PostsPayload(
        @NotNull
         Long id,
        @NotNull
        @NotBlank
         String category,
        @NotNull
        @NotBlank
         String title,
                @URL
         String cover,
        @NotNull
                @NotBlank
         String content,
        @NotNull
                @Size(min=1,message = "I minuti non possono essere 0")
         Integer minutesToRead,

        @NotNull
         Author author
) {
}
