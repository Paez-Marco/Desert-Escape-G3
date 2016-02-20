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
public class GettingHelpView {
    private String promptMessage;
    private String help;
    
    
    public GettingHelpView(){
        
        //promptMessage = "Please enter to view help "       
        this.promptMessage = "\nGet some help here";
        
     this.help = "\n"  
                +"\n----------------------------------------------------------"
                +"\n|  Getting Help                                          |"
                +"\n----------------------------------------------------------"
                +"\nG - What is the goal of the game? "
                +"\nM - How to move"
                +"\nE - Estimating the amount of resources"
                +"\nS - Stocked resources"
                +"\nQ - Quit"
                +"\n----------------------------------------------------------";
    }
    
     public void displayGettingHelpView() {
         
        boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String helpOption = this.getHelpOption();
            if(helpOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpOption);
            
        } while (!done);  
    }

    private String getHelpOption() {
        
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

    private boolean doAction(String helpOption) {
        
         helpOption = helpOption.toUpperCase(); // Convert helpOption to uppercase
        
        switch(helpOption) {
            case "G": // Goal of the game
                 this.goalGame();
                 break;
            case "M": // how to move
                 this.moveGame();
                 break;
            case "E": // amount of resources estimated and available
                 this.displayEstimatedResource();
                 break;
            case "S": // stocked resources
                 this.stockResource();
                 break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                  }
       return false;
    }

    private void goalGame() {      
        System.out.println("\n*** goalGame stub function called ***");
    }

    private void moveGame() {
        System.out.println("\n*** moveGame stub function called ***");
    }

    private void displayEstimatedResource() {
        System.out.println("\n*** displayEstimatedResource stub function called ***");
    }

    private void stockResource() {
        System.out.println("\n*** stockResource stub function called ***");
    }
}
