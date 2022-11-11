package edu.miu.cs545.lab5.lab5.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "comments")


public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;






}
