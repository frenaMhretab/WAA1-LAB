package edu.miu.demo.service.impl;

import edu.miu.demo.domain.Comment;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import edu.miu.demo.repository.PostRepository;
import edu.miu.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Transactional
public class PostServiceImpl implements PostService {
        @Autowired
        private PostRepository postRepository;
         @Override
        public List<Post> findAll() {
             return postRepository.findAll();
        }
        @Override
        public Post findById(long id) {
          return  postRepository.findById(id).get();
        }

        @Override
        public void save(Post post) {
            postRepository.save(post);
        }

        @Override
        public void delete(long id) {
            postRepository.deleteById(id);
        }

        @Override
        public void update(long id, Post post) {
              Post pos =  postRepository.findById(id).get();
              pos.setAuthor(post.getAuthor());
              pos.setTitle(post.getTitle());
              pos.setContent(post.getContent());
              postRepository.save(pos);
        }

    @Override
    public void addComment(long id, Comment comment){
        postRepository.findById(id).get().getComments().add(comment);
        postRepository.save(postRepository.findById(id).get());
    }

    @Override
    public List<Post> findPostByTitle(String title) {
        var posts = postRepository.findAll();
       return posts.stream().filter(p -> p.getTitle().equals(title))
                .collect(Collectors.toList());
    }
//    @Override
//    public List<User> findUserByPostsTitle(String title) {
//
//        var posts = postRepository.findAll();
//        return posts.stream().filter(post -> post.getTitle().equals(title)).map(post -> post.getUser())
//                .collect(Collectors.toList());
//    }
}
