package com.alex.java1;

import java.io.IOException;

@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    public int id;

    public Person(){

    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @MyAnnotation(value = "abc")
    private Person(String name){
        this.name = name;
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是:" + nation);
        return nation;
    }

    public String display(String interests) throws IOException{
        return interests;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
        
    }

    @Override
    public int compareTo(String o) {
        // TODO Auto-generated method stub
        return 0;
    }

    

    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            ", id='" + id + "'" +
            "}";
    }

    private static void showDesc(){
        System.out.println("我是一个可爱的人");
    }
}
