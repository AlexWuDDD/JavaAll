package com.alex.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest1 {
    
    //语法格式一：无参数，无返回值
    @Test
    public void test1(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda!");
            }
        };
        r.run();

        System.out.println("------------------");

        Runnable r2 = () -> System.out.println("Hello Lambda!");
        r2.run();
    }

    //语法格式二：有一个参数，无返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("Hello Lambda!");

        System.out.println("------------------");

        Consumer<String> con2 = (String s) -> {
            System.out.println(s);
        };
        con2.accept("Hello Lambda!");
    }

    //语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为”类型推断”
    @Test
    public void test3(){
        Consumer<String> con = (s) -> System.out.println(s);
        con.accept("Hello Lambda!");
    }

    @Test
    public void test4(){
        ArrayList<String> list = new ArrayList<>(); //类型推断
        int[] arr = {1,2,3};//类型推断
    }

    //语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test5(){
        Consumer<String> con = s -> System.out.println(s);
        con.accept("Hello Lambda!");
    }

    //语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test6(){
        Comparator<Integer> com = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
            return Integer.compare(x, y);
        };
        System.out.println(com.compare(1, 2));
    }

    //语法格式六：Lambda体中若只有一条语句，return 和 大括号都可以省略
    @Test
    public void test7(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
        System.out.println(com.compare(1, 2));
    }
}
