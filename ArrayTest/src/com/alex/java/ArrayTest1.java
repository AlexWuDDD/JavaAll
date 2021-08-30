package com.alex.java;

public class ArrayTest1 {
    public static void main(String[] args) {
        System.out.println("Hello, Array!");
        //一维数组的使用
        //1. 一维数组的声明和初始化

        int[] ids;
        ids = new int[]{1001, 1002, 1003, 1004};

        String[] names = new String[5];


        //2. 如何调用数组的指定位置的元素
        names[0] = "alex";
        names[1] = "jack";
        names[2] = "rose";
        names[3] = "tom";
        names[4] = "jerry";
        System.out.println(names[0]);
        //3. 如何访问数组的长度
        System.out.println(names.length);
        //4. 如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //5. 数组元素的默认初始化值
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] arr1 = new String[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //6. 数组的内容解析
        System.out.println("=====================");
        int[] arr2 = new int[]{1, 2, 3};
        String[] arr3 = new String[4];
        arr3[1] = "刘德华";
        arr3[2] = "张学友";
        arr3 = new String[3]; 

        //练习1
        System.out.println("=====================");
        {
            int[] arrT = new int[]{8,2,1,0,3};
            int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
            String tel = "";
            for (int i = 0; i < index.length; i++) {
                tel += arrT[index[i]];
            }
            System.out.println("联系方式：" + tel);
        }
    }
}