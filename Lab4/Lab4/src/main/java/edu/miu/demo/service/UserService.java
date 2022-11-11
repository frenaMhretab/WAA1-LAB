package edu.miu.demo.service;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(long id);
    public void save(User user);
    public List<Post> findPosts(long id);
    public void addPost(long id, Post post);
    public List<User>findUserByPostsGreaterThan(int n);

}
