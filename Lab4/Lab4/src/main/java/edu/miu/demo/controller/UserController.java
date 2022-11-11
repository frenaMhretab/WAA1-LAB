package edu.miu.demo.controller;

import edu.miu.demo.aspect.annotation.ExecutionTime;
import edu.miu.demo.aspect.annotation.Log;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import edu.miu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    @Log("Executing method 1")
    @ExecutionTime
    public List<User> getAll(){
        System.out.println("*** getAll() is called ***");
        return userService.findAll();
    }


    @GetMapping("/{id}")
    @Log("Executing method 2")
    @ExecutionTime
    public User getById(@PathVariable("id") long id){
        System.out.println("*** getById() is called ***");
        return userService.findById(id);
    }
    @PostMapping
    @Log("Executing method 3")
    @ExecutionTime
    public void create(@RequestBody User user){
        userService.save(user);
    }
    @GetMapping("/{id}/posts")
    public List<Post> getPosts(@PathVariable long id){
        return userService.findPosts(id);
    }
    @PostMapping("/{id}/posts")
    public void addPost(@PathVariable("id") long id, @RequestBody Post post){
        userService.addPost(id, post);
    }
    @GetMapping("/filter/{n}")
    public List<User> findUserByPostsGreaterThan(@PathVariable int n) {
        return userService.findUserByPostsGreaterThan(n);
    }

}
