package edu.miu.labb6.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;
   private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "users")
    private List<Post> posts;

    @ManyToMany(fetch = FetchType.EAGER)
    List<Role>roles;


}
