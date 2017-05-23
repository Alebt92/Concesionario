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
    public String buscar_furgo(String id){
         String cadena = "ERROR" + id; //mensaje por defecto
        ListIterator<Furgoneta> iterList = miFurgo.listIterator();
        Furgoneta temp;
        
        if(miFurgo.isEmpty()){ // la agenda está vacía
            cadena = "La agenda está vacía";
        }else{
            while(iterList.hasNext()){
                temp = iterList.next();
                if(id.equalsIgnoreCase(temp.getId())){
                    cadena = temp.toString();
                }
            }
        }
        return cadena;
    }
     public ArrayList<Furgoneta> getListaFurgo() {
        return miFurgo;
    }
}
