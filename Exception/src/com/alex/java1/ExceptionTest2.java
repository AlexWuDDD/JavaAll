package com.alex.java1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class ExceptionTest2 {

    public static void main(String[] args) {
        try{
            method2();
        }
        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }
        catch(IOException e){
            System.out.println("IOException");
        }
    }


    public static void method2() throws FileNotFoundException, IOException {
        method1();
    }
    
    public static void method1() throws FileNotFoundException, IOException{

        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while(data != -1){
            System.out.print((char)data);
            data = fis.read();
        }
        fis.close();
    }
}
