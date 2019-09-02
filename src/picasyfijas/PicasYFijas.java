package picasyfijas;

import java.io.*;
import java.util.Stack;

public class PicasYFijas {

    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)
            throws IOException {
        int numero_ganador = generarNumero(), numero_escogido = 0, fijas = 0, picas = 0, contador = 10;
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
            if (Metodos.comprobarGano(numero_ganador, numero_escogido, contador)) {
                System.out.println("Has ganado =D");
                return;
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
        System.out.println("Perdiste =( El número era: " + numero_ganador);
    }

    /**
     * Genera un número aleatorio de 4 digitos sin repetición
     *
     * @return int
     */
    private static int generarNumero() {
        int pos;
        int num_digitos = 4;
        String numero_generado = "";
        Stack<Integer> numeros = new Stack<Integer>();
        for (int i = 0; i < num_digitos; i++) {
            pos = (int) Math.floor(Math.random() * num_digitos);
            while (numeros.contains(pos)) {
                pos = (int) Math.floor(Math.random() * num_digitos);
            }
            numeros.push(pos);
            numero_generado += pos;
        }
        return Integer.parseInt(numero_generado);
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
