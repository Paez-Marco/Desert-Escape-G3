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
    private InventoryItem[] inventoryItem;
    private Map map;
    private Location location;
    private Actor actor;
        
    

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
    
    public InventoryItem[] getInventoryItem(){
        return inventoryItem;
    }
    
    public void setInventoryItem(InventoryItem[] items) {
        this.inventoryItem = items;
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

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
  
}
