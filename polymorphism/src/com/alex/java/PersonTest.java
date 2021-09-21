package com.alex.java;

public class PersonTest {
    
    public static void main(String[] args){        
        Person p1 = new Man();
        Person p2 = new Woman();

        p1.eat();
        p2.eat();

        p1.walk();
        p2.walk();

        if(p1 instanceof Man){
            Man m1 = (Man)p1;
            System.out.println(m1);
            System.out.println(p1);

            m1.earnMoney();
        }

        if(p1 instanceof Person){
            System.out.println("Person");
        }

        if(p1 instanceof Object){
            System.out.println("Person");
        }

        //ClassCastException
        if(p1 instanceof Man){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if(p1 instanceof Woman){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
