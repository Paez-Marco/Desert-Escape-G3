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
public class SceneView {
    private String message = "";
     private String scene = "";
     
      public SceneView() {

          this.message = "\nPlease enter a desired scene";
        this.scene = "\n**************************************************************"
                + "\n*                                                               *"
                + "\n*    XXX  X    XXXX  X  X XXXX XXXXX  XXX        XX-XXXX        *"
                + "\n*    X  X X    X  X  X  X X      X   X          XXXXX-XXX       *"
                + "\n*    XXX  X    XXXX  XX X XXX    X    XX       XX-XXXXXXXX      *"
                + "\n*    X    X    X  X  X XX X      X      X       XXX-XXXXX       *"
                + "\n*    X    XXXX X  X  X  X XXXX   X   XXX         XXXX-XX        *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                           PLANET SCENE MENU                   *"
                + "\n*D                            Desert Scene                      *"
                + "\n*P                            Pyramid Scene                     *"
                + "\n*C                            Caves Scene                       *"
                + "\n*A                           Alien Camp Scene                   *"
                + "\n*F                             Cliffs Scene                     *"
                + "\n*M                           Moutains Scene*                    *"  
                + "\n*Q                                 Quit                         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*****************************************************************";
                 
               
        
    }
      
      public void displaySceneView() {

        boolean done = false; // set flag to not done
        do {
            System.out.println(this.scene);
            // prompt for and get players name
            String sceneMenu = this.getSceneMenu();
            if (sceneMenu.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(sceneMenu);

        } while (!done);
    }

    private String getSceneMenu() {
         Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid is entered
            System.out.println("\n" + this.message);

            value = keyboard.nextLine();// get next line typed on keyboard
            value = value.trim();// trim of leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end loop
        }
        return value; // return value entered
    }

    private boolean doAction(String sceneMenu) {
        sceneMenu = sceneMenu.toUpperCase(); // Convert menuOpton to uppercase

        switch (sceneMenu) {
            case "A": // start Alien Camp  Scene
                this.alienCampScene();
                break;
            case "C": // start Caves Scene
                this.cavesScene();
                break;
            case "F": // start cliffs scene
                this.cliffsScene();
                break;
            case "D": // start desert scene
                this.desertScene();
                break;
            case "M": // start mountain scene
                this.mountainScene();
                break;
            case "P": // start pyramid scene
                this.pyramidScene();
                break;
            case "Q": // quit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void alienCampScene() {
        System.out.println("\n*** alienCampScene() function called ***");
    }

    private void cavesScene() {
       System.out.println("\n*** cavesScene() function called ***");
    }

    private void cliffsScene() {
        System.out.println("\n*** cliffsScene() function called ***");
    }

    private void desertScene() {
        System.out.println("\n*** desertScene() function called ***");
    }

    private void mountainScene() {
        System.out.println("\n*** mountainScene() function called ***");
    }

    private void pyramidScene() {
       System.out.println("\n*** pyramidScene() function called ***");
    }
     
}
