/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.models;

/**
 *
 * @author Prashul Singh
 */
public class Location {
    
    int x1;
    int y1;

    public Location(int x1,int y1) {
        this.x1 = x1;
        this.y1 = y1;    
    }
    
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
    
}
