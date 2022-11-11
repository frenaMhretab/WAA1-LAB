package miu.edu.lab2.controller;


import miu.edu.lab2.model.Post;
import miu.edu.lab2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getPosts() {
        return postService.findAll();
    }


    @GetMapping("/{id}")
    public Post getPostsById(@PathVariable("id") int id) {
        return postService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Post p) {

        postService.save(p);
    }
}
