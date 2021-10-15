package com.alex.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBufferBuilderTest {
    
    /**
     * 
     */
    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        assertEquals("abc11", s1.toString());

        s1.delete(0, 3);
        assertEquals("11", s1.toString());

        s1.replace(0, 2, "alex is cool");
        assertEquals("alex is cool", s1.toString());

        s1.insert(0, "Wow, ");
        assertEquals("Wow, alex is cool", s1.toString());

        s1.insert(2, false);
        System.out.println(s1);

        System.out.println(s1.reverse());
        System.out.println(s1.capacity());

        String substr1 = s1.substring(1,3);
        System.out.println(substr1);
    }



    /**
     * String、StringBuffer、StringBuilder的三者的异同
     * String:          不可变的字符序列：底层使用char[]存储
     * StringBuffer:    可变的字符序列： 线程安全，效率低；底层使用char[]存储
     * StringBuilder:   可变的字符序列： 线程不安全，效率高；底层使用char[]存储
     
     源码解析
     String str = new String(); //new char[0]
     String str = new String("abc"); //new char[]{'a','b','c'}

     StringBuffer sb1 = new StringBuffer(); //new char[16]
     sb1.append('a'); //value[0] = 'a'
     sb1.append('b'); //value[1] = 'a'

     StringBuffer sb2 = new StringBuilder("abc"); //new char["abc".length() + 16]

     //问题1：System.out.println(sb2.length());
     //问题2：扩容问题：如果要添加的数据底层数组盛不下了，那就需要扩容底层的数组。
             默认情况下，扩容为原来容量的2倍+2，同时将原有数组中的元素复制到新的数组中。

             指导意义：开发中建议大家使用：StringBuffer(int capacity）或StringBuilder(int capacity)

    
     
     
     
     */

    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        assertEquals(3, sb1.length());
        sb1.setCharAt(0, 'f');
        System.out.println(sb1);

        sb1.replace(1, 2, "d");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        assertEquals(0, sb2.length());
    }



}
