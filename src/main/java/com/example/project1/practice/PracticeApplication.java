package com.example.project1.practice;

import com.example.project1.practice.game.GameRunner;
import com.example.project1.practice.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.project1.practice","com.example.project1.practice.game","com.example.project1.practice.Controller"})
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(PracticeApplication.class, args);
		GameRunner game=context.getBean(GameRunner.class);
		game.runGame();
	}

}
