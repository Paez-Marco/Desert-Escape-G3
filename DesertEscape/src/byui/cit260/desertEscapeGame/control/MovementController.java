/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import byui.cit260.desertEscapeGame.exceptions.MovementControllerException;
import byui.cit260.desertEscapeGame.model.Game;
import byui.cit260.desertEscapeGame.model.Location;
import byui.cit260.desertEscapeGame.model.Map;
import byui.cit260.desertEscapeGame.model.Player;

/**
 *
 * @author mambou
 */
public class MovementController {
 
    //public boolean moveNorth(Game game) {
    public void moveNorth(Game game) throws MovementControllerException {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0){
            throw new MovementControllerException("Can not move to North");
            //return false;
        }
        
        int currentColumn = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow -1;
        
        Location newLocation = map.getLocation(newRow,currentColumn);
        player.setLocation(newLocation);
        
        //return true;
    }
    
    // public boolean moveEast(Game game){
    public void moveEast(Game game) throws MovementControllerException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == Map.noOfColumns -1){
            throw new MovementControllerException("Can not move to East");
            //return false;
        }
        
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn()+1));
        
        //return true;
    }
    
    //public boolean moveSouth(Game game){
    public void moveSouth(Game game) throws MovementControllerException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.noOfRows -1){
            throw new MovementControllerException("Can not move to South");
            //return false;
        }
        
        
        player.setLocation(map.getLocation(currentLocation.getRow()+1, currentLocation.getColumn()));
        
        //return true;
    }
    
    //public boolean moveWest(Game game){
    public void moveWest(Game game) throws MovementControllerException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == 0){
            throw new MovementControllerException("Can not move to West");
            //return false;
        }
        
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn()-1));
        
        //return true;
    }
}
