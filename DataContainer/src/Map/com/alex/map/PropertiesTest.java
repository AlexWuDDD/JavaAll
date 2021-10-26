// package Map.com.alex.map;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    
    public static void main(String[] args) {
        Properties pros = new Properties();

        try{
            FileInputStream fis = new FileInputStream("test.txt");
            pros.load(fis);

            String name = pros.getProperty("name");
            System.out.println(name);

            int age = Integer.parseInt(pros.getProperty("age"));
            System.out.println(age);
        }
        catch(Exception e){
            System.out.println(e.getMessage());;
        }
    }
}
