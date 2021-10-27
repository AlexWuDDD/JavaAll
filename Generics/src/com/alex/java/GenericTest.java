package com.alex.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class GenericTest{ 

    //静态方法不能使用泛型类

    //经验：泛型要使用就一路使用。要不用，一路都不要用。

    //泛型不同的引用不能相互赋值
    @Test void test4(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
    }

    @Test
    public void test3(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("Tom", 87);
        map.put("Jerry", 100);
        map.put("Jack", -79);

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(77);

        //编译时，就会进行类型检查，保证数据的安全
        // list.add("Aa");

        for(Integer score : list){
            //避免了强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }

        Iterator<Integer> integer = list.iterator();
        while(integer.hasNext()){
            int stuScore = integer.next();
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型之前
    @Test
    public void test1(){
        ArrayList list = new ArrayList();

        //需求：存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);

        //问题1：类型不安全
        list.add("Tom");

        for(Object o : list){
            //问题2：强转时，可能出现ClassCastException
            int stuScore = (Integer)o;

            System.out.println(stuScore);
        }
    }
}