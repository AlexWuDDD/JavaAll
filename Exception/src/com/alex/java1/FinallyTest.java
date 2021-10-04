package com.alex.java1;

import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {

    @Test
    public void test2(){
        FileInputStream fis = null;
        try{
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
            System.out.println("Exception: " + e.getMessage());
        }
        finally{
            try{
                if(fis != null){
                    fis.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    @Test
    public void testMethod(){
        int num = method();
        System.out.println(num);
    }


    public int method(){
        try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            return -1;
        }
        finally{
            System.out.println("我一定会被执行！！！");
        }
    }

    @Test
    public void test1(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            // e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);  
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("我好帅啊~");
        }
    }
}
