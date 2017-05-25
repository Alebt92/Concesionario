/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author dam120
 */
public class Furgoneta extends Vehiculos{
    String capacidad;
    public Furgoneta(String marca, String modelo, String color, String motor, String capacidad, int tipo) {
        super(marca, modelo, color, motor, tipo);
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Furgoneta: "+ "\n" + "Marca: " + this.marca + "\nModelo: " + this.modelo + 
                "\nColor: " + this.color + "\nMotor: " + this.motor + "\nCapacidad:" + this.capacidad;
    }
    
    
    
   
    
    
}