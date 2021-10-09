package com.alex.java;

/**
 * 创建三个窗口卖票，总票数为100张
 */

 class Window1 implements Runnable{

    private int ticket = 100;
    // Object obj = new Object();

    @Override
    public void run() {
        while(true){

            synchronized(this){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                if(ticket > 0 ){
                    System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                    --ticket;
                }
                else{
                    break;
                }
            }
        } 
    }
 }

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 window1 =  new Window1();
        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
