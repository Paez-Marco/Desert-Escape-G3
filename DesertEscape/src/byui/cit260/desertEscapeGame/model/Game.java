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
public class Game implements Serializable{
    
    private double totalTime;
    private long numberOfPeople;
    
    private Mission mission;
    private BuildTimeMachine machine;
    private FillPit pit;
    private ShopDownTree tree;
    private Player player;
    private Inventory[ ] inventoryItem;
    private Map map;
    private Location location;
        
    

    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    
    public Mission getMission(){
        return mission;
    }
    
    public void setMission(Mission mission){
        this.mission = mission;
    }

    public BuildTimeMachine getMachine() {
        return machine;
    }

    public void setMachine(BuildTimeMachine machine) {
        this.machine = machine;
    }

    public FillPit getPit() {
        return pit;
    }

    public void setPit(FillPit pit) {
        this.pit = pit;
    }

    public ShopDownTree getTree() {
        return tree;
    }

    public void setTree(ShopDownTree tree) {
        this.tree = tree;
    }
    
    
    
    public Player getPlayer(){
        return player;
    }
    
    public void setPlayer(Player player){
        this.player = player;
    }
    
    public Inventory[ ] getInventoryItem(){
        return inventoryItem;
    }
    
    public Map getMap(){
        return map;
    }
    
    public void setMap(Map map){
        this.map = map;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numberOfPeople=" + numberOfPeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.numberOfPeople);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.numberOfPeople, other.numberOfPeople)) {
            return false;
        }
        return true;
    }
    
}
