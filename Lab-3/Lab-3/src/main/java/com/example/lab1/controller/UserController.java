package com.example.lab1.controller;

import com.example.lab1.domain.Post;
import com.example.lab1.domain.User;
import com.example.lab1.service.PostService;
import com.example.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Autowired
    UserService commentService;

    @GetMapping
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping
    public void create(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post> getPosts(@PathVariable long id){
        return userService.findPosts(id);
    }

    @GetMapping("/filter/{n}")
    public List<User> getUsersWithPosts(@PathVariable int n) {
        return userService.getUsersWithPosts(n);
    }

    @GetMapping("/filter/post/{title}")
    public List<User> getUsersWithPosts(@PathVariable String title) {
        return userService.findUsersByPostTitle(title);
    }
}
