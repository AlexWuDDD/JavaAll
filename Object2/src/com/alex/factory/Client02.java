// package com.alex.factory;

// import org.junit.Test;

// interface Car{
//     void run();
// }

// class Audi implements Car{
//     @Override
//     public void run() {
//         System.out.println("Audi is running");
//     }
// }

// class BYD implements Car{
//     @Override
//     public void run() {
//         System.out.println("BYD is running");
//     }
// }

// //工厂类
// class CarFactory{
//     public static Car getCar(String type){
//         if("奥迪".equals(type)){
//             return new Audi();
//         }else if("比亚迪".equals(type)){
//             return new BYD();
//         }else{
//             return null;
//         }
//     }
// }

// public class Client02 {
//     @Test
//     public void test01(){
//         Car a = CarFactory.getCar("奥迪");
//         a.run();
//         Car b = CarFactory.getCar("比亚迪");
//         b.run();

//     }
// }
