package com.alex.java8;

import org.junit.Test;

public class SubClassTest {

    @Test
    public void test1(){
        SubClass subClass = new SubClass();
        subClass.method2();
        subClass.method3();
        CompareA.method1();
    }
    
}

class SubClass implements CompareA{

    @Override
    public void method2(){
        System.out.println("SubClass: 天津");
    }
}
