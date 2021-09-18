package com.alex.java.bean;

/**
 * @Description: Customer为实体对象，用来封装客户信息
 * @author alex
 * @date Sep 18, 2021 8:01 a.m. 
 */

public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
}
