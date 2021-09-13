package com.alex.test;

/**
 * 
 */

public class RecurisonTest {

    public static void main(String[] args){

        int sum = 0;
        for(int i = 0; i <= 100; ++i){
            sum += i;
        }
        System.out.println(sum);
        System.out.println(getSum(100));
        System.out.println(f(0));
        System.out.println(f(1));
        System.out.println(f(5));

    }

    public static int getSum(int n){
        if(n == 1){
            return n;
        }

        return n + getSum(n - 1);
    }
    public static int f(int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 4;
        }
        else{
            return 2*f(n-1)+f(n-2);       
        }
    }
}