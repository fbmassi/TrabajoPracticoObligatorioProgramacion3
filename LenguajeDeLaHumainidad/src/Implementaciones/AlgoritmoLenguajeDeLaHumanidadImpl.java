package Implementaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfaz.AlgoritmoLenguajeDeLaHumanidad;

public class AlgoritmoLenguajeDeLaHumanidadImpl implements AlgoritmoLenguajeDeLaHumanidad {

    public List<String> descubirPalabrasDeLaHumanidad(List letras, int rangoDesde, int rangoHasta) {
        List<String> resultado = new ArrayList<String>();
        List<Integer> longitudesDeseadas = generarConjuntoDeNumeros(rangoDesde, rangoHasta);
        int longitudMaxima = letras.size();
        generarPalabras(letras, "", longitudesDeseadas, 0, rangoHasta, longitudMaxima, resultado);
        return resultado;
    }

    private void generarPalabras(List<List<String>> alfabeto, String palabraActual, List<Integer> longitudesDeseadas, int etapa, int rangoHasta, int longitudMaxima, List<String> resultado) {
        if (etapa < longitudMaxima && etapa < rangoHasta) {
            List<String> grupoDeLetras = alfabeto.get(etapa);
            for (String letra : grupoDeLetras) {
                String nuevaPalabra = palabraActual + letra;
                int longitudNuevaPalabra = nuevaPalabra.length();
                if (longitudesDeseadas.contains(longitudNuevaPalabra)) {
                    resultado.add(nuevaPalabra);
                }
                generarPalabras(alfabeto, nuevaPalabra, longitudesDeseadas, etapa + 1, rangoHasta, longitudMaxima, resultado);
            }
        }
    }

    private List<Integer> generarConjuntoDeNumeros(int desde, int hasta) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = desde; i <= hasta; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public List<List<String>> generarConjuntosDeLetras(int length, int numWords) {
        List<List<String>> conjuntos = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < numWords; i++) {
            List<String> conjunto = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                String letra = String.valueOf(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
                conjunto.add(letra);
            }
            conjuntos.add(conjunto);
        }
        
        return conjuntos;
    }

}
