package com.alex.java;

import java.util.List;

import org.junit.Test;

public class GenericTest1 {
    
    @Test
    public void test1(){
        Order<String> order1 = new Order<String>();
        order1.setOrderId(123);
        order1.setOrderName("OrderAA");
        order1.setOrderT("cash");

        System.out.println(order1);


        Integer[] ints = new Integer[]{1,2,3,4,5};
        List<Integer> list =  order1.copyFromArrayToList(ints);
        System.out.println(list);
    }
}
