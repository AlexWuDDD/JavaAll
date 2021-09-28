package com.alex.test;

import org.junit.Test;

interface A{
    int x  = 0;
}

class B{
    int x = 1;
}

class C extends B implements A{
    public void pX(){
        // System.out.println(X);
        System.out.println(super.x);
        System.out.println(A.x);
    }
}

public class Test1 {
 
    @Test
    public void test_01(){
        C c = new C();
        c.pX();
    }
}
