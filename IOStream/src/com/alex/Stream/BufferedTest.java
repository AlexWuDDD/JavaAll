package com.alex.Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class BufferedTest {
    
    /**
     * 实现非文本文件的复制
     */
    @Test
    public void bufferedStreamTest(){
        //1.造文件
        String srcPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/test.mp4";
        String dstPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/test2.mp4";
        File fileInput = new File(srcPath);
        File fileOutput = new File(dstPath);

        //2造流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            //2.1 造节点流
            fis = new FileInputStream(fileInput);
            fos = new FileOutputStream(fileOutput);

            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.读写
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            //关闭资源
            //要求：先关闭外层的流，再关闭内层的流
            //说明：关闭外层流的同时，内层流也会自动的进行关闭

            try{
                if(bis != null){
                    bos.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(bos != null){
                    bis.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            // try{
            //     if(fis != null){
            //         fis.close();
            //     }
            // }
            // catch(Exception e){
            //     System.out.println(e.getMessage());;
            // }

            // try{
            //     if(fos != null){
            //         fos.close();
            //     }
            // }
            // catch(Exception e){
            //     System.out.println(e.getMessage());;
            // }
        }
    }

    /**
     * 实现文本文件的复制
     */

    public void copyFileWithBuffered(String srcPath, String dstPath){
        //1.造文件
        if(srcPath == null || dstPath == null){
            return;
        }

        File fileInput = new File(srcPath);
        File fileOutput = new File(dstPath);

        //2造流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            //2.1 造节点流
            fis = new FileInputStream(fileInput);
            fos = new FileOutputStream(fileOutput);

            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.读写
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            //关闭资源
            //要求：先关闭外层的流，再关闭内层的流
            //说明：关闭外层流的同时，内层流也会自动的进行关闭

            try{
                if(bis != null){
                    bos.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(bos != null){
                    bis.close();
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
        copyFileWithBuffered(srcPath, destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时：" + (end - start) + "ms");
    }


    @Test
    public void testBufferedReaderBufferedWriter(){
        String srcPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hello.txt";
        String dstPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/Stream/hello2.txt";
        File fileInput = new File(srcPath);
        File fileOutput = new File(dstPath);

        //2造流
        FileReader fr= null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            //2.1 造节点流
            fr = new FileReader(fileInput);
            fw = new FileWriter(fileOutput);

            //2.2 造缓冲流
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            //3.读写
            // char[] buffer = new char[1024];
            // int len;
            // while((len = br.read(buffer)) != -1){
            //     bw.write(buffer, 0, len);
            // }
            String data;
            while((data = br.readLine()) != null){
                bw.write(data);
                bw.newLine();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            //关闭资源
            //要求：先关闭外层的流，再关闭内层的流
            //说明：关闭外层流的同时，内层流也会自动的进行关闭

            try{
                if(br != null){
                    br.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(bw != null){
                    bw.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
