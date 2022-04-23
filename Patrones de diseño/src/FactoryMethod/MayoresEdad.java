/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Jonatan
 */
public class MayoresEdad extends Edad{
    @Override
    public void DescripcionPrivilegios(){
     System.out.println("Si eres mayor de edad");
     System.out.println("Tienes derecho a obtener carnet o permiso de conducir");
     System.out.println("Tienes derecho a la capacidad de obrar");
     System.out.println("Tienes derecho a votar");
     System.out.println("Tienes derecho a comprar alchol");
 }
}
