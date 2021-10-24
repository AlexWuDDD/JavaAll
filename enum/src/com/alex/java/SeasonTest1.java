package com.alex.java;

import org.junit.Test;

public class SeasonTest1 {
    @Test
    public void testSeason1(){
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}

interface Info{
    void show();
}


enum Season1 implements Info{
    SPRING("春天", "春暖花开"){
        @Override
        public void show(){
            System.out.println("春天");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show(){
            System.out.println("夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show(){
            System.out.println("秋天");
        }
    },
    WINTER("冬天", "冬日凉快"){
        @Override
        public void show(){
            System.out.println("冬天");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName(){
        return seasonName;
    }

    public String getSeasonDesc(){
        return seasonDesc;
    }
}