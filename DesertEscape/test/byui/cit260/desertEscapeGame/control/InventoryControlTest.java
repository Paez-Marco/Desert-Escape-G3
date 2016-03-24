/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import byui.cit.desertEscapeGame.exceptions.MapControlException;
import desertescape.DesertEscape;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mambou
 */
public class InventoryControlTest {
   protected final BufferedReader keyboard = DesertEscape.getInFile();
        protected final PrintWriter console = DesertEscape.getOutFile();
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcBodyMassIndex method, of class InventoryControl.
     */
    @Test
    public void testCalcBodyMassIndex() throws MapControlException {
        
        this.console.println("calcBodyMassIndex");
        
        /*********************************
         * Test Case 1
         ********************************/
        this.console.println("\tTest case #1"); 
        //input values for test case 1 ( weight in pounds and height in inches) 
        double weight = 140; 
        double height = 62.74;
        
        double expResult = 25.003; //expected output return value
        
        //create instance of inventory class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcBodyMassIndex(weight, height);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
        
        
        /*********************************
         * Test Case 2
         ********************************/
        this.console.println("\tTest case #2");
        //input values for test case 2        
        weight = -1.0;
        height = 62.74;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcBodyMassIndex(weight, height);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
        
        /*********************************
         * Test Case 3
         ********************************/
        this.console.println("\tTest case #3");
        //input values for test case 3       
        weight = 140;
        height = -1.0;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcBodyMassIndex(weight, height);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
         /*********************************
         * Test Case 4
         ********************************/
        this.console.println("\tTest case #4");
        //input values for test case 4      
        weight = 10000;
        height = 120;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcBodyMassIndex(weight, height);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of calcPitSize method, of class InventoryControl.
     */
    @Test
    public void testCalcPitSize() {
        this.console.println("calcPitSize");
        
        
        /*********************************
         * Test Case 1
         ********************************/
        this.console.println("\tTest case #1");
        //input values for test case 1     
        double height = 30;
        double radius = 15;
        
        double expResult = 21205.75; //expected output return value
        
        //create instance of inventory class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcPitSize(height, radius);
        
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.01);
        
        
        
        /*********************************
         * Test Case 2
         ********************************/
        this.console.println("\tTest case #2");
        //input values for test case 2        
        height = -12;
        radius = 12;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcPitSize(height, radius);
        
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.01);
        
        
        /*********************************
         * Test Case 3
         ********************************/
        this.console.println("\tTest case #3");
        //input values for test case 3       
        height = 100;
        radius = -10;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcPitSize(height, radius);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calcShovelSize method, of class InventoryControl.
     */
    @Test
    public void testCalcShovelSize() {
        this.console.println("calcShovelSize");
        
        /*********************************
         * Test Case 1
         ********************************/
        this.console.println("\tTest case #1");
        //input values for test case 1     
        double height = 30;
        double radius = 10;
        
        double expResult = 3141.593; //expected output return value
        
        //create instance of inventory class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcShovelSize(height, radius);
        
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
        
        
        /*********************************
         * Test Case 2
         ********************************/
        this.console.println("\tTest case #2");
        //input values for test case 2        
        height = 30;
        radius = -1;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcShovelSize(height, radius);
        
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
        
        /*********************************
         * Test Case 3
         ********************************/
        this.console.println("\tTest case #3");
        //input values for test case 3       
        height = -29;
        radius = 10;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcShovelSize(height, radius);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of calcTreeHeight method, of class InventoryControl.
     */
    @Test
    public void testCalcTreeHeight() {
        this.console.println("calcTreeHeight");
        
        /*********************************
         * Test Case 1
         ********************************/
        this.console.println("\tTest case #1");
        //input values for test case 1     
        double dimension = 45;
        double angle = 30; //use angle in degree
        
        double expResult = 25.981; //expected output return value
        
        //create instance of inventory class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcTreeHeight(dimension, angle);
        
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
        
        
        /*********************************
         * Test Case 2
         ********************************/
        this.console.println("\tTest case #2");
        //input values for test case 2        
        dimension = -30;
        angle = 75; //use angle in degree
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcTreeHeight(dimension, angle);
        
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
        
        
        /*********************************
         * Test Case 3
         ********************************/
        this.console.println("\tTest case #3");
        //input values for test case 3       
        dimension = 45;
        angle = -30; //use angle in degree
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcTreeHeight(dimension, angle);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
    }

    
    
}


    