package com.alex.java5;

import org.junit.Test;

public class InterfaceTest {
    @Test
    public void test1(){
        System.out.println(Flyable.MAX_SPEED);
        // Flyable.MIN_SPEED = 2;
        System.out.println(Flyable.MIN_SPEED);
    }

    @Test
    public void test2(){
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }
    
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; //s省略public static final

    //抽象方法
    public abstract void fly();

    //省略了public abstract
    void stop();
}

class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Planefly");
    }

    @Override
    public void stop() {
        System.out.println("Plane stop");
    }
}