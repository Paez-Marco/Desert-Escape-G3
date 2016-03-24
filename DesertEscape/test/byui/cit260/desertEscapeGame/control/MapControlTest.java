/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import desertescape.DesertEscape;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarcoA
 */
public class MapControlTest {
    protected final BufferedReader keyboard = DesertEscape.getInFile();
        protected final PrintWriter console = DesertEscape.getOutFile();

    public MapControlTest() {
    }

    /**
     * Test of visitLocation method, of class MapControl.
     */
    @Test
    public void testVisitLocation() {
        this.console.println("visitLocation");
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
        this.console.println("moveLocation");
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
        this.console.println("validLocation");
        String player = "Marco";
        String location = "1. The Alien Camp";
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.validLocation(player, location);
        assertEquals(expResult, result);

    }

}
