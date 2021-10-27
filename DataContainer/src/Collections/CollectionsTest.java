package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * Collections: 操作Collection、Map的工具类
 * 
 * 面试题：Collection 和 Collections的区别？
 * 
 * 
 * Collections类中提供了多个synchronizedXxx()方法，该方法可使将指定
 * 集合包装成线程同步的集合，从而解决多线程并发访问集合时的线程安全问题。
 */

public class CollectionsTest {

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(2323);
        list.add(278);

        //返回的list1即为线程安全的List
        List list1 = Collections.synchronizedList(list);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(2323);
        list.add(278);
        list.add(356);
        list.add(356);
        list.add(356);
        list.add(356);

        //错误的写法
        // List dest = new ArrayList();
        // Collections.copy(dest, list);
        // System.out.println(dest);
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest, list);
        System.out.println(dest);
    }
    
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(2323);
        list.add(278);
        list.add(356);
        list.add(356);
        list.add(356);
        list.add(356);

        System.out.println(list);
        // Collections.reverse(list);
        // Collections.shuffle(list); //随机化
        // Collections.sort(list);
        // Collections.sort(list, new Comparator() {
        //    @Override
        //     public int compare(Object o1, Object o2) {
        //        if(o1 instanceof Integer && o2 instanceof Integer){
        //            return -((Integer)o1).compareTo((Integer)o2);
        //        }
        //        else{
        //            throw new RuntimeException("参数类型不匹配");
        //        }
        //    } 
        // });
        // Collections.swap(list, 1, 3);

        Object max = Collections.max(list);
        Object min = Collections.min(list);
        System.out.println(max + " " +min);
        System.out.println(Collections.frequency(list, 356));
        System.out.println(list);
    }
}
