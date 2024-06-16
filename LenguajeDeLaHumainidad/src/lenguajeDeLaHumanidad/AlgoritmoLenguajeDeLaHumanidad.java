package lenguajeDeLaHumanidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class AlgoritmoLenguajeDeLaHumanidad {
	public List<String> descubirPalabrasDeLaHumanidad(List<List<String>> letras, int rangoDesde, int rangoHasta) {
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
    
    public List<List<String>> generarConjuntosDeLetras(int numeroDeConjuntos) {
        List<List<String>> alfabeto = new ArrayList<>();
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < numeroDeConjuntos; i++) {
            List<String> grupo = new ArrayList<>();
            int tamañoDelGrupo = 5; //2 + random.nextInt(3);

            while (grupo.size() < tamañoDelGrupo) {
                String letra = String.valueOf(letras.charAt(random.nextInt(letras.length())));
                if (!grupo.contains(letra)) {
                    grupo.add(letra);
                }
            }
            alfabeto.add(grupo);
        }
        return alfabeto;
    }
}
    
 






