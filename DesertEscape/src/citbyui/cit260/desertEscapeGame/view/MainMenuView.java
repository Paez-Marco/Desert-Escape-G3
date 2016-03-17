/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import byui.cit260.desertEscapeGame.control.MapControl;
import byui.cit260.desertEscapeGame.exceptions.MapControlException;
import byui.cit260.desertEscapeGame.model.Actor;
import byui.cit260.desertEscapeGame.model.Player;
import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;
import desertescape.DesertEscape;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paez & Mambou
 */
public class MainMenuView extends View {

    private String displayMessage = "";
    private String displayMenu = "";

    public MainMenuView() {

        // displayPromptMessage = "Please enter any menu option ";       
        //this.displayMessage = "\nPlease enter menu option";
        super("\n"
                + "\n----------------------------"
                + "\n         MAIN MENU"
                + "\n----------------------------"
                + "\n  N - Start New Game"
                + "\n  R - Resume Game"
                + "\n  H - How to play the game"
                + "\n  S - Save Game"
                + "\n  G - Go to Scenes"
                + "\n  Q - Quit"
                + "\n"
                + "\n  Please Ente Your Menu Selection Below"
                + "\n  "
                + "\n----------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // Convert menuOpton to uppercase

        switch (value) {
            case "N": 
        {
            try {
                // Create and Start New Game
                this.startNewGame();
            } catch (MapControlException ex) {
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                    
                    //System.out.println();
                    //Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "R": // resume the game
                this.resumeGame();
                break;
            case "H": // dislay help menu
                this.displayHelpMenu();
                break;
            case "S": // save the game
                this.saveGame();
                break;
            case "G": // Go to Scenes
                this.goToScene();
                break;
            case "Q": // quit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() throws MapControlException{

        //create new Game 
        GameControl.createNewGame(DesertEscape.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

        //GameMenuView game = new GameMenuView();
        //game.MoveNorth();
        // fuel use control
        /*FuelUseVolume fuelUse = new FuelUseVolume();
        fuelUse.fuelUse();*/
        //create BodyMassView() and display the calculation
        /*BodyMassView bodyMassView = new BodyMassView();
        bodyMassView.displayBodyMassView();*/
        // Run Mission select
        // Mission(AlienCamp);
    }

    private void resumeGame() {
        System.out.println("\n*** resumeGame() function called ***");
    }

    private void displayHelpMenu() {
        GettingHelpView gettingHelpView = new GettingHelpView();
        gettingHelpView.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void goToScene() {
        SceneView sceneView = new SceneView();
        sceneView.display();
    }

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setPlayerName(name);

        DesertEscape.setPlayer(player); // save the player

        return player;
    }

}
