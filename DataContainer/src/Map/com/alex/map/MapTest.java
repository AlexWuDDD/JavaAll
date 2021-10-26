package Map.com.alex.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {

    @Test
    public void test5(){
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put(45, 1234);
        map.put("BB", 567);
        map.put("CC", 456);

        //遍历所有的key
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Object key = it.next();
            System.out.println(key);
        }

        System.out.println();

        //遍历所有的value
        Collection values = map.values();
        for(Object value : values){
            System.out.println(value);
        }

        System.out.println();
        //遍历所有的key-value
        Set entrySet = map.entrySet();
        Iterator it2 = entrySet.iterator();
        while(it2.hasNext()){
            Map.Entry entry = (Map.Entry) it2.next();
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }


    }

    @Test
    public void test4(){
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        System.out.println(map.get(45));
        System.out.println(map.containsKey("BB"));
        System.out.println(map.containsValue(123));
        
        map.clear();
        System.out.println(map.isEmpty());
    }

    @Test
    public void test3(){
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        //修改
        map.put("AA", 87);

        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC", 123);
        map1.put("DD", 123) ;

        map.putAll(map1);

        System.out.println(map);

        //remove
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        //clear
        map.clear();
        System.out.println(map.size());
        System.out.println(map);

    }

    @Test
    public void test2(){
        Map map = new LinkedHashMap();
        map.put(123, "AA");
        map.put(345, "BB");
        map.put(12, "CC");

        System.out.println(map);
    }
    
    @Test
    public void test1(){
        Map map =  new HashMap();

        map.put(null, 123);
        
    }
}
 