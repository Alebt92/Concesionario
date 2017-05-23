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
public class ListaVehiculos {
   public ArrayList<Vehiculos> listaVehiculos;
    
   public static ListaVehiculos miListaCoches = new ListaVehiculos();
   
   public ListaVehiculos(){
       listaVehiculos = new ArrayList<Vehiculos>();
   }
   
   public void add_coche(Vehiculos veh){
       listaVehiculos.add(veh);
   }
   
   public int tam() {
        return listaVehiculos.size();
    }
   
   public ArrayList<Vehiculos> getListaCoche() {
        return listaVehiculos;
    }
    
}
