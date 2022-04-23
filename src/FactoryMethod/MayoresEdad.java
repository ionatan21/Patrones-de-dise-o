/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author barri
 */
public class MayoresEdad extends Personas{
      @Override
    public String Comprobacion(){
        String a = "Mayor";
        String b = "Menor";
        if (getAge() > 18){
         return a;
        }
       else
            
        return b;  
    }
    
}
