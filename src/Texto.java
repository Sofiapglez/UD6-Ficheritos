import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Texto {

    public static void main(String[] args) {
        File fichero = new File("Actividad1.txt");
        Scanner scanner = new Scanner(System.in);
        String texto = solicitarTexto();
        String textoFormateado = formatearTexto(texto);
        guardarTextoEnFichero(textoFormateado, fichero);


    }
    public static String solicitarTexto() {
        Scanner scanner = new Scanner(System.in);
        String texto = "";
        while (texto.length() < 30) {
            System.out.println("Introduce un texto con al menos 30 caracteres:");
            texto = scanner.nextLine();
            if (texto.length() < 30) {
                System.out.println("El texto introducido es demasiado corto. Faltan " +
                        (30 - texto.length()) + " caracteres.");
            }
        }
        scanner.close();
        return texto;

    }

    public static String formatearTexto(String texto) {
        String textoMayusculas = texto.toUpperCase();
        String textoFormateado = textoMayusculas.replace(' ', '_');
        return textoFormateado;
    }

    public static void guardarTextoEnFichero(String texto, File fichero) {
        try {
            FileWriter writer = new FileWriter(fichero);
            writer.write(texto);
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error al guardar el texto en el fichero.");
            ex.printStackTrace();
        }
    }

}


