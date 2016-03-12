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
public class ShopDownTree implements Serializable {
    private String description;
    
    public ShopDownTree(){
        this.description = description;
        System.out.println("\n You are required to chop down a tree to the exact length"
                + "\n in order to span the length of a crevasse."
                + "\n If the length is too long, it will not fit, "
                + "\n if it is too short, the tree will not fit.");
    }
    
}
