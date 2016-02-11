/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

/**
 *
 * @author mambou
 */
public class InventoryControl {
    
    
    public double calcBodyMassIndex(double weight, double height) {
        
        if (weight <= 0 || height <= 0) {
		//weight (lbs) or height (inch) value cannot be less than 1
		return -1;
        }
		
	if (weight > 140 || height > 63) {
		//"weight (lbs) or height (inch) is out bound"
		return -1;
                        }

	double mass = (weight/Math.pow(height, 2))*703;

	return mass;

    }
    
    
    
}
