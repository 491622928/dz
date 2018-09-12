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
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "login")
    public Result<User> login(String use_use, String use_password)throws Exception {
        return ResultUtil.success(userService.findUser(use_use,use_password));

    }
}
