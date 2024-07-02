package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Implementaciones.AlgoritmoLenguajeDeLaHumanidadImpl;

public class Main {
    
    private static AlgoritmoLenguajeDeLaHumanidadImpl algoritmoLenguajeDeLaHumanidad = new AlgoritmoLenguajeDeLaHumanidadImpl();
    
    private static void imprimirResultados(List<String> palabrasDescubiertas) {
        for (int i = 0; i < palabrasDescubiertas.size(); i++) {
            System.out.println("Palabra " + (i + 1) + ": " + palabrasDescubiertas.get(i));
        }
    }

    public static void main(String[] args) {
        List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(3, 15);
        for (int distancia = 0; distancia < 15; distancia++) {
            int rangoDesde = 1;
            int rangoHasta = rangoDesde + distancia;

            long startTime = System.nanoTime();
            List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, rangoDesde, rangoHasta);
            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("Tiempo para descubirPalabrasDeLaHumanidad (longitud " + rangoDesde + " a " + rangoHasta + "): " + duration + " nanosegundos");
        }
    }
}

