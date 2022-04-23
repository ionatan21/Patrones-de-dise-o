/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryMethod;
import java.util.Scanner;
/**
 *
 * @author Jonatan
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        while (i < 5) {            
    System.out.println("Digite su edad: ");
    int edad = sc.nextInt();
        
    Edad vf = new VerificarEdades().getPrivilegios(edad);
     
    System.out.println("Verificacion numero: "+ i);
    vf.setPrivilegios("Sus privilegios segun su edad son: ");
    System.out.println(vf.getPrivilegios());
     
    vf.DescripcionPrivilegios(); 
            System.out.println("");    
            i++;
        }
   
        
        
    }
    
}
