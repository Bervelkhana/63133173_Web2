package com.example.ban_quan_ao.Models;

public class Admin {
    private String admin_id;
    private String userName;
    private String passWord;
    private String email;

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    // Getter và setter cho userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter và setter cho passWord
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    // Getter và setter cho email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Admin(String admin_id, String userName, String passWord, String email){
        this.admin_id = admin_id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }
}
