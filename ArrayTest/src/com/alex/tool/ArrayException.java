package com.alex.tool;

/**
 * 数组中的常见异常
 * 1. 数组角标的越界的异常：ArrayIndexOutOfBoundsException
 * 2. 空指针异常：NullPointerException
 * 
 */

public class ArrayException {
    public static void main(String[] args) {
        // 1. 数组角标的越界的异常：ArrayIndexOutOfBoundsException
        int[] arr = new int[]{1,2,3,4,5};
        // for (int i = 0; i <= arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println(arr[-2]);

        // 2. 空指针异常：NullPointerException
        // case 1
        // int[] arr1 = new int[]{1,2,3};
        // arr1 = null;
        // System.out.println(arr1[0]);

        //case 2
        // int[][] arr2 = new int[2][];
        // System.out.println(arr2[0]);
        // System.out.println(arr2[0][0]);

        //case 2
        String[] arr3 = new String[]{"AA", "BB", "CC"};
        System.out.println(arr3[0].toString());
        System.out.println(arr3[0]);
        arr3[0] = null;
        System.out.println(arr3[0]);
        System.out.println(arr3[0].toString());
    }
}
