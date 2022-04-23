/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Los agujeros redondos son compatibles con las piezas redondas 
 */
public class RoundHoles {
    private double radius; //se declara el radio
    
    public RoundHoles (double radius){
    this.radius = radius; 
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    
    public boolean fits (RoundPeg peg){
    boolean result; 
    result = (this.getRadius( ) >= peg.getRadius()); 
    return result; 
    }
    
}
