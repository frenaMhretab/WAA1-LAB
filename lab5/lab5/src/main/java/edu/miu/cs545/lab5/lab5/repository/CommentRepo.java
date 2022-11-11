package edu.miu.cs545.lab5.lab5.repository;



import edu.miu.cs545.lab5.lab5.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {


}
