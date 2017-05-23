/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author dam120
 */
public class ListaCoches {
    ArrayList <Coche> miCoche;
    
    public static ListaCoches milista = new ListaCoches();
    
    public ListaCoches(){
        miCoche = new ArrayList<>();
    }
    
    public void add_coche(Coche coche){
        miCoche.add(coche);
    }
    
     public ArrayList<Coche> getListaCoche() {
        return miCoche;
    }
    
}
