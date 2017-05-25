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
public class ListaVehiculos {

    public ArrayList<Vehiculos> listaVehiculos;

    public static ListaVehiculos miListaCoches = new ListaVehiculos();

    public ListaVehiculos() {
        listaVehiculos = new ArrayList<Vehiculos>();
    }

    public void eliminar_vehiculo(int id) {
        boolean borrado = false;
        ListIterator<Vehiculos> iterList = listaVehiculos.listIterator();
        Vehiculos temp;
        if (listaVehiculos.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            while (iterList.hasNext() && borrado == false) {
                temp = iterList.next();
                if (id == temp.getId()) {
                    listaVehiculos.remove(temp);
                    borrado = true;
                }
            }
        }
    }
    public void add_coche(Vehiculos veh) {
        listaVehiculos.add(veh);
    }

    public int tam() {
        return listaVehiculos.size();
    }

    public ArrayList<Vehiculos> getListaCoche() {
        return listaVehiculos;
    }

}
