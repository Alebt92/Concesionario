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
public class Usuario{
    String nombre;
    String apellido;
    Dni dni;
    String clave;
    String sexo;
    
    
    
    
    public Usuario(String nombre, String apellido, Dni dni, String clave, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.clave = clave;
        this.sexo = sexo;
    }

    public Dni getDni() {
        return dni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        boolean igual = false;
        Usuario temp = (Usuario) obj;
        
        if (obj == null) {// objeto no inicializado
            igual = false;
        }
        else if (this.getClass() != obj.getClass()) {
            igual = false;
        }
        
        else if (temp.getDni().equals(this.getDni())) {
            igual = true;
        }
        return igual;
    }
    

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }

    
    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Usuario: " + this.nombre +
                "\nApellido: " + this.apellido + 
                "\nSexo: " + this.sexo +
                "\n" + this.dni;
    }

 

    public String getClave() {
        return clave;
    }
    
   
}
