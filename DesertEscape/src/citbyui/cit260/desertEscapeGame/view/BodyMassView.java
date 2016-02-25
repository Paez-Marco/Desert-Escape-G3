/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import java.util.Scanner;

/**
 *
 * @author mambou
 */
public class BodyMassView {

    private String message1 = "";
    private String message2 = "";

    public BodyMassView() {
        this.message1 = "\nEnter weight value here";
        this.message2 = "\nEnter height value here";
    }

    public void displayBodyMassView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players input
            double bodyMass = getBodyMass();

            // do the requested action and display the next view
            done = this.doAction(bodyMass);

        } while (!done);
    }

    private double getBodyMass() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        double weight, height;
        double mass = 25;

        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid is entered
            System.out.println("\n" + this.message1);
            weight = keyboard.nextDouble();// get next line typed on keyboard

            System.out.println("\n" + this.message2);
            height = keyboard.nextDouble();// get next line typed on keyboard

            if (weight <= 0 || height <= 0) {
                System.out.println("\nInvalid: error : weight and height cannot be less than 0");
                continue;
            } else if (weight > 140 || height > 63) {
                System.out.println("\nError!!!: Values to high; weight must be less than 140 and height less than 63." + "\n Please try again");
                continue;
            } else {
                mass = (weight / Math.pow(height, 2)) * 703;
                System.out.println("\n Body Mass Index is:" + mass);
            }
            break;
        }// end loop

        return mass; // return value entered
    }

    private boolean doAction(double bodyMass) {
        Scanner keyboard = new Scanner(System.in);
        double weight = keyboard.nextDouble();
        double height = keyboard.nextDouble();
        double mass;

        if (weight <= 0 || height <= 0) {
            System.out.println("\nInvalid: weight and height cannot be less than 0");
        } else if (weight > 140 || height > 63) {
            System.out.println("\nInvalid: Values to high; weight must be less than 140 and height less than 63." + "\n Please try again");
        } else {
            mass = (weight / Math.pow(height, 2)) * 703;
            System.out.println("\n Body Mass Index is:" + mass);
        }
        return true;
    }
}
