/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.model.InventoryItem;
import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;
import citbyui.cit260.desertEscapeGame.view.GameMenuView;
import desertescape.DesertEscape;

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
        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();
        String tempDesc;
        Integer tempSotck;
        Integer tempReq;

        System.out.println("Items ordered by Inventory Stock");
        System.out.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

        for (InventoryItem item1 : inventory) {
            for (InventoryItem item2 : inventory) {
                if (Float.valueOf(item2.getDescription()) < Float.valueOf(item1.getDescription())) {
                    tempDesc = item1.getDescription();
                    tempSotck = item1.getQuantityInStock();
                    tempReq = item1.getRequiredAmount();
                    item1.setDescription(item2.getDescription());
                    item1.setQuantityInStock(item2.getQuantityInStock());
                    item1.setRequiredAmount(item2.getRequiredAmount());
                    item2.setDescription(tempDesc);
                    item2.setQuantityInStock(tempSotck);
                    item2.setRequiredAmount(tempReq);
                    break;
                }
            }
        }

        InventoryItem[] inventory2 = DesertEscape.getCurrentGame().getInventoryItem();

        for (InventoryItem item : inventory2) {
            //display the description, the required amount and amount in stock
            System.out.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }

        // System.out.println("\n*** SortItemDescription() function called ***");
    }

    private void SortItemInventory() {
        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();
        String tempDesc;
        Integer tempSotck;
        Integer tempReq;

        System.out.println("Items ordered by Inventory Stock");
        System.out.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

        for (InventoryItem item1 : inventory) {
            for (InventoryItem item2 : inventory) {
                if (item2.getQuantityInStock() < item1.getQuantityInStock()) {
                    tempDesc = item1.getDescription();
                    tempSotck = item1.getQuantityInStock();
                    tempReq = item1.getRequiredAmount();
                    item1.setDescription(item2.getDescription());
                    item1.setQuantityInStock(item2.getQuantityInStock());
                    item1.setRequiredAmount(item2.getRequiredAmount());
                    item2.setDescription(tempDesc);
                    item2.setQuantityInStock(tempSotck);
                    item2.setRequiredAmount(tempReq);
                    break;
                }
            }
        }

        InventoryItem[] inventory2 = DesertEscape.getCurrentGame().getInventoryItem();

        for (InventoryItem item : inventory2) {
            //display the description, the required amount and amount in stock
            System.out.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }
        // System.out.println("\n*** SortItemInventory() function called ***");
    }

    private void SortItemRequirment() {
        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();
        String tempDesc;
        Integer tempSotck;
        Integer tempReq;

        System.out.println("Items ordered by Inventory Stock");
        System.out.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

        for (InventoryItem item1 : inventory) {
            for (InventoryItem item2 : inventory) {
                if (item2.getRequiredAmount()< item1.getRequiredAmount()) {
                    tempDesc = item1.getDescription();
                    tempSotck = item1.getQuantityInStock();
                    tempReq = item1.getRequiredAmount();
                    item1.setDescription(item2.getDescription());
                    item1.setQuantityInStock(item2.getQuantityInStock());
                    item1.setRequiredAmount(item2.getRequiredAmount());
                    item2.setDescription(tempDesc);
                    item2.setQuantityInStock(tempSotck);
                    item2.setRequiredAmount(tempReq);
                    break;
                }
            }
        }

        InventoryItem[] inventory2 = DesertEscape.getCurrentGame().getInventoryItem();

        for (InventoryItem item : inventory2) {
            //display the description, the required amount and amount in stock
            System.out.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }

        //System.out.println("\n*** SortItemRequirment() function called ***");
    }
}
