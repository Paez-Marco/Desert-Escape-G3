/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscapeGame.model.Difficulty;
import byui.cit260.desertEscapeGame.model.Game;
import byui.cit260.desertEscapeGame.model.Inventory;
import byui.cit260.desertEscapeGame.model.Map;
import byui.cit260.desertEscapeGame.model.Player;
import byui.cit260.desertEscapeGame.model.Scene;
import byui.cit260.desertEscapeGame.model.Villain;
import byui.cit260.desertEscapeGame.model.Map;
import citbyui.cit260.desertEscapeGame.view.BodyMassView;
import citbyui.cit260.desertEscapeGame.view.FuelUseVolume;
import citbyui.cit260.desertEscapeGame.view.GettingHelpView;
import citbyui.cit260.desertEscapeGame.view.MainMenuView;
import citbyui.cit260.desertEscapeGame.view.SceneView;
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

    //create SceneView()rig and display the scene view
    SceneView sV = new SceneView();
    sV.displaySceneView();
    
    // For testing
    FuelUseVolume f = new FuelUseVolume();
    f.fuelUse();

    //create BodyMassView() and display the calculation
    BodyMassView bMV = new BodyMassView();
    bMV.displayBodyMassView();
    
    //create StartProgramView()rig and display the start program view

    /*StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();*/
    /*FuelUseVolume fuelUsePlanet = new FuelUseVolume();
    fuelUsePlanet.fuelUse();*/
    //create MainMenuProgramView() rig and display the main menu view
    /*MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.displayMainMenuView();
        
    //create GettingHelpView() rig and display the Getting help view
    /* GettingHelpView gettingHelpView = new GettingHelpView();
    gettingHelpView.displayGettingHelpView();
        
          
     // Class instance variable Player 
     /*Player playerOne = new Player();
     playerOne.setPlayerName("Gilles");
     playerOne.setPlayerTime(5);
        
     Player playerTwo = new Player();
     playerTwo.setPlayerName("Marco");
     playerTwo.setPlayerTime(5);
        
     // Class Difficulty
     Difficulty diff = new Difficulty();
     diff.setName("BEGINNER");
     diff.setDescription("Starting level");
        
     // Class Inventory
     Inventory invQ = new Inventory();
     invQ.setInventoryItem("Guns");
     invQ.setStockQuantity(0);
        
     // Class Villain
     Villain villPhD = new Villain();
     villPhD.setName("Photo Destroyer");
     villPhD.setDescription("Destroys all that he photografier and print");
     villPhD.setKind("Changeable");
        
     Villain villCar = new Villain();
     villCar.setName("Car Destroyer");
     villCar.setDescription("Destroys all kind of cars");
     villCar.setKind("Changeable");
        
     // Class Scene
     Scene sceneData = new Scene();
     sceneData.setName("The Earth");
        
     // Class Map
     Map mapSite = new Map();
     mapSite.setColumnSite(1);
     mapSite.setRowSite(1);
                
     // toString fields
     String playerInfo1 = playerOne.toString();
     System.out.println(playerInfo1);
        
     String playerInfo2 = playerTwo.toString();
     System.out.println(playerInfo2);
        
     System.out.println(diff.toString());
     System.out.println(invQ.toString());
     System.out.println(villPhD.toString());
     System.out.println(villCar.toString());
     System.out.println(sceneData.toString());
     System.out.println(mapSite.toString());*/
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
