package com.alex.Optional;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {
    
/**
 * Optional.of(T t): 创建一个Optional实例，t必须非空
 * Optioanl.empty(): 创建一个空的Optional实例
 * Optional.ofNullable(T t): 若t非空，创建Optional实例，否则创建空实例
 */


    @Test
    public void test1(){
        Girl girl = new Girl();
        girl = null;
        Optional<Girl> optionalGirl = Optional.of(girl);
    }

    @Test
    public void test2(){
        Girl girl = new Girl();
        girl = null;
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);

        Girl girl1 = optionalGirl.orElse(new Girl("迪丽热巴"));
        System.out.println(girl1);
        
    }

    public String getGirlName(Boy boy){
        if(boy != null){
            Girl girl = boy.getGirl();
            if(girl != null){
                return boy.getGirl().getName();
            }
        }
        return null;
    }

    @Test
    public void test3(){
        Boy boy = new Boy();
        String girlName = getGirlName(boy);
        System.out.println(girlName);
    }

    public String getGirlName2(Boy boy){
        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        
        Boy boy1 = boyOptional.orElse(new Boy(new Girl("杨幂")));
        Girl girl = boy1.getGirl();

        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        Girl girl1 = girlOptional.orElse(new Girl("热依扎"));

        return girl1.getName();
    }

    @Test
    public void test5(){
        
    }
}
