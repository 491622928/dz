package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {


    List<User> getUser(int pageNum, int pageSize);

    User findUser(User user)throws Exception;

    void addUser(User user);

    void updUser(User user);

    void delUser(Integer use_id);


}
