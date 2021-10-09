package com.alex.java1;

class Bank{

    private Bank(){

    }

    private static Bank instance = null;

    // public static synchronized Bank getInstance(){
    //     if(instance == null){
    //         instance = new Bank();
    //     }
    //     return instance;
    // }

    //方式一：效率稍差
    // public static Bank getInstance(){
    //     synchronized(Bank.class){
    //         if(instance == null){
    //             instance = new Bank();
    //         }
    //         return instance;
    //     }
    // }

    //方式二：效率稍高
    public static Bank getInstance(){
        if(instance == null){
            synchronized(Bank.class){
                if(instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}

public class BankTest {

    public static void main(String[] args) {
        
    }
}