/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author victorvf
 */
public class MayoresEdad extends Personas {
    
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
