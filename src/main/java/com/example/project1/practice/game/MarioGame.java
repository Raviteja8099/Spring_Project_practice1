package com.example.project1.practice.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameingConsole{
    @Override
    public void up() {
        System.out.println("mario game Up");
    }

    @Override
    public void down() {
        System.out.println("mario game down");
    }

    @Override
    public void left() {
        System.out.println("mario game left");
    }

    @Override
    public void right() {
        System.out.println("mario game right");
    }
}
