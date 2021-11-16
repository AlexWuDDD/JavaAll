package com.alex.java2;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * 方法引用的使用：
 * 
 * 1. 使用情境：当传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 * 2. 方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例,
 *    所以方法引用，也是函数式接口的实例
 * 3. 使用格式：类（或对象）::方法名
 * 4. 具体分为如下的三种情况：
 *     对象：：非静态方法
 *     类：：静态方法
 *     类：：非静态方法
 */



public class MethodRefTest {

    /**
     * 情况一：对象：：实例方法
     * Consumer中的void accept(T t)
     * PrintStream中的void println(T t)
     */
    @Test
    public void test1(){
        Consumer<String> con = System.out::println;
        con.accept("Hello Lambda!");

        System.out.println("------------------");

        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("Hello Lambda!");
    }

    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2(){
        Employee emp = new Employee(1001, "Alex", 25, 9999.99);
        Supplier<String> sup1 = () -> emp.getName();
        System.out.println(sup1.get());

        System.out.println("------------------");
        Supplier<String> sup2 = emp::getName;
        System.out.println(sup2.get());
    }

    /**
     * 情况二：类：：静态方法
     * Comparator中的int compare(T t1, T t2)
     * Integer中的int compare(T t1, T t2)
     */
    @Test
    public void test3(){
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com1.compare(12,21));

        System.out.println("------------------");
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12,21));
    }

    //Function中的R apply(T t)
    //Math中的long round(double d)
    @Test
    public void test4(){
        Function<Double, Long> func1 = d -> Math.round(d);
        System.out.println(func1.apply(12.345));

        System.out.println("------------------");
        Function<Double, Long> func2 = Math::round;
        System.out.println(func2.apply(12.345));
    }

    //情况三：类：：实例方法
    //Comparator中的int compare(T t1, T t2)
    //String中的t1.compareTo(t2)
    @Test
    public void test5(){
        Comparator<String> com1 = (t1, t2) -> t1.compareTo(t2);
        System.out.println(com1.compare("abc", "abd"));

        System.out.println("------------------");
        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abc", "abd"));
    }

    //BiPredicate中的boolean test(T t1, T t2)
    //String中的t1.equals(t2)
    @Test
    public void test6(){
        BiPredicate<String, String> bp1 = (t1, t2) -> t1.equals(t2);
        System.out.println(bp1.test("abc", "abd"));

        System.out.println("------------------");
        BiPredicate<String, String> bp2 = String::equals;
        System.out.println(bp2.test("abc", "abd"));
    }

    //Function中的R apply(T t)
    //Employee中的String getName()
    @Test
    public void test7(){
        Employee emp = new Employee(1001, "Alex", 25, 9999.99);
        Function<Employee, String> func1 = e -> e.getName();
        System.out.println(func1.apply(emp));

        System.out.println("------------------");
        Function<Employee, String> func2 = Employee::getName;
        System.out.println(func2.apply(emp));
    }
    
}
