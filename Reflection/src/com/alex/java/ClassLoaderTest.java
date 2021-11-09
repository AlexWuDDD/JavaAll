package com.alex.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void test1(){
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());

        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
    }

    /**
     * Properties: 用来读取配置文件
     */
    @Test
    public void test2(){
        FileInputStream fis = null;
        BufferedReader br = null;
        try{
            Properties pros = new Properties();
            fis = new FileInputStream("/Users/alexwu/Documents/JavaNotes/Reflection/src/jdbc.properties");
            br = new BufferedReader(new InputStreamReader(fis, "utf-8"));
            pros.load(br);

            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            System.out.println(user);
            System.out.println(password);

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
            
            if(fis != null){
                try{
                    fis.close();
                }
                catch(Exception e){

                }
            }
        }
    }
}
