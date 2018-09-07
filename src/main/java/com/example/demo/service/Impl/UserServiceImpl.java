package com.example.demo.service.Impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);/* pageNum 开始页数 pageSize 每页显示的数据条数*/
        return userMapper.getUser();
    }

    @Override
    public User findUser(User user)throws RuntimeException {
        try{
            if (user != null) {
                return userMapper.findUser(user);
            }
        }catch (RuntimeException e){
            System.out.println("没有参数");

        }
        return null;
    }

    @Override
    public void addUser(User user)throws RuntimeException {
        if(user.getUse_nam()==null||user.getUse_nam().length()<0){
           throw new RuntimeException("姓名不能为空");
        }else if(user.getUse_idc()==null||user.getUse_idc().length()<0){
           throw new RuntimeException("身份证不能为空");
        }else if(user.getUse_sex()==null||user.getUse_sex().length()<0){
            throw new RuntimeException("性别不能为空");
        }else{
            userMapper.addUser(user);
        }
    }

    @Override
    public void updUser(User user) {
        if(user.getUse_id()==null||user.getUse_id().length()<0){
            throw new RuntimeException("id不能为空");
        }if(user.getUse_nam()==null||user.getUse_nam().length()<0){
            throw new RuntimeException("姓名不能为空");
        }else if(user.getUse_idc()==null||user.getUse_idc().length()<0){
            throw new RuntimeException("身份证不能为空");
        }else if(user.getUse_sex()==null||user.getUse_sex().length()<0){
            throw new RuntimeException("性别不能为空");
        }else{
            userMapper.updUser(user);
        }
    }

    @Override
    public void delUser(Integer use_id) {
        userMapper.delUser(use_id);
    }


}
