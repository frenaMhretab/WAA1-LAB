package miu.edu.lab2.repository;


import miu.edu.lab2.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post,Long> {

}
