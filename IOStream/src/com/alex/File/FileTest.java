package com.alex.File;

import java.io.File;
import java.util.Date;

import org.junit.Test;

/**
 * File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 */

public class FileTest {

    @Test
    public void test6(){
        String path = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/File/hi.txt";
        File file1 = new File(path);
        if(!file1.exists()){
            try{
                file1.createNewFile();
                System.out.println("创建成功");
            }
            catch(Exception e){
                System.out.println("文件创建失败");
            }
        }
        else{
            file1.delete();
            System.out.println("删除成功");
        }

        String path2= "/Users/alexwu/Documents/JavaNotes/IOStream/test";
        File file2 = new File(path2);
        if(!file2.exists()){
            file2.mkdir();
        }

        String path3= "/Users/alexwu/Documents/JavaNotes/IOStream/test/a/b";
        File file3 = new File(path3);
        if(!file3.exists()){
            file3.mkdirs();
        }

    }

    @Test
    public void test5(){
        File file1 = new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/File/hello.txt");
        System.out.println(file1.exists());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.canExecute());
        System.out.println(file1.isHidden());
    }

    @Test
    public void test3(){
        File file1 = new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/File/hello.txt");
        File file2 = new File("/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/File/hi.txt");
        if(file1.exists() && !file2.exists()){
            file1.renameTo(file2); //改名
        }
    }

    @Test
    public void test2(){
        File file1 = new File("/Users/alexwu/Documents/JavaNotes/IOStream", "hello.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getParentFile());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        File file2 = new File("/Users/alexwu/Documents/JavaNotes/IOStream");
        if(file2.isDirectory()){
            String[] files = file2.list();
            for(String file : files){
                System.out.println(file);
            }

            File[] files2 = file2.listFiles();
            for(File file : files2){
                System.out.println(file.getName());
            }
        }
    }

    @Test
    public void test1(){
        //构造器1
        File file1 = new File("./hello.txt");
        File file2 = new File("/Users/alexwu/Documents/JavaNotes/IOStream/hello.txt");
        File file3 = new File(File.separator + "Users" + File.separator + "alexwu" + "/Documents/JavaNotes/IOStream/hello.txt");
        File file4 = new File(".");

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);

        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());

        System.out.println("===================================");

        //构造器2
        File file5 = new File("/Users/alexwu/Documents/JavaNotes/IOStream", "hello.txt");
        System.out.println(file5);

        System.out.println("===================================");

        //构造器3
        File file6 = new File("/Users/alexwu/Documents/JavaNotes", "IOStream");
        System.out.println(file6.isDirectory());
        System.out.println(file6.isFile());
        File file7 = new File(file6, "hello.txt");
        System.out.println(file7);
        System.out.println(file7.exists());

    }
}