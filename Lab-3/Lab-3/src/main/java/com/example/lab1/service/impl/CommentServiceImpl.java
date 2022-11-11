package com.example.lab1.service.impl;

import com.example.lab1.domain.Comment;
import com.example.lab1.repo.CommentRepo;
import com.example.lab1.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public List<Comment> getComments() {
        return (List<Comment>) commentRepo.findAll();
    }

    @Override
    public void save(Comment c) {
        commentRepo.save(c);
    }
}
