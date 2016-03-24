/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit.desertEscapeGame.exceptions.MapControlException;
import byui.cit260.desertEscapeGame.control.GameControl;
import desertescape.DesertEscape;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Paez
 */
public class FuelUseVolume {

    private String planetLevel;
    private double radiusTank;
    private double lenghtTank;
    private double volumeTank;
    
    protected final BufferedReader keyboard = DesertEscape.getInFile();
        protected final PrintWriter console = DesertEscape.getOutFile();

    // public FuelUseVolume(Integer CurrentFuelLevel) {
    public void fuelUse() throws MapControlException {

        //Display a banner when view is created
        Boolean backMenu = this.displayBanner();
        
        if (backMenu)
            return;
        
        this.doAction();
    }

    private Boolean displayBanner() {
        this.console.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n*    XXX  X    XXXX  X  X XXXX XXXXX  XXX        XX=XX0X        *"
                + "\n*    X  X X    X  X  X  X X      X   X          XX-XX=XXX       *"
                + "\n*    XXX  X    XXXX  XX X XXX    X    XX       XX=XX-XX0XX      *"
                + "\n*    X    X    X  X  X XX X      X      X       XXX=XX-XX       *"
                + "\n*    X    XXXX X  X  X  X XXXX   X   XXX         X-XX=XX        *"
                + "\n*                                                               *"
                + "\n* Your Star Fighter requires the following fuel volumes:        *"
                + "\n*                                                               *"
                + "\n* LEVEL    PLANET           DESCRIPTION               VOLUME    *"
                + "\n*   1     Ar3this     Stop and destry your stones     100 Gal   *"
                + "\n*   2     BrOnChTis   Infection contagion expander    500 Gal   *"
                + "\n*   3     CrampMusc   Muscle Cramp in all body       1000 Gal   *"
                + "\n*   4     DermTiTis   Skin destroy without return    2000 Gal   *"
                + "\n*   Q     Quit        Return to previous menu                   *"
                + "\n*                                                               *"
                + "\n* Each destroyed planet gives you 10 times their GGal required  *"
                + "\n* and you win 100GGal in each war win.                          *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );

        boolean valid = false;

        while (!valid) {
            planetLevel = "\nLevel of the Planet to visit";
            this.console.println(planetLevel);
            planetLevel = this.getInput();

            switch (planetLevel) {
                case "1":
                    this.console.println("YOU GOING TO Ar3this");
                    this.console.println("REMEMBER IT: Stop and destry your stones");
                    this.console.println("YOU NEED: 100 Giga Gallons");
                    valid = true;
                    break;
                case "2":
                    this.console.println("YOU GOING TO BrOnChTis");
                    this.console.println("REMEMBER IT: Infection contagion expander");
                    this.console.println("YOU NEED: 500 Giga Gallons");
                    valid = true;
                    break;
                case "3":
                    this.console.println("YOU GOING TO CrampMusc");
                    this.console.println("REMEMBER IT: Muscle Cramp in all body");
                    this.console.println("YOU NEED: 1000 Giga Gallons");
                    valid = true;
                    break;
                case "4":
                    this.console.println("YOU GOING TO DermTiTis");
                    this.console.println("REMEMBER IT: Skin destroy without return");
                    this.console.println("YOU NEED: 2000 Giga Gallons");
                    valid = true;
                    break;
                case "Q":
                    valid = true;
                    return true;
                default:
                    ErrorView.display(this.getClass().getName(),
                           "Invalid level selection");
            }
        }
        return false;
    }

    private void doAction() throws MapControlException {

        double volTank = 0;

        tankVolume(volTank);
        this.displayBanner();
    }

    private String getInput() {
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
       try {
        while (!valid) {
            selection = this.keyboard.readLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid value, try again ***");
                continue;
            }
        break;
        }
        
            
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input:" + e.getMessage());
        }
        return selection;
    }
    

    private double getValueInput() throws MapControlException {
        Double selection = null;

        /*
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        double selection = 10;
         */
        // while (!valid) {
        while (selection == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q")) {
                break;
            }

            try {
                // selection = keyboard.nextDouble();
                selection = Double.parseDouble(value);
            } catch (NumberFormatException nfe) {
                this.console.println("\n*** Value less than 10 or Q to quit, try again ***");
            }

            /* if (selection < 10) {
                this.console.println("\n*** Value less than 10, try again ***");
                continue;
            }
            break;*/
        }
        return selection;
    }

    private double tankVolume(double volumeTank) throws MapControlException {

        boolean valid = false;

        while (!valid) {
            this.console.println("\nLenght of Tank (in meters and more than 10)");
            radiusTank = this.getValueInput();

            this.console.println("Wide of Tank (in meters and more than 10)");
            lenghtTank = this.getValueInput();

            this.console.println("The Volume of Tank is ");
            volumeTank = Math.PI * Math.pow(radiusTank, 2) * lenghtTank;
            this.console.println(volumeTank);

            switch (planetLevel) {
                case "1":
                    this.startNewGame();
                    break;
                /* if (volumeTank < 100) {
                        this.console.println("You need 100 gallons at least");
                    } else {
                        valid = true;
                        this.console.println("GOOD TRAVEL!!!");
                    }
                    break; */
                case "2":
                    this.startNewGame();
                    break;
                /* if (volumeTank < 500) {
                        this.console.println("You need 500 gallons at least");
                    } else {
                        valid = true;
                        this.console.println("GOOD TRAVEL!!!");
                    }
                    break; */
                case "3":
                    this.startNewGame();
                    break;
                /* if (volumeTank < 1000) {
                        this.console.println("You need 1000 gallons at least");
                    } else {
                        valid = true;
                        this.console.println("GOOD TRAVEL!!!");
                    }
                    break; */
                case "4":
                    this.startNewGame();
                    break;
                /* if (volumeTank < 2000) {
                        this.console.println("You need 2000 gallons at least");
                    } else {
                        valid = true;
                        this.console.println("GOOD TRAVEL!!!");
                    }
                    break; */
                default:
                    // valid = true;
                    this.console.println("GOOD TRAVEL!!!");
            }
            valid = true;
        }
        return volumeTank;
    }

    private void startNewGame() {

        if (volumeTank < 500) {
            this.console.println("You need 500 gallons at least");
        } else {
            this.console.println("GOOD TRAVEL!!!");
        }

        /*
        // Create a new game
        GameControl.createNewGame(.getPlayer()
        );
        
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
         */
    }
}
