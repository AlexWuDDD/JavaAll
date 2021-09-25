package com.alex.java2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonTest2 {
    @Test
    public void test(){
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1);
        System.out.println(order2);
        assertEquals(order1, order2);
    }
}

//懒汉式
class Order{
    //1. 私有化类的构造器
    private Order(){

    }

    //2. 声明当前类的对象， 没有初始化
    private static Order instance = null;

    //3.
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    } 
}
