package com.alex.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest{

    //Calendar
    @Test
    public void test7(){
        //1.实例化
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        //2.常用方法
        //get()
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //add()
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //getTime()
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime()
        Date date2 = new Date();
        calendar.setTime(date2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }

    //练习：”三天打鱼两天晒网“ 1990-01-01 xxxx-xx-xx 打渔？晒网？
    //举例：2021-10-19？总天数
    //总天数%5 = 1，2，3：打渔
    //总天数%5 = 4，0：晒网
    @Test
    public void test6(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date1 = sdf.parse("1990-01-01");
            Date date2 = sdf.parse("2021-10-17");
            long diff = date2.getTime() - date1.getTime();
            System.out.println(diff/(1000*60*60*24));
            double days = Math.ceil(diff / (1000*60*60*24));
            System.out.println(days);
            if(days%5 == 1 || days%5 == 2 || days%5 == 3){
                System.out.println("打渔");
            }else if(days%5 == 4 || days%5 == 0){
                System.out.println("晒网");
            }
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }

    //字符串”2020-09-08“转换为java.sql.Date
    @Test
    public void test5(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("2020-09-08");
            System.out.println(date);
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            System.out.println(sqlDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //SimpleDateFormat
    //对日期Date类的格式化和解析

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        
        String format = sdf.format(date);
        System.out.println(format);

        // String str = "2019-08-09";
        String str = "10/18/21, 6:47 AM";
        sdf.parse(str);
        Date parse = sdf.parse(str);
        System.out.println(parse);

        //*************按照指定的方式格式化和解析，调用带参的构造器***************
        // SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        //解析：要求字符串必须是符合SimpleDateFormat指定格式的(通过构造器参数体现)
        //否则会抛出异常
        Date parse2 = sdf1.parse("2021-10-18 6:56:57");
        System.out.println(parse2); 
    }


    //java.util.Date和子类java.sql.Date
    @Test
    public void test3(){
        java.sql.Date date = new java.sql.Date(1634367350359L);
        System.out.println(date);
        System.out.println(date.getTime());

        Date date3 = new java.sql.Date(1634367350359L);
        java.sql.Date data4 = (java.sql.Date)date3;

        Date date5 = new Date();
        java.sql.Date data6 = new java.sql.Date(date5.getTime());
    }


    @Test
    public void test2(){
        //构造器1
        //创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());

        System.out.println(date1.getTime()); //毫秒数

        //构造器2
       Date date2 =  new Date(1634367350359L);
       System.out.println(date2.toString());


    }

    //System类中currentTimeMillis
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        //返回与1970年1月1日的时间差（毫秒）
        System.out.println(time);
    }


}