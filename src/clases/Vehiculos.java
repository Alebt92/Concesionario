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
public abstract class Vehiculos {
    String marca;
    String modelo;
    String color;
    String motor;
    int tipo;
    int id;

    static int contador = 1;
    public Vehiculos(String marca, String modelo, String color, String motor, int tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.tipo = tipo;
        this.id=contador;
        contador++;
        
        System.out.println("Veh creado id: " + this.id);
    }

    public int getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMotor() {
        return motor;
    }

    public int getId() {
        return id;
    }
    
    
    
}
