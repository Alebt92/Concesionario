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
public class ListaFurgonetas {
    ArrayList <Furgoneta> miFurgo;
    
    public static ListaFurgonetas mLista = new ListaFurgonetas();
    
    public ListaFurgonetas(){
        miFurgo = new ArrayList<>();
    }
    
    public void add_coche(Furgoneta furgo){
        miFurgo.add(furgo);
    }
    public Furgoneta buscar_furgo(int id){
         String cadena = "ERROR" + id; //mensaje por defecto
        ListIterator<Furgoneta> iterList = miFurgo.listIterator();
        Furgoneta temp = null;
        
        if(miFurgo.isEmpty()){ //
            cadena = "No hay furgonetas en la lista";
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
     public ArrayList<Furgoneta> getListaFurgo() {
        return miFurgo;
    }
}
