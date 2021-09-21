package com.alex.test1;

public class Kids extends ManKind{

    private int yearsold;

    public void printAge(){
        System.out.println("I am " + yearsold + " years old.");
    }

    public Kids(){

    }

    public Kids(int yearsold){
        this.yearsold = yearsold;
    }

    public void setYearsold(int yearsold){
        this.yearsold = yearsold;
    }

    public int getYearsold(){
        return yearsold;
    }

}