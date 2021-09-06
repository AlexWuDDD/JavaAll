package com.alex.ooptest;

public class CustomerTest {
    
}

class Customer{
    
    String name;
    int age;
    boolean isMember;

    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        return name;
    }

    public void getNation(String nation) {
        System.out.println("我是" + nation + "人");
    }
}