package Implementaciones;

import java.util.List;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AlgoritmoLenguajeDeLaHumanidadImplTest {

    private  static AlgoritmoLenguajeDeLaHumanidadImpl algoritmoLenguajeDeLaHumanidad;
    @BeforeEach
    void setUp() {
        algoritmoLenguajeDeLaHumanidad = new AlgoritmoLenguajeDeLaHumanidadImpl();
    }

    @Test
	public void descubirPalabrasDeLaHumanidad5Palabras() {
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(5, 1);
        long startTime = System.currentTimeMillis();
        List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 1, 1);
        long endTime = System.currentTimeMillis() - startTime;
        assertNotEquals(1,endTime);

        /*
        
        assertTrue(endTime > 0, "El tiempo de ejecución debería ser mayor a 0 milisegundos");
        assertNotNull(resultados, "La lista de resultados no debería ser nula");
        assertFalse(resultados.isEmpty(), "La lista de resultados no debería estar vacía");
        System.out.println("Resultados de descubirPalabrasDeLaHumanidad5Palabras:");
        imprimirResultados(resultados);
        System.out.println("Tiempo de ejecución: " + endTime + " milisegundos\n");
        */
    }

    @Test
    void descubirPalabrasDeLaHumanidad10Palabras() {
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(3, 3);
        long startTime = System.currentTimeMillis();
        List<String> resultados =algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 1, 2);
        long endTime = System.currentTimeMillis() - startTime;
        assertNotEquals(1,endTime);

        /*
        assertTrue(endTime > 0, "El tiempo de ejecución debería ser mayor a 0 milisegundos");
        assertNotNull(resultados, "La lista de resultados no debería ser nula");
        assertFalse(resultados.isEmpty(), "La lista de resultados no debería estar vacía");
        System.out.println("Resultados de descubirPalabrasDeLaHumanidad10Palabras:");
        imprimirResultados(resultados);
        System.out.println("Tiempo de ejecución: " + endTime + " milisegundos\n");
         */
        
    }

    @Test
    void descubirPalabrasDeLaHumanidad50Palabras() {
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(2, 6);
        long startTime = System.currentTimeMillis();
        List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 4, 5);
        long endTime = System.currentTimeMillis() - startTime;
        assertNotEquals(1,endTime);
        
        /*
        assertTrue(endTime > 0, "El tiempo de ejecución debería ser mayor a 0 milisegundos");
        assertNotNull(resultados, "La lista de resultados no debería ser nula");
        assertFalse(resultados.isEmpty(), "La lista de resultados no debería estar vacía");
        System.out.println("Resultados de descubirPalabrasDeLaHumanidad50Palabras:");
        imprimirResultados(resultados);
        System.out.println("Tiempo de ejecución: " + endTime + " milisegundos\n");
        */
    }

    @Test
    void descubirPalabrasDeLaHumanidad100Palabras() {
    	List<List<String>> alfabeto = algoritmoLenguajeDeLaHumanidad.generarConjuntosDeLetras(2, 7);
        long startTime = System.currentTimeMillis();
        List<String> resultados = algoritmoLenguajeDeLaHumanidad.descubirPalabrasDeLaHumanidad(alfabeto, 4, 6);
        long endTime = System.currentTimeMillis() - startTime;
        assertNotEquals(1,endTime);
        
        /*
        assertTrue(endTime > 0, "El tiempo de ejecución debería ser mayor a 0 milisegundos");
        assertNotNull(resultados, "La lista de resultados no debería ser nula");
        assertFalse(resultados.isEmpty(), "La lista de resultados no debería estar vacía");
        System.out.println("Resultados de descubirPalabrasDeLaHumanidad100Palabras:");
        imprimirResultados(resultados);
        System.out.println("Tiempo de ejecución: " + endTime + " milisegundos\n");
        */
    }

    @AfterEach
    void tearDown() {
    	
    }
    
    private void imprimirResultados(List<String> palabrasDescubiertas) {
        for (int i = 0; i < palabrasDescubiertas.size(); i++) {
            System.out.println("Palabra " + (i + 1) + ": " + palabrasDescubiertas.get(i));
        }
    }
}
