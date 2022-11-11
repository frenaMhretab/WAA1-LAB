package com.example.lab1.repo;

import com.example.lab1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("select u from User u where u.posts.size > :n ")
    public List<User> findAllByPostsGreaterThan(@Param("n") int n);

    @Query("select u from User u JOIN u.posts p where p.title = :title")
    public List<User> findUsersByPostTitle(@Param("title") String title);
}
