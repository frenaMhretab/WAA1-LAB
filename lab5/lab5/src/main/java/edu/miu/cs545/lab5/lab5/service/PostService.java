package edu.miu.cs545.lab5.lab5.service;





import edu.miu.cs545.lab5.lab5.domain.Comment;
import edu.miu.cs545.lab5.lab5.domain.Post;

import java.util.List;

public interface PostService {
    List<Comment> getPostWithComments(long id);

    public List<Post> getAllByTitle(String title);
}
