package com.alex.java;

import java.util.Scanner;

public class ArrayCmnAlgorithm {
    public static void main(String[] args) {
        // alg1();
        alg2();
    }

    /**
     * 创建一个长度为6的int型数组
     * 要求数组的元素的值都在1~30之间，且是随机复制
     * 同时要求元素的值各不相同
     */
    private static void alg1(){
        int[] arr = new int[6];
        int i = 0;
        while(i < arr.length){
            int random = (int)(Math.random() * 30) + 1;
            Boolean flag = false;
            for(int j = 0 ; j < i; ++j){
                if (arr[j] == random){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                arr[i] = random;
                System.out.println(arr[i]);
                ++i;
            }
        }
    }

    private static void alg2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入回形数的数字：");
        int num = scanner.nextInt();
        // System.out.println(num);
        int[][] arr = new int[num][num];

        int len = num * num;
        
        enum direction{
            right,
            down,
            left,
            up
        };

        direction arrow = direction.right;

        int row = 0, col = -1;
        int circle = 0;
        for(int i = 0; i < len; ++i){
            switch(arrow){
                case right:
                    col++;
                    arr[row][col] = i + 1;
                    if (col == num - 1 - circle){
                        arrow = direction.down;
                    }
                    break;
                case down:
                    row++;
                    arr[row][col] = i + 1;
                    if (row == num - 1 - circle){
                        arrow = direction.left;
                    }
                    break;
                case left:
                    col--;
                    arr[row][col] = i + 1;
                    if (col == 0 + circle){
                        arrow = direction.up;
                        circle++;
                    }
                    break;
                case up:
                    row--;
                    arr[row][col] = i + 1;
                    if (row == 0 + circle){
                        arrow = direction.right;
                    }
                    break;
            };
        }

        for(int i = 0; i < num; ++i){
            for(int j = 0; j < num; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
