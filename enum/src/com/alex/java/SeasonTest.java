package com.alex.java;

import org.junit.Test;

public class SeasonTest{
    @Test
    public void testSeason(){
        Season season = Season.SPRING;
        System.out.println(season);
    }
}

class Season{

    //1. 声明Season类的属性
    private final String seasonName;
    private final String seasonDesc;


    //2.私有化类的构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象
    public static final Season SPRING = new Season("春季","春暖花开");
    public static final Season SUMMER = new Season("夏季","夏日炎炎");
    public static final Season AUTUMN = new Season("秋季","秋高气爽");
    public static final Season WINTER = new Season("冬季","冬日凉快");

    //4. 其他诉求1，获取枚举类对象的属性
    public String getSeasonName(){
        return seasonName;
    }

    public String getSeasonDesc(){
        return seasonDesc;
    }

    //5. 其他诉求2，提供toString方法
    @Override
    public String toString(){
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }


}