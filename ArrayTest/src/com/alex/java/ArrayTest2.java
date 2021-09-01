package com.alex.java;

public class ArrayTest2 {
    public static void main(String[] args) {
        System.out.println("二维数组");
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3}, {4,5}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];


        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);
        arr3[0] = new String[]{"111","222"};
        System.out.println(arr3[0][1]);

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
