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
    private String promptMessage="";

    public BodyMassView() {
        this.message1 = "\nEnter weight value here";
        this.message2 = "\nEnter height value here";
        
        this.promptMessage =
                "\n*************************************************************"
                + "\n*                                                         *"
                + "\n* Welcome! to:*                                           *"
                + "\n*              *** BUILD TIME MACHINE***                  *"
                + "\n* For this mission, you will be required                  *"
                + "\n* to build a time machine. You will be requiered          *"
                + "\n* to enter both your weight and height                    *"
                + "\n* The system calculates the BMI (Body Mass Index          *"
                + "\n* of the character based on weight (inches) and height    *" 
                + "\n* If the You have those items in the                      *" 
                + "\n* inventory, then the game is won. If not, then a message *"
                + "\n* will be displayed prompting you to search for more items*" 
                + "\n* to build either a stronger or weaker time machine.      *"
                + "\n*                  **GOOD LUCK**                          *"
                + "\n*                                                         *"
                + "\n*                                                         *"
                + "\n**********************************************************";
    
    System.out.println(this.promptMessage);
    }

    public void displayBodyMassView() {

        boolean done = false; // set flag to not done
        //do {
            // prompt for and get players input
            double bodyMass = getBodyMass();
            
            // do the requested action and display the next view
            //done = this.doAction(bodyMass);




       // } while (!done);
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
                System.out.println("\n Your BODY MASS INDEX is:" + mass);
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

