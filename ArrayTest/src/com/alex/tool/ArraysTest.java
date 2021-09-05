package com.alex.tool;

/**
 * 操作数组的工具类
 * 里面定义了许多操作数组的方法
 */
import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 9};

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);

        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int index = Arrays.binarySearch(arr2, 5);
        if(index >= 0){
            System.out.println("找到了，index: " + index);
        }
        else{
            System.out.println("没找到");
        }

    }
}