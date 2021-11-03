package com.alex.Decoration;

/**
 * 变形金刚在变形前是一辆汽车，它可以在陆地上移动。当它变成机器人之后
 * 除了能够在陆地上移动之外，还可以说话：
 * 如果需要，它还还可以变成飞机，除了在陆地上移动还可以在天空中飞翔。
 */

/**
 * @Description: 声明一个move方法，无论变形精钢如何改变方法始终都有，是具体构件和抽象装饰类共有的方法。
 *  */ 

interface Transform {
    public void move();
}


/**
 * 
 * @Description ConcreteComponent（具体构件）：Car.java 提供了move方法的实现，
 * 运用构造函数初始化输出当前状态，它是一个可以被装饰的类。在这里Car
 * 被声明为final类型，说明不能通过继承来拓展其功能，需运用类之间的关
 * 联关系来拓展。即装饰器装饰
 */

final class Car implements Transform {

    public Car(){
        System.out.println("变形金刚->车");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动");
    }
}

/**
 *  
 * @Description Decorator（抽象装饰类）：Changer.java 定义一个抽象构件类型的
 * transform，通过构造函数或者setter方法来给该对象赋值，同时也通过调用transform对象
 * 来实现move方法，这样可以保证原方法不被丢失，而且可以在它的子类中增加新的方法，拓展 
 * 原有功能。
 */

 class Changer implements Transform {

    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}

/**
* 
* @Description ConcreteDecorator（具体装饰类）：这里采用的是半透明
*/

class Robot extends Changer{

    public Robot(Transform transform) {
        super(transform);
        System.out.println("->机器人");
    }

    @Override
    public void move() {
        super.move();
        say();
    }

    private void say(){
        System.out.println("说话");
    }
}

class Airplane extends Changer{

    public Airplane(Transform transform) {
        super(transform);
        System.out.println("->飞机");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    private void fly(){
        System.out.println("飞翔");
    }
}

public class DecoratorDemo{

    public static void main(String[] args) {
        Transform machine = new Car();
        machine.move();

        Robot robot = new Robot(machine);
        robot.move();

        Airplane airplane = new Airplane(robot);
        airplane.move();

        Airplane airplane2 = new Airplane(robot);
        airplane2.move();

    }
}


