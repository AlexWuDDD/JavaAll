package Collection.com.alex.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

public class ForTest {
    
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new String("Tom"));
        coll.add(new Person("张三", 18));

        for(Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
