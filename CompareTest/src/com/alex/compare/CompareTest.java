package com.alex.compare;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/**
 * 一、说明：Java中的对象，正常情况下，只能进行比较：== 或 !=。不能使用 > 或 <。
 *     但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小。
 *     如何实现？使用两个接口中的任何一个：Comparable或Comparator  
 *
 * 二、 重写compareTo(obj)的规则：
 *  如果当前对象this大于形参对象obj，则返回正整数
 *  如果当前对象this小于形参对象obj，则返回负整数
 *  如果当前对象this等于形参对象obj, 则返回零
 * 
 * 
 */

public class CompareTest{
     
    /**
     * Comparable接口的使用
     * 1. 像String、包装类等实现了Comparable接口，重写了compareTo()方法，给出了比较两个对象大小
     * 2. 重写CompareTo的规则：
    */  
    @Test
    public void test1(){
        String[] arr = new String[]{"AA", "CC", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("Lenovo", 100);
        arr[1] = new Goods("Dell", 200);
        arr[2] = new Goods("Xiaomi", 50);
        arr[3] = new Goods("Apple", 500);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * Comparator接口的使用:定制排序
     * 1. 背景
     * 当元素的类型没有实现java.lang。Comparable接口而又不方便修改代码，
     * 或者实现了java.lang.Comparable接口的排序规则不适合当前的排序。
     * 那么可以考虑使用Comparator的对象排序
     * 
     * 2. 重写compare(Object o1, Object o2)方法，比较o1和o2的大小
     * 如果方法返回正整数，则表示o1大于o2；
     * 如果方法返回0，表示相等
     * 如果方法返回负整数，表示o1小于o2
     */

    @Test
    public void test3(){
        String[] arr = new String[]{"AA", "CC", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr, new Comparator(){

            //按照字符串从大到小的顺序排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("参数类型不匹配");
            }
        });
        System.out.println(Arrays.toString(arr));
        
    }

    @Test
    public void test4(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("Lenovo", 100);
        arr[1] = new Goods("Dell", 200);
        arr[2] = new Goods("Xiaomi", 50);
        arr[3] = new Goods("Apple", 500);

        Arrays.sort(arr, new Comparator(){

            //按照价格从大到小的顺序排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;
                    return -g1.compareTo(g2);
                }
                throw new RuntimeException("参数类型不匹配");
            }
        });
        System.out.println(Arrays.toString(arr));
        
    }
}