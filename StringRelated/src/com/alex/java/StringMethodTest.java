package com.alex.java;

import org.junit.Test;

public class StringMethodTest {

    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abd");
        //涉及到字符串排序，比较字符串的大小
        System.out.println(s5.compareTo(s6));

        String s7 = "霍尼韦尔控制科技（中国）有限公司";
        String s8 = s7.substring(0,4);
        System.out.println(s8);
        String s9 = s7.substring(4);
        System.out.println(s9);
        System.out.println(s7);
    }

    
    @Test
    public void test1(){
        String s1 = "helloworld";
        System.out.println(s1.length());
        
        System.out.println(s1.charAt(0));

        String s2 = "";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        String s3 = "HELLO";
        String s4= s3.toLowerCase();
        System.out.println(s3);
        System.out.println(s4);

        String s5 = "   he llo   world      ";
        String s6 = s5.trim(); //去除首位空格
        System.out.println("-----" + s5 + "------");
        System.out.println("-----" + s6 + "------");
    }
}
