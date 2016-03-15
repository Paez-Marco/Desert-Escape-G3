/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import citbyui.cit260.desertEscapeGame.view.MainMenuView;
import byui.cit260.desertEscapeGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Paez & Mambou
 */
public class StartProgramView {
    private String promptMessage;
    
    public void startProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when the view is created
        this.displayBanner();
    }

    public void displayBanner() {
        
        System.out.println(
            "\n/----------------------------------|------------------------\\"
          + "\n|  T H E <<<<< = = = = = = = = = = | To play, you need to   |"
          + "\n|                                  | Divide and Conquer     |"          
          + "\n|  DDD  EEEE  SSS  EEEE RRR  TTTTT | when using the naves.  |"
          + "\n|  D  D E    S     E    R  R   T   | Fly to the different   |"
          + "\n|  D  D EEE   SS   EEE  RRR    T   | sites and obtain       |"
          + "\n|  D  D E       S  E    R  R   T   | more points and lives  |"
          + "\n|  DDD  EEDE SSS   EEEE R  R   T   | each time you win.     |"
          + "\n|                                  | When you divide your   |"          
          + "\n|  = = = = = = = >>>>> E S C A P E | the area, you conquer  |"
          + "\n\\----------------------------------|-----------------------/"
        );
        displayStartProgramView();
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag
        do {
            // prompt for player name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
                  
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to invalid
        
        while (!valid) { // loop while an invalid value entered
            System.out.println("\n" + this.promptMessage); 
            
            value = keyboard.nextLine(); // get the next line typed in the keyboard
            value = value.trim();
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value, it can not be blank");
                continue;
            }
                    
            break;
        }
        
        return value;
    }
    
    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must me greater than one character in lenght");
            return false;
        }
        
        // Call the creater player function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if is unsucessfull
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView();
        return true;
    }

    private void displayNextView() {
        System.out.println("\n*** displayNextView() function called ***");
    }

}
