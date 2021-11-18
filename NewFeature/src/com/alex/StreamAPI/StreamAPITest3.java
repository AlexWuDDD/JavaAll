package com.alex.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.alex.java2.Employee;
import com.alex.java2.EmployeeData;

import org.junit.Test;

/**
 * 测试Stream的终止操作
 */

public class StreamAPITest3 {
    
    //1 - 匹配与查找
    @Test
    public void test1(){

        List<Employee> employees = EmployeeData.getEmployees();
        //allMatch(Predicate p) - 检查是否匹配所有元素。 
        //练习：是否说有的员工的都大于18
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

        //anyMatch(Predicate p) - 检查是否至少匹配一个元素。
        //练习：是否存在员工的工资大于10000
        boolean anyMatch = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(anyMatch);

        //noneMatch(Predicate p) - 检查是否没有匹配所有元素。
        //练习：是否存在员工的姓“雷”
        boolean noneMatch = employees.stream().noneMatch(e -> e.getLastName().equals("雷"));
        System.out.println(noneMatch);

        //findFirst() - 返回第一个元素
        Optional<Employee> employee =  employees.stream().findFirst();
        System.out.println(employee);

        //findAny() - 返回当前流中的任意元素
        Optional<Employee> employee2 =  employees.parallelStream().findAny();
        System.out.println(employee2);

    }

    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();

        //count() - 返回流中元素的总个数
        long count = employees.stream().count();
        System.out.println(count);

        //max(Comparator c) - 返回流中最大值
        Optional<Employee> max = employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        System.out.println(max);

        //min(Comparator c) - 返回流中最小值
        Optional<Employee> min = employees.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        System.out.println(min);

        //forEach(Consumer c) - 依次对流中的每个元素执行指定的操作
        employees.stream().forEach(e -> System.out.println(e));
    }

    //归约
    @Test
    public void test3(){
        List<Employee> employees = EmployeeData.getEmployees();

        //reduce(T identity, BinaryOperator op) - 将流中元素反复结合起来，得到一个值
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int ret = list.stream().reduce(0, Integer::sum);
        System.out.println(ret);
        //练习：计算员工工资总和
        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

        //reduce(BinaryOperator op) - 将流中元素反复结合起来，得到一个值
        //练习：计算员工工资的平均值
        double avg = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(avg);


    }

    //收集
    @Test   
    public void test4(){
        List<Employee> employees = EmployeeData.getEmployees();

        //collect(Collector c) - 将流转换为其他形式
        List<Employee> collectList = employees.stream().filter(predicate -> predicate.getSalary() > 6000).collect(Collectors.toList());
        collectList.forEach(System.out::println);
        System.out.println("=======================");

        Set<Employee> collectSet = employees.stream().filter(predicate -> predicate.getSalary() > 6000).collect(Collectors.toSet());
        collectSet.forEach(System.out::println);


        //练习：把员工的姓名拼接成一个字符串
        String collect = employees.stream().map(Employee::getLastName).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(collect);
    }
}
