package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	
	GamingConsole game;

	public GameRunner(GamingConsole marioGame) {
		// TODO Auto-generated constructor stub
		this.game = marioGame;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running: " + game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
