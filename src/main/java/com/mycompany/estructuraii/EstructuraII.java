
package com.mycompany.estructuraii;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstructuraII {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        List<String> listaCadenas = new ArrayList<>();

        System.out.println("Escriba su nombre para agregarlo a la lista: ");
        String nombre = scanner.nextLine();

        // Agregar elementos a la lista
        listaCadenas.add("Juan");
        listaCadenas.add("Sebastian");
        listaCadenas.add("Elias");
        listaCadenas.add("Jiuliasn");
        listaCadenas.add("Felipe");
        listaCadenas.add(nombre);

        // Mostrar el contenido original de la lista
        System.out.println("Esto es lo que contiene la lista:");
        mostrarLista(listaCadenas);

        // Editar un elemento en la lista
        int indiceEditar = 1;
        String nuevoValor = "julia";
        editarElemento(listaCadenas, indiceEditar, nuevoValor);

        // Mostrar el contenido de la lista después de la edición
        System.out.println("\nAsí queda después de la edición:");
        mostrarLista(listaCadenas);

        // Eliminar un elemento de la lista
        int indiceEliminar = 4;
        eliminarElemento(listaCadenas, indiceEliminar);

        // Mostrar el contenido de la lista después de la eliminación
        System.out.println("\nEliminé la posición 4:");
        mostrarLista(listaCadenas);
    }

    // Método para mostrar el contenido de una lista de cadenas
    private static void mostrarLista(List<String> lista) {
        System.out.println(lista);
    }

    // Método para editar un elemento en una lista de cadenas
    private static void editarElemento(List<String> lista, int indice, String nuevoValor) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, nuevoValor);
        } else {
            System.out.println("No se puede, verifique la información");
        }
    }

    // Método para eliminar un elemento de una lista de cadenas
    private static void eliminarElemento(List<String> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        } else {
            System.out.println("No se puede, verifique la información");
        }
    }
}


