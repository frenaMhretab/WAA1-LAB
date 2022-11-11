package edu.miu.demo.controller;

import edu.miu.demo.domain.Comment;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import edu.miu.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping
    public List<Post> getAll(){
        return postService.findAll();
    }
    @GetMapping("/{id}")
    public Post getById(@PathVariable("id") long id){
        return postService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody Post post){
        postService.save(post);
    }
    @PutMapping("/{id}")
    public void change( @PathVariable("id") long id,@RequestBody Post post){
        postService.update(id,post);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long id){
        postService.delete(id);
    }
    @GetMapping("/{id}/comments")
    public void addComment(@PathVariable("id") long id, @RequestBody Comment comment){
        postService.addComment(id, comment);
    }
    @GetMapping("/{title}")
    public List<Post> findPostByTitle(@PathVariable String title) {
        return postService.findPostByTitle(title);
    }
//    @GetMapping("/{title}/users")
//    public List<User> findUserByPostsTitle(@PathVariable String title) {
//        return postService.findUserByPostsTitle(title);
//    }
}
