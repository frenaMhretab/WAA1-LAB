package edu.miu.labb6.service;






import edu.miu.labb6.domain.Comment;
import edu.miu.labb6.domain.Post;

import java.util.List;

public interface PostService {
    List<Comment> getPostWithComments(long id);

    public List<Post> getAllByTitle(String title);
}
