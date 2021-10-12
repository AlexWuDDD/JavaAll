package com.alex.java;

import org.junit.Test;

public class StringTest{

    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);

        //返回值得到的s8使用的常量池中已经存在的”javaEEhadoop“
        String s8 = s5.intern();
        System.out.println(s8 == s3);
    }

    @Test
    public void test2(){

        //通过字面量定义的方式
        //此时s1和s2的数据javaEE声明在方法区中的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new + 构造器的方式，
        //此时的s3和s4保存的地址值
        //是数据在对空间中的开辟空间以后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4 == s3);

        System.out.println("***********************");

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);

        System.out.println("***********************");

        Person p3 = new Person(new String("Bob"), 12);
        Person p4 = new Person(new String("Bob"), 12);

        System.out.println(p3.name.equals(p4.name));
        System.out.println(p3.name == p4.name);
    
    }


    @Test
    public void test1(){
        String s1 = "abc"; //字面量
        String s2 = "abc";
        s1 = "hello"; 
        System.out.println(s1 == s2); //比较s1和s2的地址值
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("***********************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("***********************");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("***********************");

    }
}