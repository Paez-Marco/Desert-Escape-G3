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
public class Map implements Serializable{
    
    private Integer rowSite;
    private Integer columnSite;

    public Map() {
    }

    public Integer getRowSite() {
        return rowSite;
    }

    public void setRowSite(Integer rowSite) {
        this.rowSite = rowSite;
    }

    public Integer getColumnSite() {
        return columnSite;
    }

    public void setColumnSite(Integer columnSite) {
        this.columnSite = columnSite;
    }

    @Override
    public String toString() {
        return "Map{" + "rowSite=" + rowSite + ", columnSite=" + columnSite + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.rowSite);
        hash = 67 * hash + Objects.hashCode(this.columnSite);
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
        if (!Objects.equals(this.rowSite, other.rowSite)) {
            return false;
        }
        if (!Objects.equals(this.columnSite, other.columnSite)) {
            return false;
        }
        return true;
    }
    
}
