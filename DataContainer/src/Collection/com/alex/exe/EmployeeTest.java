package Collection.com.alex.exe;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class EmployeeTest {

    //问题二，使用生日排序
    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;
                    return e1.getBirthday().compareTo(e2.getBirthday());
                }
                throw new RuntimeException("参数类型错误");
            }
        };

        TreeSet set = new TreeSet(comparator);

        Employee e1 = new Employee("张三", 20, new MyDate(1998, 2, 14));
        Employee e2 = new Employee("李四", 21, new MyDate(1992, 3, 14));
        Employee e3 = new Employee("王五", 22, new MyDate(1993, 4, 14));
        Employee e4 = new Employee("赵六", 23, new MyDate(1994, 5, 14));
        Employee e5 = new Employee("钱七", 24, new MyDate(1995, 6, 14));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        System.out.println(set);
    }
    

    //问题一，使用自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("张三", 20, new MyDate(1991, 2, 14));
        Employee e2 = new Employee("李四", 21, new MyDate(1992, 3, 14));
        Employee e3 = new Employee("王五", 22, new MyDate(1993, 4, 14));
        Employee e4 = new Employee("赵六", 23, new MyDate(1994, 5, 14));
        Employee e5 = new Employee("钱七", 24, new MyDate(1995, 6, 14));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        System.out.println(set);
    }
}
