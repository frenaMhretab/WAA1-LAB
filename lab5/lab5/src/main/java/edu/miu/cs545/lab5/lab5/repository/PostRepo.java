package edu.miu.cs545.lab5.lab5.repository;





import edu.miu.cs545.lab5.lab5.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {

    @Query("select p from Post p where p.title = :title ")
    public List<Post> getAllByTitle( @Param("title") String title);
}
