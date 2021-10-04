package com.alex.team.domain;

public class Printer implements Equipment {

    private String type;
    private String name;

    public Printer(){
        super();
    }

    public Printer(String name, String type) {
        super();
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
    
}
