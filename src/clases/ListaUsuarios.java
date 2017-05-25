/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.ConcesionarioExcepciones;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author dam120
 */
public class ListaUsuarios {

    private ArrayList<Usuario> user;

    public ListaUsuarios() {
        user = new ArrayList<Usuario>();
    }

    static public ListaUsuarios usu = new ListaUsuarios();

    public void nuevo_usuario(Usuario usuario) throws ConcesionarioExcepciones {
        if (!comprobar_existe(usuario)) {
            user.add(usuario);
            System.out.println(usuario.getDni());
        } else {
            throw new ConcesionarioExcepciones(5);
        }
    }

    public boolean comprobar_datos_usuario(String nombre, String contra) {
        boolean correcto = false;
        Usuario temp;
        ListIterator<Usuario> iterList = user.listIterator();
        while (iterList.hasNext()) {
            temp = iterList.next();
            if (temp.getNombre().equals(nombre)) {
                if (temp.getClave().equals(contra)) {
                    correcto = true;
                }
            }
        }
        return correcto;

    }

    public void listar() {
        if (user.isEmpty()) {
            System.out.println("No hay usuarios registrados");
        } else {
            System.out.println("Usuarios: ");
            for (Usuario p : user) {
                System.out.println(p.toString());
            }

        }
    }
     
      public Usuario buscar_usuario(String nombre){
          ListIterator<Usuario> iterList = user.listIterator();
          Usuario temp = null;
        if(user.isEmpty()){
            System.out.println("No hay usuarios en la lista");
        }else{
             while(iterList.hasNext()){
                temp = iterList.next();
                if(nombre.equalsIgnoreCase(temp.getNombre())){
                   return temp;
                }
            }
        }
        return temp;
     }
     
    private boolean comprobar_existe(Usuario usuario) {
        boolean existe = false;
        Usuario temp;
        ListIterator<Usuario> iterList = user.listIterator();
        while (iterList.hasNext()) {
            temp = iterList.next();
            if (temp.getDni().equals(usuario.getDni())) {
                existe = true;
            } else {
                existe = false;
            }
        }
        return existe;
    }

}
