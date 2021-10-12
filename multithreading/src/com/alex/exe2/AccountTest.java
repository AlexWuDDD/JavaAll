package com.alex.exe2;

/**
 * 银行有一个账户
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次，
 * 每次存完打印账户余额
 */

class Account{
    private double balance;

    Account(double balance){
        this.balance = balance;
    }

    public  synchronized void deposit(double amount){
        if(amount > 0){
            balance += amount;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
        }
    }

}

class Customer extends Thread{

    private Account account;

    public Customer(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; ++i){
            account.deposit(1000);
        }
    }

}



public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);

        customer1.setName("甲");
        customer2.setName("已");

        customer1.start();
        customer2.start();
    }
}
