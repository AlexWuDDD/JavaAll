package com.alex.sort;

public class ArraySort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32,76,-98,0, 64,33,-21,32,99};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int base = arr[start];
            int low = start;
            int high = end + 1;
            while(true) {
                while(low < end && arr[++low] <= base)
                    ;
                while(high > start && arr[--high] >= base)
                    ;
                if(low < high){
                    swap(arr, low, high);
                }
                else{
                    break;
                }
            }
            swap(arr, start, high);
            quickSort(arr, start, high - 1);
            quickSort(arr, high + 1, end);
        }
    }
}
