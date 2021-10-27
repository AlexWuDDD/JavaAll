package com.alex.exe;

import java.util.List;

import org.junit.Test;

public class DaoTest {
    
    @Test
    public void test1(){

        Dao<User> dao = new Dao<>();

        dao.save("1001", new User(1001, 34, "周杰伦"));
        dao.save("1002", new User(1002, 32, "林俊杰"));
        dao.save("1003", new User(1003, 31, "王力宏"));
        
        dao.update("1003", new User(1003, 23, "萧敬腾"));

        List<User> list = dao.list();
        
        System.out.println(list);

        list.forEach(System.out::println);
    }
}
