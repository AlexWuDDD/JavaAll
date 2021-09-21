package com.alex.test1;

public class KidsTest {
    
    public static void main(String[] args) {
        
        Kids someKids = new Kids(12);
        someKids.printAge();

        someKids.setSalary(0);
        someKids.setSex(1);
        someKids.printAge();
        someKids.manOrWoman();
        someKids.employeed();
    }
}
