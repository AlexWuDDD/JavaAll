package com.alex.java3;

import org.junit.Test;

public class StudentTest{
    @Test
    public void testStudent(){
        Student s  = new Student();
        // s.register(1001);
        // System.out.println(s);

        try{
            s.register(-1001);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}

class Student{

    private int id;

    public void register(int id) throws Exception{
        if(id > 0 ){
            this.id = id;
        }
        else{
            //System.out.println("您输入的数据非法！");
            //手动抛出异常对象
            throw new Exception("您输入的数据非法！");
        }
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            "}";
    }

}