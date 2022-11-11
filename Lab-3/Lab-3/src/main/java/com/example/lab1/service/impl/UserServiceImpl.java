package com.example.lab1.service.impl;

import com.example.lab1.domain.Post;
import com.example.lab1.domain.User;
import com.example.lab1.repo.PostRepo;
import com.example.lab1.repo.UserRepo;
import com.example.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }


    @Override
    public User getById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void save(User u) {
        userRepo.save(u);
    }

    @Override
    public List<Post> findPosts(long id) {
        User user = userRepo.findById(id).orElse(null);
        return user.getPosts();
    }

    @Override
    public List<User> getUsersWithPosts(int n) {
        var users = userRepo.findAll();
        return users.stream().filter(u -> u.getPosts().size() >n).collect(Collectors.toList());
    }

    @Override
    public List<User> findUsersByPostTitle(String title) {
        return null;
    }

//    @Override
//    public List<User> findUsersByPostTitle(String title {
//
//        var users = userRepo.findAll();
//        return users.stream().filter(u -> u.getPosts().stream()
//                .collect(Collectors.toList());
//    }

}
