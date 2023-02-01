package com.in28minutes.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		PacManGame game = new PacManGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
