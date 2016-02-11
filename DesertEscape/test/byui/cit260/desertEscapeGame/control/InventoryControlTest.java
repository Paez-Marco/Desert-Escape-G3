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
 * @author mambou
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcBodyMassIndex method, of class InventoryControl.
     */
    @Test
    public void testCalcBodyMassIndex() {
        
        System.out.println("calcBodyMassIndex");
        
        /*********************************
         * Test Case 1
         ********************************/
        System.out.println("\tTest case #1");
        //input values for test case 1        
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
        System.out.println("\tTest case #2");
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
        System.out.println("\tTest case #3");
        //input values for test case 3       
        weight = 140;
        height = -1.0;
        
        expResult = -1; //expected output return value
        
        //call function to run test
        result = instance.calcBodyMassIndex(weight, height);
        //compare expected return value with atual value return
        assertEquals(expResult, result, 0.001);
    }
    
}
