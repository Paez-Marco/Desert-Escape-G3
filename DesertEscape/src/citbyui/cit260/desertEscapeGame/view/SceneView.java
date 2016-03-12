/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;

/**
 *
 * @author Paez & Mambou
 */
public class SceneView extends View {

  private String message = "";
  private String displayScene = "";

  public SceneView() {

    
    super( "\n****************************************************************"
            + "\n*                                                              *"
            + "\n*        XXX  XXX XXXX  X  X XXXX  XXX        XX-XXXX          *"
            + "\n*       X    X    X     X  X X    X          XXXXX-XXX         *"
            + "\n*        XX  X    XXX   XX X XXX   XX       XX-XXXXXXXX        *"
            + "\n*          X X    X     X XX X       X       XXX-XXXXX         *"
            + "\n*       XXX   XXX XXXX  X  X XXXX XXX         XXXX-XX          *"
            + "\n*                                                              *"
            + "\n*           LETTER          PLANET SCENE MENU                  *"
            + "\n*            (D)              Desert Scene                     *"
            + "\n*            (P)              Pyramid Scene                    *"
            + "\n*            (C)              Caves Scene                      *"
            + "\n*            (A)             Alien Camp Scene                  *"
            + "\n*            (F)               Cliffs Scene                    *"
            + "\n*            (M)             Moutains Scene                    *"
            + "\n*            (Q)                   Quit                        *"
            + "\n*                                                              *"
            + "\n*             Enter Your Selection Here Below                  *"
            + "\n****************************************************************");
  }
  
  @Override
  public boolean doAction(String value) {
    System.out.println("\n Choose your Scene");
    value = value.toUpperCase(); // Convert menuOpton to uppercase

    switch (value) {
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

