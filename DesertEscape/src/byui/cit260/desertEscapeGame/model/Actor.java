/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mambou
 */
public enum Actor implements Serializable {
    
   NicolaWilliam("actor choice"),
   Laila("actor choice"),
   Buldo("actor choice");
    
    private final String description;
    private final Point coordinate;

    Actor(String description) {
    
    this.description = description;
    coordinate = new Point(1,1);
    }
    
    

    public String getDescription() {
        return description;
    }

    

    public Point getCoordinate() {
        return coordinate;
    }

   
    
}
