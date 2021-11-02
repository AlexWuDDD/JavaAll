package com.alex.OtherStream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import org.junit.Test;

public class OtherStream {
    

    public static void main(String[] args) {
        
        InputStreamReader isr = null;
        BufferedReader br = null;

        OutputStreamWriter osw = null;

        try{
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            
            while(true){
                System.out.println("请输入字符串：");
                String data = br.readLine();
                if(data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")){
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }

            osw = new OutputStreamWriter(System.out);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(br != null){
                    br.close();
                }   
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //打印流
    @Test
    public void test1(){
        PrintStream ps = null;
        try{
            FileOutputStream fos = new FileOutputStream(new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/OtherStream/text.txt"));

            ps = new PrintStream(fos, true);

            if(ps != null){
                System.setOut(ps);
            }
            for(int i = 0; i <= 255; ++i){
                System.out.print((char)i);
                if(i%50 == 0){
                    System.out.println();
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            if(ps != null){
                ps.close();
            }
        }
    }

    /**
     * 数据流
     * 作用：用于读取或写出基本数据类型的变量或字符串
     */
    @Test
    public void test3(){
        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/OtherStream/text.txt"));
        
            dos.writeUTF("吴康俊");
            dos.writeInt(30);

            dos.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

        }
    }

    @Test
    public void test4(){
        try{
            DataInputStream dis = new DataInputStream(new FileInputStream("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/OtherStream/text.txt"));
        
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());

            dis.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

        }
    }
}
