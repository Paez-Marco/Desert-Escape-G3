/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarcoA
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of visitLocation method, of class MapControl.
     */
    @Test
    public void testVisitLocation() {
        System.out.println("visitLocation");
        String nameOfPlayer = "Marco";
        String location = "1. The Alien Camp";
        MapControl instance = new MapControl();
        instance.visitLocation(nameOfPlayer, location);
        
    }

    /**
     * Test of moveLocation method, of class MapControl.
     */
    @Test
    public void testMoveLocation() {
        System.out.println("moveLocation");
        String player = "Marco";
        String location = "1. The Alien Camp";
        MapControl instance = new MapControl();
        String expResult = "1. The Alien Camp";
        String result = instance.moveLocation(player, location);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validLocation method, of class MapControl.
     */
    @Test
    public void testValidLocation() {
        System.out.println("validLocation");
        String player = "Marco";
        String location = "1. The Alien Camp";
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.validLocation(player, location);
        assertEquals(expResult, result);
        
    }
    
}
