package com.alex.java1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StaticTest{

    @Test
    public void test1(){
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;

        c2.nation = "CHN";

        assertEquals("CHN", c1.nation);

        Chinese.show();
    }
}

class Chinese{

    String name;
    int age;

    static String nation;

    static void show(){
        System.out.println("我是一个中国人");
    }
}