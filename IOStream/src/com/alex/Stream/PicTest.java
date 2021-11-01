package com.alex.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class PicTest {
    
    //图片的加密
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream(new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog.jpeg"));
            fos = new FileOutputStream(new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog3.jpeg"));
            
            int data;
            while((data = fis.read()) != -1){
                fos.write(data^5);
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

            try{
                if(fos != null){
                    fos.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }



    //图片的解密
    @Test
    public void test2(){

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream(new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog3.jpeg"));
            fos = new FileOutputStream(new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog4.jpeg"));
            
            int data;
            while((data = fis.read()) != -1){
                fos.write(data^5);
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

            try{
                if(fos != null){
                    fos.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }    

}
