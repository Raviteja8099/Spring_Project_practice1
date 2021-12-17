package com.example.project1.practice.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GameingConsole game;

    public GameRunner(GameingConsole game) {
        this.game = game;
    }
    public void runGame(){
        game.down();
        game.left();
        game.right();
        game.up();
    }
}
