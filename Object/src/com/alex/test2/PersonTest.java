package com.alex.test2;

//构造器

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person("alex", 30);
        person.eat();
        person.study();


    }
    
}

class Person{
    private String name;
    private int age;

    //构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat(){
        System.out.println(name + "吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }
}
