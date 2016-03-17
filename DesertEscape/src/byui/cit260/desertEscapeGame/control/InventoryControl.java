/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

import citbyui.cit260.desertEscapeGame.view.BodyMassView;

/**
 *
 * @author mambou
 */
public class InventoryControl {
    
    // Body Mass Index
    public double calcBodyMassIndex(double weight, double height) {
        BodyMassView body = new BodyMassView();
        body.displayBodyMassView();
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
    
    public double calcPitSize(double height, double radius) {
        
         
        if (radius <= 0 || height <= 0) {
		//radius or height values cannot be equal to zero or negative"
		return -1;
    }
		
	if (height > 30 || radius> 15) {
		//Radius and height are out boundary"
		return -1;
        }
	
	double volumepit = Math.PI * height * Math.pow(radius, 2);

	return volumepit;    
}

    public double calcShovelSize(double height, double radius) {
        
        if (height <0 || radius < 0) {
		//radius or height values cannot be  negative"
		return -1;
                        }
		
	if (height > 50 || radius > 30) {
		//Radius or height is out boundary
		return -1;
                        }
	
	double volumeShovelSize = (Math.PI * height * Math.pow(radius, 2))*1/3;

	return volumeShovelSize;
    }

    
    public double calcTreeHeight(double dimension, double angle) {
        
        if (dimension < 0 || angle < 0) {
            //dimension or angle cannot be negative
            return -1;
        }
        if (dimension > 45 || angle > 30) {
            //dimension or angle too big (Out of Boundary)
            return -1;
        }
        
        double Height = dimension * Math.tan(angle * (Math.PI / 180));
       
        return Height;
    }    
} 
