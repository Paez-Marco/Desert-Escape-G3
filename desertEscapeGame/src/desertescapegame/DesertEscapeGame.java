/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescapegame;

import byui.cit260.desertEscape.model.StartGame;

/**
 *
 * @author mambou
 */
public class DesertEscapeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //class instance variable
        StartGame startnewgame = new StartGame();
        
        startnewgame.setPlayerName("Marco");
        startnewgame.setNumberofpoint(0);
        startnewgame.setDifficulty("Desert");
        startnewgame.setInventory("Locked");
        
        String startnewgameInfo = startnewgame.toString();
        System.out.println(startnewgameInfo);
        
        
        
    }
    
}
