package com.example.lab1.service;

import com.example.lab1.domain.Post;
import com.example.lab1.domain.User;

import java.util.List;


public interface UserService {
    public List<User> findAll();

    User getById(long id);

    public void save(User u);

    public List<Post> findPosts(long id);

   // public List<User> findAllByPostsGreaterThan(int n);

    List<User> getUsersWithPosts(int n);

    List<User> findUsersByPostTitle(String title);
}
