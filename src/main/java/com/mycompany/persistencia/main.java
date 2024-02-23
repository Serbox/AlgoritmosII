package com.mycompany.persistencia;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {//AQUI TOCA CAMBIAR LA RUTA QUE UNO TENGA
        ArchivoContactos ac = new ArchivoContactos("C://Users//juan.hernandez//Desktop//miscontactos.txt");
        ac.crear();
    }

}
