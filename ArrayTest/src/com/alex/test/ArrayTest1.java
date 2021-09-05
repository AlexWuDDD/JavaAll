package com.alex.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = getRandomInt(10, 99);
        }

        //求数组原色的最大值
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("Max value is " + maxValue);
        //求数组原色的最小值

        int minValue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Min value is " + minValue);

        //求数组原色的总和
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Min total is " + sum);

        //求数组原色的平均数
        double avg = sum / arr.length;
        System.out.println("Avg is " + avg);

    }

    //所有的随机数都是两位数
    //[10,99]
    //公式: Math.random() * (b - a + 1) + a
    private static int getRandomInt(int a, int b){
        return (int)(Math.random() * (b - a + 1) + a);
    }
    
}
