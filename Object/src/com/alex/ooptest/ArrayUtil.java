package com.alex.ooptest;

public class ArrayUtil {
    
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double getAverage(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int[] copy(int[] arr) {
        return null;
    }

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void quickSort(int[] arr, int left, int right) {
        if(left < right){
            int base = arr[left];
            int low = left;
            int high = right+1;
    
            while(true){
                while(low < right && arr[++low] <= base)
                    ;
                while(high > left && arr[--high] >= base)
                    ;
                if(low < high){
                    swap(arr, low, high);
                }
                else{
                    break;
                }
            }
            swap(arr, left, high);
            quickSort(arr, left, high-1);
            quickSort(arr, high+1, right);
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int getIndex(int[] arr, int dest) {
        int index = -1;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == dest){
                index = i;
            }
        }
        return index;
    }

}
