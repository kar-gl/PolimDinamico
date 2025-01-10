/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.polimorfismodinamico.clases;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Persona {
 private String cedula;
 private String nombre;
 private String apellido;

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
        public String imprimir(){
       return ("Cedula:"+ this.cedula+"Nombre:"+this.nombre+"Apellido:"+this.apellido);
   }


   
        
    
}
