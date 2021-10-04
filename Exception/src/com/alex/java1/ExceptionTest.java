// package com.alex.java1;

// import java.io.FileInputStream;
// import java.io.File;
// import java.util.Date;
// import java.util.Scanner;

// import org.junit.Test;

// public class ExceptionTest {

//     @Test
//     public void test7(){
//         File file = new File("hello.txt");
//         FileInputStream fis = new FileInputStream(file);
//         int data = fis.read();
//         while(data != -1){
//             System.out.print((char)data);
//         }
//         fis.close();
//     }


//     //*******************以下是运行时异常 *******************************************************
//     //ArithmeticException
//     @Test
//     public void test6(){
//         int a = 10;
//         int b = 2;
//         System.out.println(a/b);
//         b = 0;
//         System.out.println(a/b);
//     }

//     //InputMismatchException
//     @Test
//     public void test5(){
//         Scanner scanner = new Scanner(System.in);
//         int score = scanner.nextInt();
//         scanner.close();
//     }

//     //NumverFormatException
//     @Test
//     public void test4(){
//         String str = "123";
//         str = "abc";
//         int num = Integer.parseInt(str);
//     }
    
//     //ClassCastException
//     @Test
//     public void test3() {
//         Object obj = new Date();
//         String str = (String) obj;
//     }

//     //ArrayIndexOutOfBoundsException
//     @Test
//     public void test2(){
//         // int[] arr = new int[10];
//         // System.out.println(arr[10]);

//         //StringIndexOutOfBoundsException
//         String str = "abc";
//         System.out.println(str.charAt(3));
//     }


//     //NullPointerException
//     @Test
//     public void test1(){
//         // int[] arr = null;
//         // System.out.println(arr[3]);

//         String str = "abc";
//         str = null;
//         System.out.println(str.charAt(0));
//     }
// }
