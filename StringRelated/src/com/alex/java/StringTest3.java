package com.alex.java;

import org.junit.Test;

public class StringTest3 {
    
    @Test
    public void test4(){
        String str1 = "霍尼韦尔控制科技（中国）有限公司";
        str1.replace("中国", "天津");
        System.out.println(str1);
        String str2 = str1.replace("中国", "天津");
        System.out.println(str2);

        System.out.println("*************************");
        String str3 = "aaxbacauigcabckacb1213131iacus**asqnkq&&";
        String str4 = str3.replaceAll("[a-z]", "*");
        System.out.println(str4);
        String str5 = str3.replaceAll("\\d", "*");
        System.out.println(str5);
        String str6 = str3.replaceAll("\\d+", "*");
        System.out.println(str6);


        String str7 = str3.replaceFirst("\\d", "A");
        System.out.println(str7);


        String str8 = str3.replaceFirst("\\d+", "A");
        System.out.println(str8);

        String str9 = "12345";
        System.out.println(str9.matches("\\d+"));

        String str10 = "021-28940000";
        System.out.println(str10.matches("021-\\d{7,8}"));

        String str11 = "hello|world|java";
        String[] strs11 = str11.split("\\|");
        for (String s : strs11) {
            System.out.println(s);
        }

        String str12 = "hello.world.java";
        String[] strs12 = str12.split("\\.");
        for (String s : strs12) {
            System.out.println(s);
        }
    }
}
 