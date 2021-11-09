package com.alex.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;


import org.junit.Test;

public class ReflectionTest {

    //反射之前，对于Person的操作
    @Test
    public void test1(){
        //1.创建Person对象
        Person p1 = new Person("Tom", 12);

        //2.通过对象，调用其内部的属性，方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person类外部，不可以通过Person类的对象调用其内部私有结构
        //比如：name, showNation()以及私有的构造器

    }

    //反射之后，对于Person的操作
    @Test
    public void test2(){
        try{
            Class clazz = Person.class;
            Constructor cons = clazz.getConstructor(String.class, int.class);

            //1. 通过反射，创建Person类的对象
            Object obj = cons.newInstance("Tom", 12);
            Person p = (Person)obj;
            System.out.println(p.toString());

            //2. 通过反射，调用对象指定的属性、方法
            //调用属性
            Field age = clazz.getDeclaredField("age");
            age.set(p, 10);
            System.out.println(p.toString());

            //调用方法
            Method show = clazz.getDeclaredMethod("show");
            show.invoke(p);

            //通过反射，可以调用Person类的私有结构，比如，私有的构造器、方法、属性等
            //调用私有的构造器
            Constructor cons1 = clazz.getDeclaredConstructor(String.class);
            cons1.setAccessible(true);
            Object obj1 = cons1.newInstance("Jerry");
            Person p1 = (Person)obj1;
            System.out.println(p1.toString());

            //调用私有的属性
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            name.set(p1, "Eddy");
            System.out.println(p1.toString());

            //调用私有的方法
            Method showNation = clazz.getDeclaredMethod("showNation", String.class);
            showNation.setAccessible(true);
            String ret = (String) showNation.invoke(p1, "China");
            System.out.println(ret);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //疑问1：通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用哪个？
    //建议：直接new的方式
    //什么时候会使用：反射的方式，反射的特征：动态性
    //疑问2：反射机制与面向对象中的封装性是不是矛盾的？如何看待两个技术？
    //不矛盾

    /**
     * 关于java.lang.Class类的理解
     * 1. 类的加载过程
     * 程序经过javac命令以后，会生成一个或多个字节码文件（.class结尾），
     * 接着我们使用java命令对某个字节码文件进行解释运行，
     * 相当于将某个字节码文件加载到内存中，
     * 此过程称为类的加载过程。
     * 加载到内存中的类，我们就称为运行时类，
     * 此运行时类，就作为Class的一个实例
     * 
     * 2. 换句话说，Class的实例就对应着一个运行时类。
     * 
     * 3. 加载到内存中的运行时类，会缓存一定的时间，
     * 在此时间之内，我们可以通过不同的方式来获取运行时类。
     * 
     */
    //获取Class实例的方式
     @Test
     public void test3(){
        try{
            //方式一：调用运行时类的属性:.class
            Class<Person> clazz1 = Person.class;
            System.out.println(clazz1);

            //方式二：通过运行时累的对象
            Person p1 = new Person();
            Class clazz2 = p1.getClass();
            System.out.println(clazz2);

            //这个用的最多
            //方式三：调用Class的静态方法forName(String classPath)
            Class clazz3 = Class.forName("com.alex.java.Person");
            System.out.println(clazz3);

            //方式四：使用类的加载器：ClassLoader
            ClassLoader classLoader = ReflectionTest.class.getClassLoader();
            Class clazz4 = classLoader.loadClass("com.alex.java.Person");
            System.out.println(clazz4);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

        }
     }


    //万事万物皆对象？

    //体会反射的动态性
    @Test
    public void test88(){
        try{
            for(int i = 0; i < 100; ++i){
                int num = new Random().nextInt(3); //0,1,2
                String classPath = "java.lang.String";
                switch(num){
                    case 0:
                        classPath = "java.util.Date";
                        break;
                    case 1:
                        classPath = "java.lang.Object";
                        break;
                    case 2:
                        classPath = "com.alex.java.Person";
                        break;
                }
                Object obj = getInstance(classPath);
                System.out.println(obj);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //创建一个指定类的对象
    //classPath: 指定类的全类名
    public Object getInstance(String classPath) throws Exception{
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }

}