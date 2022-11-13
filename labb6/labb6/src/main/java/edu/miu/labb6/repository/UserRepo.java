package edu.miu.labb6.repository;




import edu.miu.labb6.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    List<User>findUserByPostsGreaterThan(long n);

// @Query( "select p from Product p where p.reviews.size >= :num" )
//    public List<Product> fiudProductWithReviews(int num);

    @Query("select u from User u where u.posts>:num")
    public List<User> getUserByPosts(@Param("num") int num);

//    @Query("select p from Post p where p.title = :title")
//    public List<User>getUserByPostsWithinTitle(String title);

    public User findByEmail(String user);

}
