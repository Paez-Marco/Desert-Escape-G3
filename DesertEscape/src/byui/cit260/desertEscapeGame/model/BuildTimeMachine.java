/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.io.Serializable;

/**
 *
 * @author mambou
 */
public class BuildTimeMachine implements Serializable {
 
    private String description;
    private double height;
    private double weight;
    private Integer requiredDimension;
    private String requiredItems;
    
    public BuildTimeMachine(){
        this.description = "n\This is the Desert escape Game Mission "
                + " you have to build a time machine to win";
        this.height = 0;
        this.weight = 0;
        this.requiredDimension = 0;
        this.requiredItems = "n\ Find all the Items first";
    }
}
