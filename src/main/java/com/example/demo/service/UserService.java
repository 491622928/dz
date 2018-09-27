package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {


    List<User> getUser(Integer pageNum, Integer pageSize);

//    User findUser(User user)throws Exception;

    void addUser(User user);

    void updUser(User user);

    void delUser(Integer use_id);

//    User findUser(String use_use,String use_password)throws Exception;


}
