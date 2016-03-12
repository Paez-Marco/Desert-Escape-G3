/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import byui.cit260.desertEscapeGame.model.Game;
import byui.cit260.desertEscapeGame.model.Inventory;
import byui.cit260.desertEscapeGame.model.Item;
import byui.cit260.desertEscapeGame.model.Location;
import byui.cit260.desertEscapeGame.model.Map;
import byui.cit260.desertEscapeGame.model.Mission;
import byui.cit260.desertEscapeGame.model.Player;
import byui.cit260.desertEscapeGame.model.Scene;
import byui.cit260.desertEscapeGame.model.SceneType;
import desertescape.DesertEscape;

/**
 *
 * @author mambou
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setPlayerName(name);
        
        DesertEscape.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();  // create a new game
        DesertEscape.setCurrentGame(game); // save game in DesertEscape
        
        game.setPlayer(player); // save player in the game
        
        //create the inventory list and save in the game
        Inventory[ ] inventoryList = GameControl.createInventoryList();
        
        Mission mission = new Mission();
        game.setMission(mission);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        //Move actor to starting position in the map
        MapControl.moveActorsToStartinglocation(map);
    }

    public static Inventory[] createInventoryList() {
        Inventory[ ] inventoryItem = new Inventory[Constants.NUMBER_OF_INVENTORY_ITEM];
        
        Inventory medecine = new Inventory();
        medecine.setDescription("Medecine");
        medecine.setQuantityInStock(0);
        medecine.setRequiredAmount(0);
        inventoryItem[Item.medecine.ordinal()] = medecine;
        
        Inventory water = new Inventory();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventoryItem[Item.water.ordinal()] = water;
        
        Inventory food = new Inventory();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventoryItem[Item.food.ordinal()] = food;
        
        Inventory knife = new Inventory();
        knife.setDescription("Knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventoryItem[Item.knife.ordinal()] = knife;
        
        Inventory boot = new Inventory();
        boot.setDescription("Boot");
        boot.setQuantityInStock(0);
        boot.setRequiredAmount(0);
        inventoryItem[Item.boot.ordinal()] = boot;
        
        Inventory shirt = new Inventory();
        shirt.setDescription("Shirt");
        shirt.setQuantityInStock(0);
        shirt.setRequiredAmount(0);
        inventoryItem[Item.shirt.ordinal()] = shirt;
        
      return inventoryItem;  
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.alienCamp.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.alienCamp.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.alienCamp.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.alienCamp.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.alienCamp.ordinal()]);
        
    }
    
}  
