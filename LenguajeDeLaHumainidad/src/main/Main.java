package main;

import java.util.ArrayList;
import java.util.List;

import lenguajeDeLaHumanidad.AlgoritmoLenguajeDeLaHumanidad;

public class Main {

	public static void main(String[] args) {
		AlgoritmoLenguajeDeLaHumanidad algoritmo = new AlgoritmoLenguajeDeLaHumanidad();
        
		List<List<String>> alfabeto = algoritmo.generarConjuntosDeLetras(10);
		
		long startTime = System.nanoTime();
        List<String> resultado = algoritmo.descubirPalabrasDeLaHumanidad(alfabeto, 1, 10);
        long endTime = System.nanoTime() - startTime;

        for (String palabra : resultado) {
            System.out.println(palabra);
        }
        
       
        for(List<String> letras: alfabeto) {
        	System.out.println(letras.toString());
        }
        System.out.println(resultado.size());
        System.out.println(endTime);
        System.gc();
    }
}
