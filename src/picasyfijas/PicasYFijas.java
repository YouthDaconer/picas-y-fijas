package picasyfijas;

import java.io.*;

public class PicasYFijas {

    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)
            throws IOException {
        int numero_ganador = 1234, numero_escogido = 0, fijas = 0, picas = 0, contador = 10;
        do {
            System.out.println("Escribe el número que quieres jugar, aun tienes " + contador + " intentos:");
            boolean lectura_numero = false;
            String numero_escogido_string = leer.readLine();
            // Se lee el número escogido
            while (lectura_numero == false) {
                if (isNumeric(numero_escogido_string) == true) {
                    lectura_numero = true;
                    numero_escogido = Integer.parseInt(numero_escogido_string);
                } else {
                    System.out.println("Lo que ingresaste no es un número valido.");
                    System.out.println("Escribe el número que quieres jugar, aun tienes " + contador + " intentos:");
                    numero_escogido_string = leer.readLine();
                }
            }
            // Se obtienen las fijas
            fijas = Metodos.getNumeroFijas(numero_ganador, numero_escogido);
            if (Metodos.comprobarGano(numero_ganador, numero_escogido)) {
                System.out.println("Has ganado =D");
            }
            // Se obtienen las picas
            picas = Metodos.getNumeroPicas(numero_ganador, numero_escogido);
            // Se resta el número de intentos
            contador -= 1;
            if (fijas == 4) {
                System.out.println("Tienes: " + fijas + " Fijas y 0 Picas.");
            } else {
                System.out.println("Tienes: " + fijas + " Fijas y " + picas + " Picas.");
            }
        } while (fijas != 4 && contador > 0); // Condición para comprobar el número de intentos y que ya haya ganado

    }

    /**
     * Verifica si el String enviado se puede convertir a Integer
     * 
     * @param cadena
     * @return boolean
     */
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
