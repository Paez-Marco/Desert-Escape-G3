/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import byui.cit260.desertEscapeGame.model.Player;

/**
 *
 * @author Mambou & Paez
 */
public class DifficultyControl {
    
    public Integer setDifficultyLevel(Player playerName, Integer difficulty) {
        
        if (playerName == null || difficulty <= 0)
            return -1;
        
        return difficulty++;
    }
}
