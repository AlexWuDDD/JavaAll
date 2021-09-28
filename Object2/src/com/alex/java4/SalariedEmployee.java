package com.alex.java4;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMonthly salary: " + monthlySalary;
    }

}
