package com.alex.OtherStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput {
    
    //Read s string from Keyboard
    public static String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = "";

        try{
            string = br.readLine();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        return string;
    }

    public static int readInt(){
        return Integer.parseInt(readString());
    }

    public static double readDouble(){
        return Double.parseDouble(readString());
    }

    public static byte readByte(){
        return Byte.parseByte(readString());
    }

    public static short readShort(){
        return Short.parseShort(readString());
    }

    public static long readLong(){
        return Long.parseLong(readString());
    }

    public static float readFloat(){
        return Float.parseFloat(readString());
    }
}
