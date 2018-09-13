package com.example.demo.model;

public class Menu {
    private Integer menu_id;
    private String menu_name;
    private String menu_url;
    private Integer menu_father;
    private Integer menu_level;



    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public Integer getMenu_father() {
        return menu_father;
    }

    public void setMenu_father(Integer menu_father) {
        this.menu_father = menu_father;
    }

    public Integer getMenu_level() {
        return menu_level;
    }

    public void setMenu_level(Integer menu_level) {
        this.menu_level = menu_level;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu_id=" + menu_id +
                ", menu_name='" + menu_name + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", menu_father=" + menu_father +
                ", menu_level=" + menu_level +
                '}';
    }
}
