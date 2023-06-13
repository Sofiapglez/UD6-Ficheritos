package net.salesianos.actividades;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ActividadDos {

    public static void main(String[] args) {
        File fichero = new File("Actividad2.txt");
        escribirTexto("Hola, pibe.", fichero);
        mostrarCaracteres(fichero);
    }

    public static void escribirTexto(String texto, File fichero) {
        try {
            FileWriter escritor = new FileWriter(fichero);
            escritor.write(texto);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public static void mostrarCaracteres(File fichero) {
        try {
            FileReader lector = new FileReader(fichero);
            int caracter;
            while ((caracter = lector.read()) != -1) {
                System.out.print((char) caracter + "_" + caracter + ",");
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}

