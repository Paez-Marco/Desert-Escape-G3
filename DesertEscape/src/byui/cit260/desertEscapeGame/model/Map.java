/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author mambou & Paez
 */
public class Map implements Serializable{
    
    private Integer noOfRows;
    private Integer noOfColumns;
    private Location[][] locations;

    public Map() {
    }

    
    
    public Map(int noOfRows, int noOfColumns){
        
        if(noOfRows < 1 || noOfColumns < 1){
        System.out.println("\n number of rows and columns must be > zero");
        return;
    }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create 2-D array for location object
        this.locations = new Location[noOfRows][noOfColumns];
        
        for(int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++) {
                // create an initialise new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setPlaceVisited(false);
                
                //assign the location object to current position in array
                locations[row][column] = location;
            }
        }

    }

    public Integer getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(Integer noOfRows) {
        this.noOfRows = noOfRows;
    }

    public Integer getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(Integer noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", locations=" + locations + '}';
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.noOfRows);
        hash = 59 * hash + Objects.hashCode(this.noOfColumns);
        hash = 59 * hash + Arrays.deepHashCode(this.locations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.noOfRows, other.noOfRows)) {
            return false;
        }
        if (!Objects.equals(this.noOfColumns, other.noOfColumns)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

   

    
    
}
