/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author mambou
 */
public class GettingHelpView extends View {

    private String displayHelp;
    private String help;

    public GettingHelpView() {

        //promptMessage = "Please enter to view help "
        super("\n"
                + "\n  ======================================"
                + "\n             GETTING HELP"
                + "\n  ======================================"
                + "\n  G - What is the goal of the game? "
                + "\n  M - How to move"
                + "\n  E - Estimating the amount of resources"
                + "\n  S - Stocked resources"
                + "\n  Q - Return back"
                + "\n"
                + "\n  Enter Your Selection Below"
                + "\n  ======================================");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // Convert helpOption to uppercase
        switch (value) {
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
            case "Q":
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
