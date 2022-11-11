package edu.miu.demo.service;

import edu.miu.demo.domain.Comment;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post findById(long id);
    public void save(Post post);
    public void delete(long id);
    public void update(long id,Post post);
    public void addComment(long id, Comment comment);
    public List<Post> findPostByTitle(String title);
    //public List<User> findUserByPostsTitle(String title);
}
