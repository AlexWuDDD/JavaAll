package com.alex.test;

public class ArraySearch {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA", "LL"};

        String desc = "BB";

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(desc)) {
                System.out.println("Found " + desc + " at index " + i);
            }
        }

        //二分法查找
        int[] arr2 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
        int desc2 = -34;
        int head = 0;
        int end = arr2.length - 1;

        while(head <= end) {
            int mid = (head + end) / 2;
            if(arr2[mid] == desc2) {
                System.out.println("Found " + desc2 + " at index " + mid);
                break;
            }
            else if(arr2[mid] > desc2) {
                end = mid - 1;
            }
            else{
                head = mid + 1;
            }
        }
    }
}
