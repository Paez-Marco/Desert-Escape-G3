/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscapeGame.model.Difficulty;
import byui.cit260.desertEscapeGame.model.Game;
import byui.cit260.desertEscapeGame.model.Player;
import citbyui.cit260.desertEscapeGame.view.MainMenuView;
import citbyui.cit260.desertEscapeGame.view.StartProgramView;

/**
 *
 * @author Mambou & Paez
 */
public class DesertEscape {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {

        Player player = new Player();
        player.setPlayerName("");
        player.setPlayerTime(5);
        
        /*Game game = new Game();
         DesertEscape.setCurrentGame(game);
          game.setPlayer(name);*/
         
        // Class instance variable Player 
        //Player playerOne = new Player();
        //playerOne.setPlayerName("Gilles");
        //playerOne.setPlayerTime(5);

        //Player playerTwo = new Player();
       // playerTwo.setPlayerName("Marco");
       // playerTwo.setPlayerTime(5);

        // Class Difficulty
       // Difficulty diff = new Difficulty();
       // diff.setName("BEGINNER");
       // diff.setDescription("Starting level");

        //create StartProgramView()rig and display the start program view
       // StartProgramView startProgramView = new StartProgramView();
        //startProgramView.display();

        //create MainMenuProgramView() rig and display the main menu view
       // MainMenuView mainMenuView = new MainMenuView();
       // mainMenuView.display();

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DesertEscape.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DesertEscape.player = player;
    }
}
