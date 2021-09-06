package com.alex.ooptest;


//属性 = 成员变量 = field = 域、字段
//方法 = 成员方法 = 函数 = method

//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        p1.name = "张三";
        p1.isMale = true;

        System.out.println(p1.name);

        p1.eat();
        p1.sleep();
        p1.talk("中国话");
        //********************************
        Person p2 = new Person();
        System.out.println(p2.name);
    }
}

class Person{
    
    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat()
    {
        System.out.println("人可以吃饭");
    }

    public void sleep()
    {
        System.out.println("人可以睡觉");
    }

    public void talk(String language)
    {
        System.out.println("人可以说话，使用的是：" + language);
    }
}

