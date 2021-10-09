package com.alex.java;

class Window3 extends Thread{
    
    private static int ticket = 100;
    // private static Object obj = new Object();

    @Override
    public void run() {
        while(show()){
        }
    }

    private static synchronized boolean show(){
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
            --ticket;
            return true;
        }
        else{
            return false;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 t1 = new Window3();
        Window3 t2 = new Window3();
        Window3 t3 = new Window3();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
