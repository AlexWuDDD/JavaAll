package com.alex.java2;

import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable{
    private int ticket = 100;

    //1. 实例化ReentrantLock对象
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run(){
        while(true){
            try{
                //2.调用锁定方法lock()
                lock.lock();
                if(ticket > 0){

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " 售票，票号为 " + ticket);
                    --ticket;
                }
                else{
                    break;
                }
            }
            finally {
                //3.调用解锁方法：unlock
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread t1 = new Thread(window, "窗口1");
        Thread t2 = new Thread(window, "窗口2");
        Thread t3 = new Thread(window, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
