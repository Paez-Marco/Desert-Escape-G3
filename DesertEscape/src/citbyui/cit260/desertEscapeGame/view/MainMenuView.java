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
                + "\n--------------------------------"
                + "\n  MAIN MENU"
                + "\n--------------------------------"
                + "\nN - Start New Game"
                + "\nR - Resume Game"
                + "\nH - Help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n--------------------------------";
        System.out.println(this.menu);
    }

    public void displayMainMenuView() {

        boolean done = false; // set flag to not done
        do {
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
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();// get next line typed on keyboard
            value = value.trim();// trim of leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
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
            case "Q": // quit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {

        // create a new game
        GameControl.createNewGame(DesertEscape.getPlayer());

        //display the new game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
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
}
