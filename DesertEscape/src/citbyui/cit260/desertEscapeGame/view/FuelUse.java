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
 * @author Paez &
 */
public class FuelUse {

    private String PlanetName;

    // public FuelUse(Integer CurrentFuelLevel) {
    public void fuelUse() {
        
        //Display a banner when view is created
        this.displayBanner();
        
        // 
        this.PlanetName = "\nName of Planet to visit";
        
        // get input
        this.getInput();

    }

    public void displayMenu() {
        String lenghtTank, wideTank, volTank;

        this.displayBanner();
        System.out.println(PlanetName);
        
        // PlanetName = this.getInput();
        System.out.println("Lenght of Tank");
        lenghtTank = this.getInput();
        
        System.out.println("Wide of Tank");
        wideTank = this.getInput();
        
        System.out.println("Volume of Tank");
        volTank = this.getInput();

    }

    private void displayBanner() {
        System.out.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n*    XXX  X    XXXX  X  X XXXX XXXXX  XXX        XX-XXXX        *"
                + "\n*    X  X X    X  X  X  X X      X   X          XXXXX-XXX       *"
                + "\n*    XXX  X    XXXX  XX X XXX    X    XX       XX-XXXXXXXX      *"
                + "\n*    X    X    X  X  X XX X      X      X       XXX-XXXXX       *"
                + "\n*    X    XXXX X  X  X  X XXXX   X   XXX         XXXX-XX        *"
                + "\n*                                                               *"
                + "\n* Your Star Fighter requires the following fuel volumens:       *"
                + "\n*                                                               *"
                + "\n* PLANET            DESCRIPTION                 VOLUME   LEVEL  *"
                + "\n* Ar3this     Stone robot lives                 100GGal    1    *"
                + "\n* BrOnChTis   Infection contagion expander      500GGal    2    *"
                + "\n* CrampMusc   Muscle Cramp in all body         1000GGal    3    *"
                + "\n* DermTiTis   Skin destroy without return      2000GGal    4    *"
                + "\n*                                                               *"
                + "\n* Each destroyed planet gives you 10 times their GGal required  *"
                + "\n* and you win 100GGal in each war win.                          *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("\n*** Invalid value, try again ***");
                continue;
            }
            break;
        }
        return selection;
    }

    private boolean doAction(String playerName) {

        /* if (playerName.length() < 2) {
            System.out.println("\nInvalid player name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);

        if (player == null) { // if unsuccesful
            System.out.println("\nError creating the player.");
            return false;
        }

        //display next view
        // this.displayNextView(player); */
        return true; 
    }

    
}
