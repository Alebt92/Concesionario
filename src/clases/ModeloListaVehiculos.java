/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.DefaultListModel;

/**
 *
 * @author dam120
 */
public class ModeloListaVehiculos extends DefaultListModel {

    ListaVehiculos veh;

    public void cargar(ListaVehiculos l) {
        veh = l;
        this.fireContentsChanged(this, 0, size());
    }

    @Override
    public int getSize() {
        return veh.tam();
    }
    @Override
    public Object getElementAt(int index) {
        String cadena = veh.listaVehiculos.get(index).getModelo();
        return cadena;

    }
}
