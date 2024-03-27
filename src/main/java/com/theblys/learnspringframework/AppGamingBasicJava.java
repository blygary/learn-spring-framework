package com.theblys.learnspringframework;

import com.theblys.learnspringframework.game.GameRunner;
import com.theblys.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
	}

}
