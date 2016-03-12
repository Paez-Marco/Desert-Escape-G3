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
public class FillPit implements Serializable {
    
    private String description;
    private double sizeOfShovel;
    private double amountOfShovelFull;
    private double volumeOfPit;
    private double volumeOfShovel;
    
    public FillPit(){
        this.description = "\nThis is the Desert escape Game Mission "
                + " you have to build a time machine to win";
        this.sizeOfShovel = 0;
        this.amountOfShovelFull = 0;
        this.volumeOfPit = 0;
        this.volumeOfShovel = 0;
        
    }
}
