package Implementaciones;

import java.util.List;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AlgoritmoLenguajeDeLaHumanidadImplTest {

    private  static AlgoritmoLenguajeDeLaHumanidadImpl algoritmoLenguajeDeLaHumanidad;
    private static  List<List<String>> alfabeto;
    
    @BeforeEach
    void setUp() {
        algoritmoLenguajeDeLaHumanidad = new AlgoritmoLenguajeDeLaHumanidadImpl();
        alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(5, 100);    }

    @Test
	public void descubirPalabrasDeLaHumanidad5Palabras() {
    	System.out.println("\n" + "Testeo:");
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(3, 7);
        List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 1, 1);
        imprimirResultados(resultados);
    }

    @Test
    void descubirPalabrasDeLaHumanidad10Palabras() {
    	System.out.println("\n" + "Testeo:");
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(3, 7);
    	List<String> resultados =algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 1, 2);
    	imprimirResultados(resultados);
    }

    @Test
    void descubirPalabrasDeLaHumanidad50Palabras() {
    	System.out.println("\n" + "Testeo:");
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(3, 7);
    	List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 1, 5);
    	imprimirResultados(resultados);
    }

    @Test
    void descubirPalabrasDeLaHumanidad100Palabras() {
    	System.out.println("\n" + "Testeo:");
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(3, 7);
        List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 1, 7);
        imprimirResultados(resultados);
    }

    @AfterEach
    void tearDown() {
    	
    }
    
    private static void imprimirResultados(List<String> palabrasDescubiertas) {
        for (int i = 0; i < palabrasDescubiertas.size(); i++) {
            System.out.println("Palabra " + (i + 1) + ": " + palabrasDescubiertas.get(i));
        }
    }
}

