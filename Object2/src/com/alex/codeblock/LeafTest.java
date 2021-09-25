package com.alex.codeblock;

import org.junit.Test;

public class LeafTest {
    @Test
    public void test1(){
        new Leaf();
        System.out.println();
        new Leaf();
    }
    
}

class Root{
    static{
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        System.out.println("Root的无参数的构造器");
    }
}

class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String msg){
        System.out.println("Mid的带参数的构造器，其参数值：" + msg);
    }
}

class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        super("alex");
        System.out.println("Leaf的无参数的构造器");
    }
}