package com.alex.java2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.alex.java1.Person;

import org.junit.Test;

public class OtherTest {
    
    /**
     * 获取构造器结构
     */
    @Test
    public void test1(){
        Class clazz = Person.class;


        //getConstructors() 获取当前运行时类中声明为piblic的构造器
        Constructor[] constructors = clazz.getConstructors();

        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }

        System.out.println("-----------------");

        //getDeclaredConstructors() 获取当前运行时类中声明的所有构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : declaredConstructors){
            System.out.println(constructor);
        }

    }

    /**
     * 获取运行时类的父类
     */
    @Test
    public void test2(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    /**
     * 获取运行时类的带泛型父类
     */
    @Test
    public void test3(){
        Class clazz = Person.class;
        Type genericSuperclass  = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
        
    }

    /**
     * 获取运行时类的带泛型父类的泛型
     */
    @Test
    public void test4(){
        Class clazz = Person.class;
        Type genericSuperclass  = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for(Type type : actualTypeArguments){
            System.out.println(type.getTypeName());
            System.out.println(type.getClass());
            System.out.println();
        }   
    }


    /**
     * 获取运行时类的接口
     */
    @Test
    public void test5(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for(Class inter : interfaces){
            System.out.println(inter);
        }

        System.out.println("-----------------");
        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class inter : interfaces1){
            System.out.println(inter);
        }
    }

    /**
     * 获取运行时类所在的包
     */
    @Test
    public void test6(){
        Class clazz = Person.class;
        Package package1 = clazz.getPackage();
        System.out.println(package1);
    }

    /**
     * 获取运行时类的注解
     */
    @Test
    public void test7(){
        Class clazz = Person.class;
        //获取运行时类的注解
        //getAnnotations() 获取当前运行时类中声明的所有注解
        //getDeclaredAnnotations() 获取当前运行时类中声明的所有注解
        //getAnnotation(Class<? extends Annotation> annotationClass) 获取当前运行时类中声明的指定注解
        //getDeclaredAnnotation(Class<? extends Annotation> annotationClass) 获取当前运行时类中声明的指定注解
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
        }

        System.out.println("-----------------");

        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        for(Annotation annotation : declaredAnnotations){
            System.out.println(annotation);
        }
    }


}
