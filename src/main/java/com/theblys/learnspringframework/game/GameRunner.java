package com.theblys.learnspringframework.game;

public class GameRunner {

	MarioGame game;
	
	public GameRunner(MarioGame marioGame) {
		this.game = marioGame;
	}

	public void run() {
		System.out.println("running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}