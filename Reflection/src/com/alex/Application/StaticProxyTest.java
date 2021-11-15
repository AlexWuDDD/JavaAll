package com.alex.Application;

import org.junit.Test;

/**
 * 静态代理举例
 * 特点：代理类和被代理类在编译期间，就确定下来了，不需要在运行期间再去确定。
 */

interface ClothFactory{
    public void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory factory;//用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory){
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些收尾工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}

public class StaticProxyTest{

    @Test
    public void test1(){
        NikeClothFactory nike = new NikeClothFactory();

        ProxyClothFactory proxy = new ProxyClothFactory(nike);

        proxy.produceCloth();
    }
}