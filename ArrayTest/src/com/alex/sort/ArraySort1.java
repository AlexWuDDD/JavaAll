package com.alex.sort;

public class ArraySort1 {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32,76,-98,0, 64,33,-21,32,99};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        bubbleSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }

    /**
     * 冒泡排序的基本思想是：
     * 通过对待排序序列从前向后，一次比较相邻元素的排序码
     * 若发现逆序则交换，使排序码较大的元素书剑从前部向后移
     * 
     * 因为排序过程中，各元素不断接近自己的位置，如果一趟比较下来没有进行过交换，
     * 就说明序列有序，因此要在排序过程中设置一个标志位swap
     * 判断元素是否进行交换，从而减少不必要的比较
     */
    private static void bubbleSort(int[] arr) {
        boolean swap = false;
        for(int i= 0;i < arr.length-1;i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
