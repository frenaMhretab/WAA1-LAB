package miu.edu.lab2.service;

import miu.edu.lab2.model.Post;
import miu.edu.lab2.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> findAll();

    public User getById(long id);

    public void save(User u);

    public List<Post> findPosts(long id);

}
