package com.alex.java4;

public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
    
}


abstract class Template{

    public void spendTime(){
        long start = System.currentTimeMillis();
        code(); //不确定部分，易变的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间：" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template{

    @Override
    public void code(){
        for(int i = 2; i <=1000; ++i){
            Boolean isFlag = true;
            for(int j = 2; j <= Math.sqrt(i); ++j){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i + "是质数");
            }
        }
    }

}