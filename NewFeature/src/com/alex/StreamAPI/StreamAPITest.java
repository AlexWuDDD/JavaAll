package com.alex.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.alex.java2.Employee;
import com.alex.java2.EmployeeData;

import org.junit.Test;

public class StreamAPITest {
    
    //创建Strem方式一：通过集合
    @Test
    public void test1() {

        List<Employee> employees = EmployeeData.getEmployees();

        // default Stream<E> stream() ：返回一个顺序流
        Stream<Employee> stream = employees.stream();

        // default Stream<E> parallelStream() ：返回一个并行流
        Stream<Employee> parallelStream = employees.parallelStream();
        
    }

    //创建Stream方式二：通过数组
    @Test
    public void test2(){
        int[] nums = {1,2,3,4,5,6,7,8,9};
         
        IntStream stream =  Arrays.stream(nums);

        Employee e1 = new Employee(1, "张三", 18, 9999.99);
        Employee e2 = new Employee(2, "李四", 59, 6666.66);
        Employee[] arr1 = new Employee[]{e1, e2};

        Stream<Employee> stream1 = Arrays.stream(arr1);
    }

    //创建Stream方式三：通过Stream.of()
    @Test
    public void test3(){
        Stream<String> stream = Stream.of("aa", "bb", "cc");
    }

    //创建Stream方式四：创建无限流
    @Test
    public void test4(){
        //无限流：迭代
        Stream<Integer> stream = Stream.iterate(0, (x) -> x + 2);
        stream.limit(10).forEach(System.out::println);

        //无限流：生成
        Stream<Double> stream1 = Stream.generate(Math::random);
        stream1.limit(10).forEach(System.out::println);
    }

}
