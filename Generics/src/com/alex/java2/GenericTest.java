package com.alex.java2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class GenericTest {

    /**
     * 1. 泛型在继承方面的体现
     *   虽然类A是类B的父类，但是G<A>和G<B>二者不具备子父类的关系，二者是并列关系
     *   补充：类A是类B的父类，A<G>是B<G>的父类 
     */
    
    @Test
    public void test1(){
        Object obj = null;
        String str = null;

        obj = str;

        Object[] arr = null;
        String[] arr2 = null;

        List<Object> list1 = null;
        List<String> list2 = null;

        // list1 = list2;
    }

    /**
     * 2. 通配符的使用
     *  通配符：？
     */
    @Test
    public void test2(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list3 = null;

        list3 = list1;
        list3 = list2;

        List<String> list4 = new ArrayList<>();
        list4.add("AA");
        list4.add("BB");
        list4.add("CC");
        list3 = list4;
        print(list4);

        //不能向其内部添加数据,null除外
        // list3.add("DD");

        System.out.println(list3.get(0));
        list3.add(null);
        
    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
    * 有限制条件的通配符
    */
    public void test3(){

        List<? extends Person> list1 = null; //<=
        List<? super Person> list2 = null; //>=

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
        // list1 = list5;

        // list2 = list3;
        list2 = list4;
        list2 = list5;

    }
}
