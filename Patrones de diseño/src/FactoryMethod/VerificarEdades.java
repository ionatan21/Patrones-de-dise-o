/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Jonatan
 */
public class VerificarEdades {
    
    public Edad getPrivilegios(int edad){
        
        
        
    if(edad >= 18){
    return new MayoresEdad();
    }
    if(edad < 18){
    return new MenoresEdad();
    }
    return null;
    }
    
    
    
    
}
