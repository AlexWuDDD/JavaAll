package com.alex.java2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonTest1 {

    @Test
    public void test(){
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1);
        System.out.println(bank2);
        assertEquals(bank1, bank2);
    }    
}

//饿汉式
class Bank{

    //1.私有化类的构造器
    private Bank(){

    }
    //2.内部创建类的对象
    private static Bank instance = new Bank();

    //3.提供一个公共的静态的方法,返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}