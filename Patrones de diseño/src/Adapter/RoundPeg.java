/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Piezas redondas compatibles son compatibles con los agujeros redondos 
 * @author Isaac GL
 */
public class RoundPeg {
    private double radius; 
    
    public RoundPeg (){
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public RoundPeg (double radius) {
        this.radius = radius; 
}
    
    public double getRadius () {
    return radius; 
    }
    
}
