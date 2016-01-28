/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mambou
 */
public class StartGame implements Serializable {
    
    private String playerName;
    private Integer numberofpoint;
    private String difficulty;
    private String inventory;

    public StartGame() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getNumberofpoint() {
        return numberofpoint;
    }

    public void setNumberofpoint(Integer numberofpoint) {
        this.numberofpoint = numberofpoint;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "StartGame{" + "playerName=" + playerName + ", numberofpoint=" + numberofpoint + ", difficulty=" + difficulty + ", inventory=" + inventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.playerName);
        hash = 29 * hash + Objects.hashCode(this.numberofpoint);
        hash = 29 * hash + Objects.hashCode(this.difficulty);
        hash = 29 * hash + Objects.hashCode(this.inventory);
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
        final StartGame other = (StartGame) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.numberofpoint, other.numberofpoint)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
