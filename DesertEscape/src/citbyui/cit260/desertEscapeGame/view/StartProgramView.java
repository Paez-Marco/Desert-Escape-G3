/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.GameControl;
import byui.cit260.desertEscapeGame.model.Player;
import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author mambou
 */
public class StartProgramView extends View {

    private String displayPromptMessage;

    public StartProgramView() {
          
       // this.displayPromptMessage = "\nPlease enter your name";

            super("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n*    T H E <<<<< = = = = = = = = = =                            *"
                + "\n*                                                 ///\\\\\\        *"
                + "\n*        DDD  EEEE  SSS  EEEE RRR  TTTTT        //  /\\  \\\\      *"
                + "\n*        D  D E    S     E    R  R   T        //    /\\    \\\\    *"
                + "\n*        D  D EEE   SS   EEE  RRR    T              /\\          *"
                + "\n*        D  D E       S  E    R  R   T              /\\          *"
                + "\n*        DDD  EEDE SSS   EEEE R  R   T       _______/\\__ __     *"
                + "\n*                                                               *"
                + "\n*            = = = = = = = >>>>> E S C A P E                    *"
                + "\n*                                                               *"
                + "\n* This is Nicolas Williams Desert Escape Game                   *"
                + "\n* In this game you will take the role of Nicolas Williams       *"
                + "\n* who was born on earth in a distant futur                      *"
                + "\n* But there was a global catastroph.                            *"
                + "\n* You are forced to leave earth and travel to another planet    *"
                + "\n*                                                               *"
                + "\n* You will face many threat on this new planet,                 *"
                + "\n* and you must avoid being taken by an enemy alien race         *"
                + "\n* In the game course, you will come to learn of a time machine  *"
                + "\n* that will allow you to rewrite time and reverse               *"
                + "\n* he global catastroph that destroyed earth.                    *"
                + "\n* This will become your and van be achieved by hunting down     *"
                + "\n* artifacts and items and assembling a time machine based off   *"
                + "\n* of a schematic hat was discovered                             *"
                + "\n* Find the resources needed to build the time machine and       *"
                + "\n* save the earth.                                               *"
                + "\n*                                                               *"
                + "\n* Good luck and enjoy the adventure                             *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }
    
    @Override
    public boolean doAction(String value) {

        if (value.length() < 2) {
            System.out.println("\nInvalid player name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(value);

        if (player == null) { // if unsuccesful
            System.out.println("\nError creating the player.");
            return false;
        }

        //display next view
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n================================================"
                + "\n Welcome to Desert Escape " + player.getPlayerName()
                + "\n We hope that you have a lot of fun!"
                + "\n=================================================="
        );

        // Create MainNenuView object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.display();

        // Create GettingHelpView object
        GettingHelpView gettingHelpView = new GettingHelpView();

        // display the getting help view
        gettingHelpView.display();
    }
}