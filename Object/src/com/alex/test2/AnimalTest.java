package com.alex.test2;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
    }
}


class Animal{

    String name;
    int age;
    private int legs;

    public void setLegs(int l){
        if(l >= 0 && l%2 == 0){
            legs = l;
        }
        else{
            legs = 0;
        }
    }

    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物进食");
    }
}