package com.alex.ooptest;

public class ArrayUtilTest {
    
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();

        int[] arr = new int[]{32,34,32,5,54,654,-98,0};

        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        int min = util.getMin(arr);
        System.out.println("最小值为：" + min);

        int sum = util.getSum(arr);
        System.out.println("和为：" + sum);

        double avg = util.getAverage(arr);
        System.out.println("平均值为：" + avg);

        System.out.println("翻转前：");
        util.print(arr);
        util.reverse(arr);
        System.out.println("翻转后：");
        util.print(arr);

        util.sort(arr);
        util.print(arr);

        int index = util.getIndex(arr, 900);
        if(index == -1){
            System.out.println("没找到");
        }
        else{
            System.out.println("找到了，index: " + index);
        }
    }
}
