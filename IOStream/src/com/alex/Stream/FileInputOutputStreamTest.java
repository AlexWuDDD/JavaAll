package com.alex.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
        String filePath1 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog.jpeg";
        String filePath2 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/dog2.jpeg";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        FileInputStream fis1 = null;
        FileOutputStream fos2 = null;

        try{
            fis1 = new FileInputStream(file1);
            fos2 = new FileOutputStream(file2);

            int len = 0;
            byte[] bytes = new byte[5];
            while((len = fis1.read(bytes)) != -1){
                fos2.write(bytes, 0, len);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fis1 != null){
                    fis1.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(fos2 != null){
                    fos2.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //指定路径下文件的复制
    public void copyFile(String srcPath, String destPath){
        if(srcPath == null || destPath == null){
            return;
        }

        File file1 = new File(srcPath);
        File file2 = new File(destPath);

        FileInputStream fis1 = null;
        FileOutputStream fos2 = null;

        try{
            fis1 = new FileInputStream(file1);
            fos2 = new FileOutputStream(file2);

            int len = 0;
            byte[] bytes = new byte[1024];
            while((len = fis1.read(bytes)) != -1){
                fos2.write(bytes, 0, len);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fis1 != null){
                    fis1.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(fos2 != null){
                    fos2.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Test
    public void testCopyFile(){
        long start = System.currentTimeMillis();

        String srcPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/test.mp4";
        String destPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/test2.mp4";
        copyFile(srcPath, destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时：" + (end - start) + "ms");
    }
}
