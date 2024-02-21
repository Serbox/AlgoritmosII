
package com.mycompany.pilas;

import java.util.Stack;

public class Frutas {
    String nombre;
    
    public Frutas(){
       
    }
    
    public Frutas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void eliminar(Stack<Integer> fruta){
        System.out.println(fruta.pop());
    }
    
    
}
