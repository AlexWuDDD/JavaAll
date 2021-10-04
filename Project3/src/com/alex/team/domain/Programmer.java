package com.alex.team.domain;

import com.alex.team.service.Status;

public class Programmer extends Employee{
    
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment; 

    public Programmer(){
        super();
    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment){
        super(id, name, age, salary);
        this.equipment = equipment;
    }


    public int getMemberid() {
        return this.memberId;
    }

    public void setMemberid(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString(){
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

}
