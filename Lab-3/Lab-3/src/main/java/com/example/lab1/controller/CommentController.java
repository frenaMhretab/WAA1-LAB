package com.example.lab1.controller;

import com.example.lab1.domain.Comment;
import com.example.lab1.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired

    CommentService commentService;

    @GetMapping
    public List<Comment> getComments() {
       return commentService.getComments();
    }

    @PostMapping
    public void addComment(@RequestBody Comment c) {
        commentService.save(c);
    }
}
