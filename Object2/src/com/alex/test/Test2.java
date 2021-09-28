package com.alex.test;

interface Playable{
    void play();
}

interface Bounceable{
    void play();
}

interface Rollable extends Playable, Bounceable{
    Ball ball = new Ball("Ping Pang");
}

class Ball implements Rollable{
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(ball.getName());
    }
}

public class Test2 {
    
}
