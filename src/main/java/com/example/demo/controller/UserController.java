package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/getUser")
    public Result<User> getUser(Integer pageNum, Integer pageSize){
        return ResultUtil.success(userService.getUser(pageNum,pageSize));
    }

    @PostMapping(value = "/findUser")
    public Result<User> findUser(User user)throws Exception{
        return ResultUtil.success(userService.findUser(user));
    }

    @PostMapping(value ="/addUser")
    public Result<User> addUser(User user)throws RuntimeException{
        userService.addUser(user);
        return ResultUtil.success(null);
    }

    @PostMapping(value = "/updUser")
    public  Result<User>  updUser(User user)throws RuntimeException{
        userService.updUser(user);
        return ResultUtil.success(null);
    }

    @PostMapping(value = "/delUser")
    public  Result<User> delUser(Integer use_id){
        userService.delUser(use_id);
        return ResultUtil.success(null);
    }

    @PostMapping(value = "login")
    public Result<User> login(String use_use, String use_password)throws Exception {
        return ResultUtil.success(userService.findUser(use_use,use_password));

    }

}
