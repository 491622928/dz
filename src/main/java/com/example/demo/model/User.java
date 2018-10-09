package com.example.demo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {
    private Integer userId;

    private String userName;

    private String userIdc;

    private Integer userSex;

    private String userAge;

    private String userTel;

    private String userAccount;

    private String userPassword;

    private Date userCreTim;

    private Date useUpdTim;

    private Integer userRole;

    Set<Role> roles=new HashSet<>();

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserIdc() {
        return userIdc;
    }

    public void setUserIdc(String userIdc) {
        this.userIdc = userIdc == null ? null : userIdc.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge == null ? null : userAge.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserCreTim() {
        return userCreTim;
    }

    public void setUserCreTim(Date userCreTim) {
        this.userCreTim = userCreTim;
    }

    public Date getUseUpdTim() {
        return useUpdTim;
    }

    public void setUseUpdTim(Date useUpdTim) {
        this.useUpdTim = useUpdTim;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }
}