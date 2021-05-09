package com.example.demo.user;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author Sun_yk
 * @create 2021-03-13 14:21
 */
//@CrossOrigin//没用到
@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    @GetMapping("/findAll")//查
    public List<User> getList() {
        System.out.println("前端访问了后台");
        return userRepository.findAll();

    }
    @PostMapping("/save")//改和增
    public User addUser(@RequestBody User user) {
        System.out.println("前端");
        return userRepository.save(user);
    }
    @DeleteMapping(value = "/{uid}")//删
    public void delUser(@PathVariable("uid") Integer uid
    ) {
        userRepository.deleteById(uid);
    }
}
