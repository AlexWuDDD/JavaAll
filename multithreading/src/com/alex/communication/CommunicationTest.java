package com.alex.communication;

//使用两个线程打印1-100，线程1，线程2 交替打印

class Number implements Runnable{

    private int number = 1;
    @Override
    public void run() {
        while(true){
            synchronized(this){
                notify();
                if(number <= 100){
                    try{
                        Thread.sleep(100);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() 
                        + ":" + number);
                    ++number;
                    try{
                        //使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                else{
                    break;
                }
            }

        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread1 = new Thread(number, "线程一");
        Thread thread2 = new Thread(number, "线程二");

        thread1.start();
        thread2.start();
    }
}
