package com.example.demo.model;


import com.fasterxml.jackson.annotation.JacksonInject;

import java.util.Date;

public class User {
    private Integer use_id;
    private String use_nam;
    private String use_idc;
    private String use_sex;
    private Integer use_age;
    private String use_tel;
    private String use_use;
    @JacksonInject
    private String use_password;
    private Date use_cre_tim;
    private Date use_upd_tim;


    @Override
    public String toString() {
        return "User{" +
                "use_id='" + use_id + '\'' +
                ", use_nam='" + use_nam + '\'' +
                ", use_idc='" + use_idc + '\'' +
                ", use_sex='" + use_sex + '\'' +
                ", use_age=" + use_age +
                '}';
    }

    public Date getUse_upd_tim() {
        return use_upd_tim;
    }

    public void setUse_upd_tim(Date use_upd_tim) {
        this.use_upd_tim = use_upd_tim;
    }

    public String getUse_tel() {
        return use_tel;
    }

    public void setUse_tel(String use_tel) {
        this.use_tel = use_tel;
    }

    public String getUse_use() {
        return use_use;
    }

    public void setUse_use(String use_use) {
        this.use_use = use_use;
    }

    public String getUse_password() {
        return use_password;
    }

    public void setUse_password(String use_password) {
        this.use_password = use_password;
    }

    public Date getUse_cre_tim() {
        return use_cre_tim;
    }

    public void setUse_cre_tim(Date use_cre_tim) {
        this.use_cre_tim = use_cre_tim;
    }

    public Integer getUse_id() {
        return use_id;
    }

    public void setUse_id(Integer use_id) {
        this.use_id = use_id;
    }

    public String getUse_nam() {
        return use_nam;
    }

    public void setUse_nam(String use_nam) {
        this.use_nam = use_nam;
    }

    public String getUse_idc() {
        return use_idc;
    }

    public void setUse_idc(String use_idc) {
        this.use_idc = use_idc;
    }

    public String getUse_sex() {
        return use_sex;
    }

    public void setUse_sex(String use_sex) {
        this.use_sex = use_sex;
    }

    public Integer getUse_age() {
        return use_age;
    }

    public void setUse_age(Integer use_age) {
        this.use_age = use_age;
    }
}
