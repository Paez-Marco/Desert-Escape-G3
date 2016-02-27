/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import java.util.Scanner;

/**
 *
 * @author Paez &
 */
public class FuelUseVolume {

    private String planetLevel;
    private double radiusTank;
    private double lenghtTank;
    private double volumeTank;

    // public FuelUseVolume(Integer CurrentFuelLevel) {
    public void fuelUse() {

        //Display a banner when view is created
        this.displayBanner();

        this.doAction();
    }

    private void displayBanner() {
        System.out.println(
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
                + "\n*                                                               *"
                + "\n* Each destroyed planet gives you 10 times their GGal required  *"
                + "\n* and you win 100GGal in each war win.                          *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );

        boolean valid = false;

        while (!valid) {
            planetLevel = "\nLevel of the Planet to visit";
            System.out.println(planetLevel);
            planetLevel = this.getInput();

            switch (planetLevel) {
                case "1":
                    System.out.println("YOU GOING TO Ar3this");
                    System.out.println("REMEMBER IT: Stop and destry your stones");
                    System.out.println("YOU NEED: 100 Giga Gallons");
                    valid = true;
                    break;
                case "2":
                    System.out.println("YOU GOING TO BrOnChTis");
                    System.out.println("REMEMBER IT: Infection contagion expander");
                    System.out.println("YOU NEED: 500 Giga Gallons");
                    valid = true;
                    break;
                case "3":
                    System.out.println("YOU GOING TO CrampMusc");
                    System.out.println("REMEMBER IT: Muscle Cramp in all body");
                    System.out.println("YOU NEED: 1000 Giga Gallons");
                    valid = true;
                    break;
                case "4":
                    System.out.println("YOU GOING TO DermTiTis");
                    System.out.println("REMEMBER IT: Skin destroy without return");
                    System.out.println("YOU NEED: 2000 Giga Gallons");
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid level selection");
            }
        }
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

    private double getValueInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        double selection = 10;

        while (!valid) {
            selection = keyboard.nextDouble();

            if (selection < 10) {
                System.out.println("\n*** Value less than 10, try again ***");
                continue;
            }
            break;
        }
        return selection;
    }

    private void doAction() {

        boolean valid = false;

        while (!valid) {
            System.out.println("\nLenght of Tank (in meters and more than 10)");
            radiusTank = this.getValueInput();

            System.out.println("Wide of Tank (in meters and more than 10)");
            lenghtTank = this.getValueInput();

            System.out.println("The Volume of Tank is ");
            volumeTank = Math.PI * Math.pow(radiusTank, 2) * lenghtTank;
            System.out.println(volumeTank);

            switch (planetLevel) {
                case "1":
                    if (volumeTank < 100) {
                        System.out.println("You need 100 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                case "2":
                    if (volumeTank < 500) {
                        System.out.println("You need 500 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                case "3":
                    if (volumeTank < 1000) {
                        System.out.println("You need 1000 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                case "4":
                    if (volumeTank < 2000) {
                        System.out.println("You need 2000 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                default:
                    valid = true;
                    System.out.println("GOOD TRAVEL!!!");
            }
        }
    }
}
