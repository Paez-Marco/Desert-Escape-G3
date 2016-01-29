/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscapeGame.model.Player;

/**
 *
 * @author mambou & Paez
 */
public class DesertEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //class instance variable Player
        Player playerOne = new Player();
        playerOne.setPlayerName("Gilles");
        playerOne.setPlayerTime(5);
        
        Player playerTwo = new Player();
        playerTwo.setPlayerName("Marco");
        playerTwo.setPlayerTime(5);
        
        String playerInfo1 = playerOne.toString();
        System.out.println(playerInfo1);
        
        String playerInfo2 = playerTwo.toString();
        System.out.println(playerInfo2);
    }
    
}
