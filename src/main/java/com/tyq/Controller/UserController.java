package com.tyq.Controller;


import com.tyq.Entity.User;
import com.tyq.service.imp.UserServiceI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceI userServiceI;

    public UserController(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }

    @RequestMapping("/finAll")
    public List<User> findAll(){

      /*  System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);*/
        System.out.println(userServiceI.getById(1));

      return userServiceI.list();


    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
