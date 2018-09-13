package com.example.demo.service.Impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.ExceptionUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);/* pageNum 开始页数 pageSize 每页显示的数据条数*/
        return userMapper.getUser();
    }

    @Override
    public User findUser(User user)throws Exception {
        /*判断类属性全为空*/
        Class stuCla = (Class) user.getClass();// 得到类对象
        Field[] fs = stuCla.getDeclaredFields();//得到属性集合
        boolean flag = true;
        for (Field f : fs) {//遍历属性
            f.setAccessible(true); // 设置属性是可以访问的(私有的也可以)
            Object val = f.get(user);// 得到此属性的值
            if(val!=null) {//只要有1个属性不为空,那么就不是所有的属性值都为空
                flag = false;
                break;
            }
        }
        if (flag==true) {
            System.out.println(1);
            throw new ExceptionUtil(000,"没有参数");
        }else{
            return userMapper.findUser(user);
        }
    }

    @Override
    public void addUser(User user)throws RuntimeException {
        if(user.getUse_nam()==null||user.getUse_nam().length()<0){
           throw new ExceptionUtil(101,"姓名不能为空");
        }else if(user.getUse_idc()==null||user.getUse_idc().length()<0){
           throw new ExceptionUtil(102,"身份证不能为空");
        }else if(user.getUse_sex()==null||user.getUse_sex().length()<0){
            throw new ExceptionUtil(103,"性别不能为空");
        }else if(user.getUse_age()==null||user.getUse_age().equals("")){
            throw new ExceptionUtil(104,"年龄不能为空");
        }else if(user.getUse_tel()==null||user.getUse_tel().length()<0){
            throw new ExceptionUtil(105,"电话不能为空");
        }else if(user.getUse_use()==null||user.getUse_use().length()<0){
            throw new ExceptionUtil(106,"账号不能为空");
        }else if(user.getUse_password()==null||user.getUse_password().length()<0){
            throw new ExceptionUtil(107,"密码不能为空");
        }else{
            user.setUse_cre_tim(new Date());
            userMapper.addUser(user);
        }
    }

    @Override
    public void updUser(User user) {
        if(user.getUse_id()==null||user.getUse_id().equals("")){
            throw new ExceptionUtil(100,"id不能为空");
        }if(user.getUse_nam()==null||user.getUse_nam().length()<0){
            throw new ExceptionUtil(101,"姓名不能为空");
        }else if(user.getUse_idc()==null||user.getUse_idc().length()<0){
            throw new ExceptionUtil(102,"身份证不能为空");
        }else if(user.getUse_sex()==null||user.getUse_sex().length()<0){
            throw new ExceptionUtil(103,"性别不能为空");
        }else if(user.getUse_age()==null||user.getUse_age().equals("")){
            throw new ExceptionUtil(104,"年龄不能为空");
        }else if(user.getUse_tel()==null||user.getUse_tel().length()<0){
            throw new ExceptionUtil(105,"电话不能为空");
        }else if(user.getUse_use()==null||user.getUse_use().length()<0){
            throw new ExceptionUtil(106,"账号不能为空");
        }else if(user.getUse_password()==null||user.getUse_password().length()<0){
            throw new ExceptionUtil(107,"密码不能为空");
        }else{
            user.setUse_upd_tim(new Date());
            userMapper.updUser(user);
        }
    }

    @Override
    public void delUser(Integer use_id) {
        if (use_id==null||use_id.equals("")){
            throw new ExceptionUtil(100,"id不能为空");
        }else{
            userMapper.delUser(use_id);
        }
    }

    @Override
    public User findUser(String use_use, String use_password) throws Exception {
        if(use_use==null||use_use.isEmpty()){
            throw new ExceptionUtil(106,"账号不能为空");
        }else if(use_password==null||use_password.isEmpty()){
            throw new ExceptionUtil(107,"密码不能为空");
        }
        User user=new User();
        user.setUse_use(use_use);
        user.setUse_password(use_password);
        if(userMapper.findUser(user)==null){
            throw new ExceptionUtil(108,"账号或密码错误");
        }else{
            return userMapper.findUser(user);
        }


    }


}
