package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/getUser")
    public List<User> getUser(Integer pageNum,Integer pageSize)throws RuntimeException{
        return userService.getUser(pageNum,pageSize);
    }

    @PostMapping(value = "/findUser")
    public User findUser(User user){
        return userService.findUser(user);
    }

    @PostMapping(value ="/addUser")
    public void addUser(User user)throws RuntimeException{
        userService.addUser(user);
    }

    @PostMapping(value = "/updUser")
    public  void  updUser(User user)throws RuntimeException{
        userService.updUser(user);
    }

    @PostMapping(value = "/delUser")
    public  void delUser(Integer use_id){
        userService.delUser(use_id);
    }

    
}
