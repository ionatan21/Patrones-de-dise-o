/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author barri
 */
public class RecordPerson {
    String nombre;
    String Apellido1;
    String Apellido2;
    String Direccion;

    public RecordPerson() {
    }

    public RecordPerson(String nombre, String Apellido1, String Apellido2, String Direccion) {
        this.nombre = nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    @Override
   public String toString()
   {
   return "Nombre: " + nombre + " Apellidos: " + Apellido1 + " " + Apellido2 + " Direccion: " + Direccion + " " ;
   }    
    
    
    
}
