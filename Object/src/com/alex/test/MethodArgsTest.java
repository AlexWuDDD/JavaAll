package com.alex.test;

/**
 * 可变个数形参的测试
 */


public class MethodArgsTest {

    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("alex", "is", "cool");
        

    }


    
    public void show(int i){
        System.out.println(i);
    }

    // public void show(String s){
    //     System.out.println("single: " + s);
    // }

    public void show(String ... strs){
        System.out.println("multiple String");
        for(String s : strs){
            System.out.println(s);
        }
    }

    // public void show(String[] strs){

    // }

    public void show(int ... numbers){
        System.out.println("multiple int");
    }

    // public void show(String ... strs, int i){}
    public void show(int i , String ... strs){
        System.out.println("single int and multiple String");
    }
}
