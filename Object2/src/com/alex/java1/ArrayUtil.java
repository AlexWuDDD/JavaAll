package com.alex.java1;

public class ArrayUtil {
    
    public static int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] arr){
        int minValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double getAverage(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; ++i){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
