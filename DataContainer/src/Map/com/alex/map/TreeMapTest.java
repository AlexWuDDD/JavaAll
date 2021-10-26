package Map.com.alex.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

import org.junit.Test;

public class TreeMapTest {
    
    //向TreeeMap中key-value, 要求key必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    @Test
    public void test1(){
        TreeMap map = new TreeMap();

        User u1 =  new User("Tom", 23); 
        User u2 =  new User("Jerry", 25); 
        User u3 =  new User("Jack", 33); 
        User u4 =  new User("Rose", 18); 

        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    int compare  = -u1.getName().compareTo(u2.getName());
                    if(compare != 0){
                        return compare;
                    }
                    else{
                        return Integer.compare(u1.getAge(), u2.getAge());
                    }
                }
                else{
                    throw new RuntimeException("传入的参数不是User类型");
                }
            }
        });

        User u1 =  new User("Tom", 23); 
        User u2 =  new User("Jerry", 25); 
        User u3 =  new User("Jack", 33); 
        User u4 =  new User("Rose", 18); 

        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
