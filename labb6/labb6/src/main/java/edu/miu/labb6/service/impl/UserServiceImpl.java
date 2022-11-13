package edu.miu.labb6.service.impl;




import edu.miu.labb6.domain.Post;
import edu.miu.labb6.domain.User;
import edu.miu.labb6.repository.UserRepo;
import edu.miu.labb6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);

    }

    @Override
    public List<Post> getUsersPosts(long id) {
        return userRepo.findById(id).get().getPosts();
    }

    @Override
    public List<User> getUserByPosts(int num) {
       var users = userRepo.findAll();
     return  users.stream().filter(u->u.getPosts().
             size()>num).collect(Collectors.toList());

    }


}
