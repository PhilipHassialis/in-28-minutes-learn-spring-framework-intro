package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario going up");
    }

    public void down() {
        System.out.println("Mario going down");
    }

    public void left() {
        System.out.println("Mario going left");
    }

    public void right() {
        System.out.println("Mario going right");
    }
}
