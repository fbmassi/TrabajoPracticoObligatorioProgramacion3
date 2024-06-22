package Implementaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfaz.AlgoritmoLenguajeDeLaHumanidad;


public class AlgoritmoLenguajeDeLaHumanidadImpl implements AlgoritmoLenguajeDeLaHumanidad {

	@Override
	public List<String> descubirPalabrasDeLaHumanidad(List letras, int rangoDesde, int rangoHasta) {
		List<String> resultado = new ArrayList<String>();
        for (int longitud = rangoDesde; longitud <= rangoHasta; longitud++) {
            generarPalabras(letras, "", longitud, 0, resultado);
        }
        return resultado;
    }

    private static void generarPalabras(List<List<String>> alfabeto, String palabraActual, int longitudObjetivo, int etapa, List<String> resultado) {
    	List<String> grupoDeLetras = alfabeto.get(etapa);
    	for (String letra : grupoDeLetras) {
            String nuevaPalabra = palabraActual + letra;
            if (etapa == longitudObjetivo - 1) {
                resultado.add(nuevaPalabra);
            } else if (etapa < longitudObjetivo - 1){
            	generarPalabras(alfabeto, nuevaPalabra, longitudObjetivo, etapa + 1, resultado);
            }
        }
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
