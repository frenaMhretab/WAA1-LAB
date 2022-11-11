package edu.miu.cs545.lab5.lab5.service.impl;


import edu.miu.cs545.lab5.lab5.domain.Comment;
import edu.miu.cs545.lab5.lab5.repository.CommentRepo;
import edu.miu.cs545.lab5.lab5.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public void addComment(Comment comment) {
        commentRepo.save(comment);
    }

    @Override
    public List<Comment> getAll() {
        return commentRepo.findAll();
    }


}
