package com.alex.java4;


public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public abstract double earnings();


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", number='" + number + "'" +
            ", birthday='" + birthday.toDateString() + "'" +
            "}";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }
    
}
