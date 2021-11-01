package com.alex.Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class FileReaderWriterTest {
    
    @Test
    public void test1(){
        String filePath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hello.txt";
        File file = new File(filePath);
        System.out.println(file.getAbsolutePath());

        /**
         * 将hello.txt文件内容读入程序中，并输出到控制台
         */
        FileReader fr = null;
        try{
            fr = new FileReader(file);

            //3.数据的读入
            //read():返回读入的一个字符，如果达到文件末尾，返回-1
            // int data = fr.read();
            // while(data != -1){
            //     System.out.print((char)data);
            //     data = fr.read();
            // }
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Test
    public void test2(){
        //1. File类的实例化
        String filePath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hello.txt";
        File file = new File(filePath);

        //2. FileReader类的实例化
        FileReader fr = null;
        try{
            fr = new FileReader(file);

            //3. 读入的操作
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                // for(int i = 0;i < len;i++){
                //     System.out.print(cbuf[i]);
                // }
                String str = new String(cbuf,0,len);
                System.out.print(str);

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            //4. 资源的关闭

            try{
                if(fr != null){
                    fr.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * 从内存中写出数据到硬盘的文件里
     */
    @Test
    public void tes3(){
        String filePath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hi.txt";
        File file = new File(filePath);

        FileWriter fw = null;
        try{
            fw = new FileWriter(file, true);
            fw.write("hello worl2ddddd\n");
            fw.write("hello worl2ddddd\n");
            fw.write("hello worl2ddddd");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fw != null){
                    fw.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    @Test
    public void test4(){
        String filePath1 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hi.txt";
        String filePath2 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hi2.txt";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader(file1);
            fw = new FileWriter(file2, true);
            int data;
            while((data = fr.read()) != -1){
                fw.write((char)data);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(fw != null){
                    fw.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * 字符流不能处理图片文件
     */
    @Test
    public void test5(){
        String filePath1 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog.jpeg";
        String filePath2 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog2.jpeg";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader(file1);
            fw = new FileWriter(file2, true);
            int data;
            while((data = fr.read()) != -1){
                fw.write((char)data);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(fw != null){
                    fw.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
