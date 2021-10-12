package com.alex.communication;

class Clerk{

    private int productCount = 0;

    public synchronized void produceProduct(){

        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + ": 开始生产第 " + productCount + " 个产品");
            notify();
        }
        else{
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct(){
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + ": 开始消费第 " + productCount + " 个产品");
            productCount--;
            notify();
        }
        else{
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Producor extends Thread{

    private Clerk clerk;

    public Producor(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始生产产品......");
    
        while(true){
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Customer extends Thread{

    private Clerk clerk;

    public Customer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费产品......");
    
        while(true){
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}


public class ProductTest {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producor p1 = new Producor(clerk);
        Customer c1 = new Customer(clerk);
        Customer c2 = new Customer(clerk);

        p1.setName("生产者1");
        c1.setName("消费者1");
        c2.setName("消费者2");

        p1.start();
        c1.start();
        c2.start();
    }
    
}
