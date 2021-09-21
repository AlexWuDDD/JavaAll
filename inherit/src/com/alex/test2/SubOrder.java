package com.alex.test2;

public class SubOrder extends Order {
    
    public void method(){
        methodDefault();
        methodProtected();
        methodPublic();

        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }
}
