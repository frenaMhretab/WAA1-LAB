package miu.edu.lab2.service;


import miu.edu.lab2.model.Post;
import miu.edu.lab2.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostRepo postRepo;


    @Override
    public List<Post> findAll() {
        return (List<Post>) postRepo.findAll();
    }


    @Override
    public Post getById(long id) {
        return postRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Post p) {
        postRepo.save(p);

    }

    @Override
    public void delete(long id) {
        postRepo.deleteById(id);

    }

    @Override
    public void update(long id, Post p) {
        Post post = postRepo.findById(id).orElse(null);
        post.setAuthor(p.getAuthor());
        post.setTitle(p.getTitle());
        post.setContent(p.getContent());
        postRepo.save(post);

    }

}
