/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.io.Serializable;

/**
 *
 * @author Mambou & Paez
 */
public enum Mission implements Serializable{
    
    AlienCamp("Mission Alien Camp"),
    Caves("Mission Caves"),
    Cliffs("Mission Cliffs"),
    Desert("Mission Desert"),
    Mountain("Mission Mountain"),
    Pyramids("Mission Pyramids"),
    Villain("Mission Villain");
    
    private final String description;
    private final double amountTime;

    Mission(String description) {
        this.description = description;
        amountTime = 10;
        // return "Mission{" + "name=" + name + ", description=" + description + ", amountTime=" + amountTime + '}';
    }

    public String getDescription() {
        return description;
    }

    public double getAmountTime() {
        return amountTime;
    }
}
