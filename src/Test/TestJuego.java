/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import picasyfijas.Metodos;

/**
 *
 * @author salas
 */
public class TestJuego {

    @Test
    public void caso_prueba_5() {
        // Definir variables
        int numero_ganador = 1234;
        int numero_escogido = 2563;
        Assert.assertEquals(Metodos.getNumeroPicas(numero_ganador, numero_escogido), 2);
    }

    @Test
    public void caso_prueba_6() {
        // Definir variables
        int numero_ganador = 1234;
        int numero_escogido = 1258;
        Assert.assertEquals(Metodos.getNumeroFijas(numero_ganador, numero_escogido), 2);
    }

    @Test
    public void caso_prueba_7() {
        // Definir variables
        int numero_ganador = 1234;
        int numero_escogido = 1234;
        int intentos = 9;
        Assert.assertEquals(Metodos.comprobarGano(numero_ganador, numero_escogido, intentos), true);
    }

    @Test
    public void caso_prueba_8() {
        // Definir variables
        int numero_ganador = 1234;
        int numero_escogido = 5698;
        int intentos = 11;
        Assert.assertEquals(Metodos.comprobarGano(numero_ganador, numero_escogido, intentos), false);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJuego.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
