package com.in28minutes.learnspringframework.game;

public class PacManGame implements GamingConsole {

    @Override
    public void up() {
       System.out.println("PacMan going up");
    }

    @Override
    public void down() {
        System.out.println("PacMan going down");
    }

    @Override
    public void left() {
        System.out.println("PacMan going left");
    }

    @Override
    public void right() {
        System.out.println("PacMan going right");
    }
    
}
