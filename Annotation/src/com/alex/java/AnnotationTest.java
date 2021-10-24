package com.alex.java;

import java.util.ArrayList;

public class AnnotationTest {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        int num = 10;

        @SuppressWarnings({"unused", "rawtypes"})
        ArrayList list = new ArrayList();
    }

}

@MyAnnotataion(value = "hi")
class Person{
    private String name;
    private int age;

    public Person(){}

    @MyAnnotataion
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("人走路");
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface Info{
    void show();
}

class Student extends Person implements Info{

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void show() {
        System.out.println("学生信息");
    }
}