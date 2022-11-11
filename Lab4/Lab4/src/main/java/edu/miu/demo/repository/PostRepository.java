package edu.miu.demo.repository;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  PostRepository extends JpaRepository<Post,Long> {
    @Query("select p from Post p where p.title = :title")
    public List<Post> findPostByTitle(@Param("title") String title);
//    @Query("select u from User u join u.posts p where p.title= :title")
//    public List<User> findUserByPostsTitle(@Param("title") String title);
}
