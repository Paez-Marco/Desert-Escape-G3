/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import byui.cit260.desertEscapeGame.model.Game;
import byui.cit260.desertEscapeGame.model.Location;
import byui.cit260.desertEscapeGame.model.Map;
import byui.cit260.desertEscapeGame.model.Player;

/**
 *
 * @author mambou
 */
public class MovementController {
 
    public boolean moveNorth(Game game){
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0){
            return false;
        }
        
        int currentColumn = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow -1;
        
        Location newLocation = map.getLocation(newRow,currentColumn);
        player.setLocation(newLocation);
        
        return true;
    }
    
    public boolean moveEast(Game game){
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == Map.noOfColumns -1){
            return false;
        }
        
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn()+1));
        
        return true;
    }
    
    public boolean moveSouth(Game game){
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.noOfRows -1){
            return false;
        }
        
        
        player.setLocation(map.getLocation(currentLocation.getRow()+1, currentLocation.getColumn()));
        
        return true;
    }
    
    public boolean moveWest(Game game){
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == 0){
            return false;
        }
        
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn()-1));
        
        return true;
    }
}
