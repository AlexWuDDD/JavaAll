package com.alex.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.alex.java2.Employee;
import com.alex.java2.EmployeeData;

import org.junit.Test;

/**
 * 测试Stream的中间操作
 */

public class StreamAPITest1 {
    
    //1. 筛选与切片
    @Test
    public void test1(){

        List<Employee> employees = EmployeeData.getEmployees();
        //filter(Predicate P) - 接收Lambda，从流中排除某些元素
        Stream<Employee> stream = employees.stream();
        //练习：查询员工表中薪资大于7000的员工
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
        System.out.println("---------------------------------");
        //limit(long n) - 截断流，使其元素不超过给定数量
        stream = employees.stream();
        stream.limit(3).forEach(System.out::println);
        System.out.println("---------------------------------");
        //skip(long n) - 跳过元素，返回一个扔掉了前n个元素的流
        stream = employees.stream();
        stream.skip(6).forEach(System.out::println);
        System.out.println("---------------------------------");
        //distinct() - 去重
        stream = employees.stream();
        stream.distinct().forEach(System.out::println);

    }

    //映射
    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        //map(Function F) - 接收Lambda，将元素转换成其他形式或提取信息
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        //获取员工姓名长度大于3的员工姓名
        employees.stream().map(Employee::getName).filter(name -> name.length() > 3).forEach(System.out::println);
        System.out.println("---------------------------------");
        
        //练习2
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);
        streamStream.forEach(s -> s.forEach(System.out::println));

        System.out.println("---------------------------------");
        //flatMap(Function F) - 接收Lambda，将流中的每个值都换成另一个流，然后把所有流连接成一个流
        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);


    }

    public static Stream<Character> fromStringToStream(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : str.toCharArray()){
            list.add(c);
        };
        return list.stream();
    }

    @Test
    public void test3(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);
    }


    //3.排序
    @Test
    public void test4(){
        
        //sorted() - 自然排序
        List<Integer> list = Arrays.asList(12,43,65,23,45,67,89,34,56,78,90, -7);
        list.stream().sorted().forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("---------------------------------");
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted().forEach(System.out::println);
        System.out.println("---------------------------------");
        //sorted(Comparator com) - 自定义排序
        employees.stream().sorted((e1, e2) -> {
            if(e1.getAge() == e2.getAge()){
                return Double.compare(e1.getSalary(), e2.getSalary());
            }else{
                return e1.getAge() - e2.getAge();
            }
        }).forEach(System.out::println);
    }
}
