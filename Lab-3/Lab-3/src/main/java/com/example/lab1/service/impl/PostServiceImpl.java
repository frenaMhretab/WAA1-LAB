package com.example.lab1.service.impl;

import com.example.lab1.domain.Post;
import com.example.lab1.repo.PostRepo;
import com.example.lab1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    private final PostRepo postRepo;

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

    @Override
    public List<Post> findAllByTitle(String title) {
        var posts = postRepo.findAll();
        return posts.stream().filter(p -> p.getTitle().equals(title)).collect(Collectors.toList());
    }
}
