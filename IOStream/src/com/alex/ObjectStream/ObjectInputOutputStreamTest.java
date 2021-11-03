package com.alex.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ObjectInputOutputStreamTest {

    private String rootPath = "/Users/alexwu/Documents/JavaNotes/IOStream/src/com/alex/ObjectStream";

    @Test
    public void testObjectOutputStream() {
        
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(rootPath + "/object.txt"));
            oos.writeObject(new String("我爱北京天安门"));
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(oos != null){
                    oos.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Test 
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(rootPath + "/object.txt"));
            String content = (String)ois.readObject();
            System.out.println(content);
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(ois != null){
                    ois.close();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
