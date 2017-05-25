/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.ListIterator;

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
     
     
     public Coche buscar_coche(int id){
         String cadena = "ERROR" + id; //mensaje por defecto
        ListIterator<Coche> iterList = miCoche.listIterator();
        Coche temp = null;
        
        if(miCoche.isEmpty()){ //
            cadena = "No hay coches en la lista";
        }else{
            while(iterList.hasNext()){
                temp = iterList.next();
                if(id == temp.getId()){
                    return temp;
                }
            }
        }
        return temp;
    }
     
     public void eliminar_coche(int id) {
        boolean borrado = false;
        ListIterator<Coche> iterList = miCoche.listIterator();
        Coche temp;
        if (miCoche.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            while (iterList.hasNext() && borrado == false) {
                temp = iterList.next();
                if (id == temp.getId()) {
                    miCoche.remove(temp);
                    borrado = true;
                }
            }
        }
    }
    
}
