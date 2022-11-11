package miu.edu.lab2.service;


import miu.edu.lab2.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    public List<Post> findAll();

    public Post getById(long id);

    public void save(Post p);
    public void delete(long id);
    public void update(long id,Post p);

}
