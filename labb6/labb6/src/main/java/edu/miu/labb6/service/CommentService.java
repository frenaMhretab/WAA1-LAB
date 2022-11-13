package edu.miu.labb6.service;






import edu.miu.labb6.domain.Comment;

import java.util.List;

public interface CommentService {

    void addComment(Comment comment);
     List<Comment> getAll();


}
