package com.alex.codeblock;

import org.junit.Test;

public class BlockTest {
    @Test
    public void test1(){
        System.out.println("test1");
        String desc = Person.desc;
        System.out.println(desc);
        System.out.println("*********");
    }

    @Test
    public void test2(){
        System.out.println("test2");
        Person p1 = new Person();
        Person p2 = new Person();
        Person.info();
        System.out.println("*********");
    }
    
}


class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //代码块
    static{
        System.out.println("hello, static block");
        desc = "我是一个爱学习的人";
        info();
        // eat();
    }

    {
        System.out.println("hello, block");
        age = 1;
        eat();
        desc = "我是一个爱学习的人1";
        info();
    }


    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            "}";
    }

    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}