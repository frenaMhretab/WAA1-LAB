package com.example.lab1.service;

import com.example.lab1.domain.Post;
import java.util.List;

public interface PostService {

    public List<Post> findAll();

    public Post getById(long id);

    public void save(Post p);
    public void delete(long id);
    public void update(long id,Post p);

    public List<Post> findAllByTitle(String title);

}
