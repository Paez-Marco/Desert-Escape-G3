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
public class InventorySort extends View {

  private String message = "";
  private String displayScene = "";

  public InventorySort() {

    
    super("\n#####################################"
            + "\n#                                   #"
            + "\n#   INVENTORY ORDER SELECTION       #"
            + "\n#   =========================       #"
            + "\n#                                   #"
            + "\n#   LETTER       SORT BY            #"
            + "\n#     D       Item Description      #"
            + "\n#     S       Item Stock            #"
            + "\n#     R       Item Requirement      #"
            + "\n#     Q       Quit                  #"
            + "\n#                                   #"
            + "\n#####################################");
  }
  
  @Override
  public boolean doAction(String value) {
    System.out.println("\n Choose your Scene");
    value = value.toUpperCase(); // Convert menuOpton to uppercase

    switch (value) {
      case "D": // Sort by Item description
        this.SortItemDescription();       
        break;
      case "S": // Sort by Item Inventory
        this.SortItemInventory();
        break;
      case "R": // Sort by Requirements
        this.SortItemRequirment();
        break;
      case "Q": // return previous menu
        break;
      default:
        System.out.println("\n*** Invalid selection *** Try again");
        break;
    }
    return false;
  }

  private void SortItemDescription() {
    System.out.println("\n*** SortItemDescription() function called ***");
  }

  private void SortItemInventory() {
    System.out.println("\n*** SortItemInventory() function called ***");
  }

  private void SortItemRequirment() {
    System.out.println("\n*** SortItemRequirment() function called ***");
  }
}

