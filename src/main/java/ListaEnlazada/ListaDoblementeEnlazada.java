package ListaEnlazada;
import java.util.Scanner;
public class ListaDoblementeEnlazada {
    
   

    Nodo primerNodo;
    Nodo ultimoNodo;

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (primerNodo == null) {
            primerNodo = ultimoNodo = nuevoNodo;
        } else {
            ultimoNodo.siguiente = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }
    }

    public void eliminar(int valor) {
        if (primerNodo == null) {
            return;
        }

        if (primerNodo.valor == valor) {
            primerNodo = primerNodo.siguiente;
            if (primerNodo == null) {
                ultimoNodo = null;
            }
            return;
        }

        Nodo actual = primerNodo;
        Nodo anterior = null;

        while (actual != null && actual.valor != valor) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != null) {
            anterior.siguiente = actual.siguiente;
            if (actual == ultimoNodo) {
                ultimoNodo = anterior;
            }
        }
    }

    public void imprimir() {
        Nodo actual = primerNodo;

        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }

    public static void main(String[] args) {

        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();


        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        System.out.println("la lista");
        lista.imprimir();
        
        lista.eliminar(3);
        System.out.println("Esta es la lista despues de eliminar");
        lista.imprimir();

    }
}
