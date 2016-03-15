/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import byui.cit260.desertEscapeGame.control.MovementController;
import byui.cit260.desertEscapeGame.model.InventoryItem;
//import byui.cit260.desertEscapeGame.model.InventoryItem;
import byui.cit260.desertEscapeGame.model.Location;
import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;
import desertescape.DesertEscape;

/**
 *
 * @author mambou
 */
public class GameMenuView extends View {
    
    public GameMenuView() {

        super("\n"
                + "\n----------------------------"
                + "\n         GAME MENU"
                + "\n----------------------------"
                + "\n  M - View Map"
                + "\n  I - View inventory list with costs"
                + "\n  Z - Sorted inventory list"
                + "\n  A - View list of actors"
                + "\n  T - View time machine status"
                + "\n  L - View content of locations"
                + "\n  N - Move person to North"
                + "\n  E - Move person to East"
                + "\n  S - Move person to South"
                + "\n  W - Move person to West"
                + "\n  R - Estimate the resource needed"
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
            case "M": // travel to new location
                this.Map();
                break;
            case "I": // View list of item in the inventory
                this.ViewInventory();
                break;
            case "Z": // View list of actors
                this.ListSortedInventory();
                break;
            case "A": // View list of actors
                this.Actors();
                break;
            case "T": // View time machine status
                this.displayTimeMachineStatus();
                break;
            case "L": // View content of locations
                this.ContentLocation();
                break;
            case "N": // Move person to New location
                this.MoveNorth();
                break;
            case "E": // Move person to New location
                this.MoveEast();
                break;
            case "S": // Move person to New location
                this.MoveSouth();
                break;
            case "W": // Move person to New location
                this.MoveWest();
                break;
            case "R": // Estimate the resource needed
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

    private void Map() {
        System.out.println(DesertEscape.getCurrentGame().getMap().getMapString());

    }

    private void ViewInventory() {

        InventoryItem[] inventory = null;
        
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description \tInventory \tIn Stock");

        for (InventoryItem item : inventory) {
            //display the description, the required amount and amount in stock
            System.out.println(item.getDescription() + "\t"
                    + item.getInventoryItem()+ "\t"
                    + item.getRequiredAmount() + "\t"
                    + item.getQuantityInStock());
        }

    }

    private void ListSortedInventory() {
        System.out.println("\n *** ListSortedInventory stub function called ***");
    }


    private void Actors() {
        System.out.println("\n *** viewActors stub function called ***");
    }

    private void ContentLocation() {
        Location lc = DesertEscape.getCurrentGame().getPlayer().getLocation();
        System.out.println("You are at: (" + lc.getRow() + "," + lc.getColumn() + ")");
    }

    private void displayEstimatedResource() {
        System.out.println("\n *** viewEstimatedResourceNeeded stub function called ***");
    }

    private void displayHelp() {
        System.out.println("\n *** viewhelp stub function called ***");
    }

    private void displayTimeMachineStatus() {
        System.out.println("\n *** viewTimeMachineStatus stub function called ***");
    }

    public void MoveNorth() {
        MovementController mc = new MovementController();
        if (mc.moveNorth(DesertEscape.getCurrentGame()) == false) {
            System.out.println("You cannot move there");
        }
    }

    private void MoveEast() {
        MovementController mc = new MovementController();
        if (mc.moveEast(DesertEscape.getCurrentGame()) == false) {
            System.out.println("You cannot move there");
        }
    }

    private void MoveSouth() {
        MovementController mc = new MovementController();
        if (mc.moveSouth(DesertEscape.getCurrentGame()) == false) {
            System.out.println("You cannot move there");
        }
    }

    private void MoveWest() {
        MovementController mc = new MovementController();
        if (mc.moveWest(DesertEscape.getCurrentGame()) == false) {
            System.out.println("You cannot move there");
        }
    }

}
