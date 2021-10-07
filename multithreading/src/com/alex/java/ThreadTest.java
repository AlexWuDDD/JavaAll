package com.alex.java;

/**
 * 多线程的创建：方式一：继承于thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run()
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 */

 class MyThread1 extends Thread{
    
    @Override
    public void run() {
        for(int i = 0; i < 100; ++i){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
 }

public class ThreadTest{
    
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        for(int i = 0; i < 100; ++i){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}