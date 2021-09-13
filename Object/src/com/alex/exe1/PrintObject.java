package com.alex.exe1;

public class PrintObject {

    public static void main(String[] args) {
        PrintObject po = new PrintObject();
        Circle c = new Circle();
        po.printArea(c, 5);
    }

    public void printArea(Circle c, int time){

        System.out.println("Radius\t\tArea");

        for(int i = 1; i <= time; i++){
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

        c.radius = time+1;
        System.out.println("now radius is " + c.radius);
    }
    
}
