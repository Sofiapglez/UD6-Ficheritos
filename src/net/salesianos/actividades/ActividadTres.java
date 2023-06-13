package net.salesianos.actividades;

import java.io.*;

public class ActividadTres {

    public static void main(String[] args) {
        File fichero = new File("Actividad3.txt");

        fusionarFichero(fichero);

        String mensajeFirma = "\nFirma.";
        anadirMensajeFirma(fichero, mensajeFirma);

    }

    public static void fusionarFichero(File fichero) {
        try {
            FileReader lector1 = new FileReader("Actividad1.txt");
            BufferedReader buffer1 = new BufferedReader(lector1);
            String contenido1 = buffer1.readLine();

            FileReader lector2 = new FileReader("Actividad2.txt");
            BufferedReader buffer2 = new BufferedReader(lector2);
            String contenido2 = buffer2.readLine();

            FileWriter escritor = new FileWriter(fichero);
            escritor.write(contenido1 + "\n");
            escritor.write(contenido2 + "\n");
            escritor.close();

            buffer1.close();
            buffer2.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public static void anadirMensajeFirma(File fichero, String mensaje) {
        try {
            FileWriter escritor = new FileWriter(fichero, true);
            escritor.write(mensaje);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}

