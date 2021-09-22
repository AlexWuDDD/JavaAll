package com.alex.java;

import jdk.jfr.Timestamp;

public class EqualsTest {

    private int age;

    public static void main(String[] args) {
        
        int i = 10;
        int j = 10;
        double d = 10.0;

        System.out.println(i == j);
        System.out.println(i == d);

        boolean b = true;
        // System.out.println(b == i);

        char c = 10;
        System.out.println(i == c);

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);
    }

}