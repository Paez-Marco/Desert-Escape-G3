/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import byui.cit260.desertEscapeGame.control.MapControl;
import byui.cit260.desertEscapeGame.exceptions.MapControlException;
import byui.cit260.desertEscapeGame.model.Actor;
import citbyui.cit260.desertEscapeGame.view.ViewInterface.View;
import java.awt.Point;

/**
 *
 * @author mambou
 */
public class MapControlLocationView extends View {
    
    
    @Override
    public boolean doAction(String value) {
    Actor actor = null;
    Point coordinate = null;
       
       //move actor to specified location
       try {
      MapControl.moveActorTolocation(actor, coordinate);
       } catch (MapControlException me) {
           System.out.println(me.getMessage());
       }
       return false;
    }
}

