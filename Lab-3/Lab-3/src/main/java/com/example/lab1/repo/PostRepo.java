package com.example.lab1.repo;

import com.example.lab1.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    @Query("select p from Post p where p.title = :title")
    public List<Post> findAllByTitle(@Param("title") String title);
}
