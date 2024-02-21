
package com.mycompany.pilas;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Frutas> fruta = new Stack<Frutas>();
        
        System.out.println("Pila vacia: " + fruta);
        System.out.println("Esta vacia?: " + fruta.isEmpty());
        
        
       //Creo 5 objetos
        Frutas manzana = new Frutas("Manzana");
        Frutas pera = new Frutas("pera");
        Frutas limon = new Frutas("Limon");
        Frutas mora = new Frutas("Mora");
        Frutas guayaba = new Frutas("Guayaba");
        
        //agrego los objetos a la pila 
        fruta.push(manzana);
        fruta.push(pera);
        fruta.push(limon);
        fruta.push(mora);
        fruta.push(guayaba);
        
        
        //verifico si la pila tiene objetos
        System.out.println("Pila vacia: " + fruta.isEmpty());
        
        //eliminar
        fruta.pop();
        
        
        System.out.println("-------- PILA ---------");
        
        //muestro mi pila
        while(!fruta.isEmpty()){
            System.out.println( fruta.pop().getNombre());
        }

    }
}
