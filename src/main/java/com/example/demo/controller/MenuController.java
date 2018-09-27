package com.example.demo.controller;

import com.example.demo.model.Menu;
import com.example.demo.model.Result;
import com.example.demo.service.MenuService;
import com.example.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

//    @PostMapping(value = "/getMenu")
//    public Result<Menu> getMenu(Integer menu_father,Integer menu_level){
//        return  ResultUtil.success(menuService.getMenu(menu_father,menu_level));
//    }

}
