package com.alex.java3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class NewThread implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1; i <= 100; ++i){
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();

        FutureTask futureTask = new FutureTask(newThread);

        new Thread(futureTask).start();

        try{
            //get()方法返回值即为futureTask的call()方法的返回值
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
