package it.epicode.Blog.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "authors")
@Builder(setterPrefix = "with")
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private String email;

    private Date birthdate;

    private String avatar;

    @OneToMany(mappedBy = "author")
    private List<Post> postList;


}
