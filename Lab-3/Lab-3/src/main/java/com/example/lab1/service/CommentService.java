package com.example.lab1.service;

import com.example.lab1.domain.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> getComments();
    public void save(Comment c);

}
