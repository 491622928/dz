package com.example.demo.model;

public class Menu {
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuFather;

    private Integer menuLevel;

    private String menuOther;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getMenuFather() {
        return menuFather;
    }

    public void setMenuFather(Integer menuFather) {
        this.menuFather = menuFather;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getMenuOther() {
        return menuOther;
    }

    public void setMenuOther(String menuOther) {
        this.menuOther = menuOther == null ? null : menuOther.trim();
    }
}