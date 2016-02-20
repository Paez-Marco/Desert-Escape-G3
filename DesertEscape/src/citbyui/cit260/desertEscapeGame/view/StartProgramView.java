/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import byui.cit260.desertEscapeGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author mambou
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        //promptMessage = "Please enter your name"       
        this.promptMessage = "\nPlease enter your name";
        
         //Display a banner when view is created
         this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* This is Nicolas Williams Desert Escape Game :                 *"         
       +"\n* In this game you will take the role of Nicolas Williams       *"
       +"\n* who was born on earth in a distant futur                      *"
       +"\n* But there was a global catastroph.                            *"         
       +"\n* You are forced to leave earth and travel to another planet    *"  
       +"\n*                                                               *"         
       +"\n* You will face many threat on this new planet,                 *" 
       +"\n* and you must avoid being taken by an enemy alien race         *"         
       +"\n* In the game course, you will come to learn of a time machine  *"   
       +"\n* that will allow you to rewrite time and reverse               *"         
       +"\n* he global catastroph that destroyed earth.                    *"
       +"\n* This will become your and van be achieved by hunting down     *"         
       +"\n* artifacts and items and assembling a time machine based off   *"         
       +"\n* of a schematic hat was discovered                             *"          
       +"\n* Find the resources needed to build the time machine and       *"         
       +"\n* save the earth.                                               *"  
       +"\n*                                                               *"         
       +"\n* Good luck and enjoy the adventure                             *"  
       +"\n*                                                               *" 
       +"\n*****************************************************************"
        );
    }

    public void dislayStartProgramView() {
      boolean done = false; //set flag to not done
      do {
          //prompt for and get player name
          String playerName = this.getPlayeName();
          if (playerName.toUpperCase().equals("Q"))// user wants to quit
              return; // exit the game
          
          //do the requested action and  display the next view
          done = this.doAction(playerName);
    
      } while (!done);
      
   }

    private String getPlayeName() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while(!valid){ //loop while an invalid is entered
            System.out.println("\n" + this.promptMessage);
            
        value = keyboard.nextLine();// get next line typed on keyboard
        value = value.trim();// trim of leading and trailing blanks
        
        if(value.length() < 1){ // value is blank
            System.out.println("\nInvalid value: value cannot be blank");
            continue;
        }
        break; // end loop
        }
        return value; // return value entered
    }

    private boolean doAction(String playerName) {
        
        if (playerName.length() < 2){
            System.out.println("\nInvalid player name: "
            + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);
        
        if(player == null){ // if unsuccesful
            System.out.println("\nError creating the player.");
            return false;
        }
        
          //display next view
        this.displayNextView(player);
        return true;
    }  

    private void displayNextView(Player player) {
        System.out.println("\n================================================"
                        +"\n Welcome to Desert Escape " + player.getPlayerName()
                        +"\n We hope that you have a lot of fun!"
                        +"\n=================================================="
                        );
        
        // Create MainNenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
        
        // Create GettingHelpView object
        GettingHelpView gettingHelpView = new GettingHelpView();
        
        // display the getting help view
        gettingHelpView.displayGettingHelpView();
    }

   
    }
