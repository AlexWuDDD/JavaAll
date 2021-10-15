package com.alex.java;

import org.junit.Test;

public class StringTest2 {
    
    @Test
    public void test3(){
        String str1 = "helloworld";
        System.out.println(str1.endsWith("ld"));

        System.out.println(str1.startsWith("he"));

        System.out.println(str1.startsWith("ll", 2));

        String str2 = "wo";
        System.out.println(str1.contains(str2));

        System.out.println(str1.indexOf("ll"));

        System.out.println(str1.indexOf("lo", 6));

        System.out.println(str1.lastIndexOf("or"));

        //从指定的索引反向搜索
        System.out.println(str1.lastIndexOf("or", 5));
        System.out.println(str1.lastIndexOf("or", 8));
    }
}
