package it.epicode.Blog.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
@Builder(setterPrefix = "with")
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String category;

    private String title;

    private String cover;

    private String content;

    @Setter
    private Integer minutesToRead;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
