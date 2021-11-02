package com.alex.StreamChange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class InputSteamReaderTest {
    
    String fileSrc = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/StreamChange/test.txt";
    String fileDst = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/StreamChange/test2.txt";
    @Test
    public void test1(){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try{
            fis = new FileInputStream(new File(fileSrc));
            isr = new InputStreamReader(fis, "UTF-8");

            char[] cbuf = new char[1024];
            int len;
            while((len = isr.read(cbuf)) != -1){
                System.out.println(new String(cbuf, 0, len));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(isr != null){
                    isr.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Test
    public void test2(){

        File file1 = new File(fileSrc);
        File file2 = new File(fileDst);

        FileInputStream fis = null;
        FileOutputStream fos = null;

        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try{
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis, "UTF-8");
            osw = new OutputStreamWriter(fos, "gbk");

            char[] cbuf = new char[20];
            int len;
            while((len = isr.read(cbuf)) != -1){
                osw.write(cbuf, 0, len);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(isr != null){
                    isr.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                if(osw != null){
                    osw.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
