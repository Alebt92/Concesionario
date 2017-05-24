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
public class Coche extends Vehiculos{
    String n_plazas;
    
    public Coche(String marca, String modelo, String color, String motor, String n_plazas, int tipo) {
        super(marca, modelo, color, motor, tipo);
        this.n_plazas = n_plazas;
    }

    public String getN_plazas() {
        return n_plazas;
    }

    @Override
    public String toString() {
        return "Turismo: "+ "\n" + "Marca: " + this.marca + "\nModelo: " + this.modelo + 
                "\nColor: " + this.color + "\nMotor: " + this.motor + "\nNumero plazas:" + this.n_plazas;
    }

    
    
}
