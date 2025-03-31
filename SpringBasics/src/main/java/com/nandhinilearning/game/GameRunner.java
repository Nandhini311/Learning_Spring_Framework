package com.nandhinilearning.game;

public class GameRunner {

    MarioGame game;
    //gamerunner class is tightly coupled to the mario game,
    //incase you want to run a contragame instead of a Mario game. you will need to make many changes,
    //replace all instances of Mario, call all the methods of contragrame removing ones that of mario game.
    //this is called as tight coupling

   public GameRunner(MarioGame marioGame){
       this.game = marioGame;
   }

   public void run(){
       System.out.println("Running the game: " + game);
       game.up();
       game.down();
       game.left();
       game.right();
   }

}
