
package colas;

import java.util.LinkedList;
import java.util.Queue;


public class main {
    public static void main(String[] args) {
        Queue<Carros> colaCarros = new LinkedList<Carros>();
        
        System.out.println("Cola vacía: " + colaCarros);
        System.out.println("¿Está vacía?: " + colaCarros.isEmpty());
        
        // Creo 5 objetos
        Carros carro1 = new Carros("Toyota");
        Carros carro2 = new Carros("Honda");
        Carros carro3 = new Carros("Ford");
        Carros carro4 = new Carros("Chevrolet");
        Carros carro5 = new Carros("BMW");
        
        // Agrego los objetos a la cola 
        colaCarros.offer(carro1);
        colaCarros.offer(carro2);
        colaCarros.offer(carro3);
        colaCarros.offer(carro4);
        colaCarros.offer(carro5);
        
        // Verifico si la cola tiene objetos
        System.out.println("Cola vacía: " + colaCarros.isEmpty());
        
        // Elimino un carro de la cola
        colaCarros.poll();
        
        System.out.println("-------- COLA ---------");
        
        // Muestro la cola
        while (!colaCarros.isEmpty()) {
            System.out.println(colaCarros.poll().getNombre());
        }
    }
}
