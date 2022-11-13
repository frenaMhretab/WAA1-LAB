package edu.miu.labb6.controller;




import edu.miu.labb6.domain.Post;
import edu.miu.labb6.domain.User;
import edu.miu.labb6.service.PostService;
import edu.miu.labb6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    PostService postService;

    @GetMapping
//    @LogMe
//    @ExecutionTIme
    public List<User> displayUsers(){
        System.out.println("getAll() is printed");
    return    userService.getAllUsers();
    }

    @GetMapping("/{id}")

    public User displayById(@PathVariable("id") long id){
        System.out.println("getById() is printed");
        return userService.getById(id);
    }

    @PostMapping("/save")

    public void save(@RequestBody User user){

        userService.saveUser(user);
    }
  @GetMapping("/{id}/posts")
    public List<Post> getPostsByUserId(@PathVariable("id") long id){
        return userService.getUsersPosts(id);
  }

  @GetMapping("/filter/posts/{n}")
    public List<User> getByNumOfPosts(@PathVariable("n") int n){
        return userService.getUserByPosts(n);
  }
 @GetMapping("/filter/{title}")
 public List<Post> getAllByTitle(@PathVariable("title") String title){
        return postService.getAllByTitle(title);
 }
}
