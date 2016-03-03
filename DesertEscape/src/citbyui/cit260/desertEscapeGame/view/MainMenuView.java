/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import desertescape.DesertEscape;
import java.util.Scanner;

/**
 *
 * @author mambou
 */
public class MainMenuView {

  private String promptMessage = "";
  private String menu = "";

  public MainMenuView() {

    //promptMessage = "Please enter any menu option "       
    this.promptMessage = "\nPlease enter menu option";

    this.menu = "\n"
            + "\n----------------------------"
            + "\n         MAIN MENU"
            + "\n----------------------------"
            + "\n  N - Start New Game"
            + "\n  R - Resume Game"
            + "\n  H - How to play the game"
            + "\n  S - Save Game"
            + "\n  G - Go to Scenes"
            + "\n  Q - Quit"
            + "\n----------------------------";
  }

  public void displayMainMenuView() {

    boolean done = false; // set flag to not done
    do {
      System.out.println(this.menu);
      // prompt for and get players name
      String menuOption = this.getMenuOption();
      if (menuOption.toUpperCase().equals("Q")) // user wants to quit
      {
        return; // exit the game
      }
      // do the requested action and display the next view
      done = this.doAction(menuOption);

    } while (!done);
  }

  private String getMenuOption() {

    Scanner keyboard = new Scanner(System.in); //get infile for keyboard
    String value = ""; //value to be returned
    boolean valid = false; //initialize to not valid

    while (!valid) { //loop while an invalid is entered
      System.out.println(this.promptMessage);

      value = keyboard.nextLine();// get next line typed on keyboard
      value = value.trim();// trim of leading and trailing blanks

      if (value.length() < 1) { // value is blank
        System.out.println("Invalid value: value cannot be blank");
        continue;
      }
      break; // end loop
    }
    return value; // return value entered
  }

  private boolean doAction(String menuOption) {
    menuOption = menuOption.toUpperCase(); // Convert menuOpton to uppercase

    switch (menuOption) {
      case "N": // Create and Start New Game
        this.startNewGame();
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

  private void startNewGame() {

    FuelUseVolume f = new FuelUseVolume();
    f.fuelUse();

    //create BodyMassView() and display the calculation
    BodyMassView bMV = new BodyMassView();
    bMV.displayBodyMassView();
  }

  private void resumeGame() {
    System.out.println("\n*** resumeGame() function called ***");
  }

  private void displayHelpMenu() {
    GettingHelpView gettingHelpView = new GettingHelpView();
    gettingHelpView.displayGettingHelpView();
  }

  private void saveGame() {
    System.out.println("\n*** saveGame() function called ***");
  }

  private void goToScene() {
    SceneView sceneView = new SceneView();
    sceneView.displaySceneView();
  }
}
