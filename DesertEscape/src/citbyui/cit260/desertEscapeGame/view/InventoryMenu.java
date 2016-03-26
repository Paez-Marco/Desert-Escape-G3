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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Paez
 */
public class InventoryMenu extends View {

    private String message = "";
    private String displayScene = "";

    public InventoryMenu() {

        super("\n#####################################"
                + "\n#                                   #"
                + "\n#       I N V E N T O R Y           #"
                + "\n#   =========================       #"
                + "\n#                                   #"
                + "\n#   LETTER      INVENTORY           #"
                + "\n#     L     Load stock from a file  #"
                + "\n#     S     Save stock to a file    #"
                + "\n#                                   #"
                + "\n#   LETTER      SORTED LISTS        #"
                + "\n#     D     by Description          #"
                + "\n#     T     by Stock                #"
                + "\n#     R     by Requirement          #"
                + "\n#                                   #"
                + "\n#     Q     return previous menu    #"
                + "\n#                                   #"
                + "\n#####################################");
    }

    @Override
    public boolean doAction(String value) {
        this.console.println("\n Choose your inventory selection");
        value = value.toUpperCase(); // Convert menuOpton to uppercase

        switch (value) {
            case "L": // Load from file
                this.InventoryLoad();
                break;
            case "S": // Save to a file
                this.InventorySave();
                break;
            case "D": // Sort by Item description
                this.SortItemDescription();
                break;
            case "T": // Sort by Item Inventory
                this.SortItemInventory();
                break;
            case "R": // Sort by Requirements
                this.SortItemRequirment();
                break;
            case "Q": // return previous menu
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private String InventoryFileName() {

        String filePath = "";
        this.console.println("\n\nEnter the file path for the file: ");
        try {
            filePath = this.getInput();            
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
        return filePath;
    }

    private void InventoryLoad() {

        String filePath = InventoryFileName();

        this.console.println("Loading from " + filePath);

        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();

        //inventoryList.display();
        this.console.println("\tList of Inventory Items");
        this.console.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

        for (InventoryItem item : inventory) {
            //display the description, the required amount and amount in stock
            this.console.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }
    }

    private void InventorySave() {

        String filePath = InventoryFileName();

        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();

        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(inventory);
        } catch (Exception e) {
            ErrorView.display("Program controller", e.getMessage());
        }
    }

    private void SortItemDescription() {
        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();
        String tempDesc;
        Integer tempSotck;
        Integer tempReq;
        Boolean breaked = false;

        this.console.println("Items ordered by Description");
        this.console.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

        while (!breaked) {
            for (InventoryItem item1 : inventory) {
                for (InventoryItem item2 : inventory) {
                    if (item2.getDescription().compareTo(item1.getDescription()) > 0) {
                        tempDesc = item1.getDescription();
                        tempSotck = item1.getQuantityInStock();
                        tempReq = item1.getRequiredAmount();
                        item1.setDescription(item2.getDescription());
                        item1.setQuantityInStock(item2.getQuantityInStock());
                        item1.setRequiredAmount(item2.getRequiredAmount());
                        item2.setDescription(tempDesc);
                        item2.setQuantityInStock(tempSotck);
                        item2.setRequiredAmount(tempReq);
                        breaked = true;
                        break;
                    } else {
                        breaked = false;
                    }
                }
            }
            if (breaked) {
                breaked = false;
                break;
            }

        }

        InventoryItem[] inventory2 = DesertEscape.getCurrentGame().getInventoryItem();

        for (InventoryItem item : inventory2) {
            //display the description, the required amount and amount in stock
            this.console.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }
        // this.console.println("\n*** SortItemDescription() function called ***");
    }

    private void SortItemInventory() {
        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();
        String tempDesc;
        Integer tempSotck;
        Integer tempReq;

        this.console.println("Items ordered by Inventory Stock");
        this.console.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

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
            this.console.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }
        // this.console.println("\n*** SortItemInventory() function called ***");
    }

    private void SortItemRequirment() {
        InventoryItem[] inventory = DesertEscape.getCurrentGame().getInventoryItem();
        String tempDesc;
        Integer tempSotck;
        Integer tempReq;

        this.console.println("Items ordered by Inventory Stock");
        this.console.println(String.format("%1$10s%2$10s%3$15s", "Description", "In Stock", "Requirement"));

        for (InventoryItem item1 : inventory) {
            for (InventoryItem item2 : inventory) {
                if (item2.getRequiredAmount() < item1.getRequiredAmount()) {
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
            this.console.println(String.format("%1$10s%2$10s%3$15s", item.getDescription(),
                    item.getQuantityInStock(),
                    item.getRequiredAmount()));
        }

        //this.console.println("\n*** SortItemRequirment() function called ***");
    }

}
