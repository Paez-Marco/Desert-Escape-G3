/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import byui.cit260.desertEscapeGame.model.Game;
import byui.cit260.desertEscapeGame.model.Map;
import byui.cit260.desertEscapeGame.model.Scene;
import byui.cit260.desertEscapeGame.model.SceneType;
import desertescape.DesertEscape;

/**
 *
 * @author Mambou & Paez
 */
public class MapControl {

    public static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        //create a list of the different scene in the game
        Scene[] scenes = createScenes();
        
        //assign the different scene to location in the map
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        Game game = DesertEscape.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                     "\n "
        );
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(300);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n "
        );
        finishScene.setMapSymbol("ST");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
        }

    static void moveActorsToStartinglocation(Map map) {
        System.out.println("\n moveActorsToStartinglocation() stub function called");
    }
    
     public void visitLocation(String nameOfPlayer, String location) {
        
       
        nameOfPlayer = toString();
        
        if (nameOfPlayer == null || location == null) {
            String nameSite = "Can not visit this Location";
            return;
        }
        
        // locations to visit
        System.out.println("Welcome " + nameOfPlayer + "\n");
        System.out.println("Site to visit:\n");
        System.out.println("1. The Alien Camp");
        System.out.println("2. The Terrible Caves");
        System.out.println("3. Big Cliffs");
        System.out.println("4. Climb the Mountains");
        System.out.println("5. Walk in the Desert");
        System.out.println("6. Search the Pyramids");
        
        // select location
        String selectSite = System.in.toString();
                
        // valid location
        String nameSite = moveLocation(nameOfPlayer, selectSite);
        
        if (validLocation(nameOfPlayer, nameSite))
            System.out.println("Time to win: " + nameSite);
        else
            System.out.println("Can not visit this Location, please restart");
                
    }
    
    public String moveLocation(String player, String location) {
        
        // verifying the parameters are not null
        String moveMessage = location;
        if (player == null || location == null)
            return moveMessage;
                
        // Assign the name of the location to visit
        if ("1".equals(location)) 
            moveMessage = "\"The Alien Camp\"";
        if ("2".equals(location))
            moveMessage = "\"The Terrible Caves\"";
        if ("3".equals(location))
            moveMessage = "\"Big Cliffs\"";
        if ("4".equals(location))
            moveMessage = "\"Climb the Mountains\"";
        if ("5".equals(location))
            moveMessage = "\"Walk in the Desert\"";
        if ("6".equals(location))
            moveMessage = "\"Search the Pyramids\"";
        
        // not a valid site
        return moveMessage;
        
    }
    
    public boolean validLocation(String player, String location) {
        
        if (player == null || location == null) {
            return true;
        }
        String nameSite = moveLocation(player, location);
        
        if (nameSite !=  location){
            return false;}
        return false;
        
    }
    
  }
