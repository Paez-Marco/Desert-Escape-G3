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
            + "\n#   LETTER    SORT BY               #"
            + "\n#     D       Item Description      #"
            + "\n#     I       Item Inventory        #"
            + "\n#     M       Medicine              #"
            + "\n#     W       Water                 #"
            + "\n#     K       Knife                 #"
            + "\n#     B       Boots                 #"
            + "\n#     F       Food                  #"
            + "\n#     S       Shirt                 #"            
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
      case "I": // Sort by Item Inventory
        this.SortItemInventory();
        break;
      case "M": // Sort by Medicine
        this.SortMedicine();
        break;
      case "W": // Sort by Water
        this.SortWater();
        break;
      case "K": // Sort by Knife
        this.SortKnife();
        break;
      case "B": // Sort by Boots
        this.SortBoots();
        break;
      case "F": // Sort by Food
        this.SortFood();
        break;
      case "S": // Sort by Shirt
        this.SortShirt();
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

  private void SortMedicine() {
    System.out.println("\n*** SortMedicine() function called ***");
  }

  private void SortWater() {
    System.out.println("\n*** SortWater() function called ***");
  }

  private void SortKnife() {
    System.out.println("\n*** SortKnife() function called ***");
  }

  private void SortBoots() {
    System.out.println("\n*** SortBoots() function called ***");
  }
  
  private void SortFood() {
    System.out.println("\n*** SortFood() function called ***");
  }
  
  private void SortShirt() {
    System.out.println("\n*** SortShirt() function called ***");
  }
}

