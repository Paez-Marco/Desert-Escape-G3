/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import byui.cit260.desertEscapeGame.model.Inventory;
import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;

/**
 *
 * @author mambou
 */
public class GameMenuView extends View{

    public GameMenuView() {
       
        super("\n"
                + "\n----------------------------"
                + "\n         GAME MENU"
                + "\n----------------------------"
                + "\n  V - View Map"
                + "\n  I - View list of item in the inventory"
                + "\n  A - View list of actors"
                + "\n  T - View time machine status"
                + "\n  L - View content of locations"
                + "\n  M - Move person to New location"
                + "\n  E - Estimate the resource needed"
                + "\n  H - Help"
                + "\n  Q - Quit"
                + "\n"
                + "\n  Please Ente Your Selection Below"
                + "\n  "
                + "\n----------------------------");
    }    
    
     @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // Convert menuOpton to uppercase

        switch (value) {
            case "V": // travel to new location
                this.displayMap();
                break;
            case "I": // View list of item in the inventory
                this.displayInventory();
                break;
            case "A": // View list of actors
                this.displayActors();
                break;
            case "T": // View time machine status
                this.displayTimeMachineStatus();
                break;
            case "L": // View content of locations
                this.displayContentLocation();
                 break;
            case "M": // Move person to New location
                this.displayMove();            
                break;
            case "E": // Estimate the resource needed
                this.displayEstimatedResource();
                break;
            case "H": // View help
                this.displayHelp();
                break;
            case "Q": // quit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayMap() {
        System.out.println("\n *** displayMap stub function called ***");
    }

    private void displayInventory() {
      
        //get the sorted list of inventory items for the currunt game
        Inventory[] inventoryItem = GameControl.getSortedInventoryList();
        
        System.out.println("\n List of Inventory Items");
        System.out.println("Description" + "\t" +
                "Required" + "\t" +
                "In Stock");
        
        //for each inventory item
        for(Inventory inventory : inventoryItem) {
            //display the description, the required amount and amount in stock
            System.out.println(inventory.getDescription() + "\t" +
                    inventory.getRequiredAmount() + "\t" +
                    inventory.getQuantityInStock());
        }
        
    }

    private void displayActors() {
         System.out.println("\n *** viewActors stub function called ***");
    }

    private void displayContentLocation() {
         System.out.println("\n *** viewContentlocation stub function called ***");
    }

    private void displayEstimatedResource() {
         System.out.println("\n *** viewEstimatedResourceNeeded stub function called ***");
    }

    private void displayHelp() {
         System.out.println("\n *** viewhelp stub function called ***");
    }

    private void displayMove() {
         System.out.println("\n *** viewMoves stub function called ***");
    }

    private void displayTimeMachineStatus() {
        System.out.println("\n *** viewTimeMachineStatus stub function called ***");
    }

}
