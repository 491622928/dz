package com.example.demo.service.Impl;


import com.example.demo.mapper.MenuMapper;
import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

//    @Override
//    public List<Menu> getMenu(Integer menu_father, Integer menu_level) {
//        Menu menu=new Menu();
//        menu.setMenu_father(menu_father);
//        menu.setMenu_level(menu_level);
//        return menuMapper.getMenu(menu);
//    }
}
