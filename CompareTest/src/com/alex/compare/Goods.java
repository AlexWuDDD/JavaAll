package com.alex.compare;

public class Goods implements Comparable{
    
    private String name;
    private double price;

    public Goods(){

    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods g = (Goods)o;
            if(this.price > g.price){
                return 1;
            }
            else if(this.price < g.price){
                return -1;
            }
            else{
                return 0;
            }
            //方式二
            // return Double.compare(this.price, g.price);
        }
        // return -1;
        throw new RuntimeException("传入的数据类型不一致");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
