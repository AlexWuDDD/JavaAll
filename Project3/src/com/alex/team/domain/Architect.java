package com.alex.team.domain;


public class Architect extends Designer {
    
    private int stock;

    public Architect(){
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock){
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam(){
        return getMemberid()+ "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "架构师" + "\t" + getBonus() + "\t" + stock;
    }
}
