package com.alex.factory;

import org.junit.Test;

interface Car{
    void run();
}

class Audi implements Car{
    @Override
    public void run() {
        System.out.println("Audi is running");
    }
}

class BYD implements Car{
    @Override
    public void run() {
        System.out.println("BYD is running");
    }
}

//工厂接口
interface Factory{
    Car getCar();
}

//两个工厂类
class AudiFactory implements Factory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}

class BydFactory implements Factory{
    @Override
    public Car getCar() {
        return new BYD();
    }
}

public class Client03 {

    @Test
    public void test(){
       Car a = new AudiFactory().getCar();
       Car b = new BydFactory().getCar();
       a.run();
       b.run();
    }
    
}
