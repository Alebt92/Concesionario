/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.ConcesionarioExcepciones;

/**
 *
 * @author dam120
 */
public class Comprobaciones {
    static public boolean comprobar(String nombre, String apellido, String contra) throws ConcesionarioExcepciones{
        boolean correcto = false;
        if(nombre.isEmpty() || nombre.length() < 4){
            throw new ConcesionarioExcepciones(2);
        }else if(apellido.isEmpty() || apellido.length() < 4){
           throw new ConcesionarioExcepciones(3);
        }else if(contra.isEmpty() || contra.length() < 4){
            throw new ConcesionarioExcepciones(4);
        }else{
            correcto = true;
        }
        return correcto;
                
    }
    
    static public boolean  comprobar_gestion(String marca, String modelo, String color, String motor) throws ConcesionarioExcepciones{
  
        
        if(marca.isEmpty() || modelo.isEmpty() || color.isEmpty() || motor.isEmpty()){
            throw new ConcesionarioExcepciones(6);
        }else{
            return true;
        }
    }
    
}
