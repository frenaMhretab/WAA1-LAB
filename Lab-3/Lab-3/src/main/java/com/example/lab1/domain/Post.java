package com.example.lab1.domain;

import com.example.lab1.service.CommentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String content;
    String author;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post")
    List<Comment> comment;

}
