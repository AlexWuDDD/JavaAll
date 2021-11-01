package com.alex.Stream;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Test;

public class FileInputOutputStreamTest {
    
    //使用字节流读取文件可能会出现乱码
    @Test
    public void test1(){
        String filePath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hi.txt";
        File file = new File(filePath);

        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            int len = 0;
            byte[] bytes = new byte[5];
            while((len = fis.read(bytes)) != -1){
                System.out.println(new String(bytes, 0, len));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fis != null){
                    fis.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Test
    public void test2(){
        
    }
}
