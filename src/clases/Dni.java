/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.ConcesionarioExcepciones;
import java.util.Objects;

/**
 *
 * @author dam120
 */
public class Dni {

    private String dni;

    public Dni(String dni) throws ConcesionarioExcepciones {
        if(validar_dni(dni)){
            this.dni = dni;
        }else{
            throw new ConcesionarioExcepciones(1);
        }
    }

    private boolean validar_dni(String dni) {
        boolean correcto = false;
        if(dni.length() == 9){
            if(Character.isLetter(dni.charAt(8))){
                correcto = true;
            }
        }
        return correcto;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Dni: " + dni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dni other = (Dni) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    

    
}
