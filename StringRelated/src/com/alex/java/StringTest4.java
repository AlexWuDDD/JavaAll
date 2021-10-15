package com.alex.java;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.Test;

//String类与其他结构类型之间的转换

public class StringTest4 {

    /**
     * 1. 常量与常量拼接结果在常量池，且常量池中不会保存相同内容的常量
     * 2. 只要其中一个是变量，结果就在堆中
     * 3. 如果拼接的结果调用intern()方法，返回值就在常量池中
     */
    @Test
    public void test4(){
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        assertEquals(false, s1 == s3);

        final String s4 = "javaEE";
        assertEquals(true, s2 == s4);
        String s5  = s4 + "hadoop";
        assertEquals(true, s5 == s1) ;
    }


    /**
     * String 与 byte[]之间的转换
     * 编码：String --> byte[]: 调用String的getBytes()方法
     * 解码：byte[] --> String: 调用String的构造器方法
     * 
     * 编码：字符串 --> 字节 （看得懂 --> 看不懂的二进制数据）
     * 解码：编码的逆过程，字节 --> 字符串 (看不懂的二进制数据--> 看得懂）
     */
    @Test
    public void test3() throws UnsupportedEncodingException{
        String str = "123abc中国";
        byte[] bytes = str.getBytes();//使用默认的字符集，进行转换
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str.getBytes("gbk");//使用指定的字符集，进行转换
        System.out.println(Arrays.toString(gbks));

        String str2 = new String(bytes, "utf-8");//使用指定的字符集，进行转换
        String str3 = new String(gbks, "gbk");
        String str4 = new String(gbks, "utf-8");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }



    /**
     * String 与 char[] 的转换
     * String --> char[]: 调用String的toCharArray()方法
     * char[] --> String: 调用String的构造器
     */

    @Test
    public void test2(){
        String str1 = "abc123";
        char[] chs = str1.toCharArray();
        for(char c : chs){
            System.out.println(c);
        }

        char[] chs2 = {'a','b','c','1','2','3'};
        assertEquals("abc123", new String(chs2));
    }
    
    /**
     * 复习：
     * String 与基本数据类型，包装类之间的转换
     * String --> 基本数据类型、包装类：调用包装类的静态方法：parseXXX(String)
     * 基本数据类型、包装类 --> String：调用String重载的valueOf(xxx)方法
     */
    @Test
    public void test1(){
        String str1 = "123";
        int num = Integer.parseInt(str1);
        assertEquals(123, num);

        String str2 = String.valueOf(num);
        assertEquals("123", str2);

    }


}
