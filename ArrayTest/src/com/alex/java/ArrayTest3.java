package com.alex.java;

/**
 * 二维数组的使用
 * 外层元素
 * 内层元素
 * 
 */

public class ArrayTest3 {
    public static void main(String[] args) {
        System.out.println("ArrayTest3");

        int[][] arr = new int[4][3];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);

        String[][] arr2 = new String[4][3];
        System.out.println(arr2[1]);
        System.out.println(arr2[1][1]);

        double[][] arr3 = new double[4][3];
        System.out.println(arr3[1]);

    }
}
