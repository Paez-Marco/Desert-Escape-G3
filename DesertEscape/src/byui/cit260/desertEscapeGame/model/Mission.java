/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mambou & Paez
 */
public class Mission implements Serializable{
    
    /*AlienCamp("Mission Alien Camp"),
    Caves("Mission Caves"),
    Cliffs("Mission Cliffs"),
    Desert("Mission Desert"),
    Mountain("Mission Mountain"),
    Pyramids("Mission Pyramids"),
    Villain("Mission Villain");*/
    
    /*private final String description;
    private final double amountTime;*/
    
    private String buildTimeMachine;
    private String fillPit;
    private String shopDownTree;
    private String description;
    private int amountOfTime;

    /*Mission(String description) {
        this.description = description;
        amountTime = 10;
        // return "Mission{" + "name=" + name + ", description=" + description + ", amountTime=" + amountTime + '}';*/

    public Mission() {
    }

    public String getBuildTimeMachine() {
        return buildTimeMachine;
    }

    public void setBuildTimeMachine(String buildTimeMachine) {
        this.buildTimeMachine = buildTimeMachine;
    }

    public String getFillPit() {
        return fillPit;
    }

    public void setFillPit(String fillPit) {
        this.fillPit = fillPit;
    }

    public String getShopDownTree() {
        return shopDownTree;
    }

    public void setShopDownTree(String shopDownTree) {
        this.shopDownTree = shopDownTree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmountOfTime() {
        return amountOfTime;
    }

    public void setAmountOfTime(int amountOfTime) {
        this.amountOfTime = amountOfTime;
    }

    
    
    
    

}

    

