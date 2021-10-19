package com.alex.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

import org.junit.Test;

public class DateTimeTest2 {

    /**
     * DataTimeFormatter 格式化或解析日期、时间
     */
    @Test
    public void test3(){
        //方式一：预定义的标准给是：ISO_LOCAL_DATE_TIME；ISO_LOCAL_DATE; ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);        
        System.out.println(str1);

        TemporalAccessor parse = formatter.parse("2021-10-19T08:36:31.18299");
        System.out.println(parse);

        //方式二： 本地化相关的格式。如：ofLocalizedDateTime(FormatStyle.LONG)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); 
        // DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); 
        String str2 = formatter2.format(localDateTime);
        String str3 = formatter3.format(localDateTime);
        // String str4 = formatter4.format(localDateTime);
        System.out.println(str2);
        System.out.println(str3);
        // System.out.println(str4);

        DateTimeFormatter formatter5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String str5 = formatter5.format(LocalDate.now());
        System.out.println(str5);

        //方式三：自定义格式
        DateTimeFormatter formatter6 = new DateTimeFormatterBuilder()
        .appendPattern("yyyy-MM-dd HH:mm:ss")
        .appendFraction(ChronoField.MICRO_OF_SECOND, 0, 6, true)
        .toFormatter()
        .withZone(ZoneId.systemDefault());

        TemporalAccessor accessor = formatter6.parse("2021-10-19 08:52:32");
        
        System.out.println(accessor);

        Instant instant = Instant.from(accessor);
        System.out.println(instant);
        

    }



    /**
     * 瞬时：Instant
     * 类似 Date类
     */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant); //本初子午线时间

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取对应的毫秒数 距离1970-1-1 00:00:00的毫秒数
        System.out.println(instant.toEpochMilli());

        //
        Instant instant2 = Instant.ofEpochMilli(1634603312426L);
        System.out.println(instant2);

    }
    
    /**
     * LocalDate, LocalTime, LocalDateTime的使用
     */
    @Test
    public void test1() {
        //now():获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():指定年月日、时分秒, 没有偏移量
        LocalDateTime localDateTime1 =  LocalDateTime.of(2020, 10, 6, 13, 13, 13);
        System.out.println(localDateTime1);

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfWeek());

        //体现不可变性
        LocalDate localDate2 =  localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate2);

        //
        LocalDateTime localDateTime3 =  localDateTime.plusMonths(3);
        System.out.println(localDateTime3);

        //
        LocalDateTime localDateTime4 =  localDateTime.minusDays(3);
        System.out.println(localDateTime4);
    }
}
