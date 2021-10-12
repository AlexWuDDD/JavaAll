package com.alex.java3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 100; ++i){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 100; ++i){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}



public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        //设置线程的属性
        System.out.println(service.getClass());
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        service1.setCorePoolSize(15);
        // service1.setKeepAliveTime(time, unit);

        service.execute(new NumberThread());
        service.execute(new NumberThread1());
        // service.submit();

        service.shutdown();
    }
}
