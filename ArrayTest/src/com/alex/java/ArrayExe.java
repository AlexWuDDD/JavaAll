package com.alex.java;
class ArrayExe {
    public static void main(String[] args) {
        //使用二维数组打印一个10行杨辉三角
        int[][] yanghui = new int[10][];
        for(int i = 0; i < 10; ++i){
            yanghui[i] = new int[i+1];
            //每行首末元素赋值为1
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;

            //每行的非首末元素复制
            if(i > 1){
                for(int j = 1; j < i; ++j){
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }


        for(int i = 0; i < yanghui.length; ++i){
            for(int j = 0; j < yanghui[i].length; ++j){
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}