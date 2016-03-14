/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author mambou & Paez
 */
public class Location implements Serializable {

    private int row;
    private int column;
    private boolean placeVisited;
    private double amountRemaining;
    private Scene scene;
    private SceneType type;
    private ArrayList<Actor> actors;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isPlaceVisited() {
        return placeVisited;
    }

    public void setPlaceVisited(boolean placeVisited) {
        this.placeVisited = placeVisited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public SceneType getType() {
        return type;
    }

    public void setType(SceneType type) {
        this.type = type;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

}
