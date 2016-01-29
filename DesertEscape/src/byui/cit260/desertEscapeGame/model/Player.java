/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mambou & Paez
 */
public class Player implements Serializable {
    
    private String playerName;
    private double playerTime;
    
    public Player() {
    }
  
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getPlayerTime() {
        return playerTime;
    }

    public void setPlayerTime(double playerTime) {
        this.playerTime = playerTime;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerTime=" + playerTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.playerName);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.playerTime) ^ (Double.doubleToLongBits(this.playerTime) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.playerTime) != Double.doubleToLongBits(other.playerTime)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }
    
    
}
