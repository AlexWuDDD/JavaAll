package com.alex.java4;

public class AbstractTest {
    
}

abstract class Person{

    public abstract void eat();

}

class Student extends Person{

    @Override
    public void eat() {
        System.out.println("Student is eating");
    }

}