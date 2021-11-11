package com.alex.java2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.alex.java1.Person;

import org.junit.Test;

/**
 * 获取当前运行时类的属性结构
 */

public class FieldTest {
    
    @Test
    public void test1(){

        Class clazz = Person.class; 

        //获取属性结构
        //getFields() 获取当前运行时类及其父类声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for(Field field : fields){
            System.out.println(field);
        }

        System.out.println("===========================");

        //getDeclaredFields() 获取当前运行时类中声明的所有属性。（不包括父类中声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field : declaredFields){
            System.out.println(field);
        }

        System.out.println("===========================");

    }

    //权限修饰符 数据类型 变量名
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            //1.权限修饰符
            int modifier = field.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            //2.数据类型
            Class type = field.getType();
            System.out.print(type.getName() + "\t");

            //3.变量名
            String name = field.getName();
            System.out.println(name);
        }
    }
}
