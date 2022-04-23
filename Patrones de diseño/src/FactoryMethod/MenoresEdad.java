/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Jonatan
 */
public class MenoresEdad extends Edad{
    @Override
    public void DescripcionPrivilegios(){
     System.out.println("Eres menor de edad");
     System.out.println("Tienes derecho a conocer a tus padres");
     System.out.println("Tienes derecho a permaneser en un hogar");
     System.out.println("Tienes derecho a que el estado garantice tu proteccion");
     System.out.println("Tienes derecho a que se respete tu integridad fisica");
    }
}
