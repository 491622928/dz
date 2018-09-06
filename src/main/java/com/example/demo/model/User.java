package com.example.demo.model;


public class User {
    private String use_id;
    private String use_nam;
    private String use_idc;
    private String use_sex;
    private Integer use_age;

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

    public String getUse_id() {
        return use_id;
    }

    public void setUse_id(String use_id) {
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
