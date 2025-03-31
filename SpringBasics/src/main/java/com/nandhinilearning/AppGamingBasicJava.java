package com.nandhinilearning;

import com.nandhinilearning.game.GameRunner;
import com.nandhinilearning.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}