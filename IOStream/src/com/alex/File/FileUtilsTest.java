package com.alex.File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsTest {

    private String filePath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/File/hello.txt";
    private String filePath2 = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/File/hello2.txt";

    @Test
    public void test1(){
        File srcFile = new File(filePath);
        File dstFile = new File(filePath2);
        try {
            FileUtils.copyFile(srcFile, dstFile);
        } catch (IOException e) {
            System.out.println(e.getMessage()); 
        }
    }
    
}
