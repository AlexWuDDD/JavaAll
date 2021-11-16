package com.alex.java2;

import java.sql.Array;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

public class ConstructorRefTest {
    
    //构造器引用
    //Supplier中的T get()
    //Employee的空参构造器：Employee()
    @Test
    public void test1(){
        Supplier<Employee> sup1 = () -> new Employee(1001, "张三", 18, 9999.99);
        System.out.println(sup1.get());
        System.out.println("------------------");
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }

    //Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer, Employee> fun1 = id -> new Employee(id);
        System.out.println(fun1.apply(1002));
        System.out.println("------------------");
        Function<Integer, Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(1003));

    }

    //BiFunction中的R apply(T t, U u)
    @Test
    public void test3(){
        BiFunction<Integer, String, Employee> fun1 = (id, name) -> new Employee(id, name);
        System.out.println(fun1.apply(1004, "李四"));
        System.out.println("------------------");
        BiFunction<Integer, String, Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(1005, "王五"));
    }

    //数组引用
    //Function中的R apply(T... t)
    @Test
    public void test4(){
        Function<Integer, String[]> fun1 = length -> new String[length];
        String[] strs = fun1.apply(3);
        System.out.println(Arrays.toString(strs));
        System.out.println("------------------");
        Function<Integer, String[]> fun2 = String[]::new;
        String[] strs2 = fun2.apply(4);
        System.out.println(Arrays.toString(strs2));
    }
}
