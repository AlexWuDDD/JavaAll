package com.alex.ObjectStream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileTest {

    private String filPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/ObjectStream/dog.jpeg";
    private String filPath2 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/ObjectStream/dog2.jpeg";
    private String filPath3 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/ObjectStream/hello.txt";

    @Test
    public void test1(){

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try{
            raf1 = new RandomAccessFile(new File(filPath), "r");
            raf2 = new RandomAccessFile(new File(filPath2), "rw");

            byte[] b = new byte[1024];
            int len = -1;
            while((len = raf1.read(b)) != -1){
                raf2.write(b, 0, len);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            if(raf1 != null){
                try{
                    raf1.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

            if(raf2 != null){
                try{
                    raf2.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Test 
    public void test2() throws IOException{
        RandomAccessFile raf1 = new RandomAccessFile(new File(filPath3), "rw");

        raf1.seek(1);
        raf1.write("xyz".getBytes());
        raf1.close();
    }
}
