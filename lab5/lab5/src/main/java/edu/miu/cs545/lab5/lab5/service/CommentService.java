package edu.miu.cs545.lab5.lab5.service;





import edu.miu.cs545.lab5.lab5.domain.Comment;

import java.util.List;

public interface CommentService {

    void addComment(Comment comment);
     List<Comment> getAll();


}
