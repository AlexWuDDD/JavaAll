package Collection.com.alex.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetTest {

    /**
     * 1. 向TreeSet中添加的数据，要求是相同类的对象
     * 2. 两种排序方式：自然排序(实现Comparable接口)和定制排序（Comparator）
     * 3. 自然排序中，比较两个对象是否相同的标准为：compareTo()返回0， 不再是equals()
     * 4. 
     */

    @Test
    public void test4(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
                else{
                    throw new RuntimeException("参数类型不匹配");
                }
                
            }
        };

        Set set = new TreeSet(com);
        // set.add(456);
        // set.add(123);
        // set.add(-123);

        set.add(new Person("alex", 18));
        set.add(new Person("amy", 19));
        set.add(new Person("eden", 20));
        set.add(new Person("jack", 21));
        set.add(new Person("jack", 56));

        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void test3(){
        Set set = new TreeSet();
        // set.add(456);
        // set.add(123);
        // set.add(-123);

        set.add(new Person("alex", 18));
        set.add(new Person("amy", 19));
        set.add(new Person("eden", 20));
        set.add(new Person("jack", 21));
        set.add(new Person("jack", 56));

        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * LinkedHashSet的使用
     * LinkedHashSet是HashSet的子类，在添加数据的同时，
     * 每个数据还维护了两个引用，记录次数据的前一个数据和后一个数据。
     * 优点：对于频繁的遍历操作，LinkedHashSet比HashSet更高效。
     */

    @Test
    public void test2(){

        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));
        set.add("CC");
        set.add(12);

        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    
    @Test
    public void test1(){

        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));
        set.add("CC");
        set.add(12);

        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
