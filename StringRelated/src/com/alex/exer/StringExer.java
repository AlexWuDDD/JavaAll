package com.alex.exer;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class StringExer{

    //1.模拟一个trim方法，去除字符串两端的空格。
    @Test
    public void test1(){
        String resutlt = myTrim("    alex is cool    ");
        assertEquals("alex is cool", resutlt);
        String result2 = myTrim(" ");
        assertEquals("", result2);
    }

    private String myTrim(String str){
        if(str != null){
            int start = 0;
            int end = str.length() - 1;
            while(start < end && str.charAt(start) == ' '){
                start++;
            }
            while(start < end && str.charAt(end) == ' '){
                end--;
            }
            if(str.charAt(start) == ' '){
                return "";
            }
            return str.substring(start, end+1);
        }
        return null;
    }


    //2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
    @Test
    public void test2(){
        String str = "abcdefg";
        assertEquals("abfedcg", reverse1(str, 2, 5));
        assertEquals("abfedcg", reverse2(str, 2, 5));
        assertEquals("abfedcg", reverse3(str, 2, 5));

    }

    private String reverse1(String str, int start, int end){
        if(str != null){
            char[] chars = str.toCharArray();
            for(int i = start, j = end; i < j; i++, j--){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    private String reverse2(String str, int start, int end){
        String newStr = str.substring(0, start);
        for(int i = end; i >= start; --i){
            newStr += str.charAt(i);
        }
        newStr += str.substring(end+1);
        return newStr;
    }

    private String reverse3(String str, int start, int end){
        StringBuffer s = new StringBuffer(str.length());
        s.append(str.substring(0, start));
        for(int i = end; i >= start; --i){
            s.append(str.charAt(i));
        }
        s.append(str.substring(end+1));
        return s.toString();
    }

    /**
     * 3.获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”    
      中出现的次数
     */
    @Test
    public void test3(){
        String str1 = "cdabkkcadkabkebfkabkskab";
        String str2 = "ab";
        assertEquals(4, getCount(str1, str2));

    }

    private int getCount(String mainStr, String subStr){
        if(mainStr.length() >= subStr.length()){
            int count = 0;
            int index = 0;
            while((index = mainStr.indexOf(subStr, index)) != -1){
                count++;
                index += subStr.length();
            }
            return count;
        }
        else{
            return 0;
        }
    }

//     4.获取两个字符串中最大相同子串。比如：
//    str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
//    提示：将短的那个串进行长度依次递减的子串与较长  
//    的串比较。
    @Test
    public void test4(){
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";

        assertEquals("hello", getMaxSameSubString(str1, str2));
    }

    private String getMaxSameSubString(String str1, String str2){
        if(str1 != null && str2 != null){
            String maxStr = (str1.length() > str2.length())? str1: str2;
            String minStr = (str1.length() > str2.length())? str2: str1;

            int len = minStr.length();
            for(int i = 0; i < len; ++i){
                System.out.println(i);
                for(int x = 0, y = len-i; y <= len; x++, y++){
                    System.out.println(minStr.substring(x, y));
                    if(maxStr.contains(minStr.substring(x, y))){
                        return minStr.substring(x, y);
                    }
                }
            }
        }
        return  null;
    }

// 5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
// 提示：
// 1）字符串变成字符数组。
// 2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
// 3）将排序后的数组变成字符串。

    @Test
    public void test5(){
        String str = "abcwerthelloyuiodef";
        assertEquals("abcdeeefhilloortuwy", strSort(str));
    }

    private String strSort(String str){
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}