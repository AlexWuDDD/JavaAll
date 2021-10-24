package Collection.com.alex.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class CollectionTest{

    @Test
    public void test10(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new String("Tom"));
        coll.add(new Person("张三", 18));

        /**
         * 如果还未调用next()或在上一次调用next方法字后
         * 已经调用了remove方法
         * 再调用remove都会报IllegalStateException异常
         */
        Iterator it = coll.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if("Tom".equals(obj)){
                it.remove();                
            }
        }
        it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void test9(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new Person("张三", 18));

        //错误方式一
        // Iterator it = coll.iterator();
        // while(it.next() != null){
        //     System.out.println(it.next());
        // }

        //错误方式二
        // while(coll.iterator().hasNext()){
        //     System.out.println(coll.iterator().next());
        // }
    }

    @Test
    public void test8(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new Person("张三", 18));

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test7(){
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List ARR1 = Arrays.asList(new int[]{123, 456});
        System.out.println(ARR1.size());

        List ARR2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(ARR2.size());
    }

    @Test
    public void test6(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new Person("张三", 18));

        Object[] arr = coll.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }
    }

    @Test
    public void test5(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new Person("张三", 18));

        Collection coll1 = new ArrayList();
        coll1.add(new Date());
        coll1.add(123);
        coll1.add("AA");
        coll1.add(false); 
        coll1.add(new Person("张三", 18));

        System.out.println(coll.equals(coll1));

        Collection coll2 = new ArrayList();
        coll2.add(456);
        coll2.add(123);

        Collection coll3 = new ArrayList();
        coll3.add(123);
        coll3.add(456);

        System.out.println(coll2.equals(coll3));
    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false); 
        coll.add(new Person("张三", 18));

        //求交集
        Collection coll1 = Arrays.asList(123, 456, 789);
        coll.retainAll(coll1);

        System.out.println(coll);
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false);
        coll.add(new Person("张三", 18));

        boolean ret = coll.remove(123);
        System.out.println(ret);
        System.out.println(coll);

        ret = coll.remove(456);
        System.out.println(ret);

        Collection coll2 = Arrays.asList(123, 456);
        ret = coll.removeAll(coll2);
        System.out.println(ret);
        System.out.println(coll);

    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(new Date());
        coll.add(123);
        coll.add("AA");
        coll.add(false);
        coll.add(new Person("张三", 18));

        System.out.println(coll);
        System.out.println(coll.size());
        System.out.println(coll.contains(false));
        System.out.println(coll.contains(new Person("张三", 18)));

        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add("AA");
        System.out.println(coll.containsAll(coll1));

        Collection coll2 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll2));


    }


    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        coll.add(123); //自动装箱
        coll.add(new Date());

        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");

        coll.addAll(coll1);

        System.out.println(coll.size());

        System.out.println(coll);

        System.out.println(coll.isEmpty());

        coll.clear();

        System.out.println(coll.isEmpty());

    }

}