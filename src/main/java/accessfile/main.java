package accessfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto(1,"producto 1",10.5,true,'f'));
        productos.add(new Producto(2,"producto 2",10.5,true,'o'));
        productos.add(new Producto(3,"producto 3",10.5,false,'z'));
        productos.add(new Producto(4,"producto 4",10.5,true,'y'));
        productos.add(new Producto(5,"producto 5",10.5,false,'m'));
        
        // Escribir en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ejemplo.dat"))) {
            for (Producto p : productos) {
                writer.write(p.getId() + ",");
                writer.write(p.getNombre() + ",");
                writer.write(p.getPrecio() + ",");
                writer.write(p.isDescuento() + ",");
                writer.write(p.getTipo() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Leer desde el archivo
        try (BufferedReader reader = new BufferedReader(new FileReader("C://Users//juanl//Documents//ejemplo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String nombre = parts[1];
                double precio = Double.parseDouble(parts[2]);
                boolean descuento = Boolean.parseBoolean(parts[3]);
                char tipo = parts[4].charAt(0);
                
                Producto producto = new Producto(id, nombre, precio, descuento, tipo);
                productos.add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Imprimir productos
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
