package edu.miu.demo.service;
import edu.miu.demo.domain.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> findAll();
    public Comment findById(long id);
    public void save(Comment com);

}
