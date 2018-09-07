package com.example.demo.mapper;

import com.example.demo.model.User;


import java.util.List;


public interface UserMapper {


    List<User> getUser();

    User findUser(User user);

    void addUser(User user);

    void updUser(User user);

    void delUser(Integer use_id);


}
