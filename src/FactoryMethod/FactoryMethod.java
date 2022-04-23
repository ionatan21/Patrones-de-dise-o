/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryMethod;
import java.util.ArrayList;
/**
 *
 * @author barri
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Personas P = MayoresEdad.getAge(20); 
        ArrayList<Personas> LIST = new ArrayList<>();
        LIST.add(new Personas("Victor","Manuel","Valverde","Las Trenzas","8888888","Soltero",
                               //"Cartago","Hombre","305320465",20,get));
    }
    
}
