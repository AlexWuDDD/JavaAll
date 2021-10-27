package com.alex.java;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {
    
    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型

    T orderT;

    public Order(){

        //编译不通过
        // T[] t = new T[10];

        T[] arr = (T[]) new Object[10];

    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }


    public String getOrderName() {
        return this.orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    //如下的三个方法都不是泛型方法
    public T getOrderT() {
        return this.orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }
    

    @Override
    public String toString() {
        return "{" +
            " orderName='" + getOrderName() + "'" +
            ", orderId='" + getOrderId() + "'" +
            ", orderT='" + getOrderT() + "'" +
            "}";
    }

    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //换句话说，泛型方法所属的类是不是泛型类都没有关系 
    
    public <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();
        for(E e : arr){
            list.add(e);
        }
        return list;
    }

}
