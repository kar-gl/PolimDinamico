/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.polimorfismodinamico.clases;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Estudiante extends Persona{
    private int codigoEstudiante;
  
    public Estudiante(int codigoEstudiante, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.codigoEstudiante = codigoEstudiante;
    }
    @Override
   public String imprimir() {
    return super.imprimir()+"Codigo estudiante:"+this.codigoEstudiante; 
   }
}
