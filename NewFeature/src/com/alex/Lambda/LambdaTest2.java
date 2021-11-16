package com.alex.Lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;

/**
 * java内置的4大核心函数式接口
 * 
 * 消费型接口：Consumer<T> void accept(T t);
 * 供给型接口：Supplier<T> T get();
 * 函数型接口：Function<T, R> R apply(T t);
 * 断定型接口：Predicate<T> boolean test(T t);
 * 
 */

public class LambdaTest2 {
    
    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double t) {
                System.out.println("消费了"+t);
            }
        });

        happyTime(1000, t -> System.out.println("消费了" + t));
    }

    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    @Test   
    public void test2(){
        List<String> list = List.of("hello", "world", "java");
        filterString(list, new Predicate<String>(){
            @Override
            public boolean test(String t) {
                return t.contains("a");
            }
        });

        filterString(list, s -> s.contains("ll"));
    }

    public void filterString(List<String> list, Predicate<String> pre){
        for (String s : list) {
            if(pre.test(s)){
                System.out.println(s);
            }
        }
    }
}
