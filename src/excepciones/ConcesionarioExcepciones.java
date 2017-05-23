/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Alejandro
 */
public class ConcesionarioExcepciones extends Exception{
     private int error;
    
    public ConcesionarioExcepciones(int error){
        this.error = error;
    }
    
    @Override
    public String getMessage(){
        switch (this.error) {
            case 1: return "Dni incorrecto. El formato correcto es 11111111X (8 dígitos y una letra)";
            case 2: return "El nombre debe contener más de 4 caracteres";
            case 3: return "El apellido debe contener más de 4 caracteres";
            case 4: return "La clave debe contener más de 4 caracteres";
            case 5: return "Error, el usuario que intentas registrar ya existe!";
            default:
               return "";
        }
    }
}
