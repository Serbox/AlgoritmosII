
import java.util.Arrays;
import java.util.Scanner;

public class ejecicio {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Escriba su nombre para ponerlo en el array: ");
        String nombre = scanner.nextLine();
        
        // Crear un array de cadenas
        String[] arrayCadenas = {"Juan", "Sebastian", "Elias", "Jiuliasn", "Felipe",nombre};

        // Mostrar el contenido original del array
        System.out.println("Esto es lo que contiene el array:");
        mostrarArray(arrayCadenas);

        // Editar un elemento en el array
        int indiceEditar = 1;
        String nuevoValor = "julia";
        arrayCadenas = editarElemento(arrayCadenas, indiceEditar, nuevoValor);

        // Mostrar el contenido del array después de la edición
        System.out.println("\nAsi quedo despues de que lo editara:");
        mostrarArray(arrayCadenas);

        // Eliminar un elemento del array
        int indiceEliminar = 4;
        arrayCadenas = eliminarElemento(arrayCadenas, indiceEliminar);

        // Mostrar el contenido del array después de la eliminación
        System.out.println("\nElimine la picicion 4:");
        mostrarArray(arrayCadenas);
    }
    


    // Método para mostrar el contenido de un array de cadenas
    private static void mostrarArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    // Método para editar un elemento en un array de cadenas
    private static String[] editarElemento(String[] array, int indice, String nuevoValor) {
        if (indice >= 0 && indice < array.length) {
            array[indice] = nuevoValor;
        } else {
            System.out.println("No se puede");
        }
        return array;
    }

    // Método para eliminar un elemento de un array de cadenas
    private static String[] eliminarElemento(String[] array, int indice) {
        if (indice >= 0 && indice < array.length) {
            String[] nuevoArray = new String[array.length - 1];
            int nuevoIndice = 0;

            // Copiar los elementos al nuevo array, excluyendo el elemento a eliminar
            for (int i = 0; i < array.length; i++) {
                if (i != indice) {
                    nuevoArray[nuevoIndice] = array[i];
                    nuevoIndice++;
                }
            }

            return nuevoArray;
        } else {
            System.out.println("No se puede verifique la informacion.");
            return array;
        }
    }
}
