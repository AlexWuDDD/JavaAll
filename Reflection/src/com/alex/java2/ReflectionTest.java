package com.alex.java2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alex.java1.Person;

import org.junit.Test;

/**
 * 调用运行时类中指定的结构：属性、方法、构造器
 */

public class ReflectionTest {

    @Test
    public void testField() throws Exception {

        Class clazz = Person.class;

        //创建运行时类的对象
        Person person = (Person) clazz.newInstance();

        //获取指定的属性, 要求运行时类中的声明为public
        Field id = clazz.getField("id");

        //设置当前属性的值
        id.set(person, 1001);

        int pId = (Integer)id.get(person);

        System.out.println(pId);
        System.out.println(person);

        System.out.println("===========================");

        //获取指定的属性
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person, 30);

        int pAge = (Integer)age.get(person);
        System.out.println(pAge);
        System.out.println(person);
    }

    @Test
    public void testMethod() throws Exception {

        Class clazz = Person.class;

        //创建运行时类的对象
        Person person = (Person) clazz.newInstance();

        //获取指定的方法
        Method eat = clazz.getMethod("eat");
        eat.invoke(person);

        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        Object ret = show.invoke(person, "中国");
        System.out.println(ret);

        System.out.println("*****************");

        System.out.println("如何调用静态方法");
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        // Object ret2 = showDesc.invoke(Person.class); 
        Object ret2 = showDesc.invoke(null); 
        System.out.println(ret2);

    }

    /**
     * 如何调用运行时类中的指定的构造器
     */
    @Test
    public void testConstructor() throws Exception {

        Class clazz = Person.class;

        Constructor constructor = clazz.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);

        Person person = (Person) constructor.newInstance("alex");

        System.out.println(person);
    }


}
