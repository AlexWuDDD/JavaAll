package com.alex.java;

public class ExtendsTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Person p1 = new Person();
        p1.setName("Alex");
        p1.setAge(30);
        System.out.println(p1);

        Student s1 = new Student();
        s1.setName("Alex");
        s1.setAge(30);
        System.out.println(s1);
    }
}

class Student extends Person{

}
