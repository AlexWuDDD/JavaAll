package Collection.com.alex.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ListTest {

    /**
     * 面试题
     * 区分list中remove(int index)和remove(Object o)
     */

    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);

    }

    private static void updateList(List list){
        // list.remove(2);
        list.remove(Integer.valueOf(2));
    }

    @Test
    public void test3(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===========================");

        for(Object o : list){
            System.out.println(o);
        }

        System.out.println("===========================");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }


    @Test
    public void test2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 20));
        list.add(456);

        int index = list.indexOf("AA");
        System.out.println(index);

        index = list.indexOf("CC");
        System.out.println(index);

        index = list.lastIndexOf(456);
        System.out.println(index);

        Object obj = list.remove(index);
        System.out.println(obj);
        System.out.println(list);

        List list2 = list.subList(0, 2);

        System.out.println(list2);
    }

    
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 20));

        System.out.println(list);

        list.add(1, "BB");
        System.out.println(list);

        List list1 = Arrays.asList(1,2,3);
        list.addAll(list1);
        System.out.println(list.size());
        System.out.println(list);

    }
}
