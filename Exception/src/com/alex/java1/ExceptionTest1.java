package com.alex.java1;

import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {

    @Test
    public void test2(){
        try{
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
            }
            fis.close();
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
    }

    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println("hello-----1");
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException: " + e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("hello-----2");
    }

}
