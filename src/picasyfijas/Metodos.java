/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picasyfijas;

/**
 *
 * @author Carlos Caicedo
 */
public class Metodos {

    /**
     * Método para saber si ganó
     *
     * @param numero_ganador
     * @param numero_escogido
     * @return boolean
     */
    public static boolean comprobarGano(int numero_ganador, int numero_escogido) {
        return (numero_ganador == numero_escogido);
    }

    /**
     * Método que obtiene el número de fijas del número escogido
     *
     * @param numero_ganador
     * @param numero_escogido
     * @return
     */
    public static int getNumeroFijas(int numero_ganador, int numero_escogido) {
        int cifras = 4,
                num_ganador_rem = 0,
                num_escogido_rem = 0,
                fijas = 0,
                posicionNumG1 = 0,
                posicionNumG2 = 0,
                posicionNumG3 = 0,
                posicionNumG4 = 0,
                posicionNumE1 = 0,
                posicionNumE2 = 0,
                posicionNumE3 = 0,
                posicionNumE4 = 0;
        // Recorremos las cifras del número
        while (cifras > 0) {
            // Aqui obtenemos la posición de las cifras
            num_ganador_rem = numero_ganador % 10;
            num_escogido_rem = numero_escogido % 10;
            numero_ganador = (numero_ganador - num_ganador_rem) / 10;
            numero_escogido = (numero_escogido - num_escogido_rem) / 10;
            // Se verifica si la posición de la cifra actual del número ganador 
            // y el número escogido es fija 
            switch (cifras) {
                case 1:
                    posicionNumG1 = num_ganador_rem;
                    posicionNumE1 = num_escogido_rem;
                    if (posicionNumG1 == posicionNumE1) {
                        fijas++;
                    }
                    break;
                case 2:
                    posicionNumG2 = num_ganador_rem;
                    posicionNumE2 = num_escogido_rem;
                    if (posicionNumG2 == posicionNumE2) {
                        fijas++;
                    }
                    break;
                case 3:
                    posicionNumG3 = num_ganador_rem;
                    posicionNumE3 = num_escogido_rem;
                    if (posicionNumG3 == posicionNumE3) {
                        fijas++;
                    }
                    break;
                case 4:
                    posicionNumG4 = num_ganador_rem;
                    posicionNumE4 = num_escogido_rem;
                    if (posicionNumG4 == posicionNumE4) {
                        fijas++;
                    }
                    break;
                default:
                    break;
            }
            cifras--;
        }
        return fijas;
    }

    /**
     * Método que obtiene el número de picas del número escogido
     *
     * @param numero_ganador
     * @param numero_escogido
     * @return int
     */
    public static int getNumeroPicas(int numero_ganador, int numero_escogido) {
        int cifras = 4,
                num_ganador_rem = 0,
                num_escogido_rem = 0,
                picas = 0,
                posicionNumG1 = 0,
                posicionNumG2 = 0,
                posicionNumG3 = 0,
                posicionNumG4 = 0,
                posicionNumE1 = 0,
                posicionNumE2 = 0,
                posicionNumE3 = 0,
                posicionNumE4 = 0;
        // Recorremos las cifras del número
        while (cifras > 0) {
            // Aqui obtenemos la posición de las cifras
            num_ganador_rem = numero_ganador % 10;
            num_escogido_rem = numero_escogido % 10;
            numero_ganador = (numero_ganador - num_ganador_rem) / 10;
            numero_escogido = (numero_escogido - num_escogido_rem) / 10;
            // Se asignan las posiciones del número ganador y el número escogido
            switch (cifras) {
                case 1:
                    posicionNumG1 = num_ganador_rem;
                    posicionNumE1 = num_escogido_rem;
                    break;
                case 2:
                    posicionNumG2 = num_ganador_rem;
                    posicionNumE2 = num_escogido_rem;
                    break;
                case 3:
                    posicionNumG3 = num_ganador_rem;
                    posicionNumE3 = num_escogido_rem;
                    break;
                case 4:
                    posicionNumG4 = num_ganador_rem;
                    posicionNumE4 = num_escogido_rem;
                default:
                    break;
            }
            cifras--;
        }
        /* Aqui se verifica cada cifra del número escogido con las demas cifras
         número ganador para saber si la cifra está contenida en el número ganador
         y si está, se incrementan las picas */
        if (posicionNumE1 == posicionNumG2) {
            picas++;
        }
        if (posicionNumE1 == posicionNumG3) {
            picas++;
        }
        if (posicionNumE1 == posicionNumG4) {
            picas++;
        }
        if (posicionNumE2 == posicionNumG1) {
            picas++;
        }
        if (posicionNumE2 == posicionNumG3) {
            picas++;
        }
        if (posicionNumE2 == posicionNumG4) {
            picas++;
        }
        if (posicionNumE3 == posicionNumG1) {
            picas++;
        }
        if (posicionNumE3 == posicionNumG2) {
            picas++;
        }
        if (posicionNumE3 == posicionNumG4) {
            picas++;
        }
        if (posicionNumE4 == posicionNumG1) {
            picas++;
        }
        if (posicionNumE4 == posicionNumG2) {
            picas++;
        }
        if (posicionNumE4 == posicionNumG3) {
            picas++;
        }
        /* Fin de verificaciones */
        return picas;
    }

}
